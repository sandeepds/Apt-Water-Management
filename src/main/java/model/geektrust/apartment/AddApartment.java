package model.geektrust.apartment;

public class AddApartment {

	public static Apartment addApartment(int type, int corporationWaterRatio, int borewellWaterRatio){
        Apartment apartment = null;
        switch (type){
            case 2:
                apartment = new Apartment(ApartmentType.TWO_BEDROOM_APARTMENT, corporationWaterRatio, borewellWaterRatio);
                break;
            case 3:
                apartment = new Apartment(ApartmentType.THREE_BEDROOM_APARTMENT, corporationWaterRatio, borewellWaterRatio);
                break;
        }
        return apartment;
    }
}
