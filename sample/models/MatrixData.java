package sample.models;

import sample.utils.MatrixCount;

/**
 * Created by Lelouch on 31.10.2016.
 */
public class MatrixData {

    MatrixCount count = new MatrixCount();

    private int zeroYear;
    private int twentyYear;
    private int fortyYear;


    private int tenYear;
    private int thirtyYear;
    private int fiftyYear;
    private int sixtyYear;
    private int seventyYear;

    private int comfort;


    public MatrixData(Person person) {
        this.zeroYear = count.counter(person.getBirthDay());
        this.twentyYear = count.counter(person.getBirthMonth());
        this.fortyYear = count.counter(person.getBirthYear());

        this.tenYear = count.counter(zeroYear + twentyYear);
        this.thirtyYear = count.counter(twentyYear + fortyYear);
        this.sixtyYear = count.counter(zeroYear + twentyYear + fortyYear);
        this.fiftyYear = count.counter(fortyYear + sixtyYear);
        this.seventyYear = count.counter(sixtyYear + zeroYear);

        this.comfort = count.counter(zeroYear + twentyYear + fortyYear + sixtyYear);
    }


    @Override
    public String toString() {
        return "MatrixData{" +
                "zeroYear=" + zeroYear +
                ", twentyYear=" + twentyYear +
                ", fortyYear=" + fortyYear +
                ", tenYear=" + tenYear +
                ", thirtyYear=" + thirtyYear +
                ", fiftyYear=" + fiftyYear +
                ", sixtyYear=" + sixtyYear +
                ", seventyYear=" + seventyYear +
                ", comfort=" + comfort +
                '}';
    }
}
