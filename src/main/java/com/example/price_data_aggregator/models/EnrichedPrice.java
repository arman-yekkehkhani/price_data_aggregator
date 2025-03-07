package com.example.price_data_aggregator.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "priceItems")
public record EnrichedPrice(
        @Id
        String uuid,
        Integer advertiserId,
        Integer accommodationId,
        String currency,
        Float price
) {
}
