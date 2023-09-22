public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        double taxation;
        if (this.salary < 1000) {
            return 0;
        } else {
            taxation = this.salary * 0.03;
        }
        return taxation;
    }

    double bonus() {
        int extraHours;
        double extraMoney;
        if (this.workHours > 40) {
            extraHours = this.workHours - 40;
            extraMoney = extraHours * 30;
        } else {
            return 0;
        }
        return extraMoney;
    }

    double raiseSalary() {
        double increasedSalary;
        int currentTime = 2021;
        if (currentTime - this.hireYear < 10) {
            increasedSalary = this.salary * 0.05;
        } else if (9 < currentTime - this.hireYear && currentTime - this.hireYear < 20) {
            increasedSalary = this.salary * 0.10;
        } else {
            increasedSalary = this.salary * 0.15;
        }
        return increasedSalary;
    }

    public String toString() {

        System.out.println("Adı : " + this.name);
        System.out.println("Maaş : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş artışı : " + raiseSalary());
        System.out.println("Vergi ve bonuslarla maaş : " + (this.salary + tax() + bonus()));
        return "Toplam maaş : " + (this.salary + tax() + bonus() + raiseSalary());
    }

}

