package model.geektrust.Costing;

public class Slab {

	int slabStart;
    int slabEnd;
    int rate;
    
    public Slab(int slabStart, int slabEnd, int rate) {
        this.slabStart = slabStart;
        this.slabEnd = slabEnd;
        this.rate = rate;
    }

    public int getSlabStart() {
        return slabStart;
    }

    public int getSlabEnd() {
        return slabEnd;
    }

    public int getSlabRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "Slab[" + slabStart +
                "-" + slabEnd +
                " $" + rate +
                ']';
    }
}
