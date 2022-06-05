package d02_06_2022;

import java.util.ArrayList;

public abstract class Worker {
    protected String fullName;

    public Worker(String fullName) {
        this.fullName = fullName;
    }

    protected ArrayList<Sector> sectors = new ArrayList();
    public abstract double salary();
    public void sectorHire (Sector sector){
        this.sectors.add(sector);
    }
}
