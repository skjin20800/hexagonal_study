package com.haivis.flow.classification.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Classification {

    @Getter private final ClassificationId id;
    @Getter private final String testdata;



    @Value
    public static class ClassificationId {
        private Long value;
    }
}
