package model.geektrust.Costing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum SlabRateWaterTypes {

	TankerWater("TankerWater", new ArrayList<>(
            Arrays.asList(
                    new Slab(1, 500, 2),
                    new Slab(501, 1500, 3),
                    new Slab(1501, 3000, 5),
                    new Slab(3001, Integer.MAX_VALUE, 8)
            )
        )
    );

	String waterType;
	List<Slab> slabs;
	SlabRateWaterTypes(String waterType, ArrayList<Slab> slabs){
	this.waterType = waterType;
	this.slabs = slabs;
	}
	
	public String getWaterType() {
	return this.waterType;
	}
	
	public List<Slab> getSlabs() {
	return this.slabs;
	}
}
