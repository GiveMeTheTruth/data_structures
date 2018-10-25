public class Student {
    private String name;
    private int score;

    public Student(String sName, int sScore) {
        name = sName;
        score = sScore;
    }


    @Override
    public String toString() {
        return String.format("student:name=%s, score=%d", name, score);
    }

    public static void main(String[] args) {
        Array<Student> aaa = new Array<>();
        aaa.addLast(new Student("a", 100));
        aaa.addLast(new Student("b", 300));
        aaa.addLast(new Student("c", 500));
        System.out.println(aaa);
    }
}
