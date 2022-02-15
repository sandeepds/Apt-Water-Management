package model.geektrust.apartment;

public class Ratio {
	
	 private int corporationWaterRatio;
	 private int borewellWaterRatio;
	 private int tankerWaterRatio;
	
	 public Ratio(int corporationWaterRatio, int borewellWaterRatio) {
	        this.corporationWaterRatio = corporationWaterRatio;
	        this.borewellWaterRatio = borewellWaterRatio;	       
	 }
	 
	 public int getCorporationWaterRatio() {
		return corporationWaterRatio;
	 }
	 public int getBorewellWaterRatio() {
		return borewellWaterRatio;
	 }

	 public int getTankerWaterRatio() {
		return tankerWaterRatio;
	 }

}
