package lab4;

import com.google.gson.Gson;
import lab2.controllers.UniversityCreator;
import lab2.model.University;
import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

class RunTest {

    @Test
    public void main() throws IOException {
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createUniversityRandomly();
        Gson gson = new Gson();
        String universityToJson = gson.toJson(university);
        
        FileWriter fileWriter = new FileWriter("file.txt");
        fileWriter.write(universityToJson);

        University universityFromJson = gson.fromJson(universityToJson, University.class);
        System.out.println(university.equals(universityFromJson));

    }
}