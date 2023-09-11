package ru.open_broker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.ArrayList;
import java.util.Collections;

public class RowTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/testdata/calculateSumResults.csv")
    void calculateSumResults(String testData,int expectedSum){
        Row row = new Row(testData);
        Assertions.assertEquals(row.getSum(),expectedSum);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/testdata/checkCalculateMaxValue.csv")
    void checkCalculateMaxValue(String testDatafirst,String testDatasecond,String expectedRow){
        ArrayList<Row> rows = new ArrayList<>();
        rows.add(new Row(testDatafirst));
        rows.add(new Row(testDatasecond));
        Assertions.assertEquals(Collections.max(rows).getValue(),expectedRow);
    }
}
