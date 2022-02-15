package model.geektrust.Costing;

public enum ConsumptionRate {
	
	CorporationWater("CorporationWater", 1),
    BorewellWater("BorewellWater", 1.5),
    TankWater("TankWater", 2);

    private String waterType;
    private double rate;
    ConsumptionRate(String waterType, double rate){
        this.waterType = waterType;
        this.rate = rate;
    }

    public String getWaterType() {
        return waterType;
    }

    public double getRate() {
        return rate;
    }

}
