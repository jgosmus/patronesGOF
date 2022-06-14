public class AdminBuilder extends Builder {

    public Builder name(String name) {
        this.user.setName("Adm-" + name);
        return this;
    }

    public Builder surname(String surname) {
        this.user.setSurname(surname);
        return this;
    }

    public Builder age(int age) {
        this.user.setAge(age);
        return this;
    }

}
