package com.kkt.reactive.learning.datadevelopment.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@AllArgsConstructor
@Data
@Builder
public class Reservation {
    @Id
    private String id;

    private String name;


}
