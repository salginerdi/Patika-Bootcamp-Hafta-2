public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = 0.0;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void tax(double taxation) {
        if (this.salary < 1000) {
            System.out.println("Vergiye tabii değilsiniz");
        } else {
            taxation = (this.salary * 0.03);
            System.out.println("Vergi : " + taxation);
        }

    }

    void bonus(int extraHours, int extraMoney) {
        if (this.workHours > 40) {
            extraHours = this.workHours - 40;
            extraMoney = extraHours * 30;
            System.out.println("Bonus : " + extraMoney);
        }
    }

    void raiseSalary(int currentTime, double increasedSalary) {
        currentTime = 2021;
        if (currentTime - this.hireYear > 10) {
            increasedSalary = this.salary * 0.05;
            System.out.println("Maaş artışı" + increasedSalary);
        } else if (9 < currentTime - this.hireYear || currentTime - this.hireYear < 20) {
            increasedSalary = this.salary * 0.10;
            System.out.println("Maaş artışı" + increasedSalary);
        } else if (19 < currentTime - this.hireYear) {
            increasedSalary = this.salary * 0.15;
            System.out.println("Maaş artışı" + increasedSalary);
        }
    }

    void print() {
        System.out.println("Adı : " + this.name);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
    }
}
