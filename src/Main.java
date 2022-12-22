public class Main {
    public static void main(String[] args) {
    Name man1 = new Name("Петров","Петр","Петрович");
    Name man2 = new Name("Иванов","Иван","Иванович");
    Name man3 = new Name("Семёнов","Семён","Семёнович");
    Name man4 = new Name("Круглова","Ирина","Анатольевна");
    Name man5 = new Name("Далетдаева","Кристина","Арикадьевна");
    Name man6 = new Name("Козлов","Дмитрий","Павлович");
    Name man7 = new Name("Егоров","Геннадий","Вячеславович");
    Name man8 = new Name("Белобородова","Анастасия","Сергеевна");
    Name man9 = new Name("Павлов","Евгений","Александрович");
    Name man10 = new Name("Светлова","Людмила","Борисовна");

    Employee [] employees = new Employee[10];
    employees[0] = new Employee(man1,1,20_000);
    employees[1] = new Employee(man2,5,46_000);
    employees[2] = new Employee(man3,3,50_000);
    employees[3] = new Employee(man4,2,38_000);
    employees[4] = new Employee(man5,4,49_000);
    employees[5] = new Employee(man6,1,18_000);
    employees[6] = new Employee(man7,5,27_000);
    employees[7] = new Employee(man8,3,44_000);
    employees[8] = new Employee(man9,2,43_000);
    employees[9] = new Employee(man10,3,51_000);
        //Распечатываем список всех сотрудников со всеми имеющимися данными
    printEmployee(employees);
       //Считаем общую сумму зп всех сотрудников
    calculateSumSalary(employees);
      //Распечатываем сотрудника с min зп
    printMinSalary(employees);
      //Распечатываем сотрудника с max зп
    printMaxSalary(employees);
      //Считаем среднее значение зп по всем сотрудникам
    calculateAverageSumSalary(employees);
    //Распечатываем ФИО всех сотрудников
    printFullNameAllEmployees(employees);
        System.out.println(" ");
    ////Проиндексировали зп всех сотрудников на % и вызвали изменения в зп каждого сотрудника
    calculatePercentSalary(employees,2);
    ///Распечатываем минимальную зарплату в конкретном отделе
    printMinSalaryInDepartment(employees,2);
    ///Распечатываем максимальную зарплату в конкретном отделе
    printMaxSalaryInDepartment(employees,2);
    ///Считаем сумму зарплат всех сотрудников в конкретном отделе
    calculateSumSalaryInDepartment(employees,2);
    ///Считаем среднюю зарплату по конкретному отделу
    calculateAverageSumSalaryInDepartment(employees,2);
    ///Индексируем зарплату сотрудников конкретного отдела на заданный %
    calculatePercentSalaryInDepartment(employees,2,2);
    ///Распечатываем всех сотрудников конкретного отдела (все данные сотрудников, кроме № отдела)
    printEmployeesInDepartment(employees,2);
    ///Распечатываем id, ФИО и зарплату сотрудников конкретного отдела,если зп меньше заданного числа
    printEmployeeRandomMinNumber(employees,30000);
    ///Распечатываем id, ФИО и зарплату сотрудников конкретного отдела,если зп больше или равно заданному числу
    printEmployeeRandomMaxNumber(employees,30000);

    }
    public static void printEmployee (Employee[] employees){
        for (int i = 0; i< employees.length ; i++){
            System.out.println(employees[i]);
        }
    }
    public static void calculateSumSalary (Employee[] employees){
        double sum =0;
        for (int i = 0; i < employees.length; i++){
            sum += employees[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц => " + sum + " рублей.");
    }
    public static void printMinSalary (Employee [] employees){
        double min = employees[0].getSalary();
        int number =0;
        for (int i = 0; i < employees.length; i++){
            if (employees[i].getSalary() < min)
            number = i;
        }
        System.out.println("Сотрудник с минимальной зарплайтой в месяц => " + employees[number] + " рублей.");
    }
    public static void printMaxSalary (Employee [] employees){
        double max = employees [0].getSalary();
        int number = 0;
        for (int i = 0; i< employees.length; i++){
            if (max < employees[i].getSalary())
            number = i;
        }
        System.out.println("Сотрудник c максимальной зарплатой в месяц => " + employees[number] + " рублей.");
    }
    public  static void calculateAverageSumSalary (Employee [] employees){
        double average = 0;
        for (int i = 0; i < employees.length; i++){
            average += employees[i].getSalary()/employees.length;
        }
        System.out.println("Среднее значение зарплат " + average + " рублей.");
    }
    public static void calculatePercentSalary (Employee [] employees, double percent){
        percent = percent/100;
        double salary = 0;
        double salaryPercent = 0;
        for (int i = 0; i < employees.length; i++){
            salary = employees[i].getSalary();
            salaryPercent = (salary * percent) + salary;
            System.out.println("Зарплата сотрудника после индексации => " + employees[i].getFullName() + " => " + salaryPercent + " рублей.");
        }
    }
    public static void  printFullNameAllEmployees(Employee [] employees){
        int i = 0;
        while (i < employees.length){
            System.out.println("ФИО сотрудника => " + employees[i].getFullName());
            i++;
        }
    }
    public static void printMinSalaryInDepartment (Employee [] employees, int departmentNumber ){
        double min = 0;
        int number = 0;
        for (int i = 0; i < employees.length; i++){
            if (employees[i].getDepartmentNumber() == departmentNumber){
                if (min > employees[i].getSalary() || min == 0){
                    min = employees[i].getSalary();
                    number = i;
                }
            }
        }
        System.out.println("Сотрудник из " + departmentNumber + " отдела с минимальной зарплайтой в месяц => " + employees[number] + " рублей.");
    }
    public static void printMaxSalaryInDepartment (Employee [] employees, int departmentNumber){
        double max = 0;
        int number = 0;
        for (int i = 0; i < employees.length; i++){
            if ((employees[i].getDepartmentNumber() == departmentNumber) && (employees[i].getSalary() > max)){
                max = employees [i].getSalary();
                number = i;
            }
        }
        System.out.println("Сотрудник из " + departmentNumber + " отдела " + " с максимальной зарплатой => " + employees[number]);
    }
    public static void calculateSumSalaryInDepartment (Employee [] employees, int departmentNumber){
        double sum = 0;
        int number = 0;
        for (int i = 0; i < employees.length; i++){
            if (employees[i].getDepartmentNumber() == departmentNumber){
                sum += employees[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты по " + departmentNumber + " отделу => " + sum + " рублей.");
    }
    public static  void calculateAverageSumSalaryInDepartment (Employee [] employees, int departmentNumber){
        double average = 0;
        double sum = 0;
        double number = 0;
        for (int i = 0; i < employees.length; i++){
            if (employees[i].getDepartmentNumber() == departmentNumber){
                sum += employees[i].getSalary();
                number++;
            }
        }
        average = sum/number;
        System.out.println("Средняя зарплата по " + departmentNumber + " отделу => " + average + " рублей.");
    }
    public static void calculatePercentSalaryInDepartment (Employee [] employees, int departmentNumber, double percent){
        percent = percent/100;
        double salary = 0;
        double salaryPercent = 0;
        for (int i = 0; i < employees.length; i++){
            if (employees[i].getDepartmentNumber() == departmentNumber){
                salary = employees[i].getSalary();
                salaryPercent = (salary*percent)+salary;
                System.out.println(employees[i].getFullName() + " из " + departmentNumber + " отдела , зарплата после индексации на " + percent + " % => " + salaryPercent + " рублей.");
            }
        }
    }
    public static void printEmployeesInDepartment (Employee [] employees, int departmentNumber){
        for (int i = 0; i < employees.length; i++){
            if (employees[i].getDepartmentNumber() == departmentNumber)
                System.out.println("Сотрудник " + departmentNumber + " отдела =>  id сотрудника : " + employees[i].getId() + ", " + " ФИО : " + employees[i].getFullName() + " , зарплата в месяц : " +  employees[i].getSalary() + " рублей.");
        }
    }
    public static void printEmployeeRandomMinNumber (Employee [] employees, double randomNumber){
        for (int i = 0; i < employees.length; i++){
            if (employees[i].getSalary() < randomNumber)
            System.out.println("Сотрудник с зарплатой меньше числа " +  randomNumber + " => "  + " id сотрудника : " + employees[i].getId() + ", " + " ФИО : " + employees[i].getFullName() + " , зарплата в месяц : " +  employees[i].getSalary() + " рублей.");
        }
    }
    public static void printEmployeeRandomMaxNumber (Employee [] employees, double randomNumber){
        for (int i = 0; i < employees.length; i++){
            if (employees[i].getSalary() >= randomNumber)
                System.out.println("Сотрудник с зарплатой больше или равно числу " +  randomNumber + " => "  + " id сотрудника : " + employees[i].getId() + ", " + " ФИО : " + employees[i].getFullName() + " , зарплата в месяц : " +  employees[i].getSalary() + " рублей.");
        }
    }


}