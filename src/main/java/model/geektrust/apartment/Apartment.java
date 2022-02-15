package model.geektrust.apartment;

public class Apartment {
	
	private ApartmentType apartmentType;
	private int guests;
	private Ratio ratio;
	
	public Apartment(ApartmentType apartmentType, int corporationWaterRatio, int borewallWaterRatio ) {
		this.apartmentType = apartmentType;
		this.ratio = new Ratio(corporationWaterRatio, borewallWaterRatio);
	}
	
    public void addGuests(int guests){
        this.guests += guests;
    }

    public int getPeople() {
        return apartmentType.getPeople();
    }
    
	public int getGuests() {
		return guests;
	}
	public Ratio getRatio() {
		return ratio;
	}
	
	

}
