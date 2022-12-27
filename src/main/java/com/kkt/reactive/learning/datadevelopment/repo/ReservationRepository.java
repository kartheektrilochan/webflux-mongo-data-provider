package com.kkt.reactive.learning.datadevelopment.repo;

import com.kkt.reactive.learning.datadevelopment.model.Reservation;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReservationRepository extends ReactiveCrudRepository<Reservation,String> {

}
