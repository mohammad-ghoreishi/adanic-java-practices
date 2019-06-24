public class Run {
    public static void main(String[] args) {
        Student std1 = new Student("Ehsan","Edalat","910209471");
        Student std2 = new Student("Seyed","Ahmadpanah","910209472");
        Student std3 = new Student("Ahmad","Asadi","910209473");

        std1.print();
        std1.setGrade(15);
        std1.print();

        std2.print();
        std2.setGrade(11);
        std2.print();

        std3.print();
        std3.setFirstName("HamidReza");
        std3.print();
    }
}
