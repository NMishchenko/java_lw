package university.Tests;

import university.Controllers.JsonManager;
import university.Controllers.UniversityCreator;
import university.Models.University;

import org.junit.Test;

public class UniversityTest {
    @Test
    public void WriteUniversityModelToJsonAndRead_ShouldBeEqual() {
        UniversityCreator universityCreator = new UniversityCreator();
        University oldUniversity = universityCreator.createTypicalUniversity(5);

        JsonManager jm = new JsonManager();
        jm.write(oldUniversity);
        University newUniversity = jm.read();

        newUniversity.equals(oldUniversity);
    }
}
