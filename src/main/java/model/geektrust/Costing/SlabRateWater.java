package model.geektrust.Costing;

import java.util.List;

public class SlabRateWater extends Water{
	
	SlabRateWaterTypes slabRateWater;
    List<Slab> slabs;
    public SlabRateWater(SlabRateWaterTypes slabRateWater) {
        super(slabRateWater.getWaterType());
        this.slabRateWater = slabRateWater;
    }
    public boolean addSlab(int slabStart, int slabEnd, int rate ){
        if(validateSlab(slabStart, slabEnd)){
            this.slabs.add(new Slab(slabStart, slabEnd, rate));
            return true;
        }
        else return false;
    }
    private boolean validateSlab(int slabStart, int slabEnd){
        if (this.slabs.size() == 0) return (slabStart == 1) && (slabStart < slabEnd);
        Slab lastSlab = this.slabs.get(this.slabs.size()-1);
        if(lastSlab.slabEnd+1 != slabStart) return false;
        return slabStart < slabEnd;
    }
    public  List<Slab> getSlabs(){
        return this.slabRateWater.getSlabs();
    }

}
