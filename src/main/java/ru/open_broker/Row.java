package ru.open_broker;

public class Row implements Comparable<Row> {

    private String value;
    private Integer sum;

    public Row(String value) {
        this.value = value;
        this.sum = calculateSum(value);
    }

    public Integer getSum() {
        return sum;
    }

    public String getValue() {
        return value;
    }

    private Integer calculateSum(String value) {
        return value.chars().map(o -> switch (o) {
            case 'a' -> 3;
            case 'b' -> 2;
            case 'c' -> 1;
            default -> 0;
        }).reduce(0, Integer::sum);
    }

    @Override
    public int compareTo(Row o) {
        if (this.sum.equals(o.getSum())) {
            return this.value.length() - o.getValue().length();
        }
        return o.getSum() - this.sum;
    }
}
