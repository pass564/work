public class Animal {
    private String gender;
    private String species;
    private int age;

    public Animal(){}

    public Animal(String gender, String species, int age) {
        this.gender = gender;
        this.species = species;
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
