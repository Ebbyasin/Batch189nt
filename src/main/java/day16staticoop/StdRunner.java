package day16staticoop;

public class StdRunner {

    public static void main(String[] args) {
        //stdName static oldugundan ona ulasmak icin object olusturmadim
        //Sadece class ismini kullanmak yeterlidir

        System.out.println(Student.stdName);

        //age non-static oldugundan ona ulasmak icin object olusturmak zorundayiz

        Student ali = new Student();
        System.out.println(ali.age);

        Student.staticMethod();
        ali.nonstaticMethod();

        //Class ismi üzerinden yaptigimiz her method static tir.(LocalDate vb)
    }
}
