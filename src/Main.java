public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
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
        System.out.println(" ");
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
        System.out.println(" ");
        //Распечатываем список всех сотрудников со всеми имеющимися данными
    printEmployee(employees);
       //Считаем общую сумму зп всех сотрудников
    calculateSumSalary(employees);
      //Распечатываем сотрудника с min зп
    printMinSalary(employees);
      //Распечатываем сотрудника с max зп
    printMaxSalary(employees);
      //Считаем среднее значение зп по всем сотрудникам
    calculateAverageSum(employees);
        System.out.println(" ");
        //Распечатываем ФИО всех сотрудников
    System.out.println(man1.toString());
    System.out.println(man2.toString());
    System.out.println(man3.toString());
    System.out.println(man4.toString());
    System.out.println(man5.toString());
    System.out.println(man6.toString());
    System.out.println(man7.toString());
    System.out.println(man8.toString());
    System.out.println(man9.toString());
    System.out.println(man10.toString());
        System.out.println(" ");
        //Распечатываем общее кол-во сотрудников по всем отделам
    System.out.println("Общее количество сотрудников по всем отделам : " + Employee.id);

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
        System.out.println("Сумма затрат на зарплаты в месяц " + sum + " рублей");
    }
    public static void printMinSalary (Employee [] employees){
        double min = employees[0].getSalary();
        int number =0;
        for (int i = 0; i < employees.length; i++){
            if (employees[i].getSalary() < min)
            number = i;
        }
        System.out.println("Сотрудник с минимальной зарплайтой в месяц => " + employees[number] + " рублей");
    }
    public static void printMaxSalary (Employee [] employees){
        double max = employees [0].getSalary();
        int number = 0;
        for (int i = 0; i< employees.length; i++){
            if (max < employees[i].getSalary())
            number = i;
        }
        System.out.println("Сотрудник c максимальной зарплатой в месяц => " + employees[number] + " рублей");
    }
    public  static void calculateAverageSum (Employee [] employees){
        double average = 0;
        for (int i = 0; i < employees.length; i++){
            average += employees[i].getSalary()/employees.length;
        }
        System.out.println("Среднее значение зарплат " + average + " рублей");
    }






}