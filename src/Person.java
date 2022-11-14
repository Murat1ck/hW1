public class Person {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    Person(int yearOfBirth, String name, String town, String jobTitle) {
        this.yearOfBirth = yearOfBirth;
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        }else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        this.name = name;
        if (name == null) {
            System.out.println("Информация не указана");

        }
        this.town = town;
        if (town == null) {
            System.out.println("Информация не указана");
        }
            this.jobTitle = jobTitle;
            if (jobTitle == null) {
                System.out.println("Информация не указана");
            }
        }

    void acquaintance() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году.Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }
}
//"Привет! Меня зовут… Я из города… Я родился в… году. Будем знакомы!"