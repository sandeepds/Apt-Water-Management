package model.commands;

import java.util.HashMap;

import com.billing.Biling;
import com.billing.FinalBiling;
import com.billing.Invoice;

import model.geektrust.Costing.Water;
import model.geektrust.Costing.WaterTypes;
import model.geektrust.apartment.AddApartment;
import model.geektrust.apartment.Apartment;

public class CommandExecutor {
	
	Command cmnd;
	HashMap<String, Water> waterTypes;
    Apartment apartment;
    Invoice invoice;
    Biling billing;
	
    public CommandExecutor(){
        this.waterTypes = WaterTypes.getWaterTypes();
    }

    public void runCommand(String command){
        if(command.startsWith(AllotWaterCommand.CMD)){
            cmnd = new AllotWaterCommand(command);
            String[] params = cmnd.getParams();
            String ratio = params[2];
            System.out.println("ration...."+ratio);
            String[] ratioValue = ratio.split(":");
            System.out.println("ratioValue...."+ratioValue.toString());
            int apartmentType = Integer.parseInt(params[1]);
            System.out.println("apartmentType...."+apartmentType);
            int corp = Integer.parseInt(ratioValue[0]);
            System.out.println("corp...."+corp);
            int borewell= Integer.parseInt(ratioValue[1]);
            System.out.println("borewell...."+borewell);
            this.apartment = AddApartment.addApartment(2, corp, borewell);
            this.invoice = new FinalBiling(apartment, waterTypes);
            this.billing = new Biling(apartment, this.invoice);
        }
        else if(command.startsWith(AddGuests.CMD)){
            cmnd = new AddGuests(command);
            int guests = Integer.parseInt(cmnd.getParams()[1]);
            //System.out.println("Guests "+guests);
            this.apartment.addGuests(guests);
        }
        else if(command.startsWith(BillCommand.CMD)){
            cmnd = new BillCommand(command);
            //System.out.println("Total Guests " +this.apartment.getGuests());
            int bill = this.billing.generateBill();
            int water = this.billing.getTotalWater();
            System.out.println(water+" "+bill);
        }
    }
}
