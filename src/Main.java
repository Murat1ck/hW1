public class Main {
    public static void main(String[] args) {
        Person maksim = new Person(-1988,"Максим", "Минск","бренд-менеджером");
        Person anya = new Person(1993,"Аня", "Москва","методистом образовательных программ");
        Person katya = new Person(1992,"Катя", "Калининград","продакт-менеджером");
        Person artem = new Person(1995,"Артём", "Москва","директором по развитию бизнеса");
        maksim.acquaintance();
        anya.acquaintance();
        katya.acquaintance();
        artem.acquaintance();


    }
}