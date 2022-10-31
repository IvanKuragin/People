public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String city;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Вы указали неверный возраст");
        } else {
            this.age = age;
        }
        return this;
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
            if (surname == null) {
                throw new IllegalStateException("Вы не указали фамилию");
            }
        return new Person(name, surname, age, city);
    }
}
