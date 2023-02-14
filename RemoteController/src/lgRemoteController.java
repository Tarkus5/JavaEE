public class lgRemoteController implements remoteController {
    int volume = 0;
    boolean status = false;
    @Override
    public void volumeUp() {
        for (int i = 0; i <= 30; i++){
            volume++;
        }
    }

    @Override
    public void volumeDown() {
        for (int i = 0; i <= 31; i--){
            volume--;
            if (volume == 0){
                break;
            }
        }
    }

    @Override
    public void setVolume() {
        this.volume = volume;
        System.out.println("Volume status is: " + volume);
    }

    @Override
    public void setStatus(boolean status) {
        if (status == true){
            System.out.println("LG TV is on");
        }else {
            System.out.println("LG TV is off");
        }
    }
}
