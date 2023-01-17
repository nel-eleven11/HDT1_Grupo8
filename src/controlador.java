package src;

public class controlador {

    public IRadio radio = new radio();

    public void turnOnOff() {
        if(radio.isOn()){
            radio.off();
        }else{
            radio.on();
        }
    }

    public void changeFrequence() throws Exception {
        radio.setFrequence(radio.getFrequence());
    }
    public String getFrequence(){
        return radio.getFrequence();
    }
    public int getAMActualStation(){
        return radio.getAMActualStation();
    }
    public double getFMActualStation(){
        return radio.getFMActualStation();
    }

    public void forward(){
        radio.Forward();
    }

    public void backward(){
        radio.Backward();
    }

    public void saveStation(int slot){
        if(radio.getFrequence().equals("AM")){
            radio.saveAMStation(radio.getAMActualStation(), slot);
        }else{
            radio.saveFMStation(radio.getFMActualStation(), slot);
        }
    }

    public void selectFavoriteSation(int slot){
        if(radio.getFrequence().equals("AM")){
            radio.setAMActualStation(radio.getAMSlot(slot));
        }else{
            radio.setFMActualStation(radio.getFMSlot(slot));
        }

    }

}
