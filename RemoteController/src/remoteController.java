/*
Creare l'interfaccia remoteController.
Assegnargli dei campi e dei metodi (volumeUP, volumeDown, setVolume, turnOff)
Implementare l'interfaccia all'interno di alcune classi (LG Remote Controller - Samsung Remote Controller)
Fare in modo di alzare il volume in maniera autonoma
*/
public interface remoteController {
    int volume = 0;
    boolean status = false;

    void volumeUp();
    void volumeDown();
    void setVolume();
    void setStatus(boolean status);

}
