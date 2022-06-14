public abstract class Builder {

    protected User user;

    public Builder() {
        this.user = new User();
    }

    User build() {
        return this.user;
    }

    abstract Builder name(String name);
    abstract Builder surname(String surname);
    abstract Builder age(int age);

}
