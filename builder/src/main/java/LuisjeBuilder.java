public class LuisjeBuilder extends Builder {

    public Builder name(String name) {
        this.user.setName("Perro-" + name);
        return this;
    }

    public Builder surname(String surname) {
        this.user.setSurname("Maricon-" + surname);
        return this;
    }

    public Builder age(int age) {
        this.user.setAge(age);
        return this;
    }

}
