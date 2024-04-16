package com.data.server.data_server.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class ClassificationMetaDataEntity {

    private int imageIndex;
    private ArrayList<Double> scores;
    private String resultClass;

}
