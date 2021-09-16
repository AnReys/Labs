package lab0;

public class Dog extends Animal {
    int dogness;

    Dog(int weight1,int height1,int length1, Sex sex1){
        this.weight = weight1;
        this.lenght = length1;
        this.height = height1;
        this.sex = sex1;

    }

    String getVoice(){
        return "Davvv";
    }
}
