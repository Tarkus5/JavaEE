/*
Creare l'interfaccia remoteController.
Assegnargli dei campi e dei metodi (volumeUP, volumeDown, setVolume, turnOff)
Implementare l'interfaccia all'interno di alcune classi (LG Remote Controller - Samsung Remote Controller)
Fare in modo di alzare il volume in maniera autonoma
*/

public class Main {
    public static void main(String[] args) {
    lgRemoteController controllerLG = new lgRemoteController();
    controllerLG.setStatus(true);
    controllerLG.volumeUp();
    controllerLG.setVolume();
    controllerLG.volumeDown();
    controllerLG.setVolume();
    controllerLG.setStatus(false);

    System.out.println("");

    samsungRemoteController controllerSamsung = new samsungRemoteController();
    controllerSamsung.setStatus(true);
    controllerSamsung.volumeUp();
    controllerSamsung.setVolume();
    controllerSamsung.volumeDown();
    controllerSamsung.setVolume();
    controllerSamsung.setStatus(false);
    }
}