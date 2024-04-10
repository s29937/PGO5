import java.time.Year;
public class Employee {
    public String name;
    public String surname;
    public String adress;
    public String email;
    public int pesel;
    public int rokZatrudnienia;

    public int calculateSalary(){
        int rise = 1000;
        int year = Year.now().getValue();
        int calculateSalary = 3000 + (rokZatrudnienia - year) * rise;
        return calculateSalary;
    }
}
