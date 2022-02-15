package model.geektrust.apartment;

public enum ApartmentType {
	
	TWO_BEDROOM_APARTMENT(2,3), 
	THREE_BEDROOM_APARTMENT(3,5);
	
    private int people;
	private int apType;

    ApartmentType(int apType, int people){
        this.people = people;
        this.apType = apType;
    }

    public int getType() {
        return apType;
    }

    public int getPeople() {
        return people;
    }

}
