package com.kkt.reactive.learning.datadevelopment.service;

import com.kkt.reactive.learning.datadevelopment.model.Reservation;
import com.kkt.reactive.learning.datadevelopment.repo.ReservationRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
@Slf4j
@AllArgsConstructor
public class ReservationDataGenerator {

    private ReservationRepository reservationRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void ready() {
        log.info("Application is ready");
        Flux<String> names = Flux.just("Kartheek", "Devika");
        Flux<Reservation> reservationFLux = names.map(name -> new Reservation(null, name));
        Flux<Reservation> result = reservationFLux.flatMap(i -> this.reservationRepository.save(i));

        this.reservationRepository
                .deleteAll()
                .thenMany(result)
                .thenMany(this.reservationRepository.findAll())
                .subscribe(i -> log.info("request={}", i));

    }
}
