package ua;

public class Tanker {
    private String serialNumber;

    public String getSerialNumber() {
        return serialNumber;
    }

    protected String getFuelType(){
        return "A500";
    }

    public void refuel(int amount ){
        System.out.println("Add "+amount+" of "+getFuelType()+", tanker serial number is "+serialNumber);
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public static void main(String[] args) {
        Tanker tanker = new XFuelTanker();
        tanker.setSerialNumber("SN504030");
        tanker.refuel(300);
    }
}

class XFuelTanker extends Tanker{
@Override
    protected String getFuelType(){
        return "XFuel";
    }
}

class MX200Tanker extends Tanker{
    @Override
    protected String getFuelType(){
        return "MX200";
    }
}