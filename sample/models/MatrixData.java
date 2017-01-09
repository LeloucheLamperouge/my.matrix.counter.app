package sample.models;

import sample.utils.MatrixCount;

/**
 * Created by Lelouch on 31.10.2016.
 */
public class MatrixData {

    private MatrixCount count = new MatrixCount();

    private int zeroYear;
    private int twentyYear;
    private int fortyYear;


    private int tenYear;
    private int thirtyYear;
    private int fiftyYear;
    private int sixtyYear;
    private int seventyYear;

    private int comfort;

    private int zeroYearOne;
    private int zeroYearTwo;
    private int zeroYearThree;

    private int tenYearOne;
    private int tenYearTwo;

    private int twentyYearOne;
    private int twentyYearTwo;
    private int twentyYearThree;

    private int thirtyYearOne;
    private int thirtyYearTwo;

    private int fortyYearOne;
    private int fortyYearTwo;

    private int fiftyYearOne;
    private int fiftyYearTwo;
    private int fiftyYearThree;

    private int sixtyYearOne;
    private int sixtyYearTwo;

    private int seventyYearOne;
    private int seventyYearTwo;

    private int center;
    private int relations;
    private int career;

    private int earth;
    private int sky;
    private int earthSkySum;

    private int male;
    private int female;
    private int maleFemaleSum;

    private int spirit;
    private int planet;



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

        this.zeroYearTwo = count.counter(zeroYear + comfort);
        this.zeroYearOne = count.counter(zeroYear + zeroYearTwo);
        this.zeroYearThree = count.counter(zeroYearTwo + comfort);

        this.tenYearTwo = count.counter(tenYear + comfort);
        this.tenYearOne = count.counter(tenYear + tenYearTwo);

        this.twentyYearTwo = count.counter(twentyYear + comfort);
        this.twentyYearOne = count.counter(twentyYearTwo + twentyYear);
        this.twentyYearThree = count.counter(twentyYearTwo + comfort);

        this.thirtyYearTwo = count.counter(thirtyYear + comfort);
        this.thirtyYearOne = count.counter(thirtyYear + thirtyYearTwo);

        this.fortyYearTwo = count.counter(fortyYear + comfort);
        this.fortyYearOne = count.counter(fortyYear + fortyYearTwo);

        this.fiftyYearTwo = count.counter(fiftyYear + comfort);
        this.fiftyYearOne = count.counter(fiftyYear + fiftyYearTwo);
        this.fiftyYearThree = count.counter(fiftyYearTwo + comfort);

        this.sixtyYearTwo = count.counter(sixtyYear + comfort);
        this.sixtyYearOne = count.counter(sixtyYear + sixtyYearTwo);

        this.seventyYearTwo = count.counter(seventyYear + comfort);
        this.seventyYearOne = count.counter(seventyYear + seventyYearTwo);

        this.center = count.counter(fortyYearTwo + sixtyYearTwo);
        this.relations = count.counter(sixtyYearTwo + center);
        this.career = count.counter(fortyYearTwo + center);

        this.earth = count.counter(twentyYear + sixtyYear);
        this.sky = count.counter(zeroYear + fortyYear);
        this.earthSkySum = count.counter(earth + sky);

        this.male = count.counter(tenYear + fiftyYear);
        this.female = count.counter(thirtyYear + seventyYear);
        this.maleFemaleSum = count.counter(male + female);

        this.spirit = count.counter(earthSkySum + maleFemaleSum);

        this.planet = count.counter(maleFemaleSum + spirit);
    }

    @Override
    public String toString() {
        return "MatrixData{" +
                "count=" + count +
                ", zeroYear=" + zeroYear +
                ", twentyYear=" + twentyYear +
                ", fortyYear=" + fortyYear +
                ", tenYear=" + tenYear +
                ", thirtyYear=" + thirtyYear +
                ", fiftyYear=" + fiftyYear +
                ", sixtyYear=" + sixtyYear +
                ", seventyYear=" + seventyYear +
                ", comfort=" + comfort +
                ", zeroYearOne=" + zeroYearOne +
                ", zeroYearTwo=" + zeroYearTwo +
                ", zeroYearThree=" + zeroYearThree +
                ", tenYearOne=" + tenYearOne +
                ", tenYearTwo=" + tenYearTwo +
                ", twentyYearOne=" + twentyYearOne +
                ", twentyYearTwo=" + twentyYearTwo +
                ", twentyYearThree=" + twentyYearThree +
                ", thirtyYearOne=" + thirtyYearOne +
                ", thirtyYearTwo=" + thirtyYearTwo +
                ", fortyYearOne=" + fortyYearOne +
                ", fortyYearTwo=" + fortyYearTwo +
                ", fiftyYearOne=" + fiftyYearOne +
                ", fiftyYearTwo=" + fiftyYearTwo +
                ", fiftyYearThree=" + fiftyYearThree +
                ", sixtyYearOne=" + sixtyYearOne +
                ", sixtyYearTwo=" + sixtyYearTwo +
                ", seventyYearOne=" + seventyYearOne +
                ", seventyYearTwo=" + seventyYearTwo +
                ", center=" + center +
                ", relations=" + relations +
                ", career=" + career +
                ", earth=" + earth +
                ", sky=" + sky +
                ", earthSkySum=" + earthSkySum +
                ", male=" + male +
                ", female=" + female +
                ", maleFemaleSum=" + maleFemaleSum +
                ", spirit=" + spirit +
                ", planet=" + planet +
                '}';
    }
}
