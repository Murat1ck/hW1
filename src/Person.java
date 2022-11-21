public class Person {
    private int yearOfBirth;
    public String name;
    private String town;
    public String jobTitle;


    public Person(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        }else {
            this.yearOfBirth = yearOfBirth;
        }
        if (name == null) {
            this.name = "Информация не указана";
        }else {
            this.name = name;
        }
        if (town == null) {
            this.town = "Информация не указана";
        }else {
            this.town = town;
        }
        if (jobTitle == null) {
            this.jobTitle = "Информация не указана";
        }else {
            this.jobTitle = jobTitle;
        }
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        }else {
            this.yearOfBirth = yearOfBirth;
        }    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null) {
            this.town = "Информация не указана";
        }else {
            this.town = town;
        }    }

    void acquaintance(Person person) {
        System.out.println("Привет! Меня зовут " + person.name + ". Я из города " + person.getTown() + ". Я родился в " + person.getYearOfBirth() + " году.Я работаю на должности " + person.jobTitle + ". Будем знакомы!");
    }
}
//"Привет! Меня зовут… Я из города… Я родился в… году. Будем знакомы!"