public class Person {

    private final String name;
    private final String surname;
    private int age;
    private String city;
    private boolean hasAge;
    private boolean address;

    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
        if (age > 0) {
            hasAge = true;
        }
        if (city != null) {
            address = true;
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public void setAge(int age) {
        this.age = age;
        hasAge = true;
    }

    public void setCity(String city) {
        this.city = city;
        address = true;
    }

    public void happyBirthday() {
        age++;
    }

    public boolean hasAge() {
        return hasAge;
    }

    public boolean hasAddress() {
        return address;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surname)
                .setCity(city);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
