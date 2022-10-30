public class Main {

    public static void main(String[] args) {

        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setCity("Сидней")
                .build();

        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);
        System.out.println(son.hasAge());
        son.setAge(1);
        System.out.println(son.hasAge());
        System.out.println(son.hasAddress());
        son.happyBirthday();
        System.out.println("У " + mom + " есть сын, " + son);
    }
}

