package d03_06_2022;

public abstract class Packaging {
    protected String barCode;
    protected String articleName;
    protected double netWeight;
    protected double grossWeight;

    public Packaging() {
    }

    public Packaging(String barCode,
                     String articleName,
                     double netWeight,
                     double grossWeight) {
        this.barCode = barCode;
        this.articleName = articleName;
        this.netWeight = netWeight;
        this.grossWeight = grossWeight;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public double getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(double netWeight) {
        this.netWeight = netWeight;
    }

    public double getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(double grossWeight) {
        this.grossWeight = grossWeight;
    }
    public double packageWeight (){
        return grossWeight - netWeight;
    }
    public abstract double articlePrice();
    public abstract void print();
}

