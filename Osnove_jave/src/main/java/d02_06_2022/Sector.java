package d02_06_2022;

public class Sector {
    private String sectorName;
    private double sectorSalary;

    public Sector(String sectorName,
                  double sectorSalary) {
        this.sectorName = sectorName;
        this.sectorSalary = sectorSalary;
    }

    public String getSectorName() {
        return sectorName;
    }

    public double getSectorSalary() {
        return sectorSalary;
    }
}
