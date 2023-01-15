package main;

public class radio implements IRadio{

    private boolean on;
    private String frequence;
    private double FMActualStation;
    private int AMActualStation;
    private double[] FMSlot = new double[12];
    private int[] AMSlot = new int[12];

    public radio(){
        on = false;
        frequence = "AM";
        FMActualStation = 87.9;
        AMActualStation = 530;
    }

    public void on(){
        on = true;
    }

    public void off(){
        on = false;
    }

    public boolean isOn(){
        return on;
    }

    public void setFrequence(String freq) throws Exception{
        if(freq.equals("AM") ){
            frequence = "FM";
        }else if(freq.equals("FM")){
            frequence = "AM";
        }else{
            throw new Exception("Error");
        }
    }

    public String getFrequence(){
        return frequence;
    }

    public void Forward(){
        if(frequence.equals("AM")){
            if(AMActualStation == 1610){
                AMActualStation = 530;
            }else{
                AMActualStation += 10;
            }
        }else{
            if(FMActualStation == 107.9){
                FMActualStation = 87.9;
            }else{
                FMActualStation += 0.2;
            }
        }
    }

    public void Backward(){
        if(frequence.equals("AM")){
            if(AMActualStation == 530){
                AMActualStation = 1610;
            }else{
                AMActualStation -= 10;
            }
        }else{
            if(FMActualStation == 87.9){
                FMActualStation = 107.9;
            }else{
                FMActualStation -= 0.2;
            }
        }
    }

    public double getFMActualStation(){
        return FMActualStation;
    }

    public int getAMActualStation(){
        return AMActualStation;
    }

    public void setFMActualStation(double actualStation){
        FMActualStation = actualStation;
    }

    public void setAMActualStation(int actualStation){
        AMActualStation = actualStation;
    }

    public void saveFMStation(double actualStation, int slot){
        FMSlot[slot] = actualStation;
    }

    public void saveAMStation(int actualStation, int slot){
        AMSlot[slot] = actualStation;
    }

    public double getFMSlot(int slot){
        return FMSlot[slot];
    }

    public int getAMSlot(int slot){
        return AMSlot[slot];
    }
}
