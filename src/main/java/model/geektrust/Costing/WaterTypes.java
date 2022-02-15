package model.geektrust.Costing;

import java.util.HashMap;

public class WaterTypes {

	private static HashMap<String, Water> waterTypes;
    private WaterTypes(){

    }
    public static HashMap<String, Water> getWaterTypes(){
        if(WaterTypes.waterTypes != null) return WaterTypes.waterTypes;
        WaterTypes.waterTypes = new HashMap<>();
        WaterTypes.waterTypes.put(ConsumptionRate.CorporationWater.getWaterType(), new ConsumptionRateWater(ConsumptionRate.CorporationWater));
        WaterTypes.waterTypes.put(ConsumptionRate.BorewellWater.getWaterType(), new ConsumptionRateWater(ConsumptionRate.BorewellWater));
        WaterTypes.waterTypes.put(SlabRateWaterTypes.TankerWater.getWaterType(), new SlabRateWater(SlabRateWaterTypes.TankerWater));
        return WaterTypes.waterTypes;
    }
}
