package lab0;

public abstract class Animal {
    int weight;
    int height;
    int lenght;
    Sex sex;

    abstract String getVoice();

    String getVoice(){
        return "AAAAA";
    }
}
