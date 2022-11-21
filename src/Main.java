public class Main {
    public static void main(String[] args) {
        int currentYear = 2022;
        Person maksim = new Person(-1988,"Максим", "Минск","бренд-менеджером");
        Person anya = new Person(1993,"Аня", "Москва","методистом образовательных программ");
        Person katya = new Person(1992,"Катя", "Калининград","продакт-менеджером");
        Person artem = new Person(1995,"Артём", "Москва","директором по развитию бизнеса");
        Person vladimir = new Person(2001,"Владимир", "Казани","безработный");
        maksim.acquaintance(maksim);
        anya.acquaintance(anya);
        katya.acquaintance(katya);
        artem.acquaintance(artem);
        artem.acquaintance(vladimir);


    }
    void acquaintance(Person person) {
        System.out.println("Привет! Меня зовут " + person.name + ". Я из города " + person.getTown() + ". Я родился в " + person.getYearOfBirth() + " году.Я работаю на должности " + person.jobTitle + ". Будем знакомы!");
    }
}