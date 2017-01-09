package sample.models;

/**
 * Created by Lelouch on 07.12.2016.
 */
public class MatrixTableData {

    private String physics;
    private String energy;
    private String emotions;

    private String chakras;
    private String valueOf;

    public MatrixTableData(){

    }

    public MatrixTableData(String physics, String energy, String emotions, String chakras, String valueOf) {
        this.physics = physics;
        this.energy = energy;
        this.emotions = emotions;
        this.chakras = chakras;
        this.valueOf = valueOf;
    }

    public String getPhysics() {
        return physics;
    }

    public void setPhysics(String physics) {
        this.physics = physics;
    }

    public String getEnergy() {
        return energy;
    }

    public void setEnergy(String energy) {
        this.energy = energy;
    }

    public String getEmotions() {
        return emotions;
    }

    public void setEmotions(String emotions) {
        this.emotions = emotions;
    }

    public String getChakras() {
        return chakras;
    }

    public void setChakras(String chakras) {
        this.chakras = chakras;
    }

    public String getValueOf() {
        return valueOf;
    }

    public void setValueOf(String valueOf) {
        this.valueOf = valueOf;
    }

    @Override
    public String toString() {
        return "MatrixTableData{" +
                "physics='" + physics + '\'' +
                ", energy='" + energy + '\'' +
                ", emotions='" + emotions + '\'' +
                ", chakras='" + chakras + '\'' +
                ", valueOf='" + valueOf + '\'' +
                '}';
    }
}
