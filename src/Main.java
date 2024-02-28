import java.util.Scanner;
class Person{
    public String FIO;
    public String Adress;
    public String Education;
    public int Age;
    Person(String FIO, String Adress,String Education, int Age){
        this.FIO = FIO;
        this.Adress = Adress;
        this.Education = Education;
        this.Age = Age;
    }

    }

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Иван Иванов", "ул. Пушкина 10", "Высшее", 25);
        Person person2 = new Person("Мария Смирнова", "пр. Ленина 5", "Высшее", 30);
        Person person3 = new Person("Анна Петрова", "пл. Гагарина 3", "Среднее", 35);
        Person person4 = new Person("Алексей Сидоров", "ул. Лесная 15", "Начальное", 20);
        Person person5 = new Person("Екатерина Кузнецова", "пер. Солнечный 7", "Среднее", 28);
        Person[] Persons = {person1, person2, person3, person4,person5};
        System.out.print("Введите ограничение возраста: ");
        Scanner input = new Scanner(System.in);
        int MaxAge = input.nextInt();
        System.out.printf("Люди старше %d: \n", MaxAge);
        for (Person p : Persons){
            if(p.Age > MaxAge ){
                System.out.println(p.FIO);
            }
        }
        System.out.println();
        System.out.println("Люди с высшим образованием:");
        for (Person p : Persons){
            if (p.Education == "Высшее"){
                System.out.println(p.FIO);

            }

        }


    }
}