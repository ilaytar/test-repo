package builder;

import java.time.LocalDate;

public class APIS {
    private String lastName;
    private String firstName;
    private String middleName;
    private Gender gender;
    private LocalDate dateOfBirth;
    private String nationality;
    private String countryOfResidence;
    private String travelDocumentType;
    private int travelDocumentNumber;
    private String addressOfTheFirstNightSpentInTheUS;

    private APIS(APISBuilder builder) {
        this.lastName = builder.getLastName();
        this.firstName = builder.getFirstName();
        this.middleName = builder.getMiddleName();
        this.gender = builder.getGender();
        this.dateOfBirth = builder.getDateOfBirth();
        this.nationality = builder.getNationality();
        this.countryOfResidence = builder.getCountryOfResidence();
        this.travelDocumentType = builder.getTravelDocumentType();
        this.travelDocumentNumber = builder.getTravelDocumentNumber();
        this.addressOfTheFirstNightSpentInTheUS = builder.getAddressOfTheFirstNightSpentInTheUS();
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    public String getTravelDocumentType() {
        return travelDocumentType;
    }

    public int getTravelDocumentNumber() {
        return travelDocumentNumber;
    }

    public String getAddressOfTheFirstNightSpentInTheUS() {
        return addressOfTheFirstNightSpentInTheUS;
    }

    @Override
    public String toString() {
        return "APIS{" +
                "\nlastName='" + lastName + '\'' +
                "\n, firstName='" + firstName + '\'' +
                "\n, middleName='" + middleName + '\'' +
                "\n, gender=" + gender +
                "\n, dateOfBirth=" + dateOfBirth +
                "\n, nationality='" + nationality + '\'' +
                "\n, countryOfResidence='" + countryOfResidence + '\'' +
                "\n, travelDocumentType='" + travelDocumentType + '\'' +
                "\n, travelDocumentNumber=" + travelDocumentNumber +
                "\n, addressOfTheFirstNightSpentInTheUS='" + addressOfTheFirstNightSpentInTheUS + '\'' +
                '}';
    }

    public static class APISBuilder {
        private String lastName;
        private String firstName;
        private String middleName;
        private Gender gender;
        private LocalDate dateOfBirth;
        private String nationality;
        private String countryOfResidence;
        private String travelDocumentType;
        private int travelDocumentNumber;
        private String addressOfTheFirstNightSpentInTheUS;

        public APISBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public APISBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public APISBuilder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public APISBuilder setGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public APISBuilder setDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public APISBuilder setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public APISBuilder setCountryOfResidence(String countryOfResidence) {
            this.countryOfResidence = countryOfResidence;
            return this;
        }

        public APISBuilder setTravelDocumentType(String travelDocumentType) {
            this.travelDocumentType = travelDocumentType;
            return this;
        }

        public APISBuilder setTravelDocumentNumber(int travelDocumentNumber) {
            this.travelDocumentNumber = travelDocumentNumber;
            return this;
        }

        public APISBuilder setAddressOfTheFirstNightSpentInTheUS(String addressOfTheFirstNightSpentInTheUS) {
            this.addressOfTheFirstNightSpentInTheUS = addressOfTheFirstNightSpentInTheUS;
            return this;
        }

        public String getLastName() {
            return lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public Gender getGender() {
            return gender;
        }

        public LocalDate getDateOfBirth() {
            return dateOfBirth;
        }

        public String getNationality() {
            return nationality;
        }

        public String getCountryOfResidence() {
            return countryOfResidence;
        }

        public String getTravelDocumentType() {
            return travelDocumentType;
        }

        public int getTravelDocumentNumber() {
            return travelDocumentNumber;
        }

        public String getAddressOfTheFirstNightSpentInTheUS() {
            return addressOfTheFirstNightSpentInTheUS;
        }

        public APIS build() {
            return new APIS(this);
        }
    }
}
