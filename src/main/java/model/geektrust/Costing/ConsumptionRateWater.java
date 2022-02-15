package model.geektrust.Costing;

public class ConsumptionRateWater extends Water {

	ConsumptionRate consumptionRate;
    public ConsumptionRateWater(ConsumptionRate consumptionRate) {
        super(consumptionRate.getWaterType());
        this.consumptionRate = consumptionRate;
    }
    public double getRate(){
        return this.consumptionRate.getRate();
    }
}
