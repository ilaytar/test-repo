import builder.APIS;
import builder.Gender;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class BuilderTest {
    @Test
    public void builderTest() {
        APIS apis = new APIS.APISBuilder()
                .setFirstName("Michael")
                .setLastName("Wells")
                .setMiddleName("Steven")
                .setGender(Gender.MALE)
                .setDateOfBirth(LocalDate.of(1990, 3, 5))
                .setNationality("usa")
                .setTravelDocumentType("passport")
                .setTravelDocumentNumber(888325)
                .setCountryOfResidence("USA")
                .setAddressOfTheFirstNightSpentInTheUS("47 W 13th St, New York, NY 10011, USA")
                .build();

        System.out.println(apis.toString());

        Assert.assertEquals(apis.getFirstName(), "Michael");
        Assert.assertEquals(apis.getTravelDocumentNumber(), 888325);
    }
}
