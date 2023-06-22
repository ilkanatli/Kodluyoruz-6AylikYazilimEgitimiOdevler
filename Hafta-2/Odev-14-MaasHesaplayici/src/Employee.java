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

    double tax(){
        if (this.salary < 1000){
            return 0;
        }
        return this.salary * 0.03;
    }

    double bonus() {
        if (this.workHours > 40) {
            return  ((this.workHours - 40) * 30);
        }
        return 0;
    }

    double raiseSalary() {
        if ((2021 - this.hireYear) < 10) {
            return this.salary * 0.5;
        } else if ((2021 - this.hireYear) > 9 && (2021 - this.hireYear) < 20) {
            return this.salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }

    void employeeInfo() {
        System.out.println("Adi: " + this.name);
        System.out.println("Maasi: " + this.salary);
        System.out.println("Calisma Saati: " + this.workHours);
        System.out.println("Baslangic Yili: " + this.hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maas Artisi: " + raiseSalary());
        System.out.println("Vergiler ve Bonuslar ile birlikte maas: " + ((this.salary + bonus()) - tax()));
        System.out.println("Toplam maas: " + (this.salary + raiseSalary()));
    }
}
