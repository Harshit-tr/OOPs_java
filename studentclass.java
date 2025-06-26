public class studentclass{
    public static class Student{
        //creating a new data type
        String name;
        int rno;
        double percent;
        }
    public static void main(String[] args){
        Student x = new Student(); //Object
        x.name = "Harshit";
        x.rno = 42;
        x.percent = 75.5;
        System.out.println(x.name);
    }
}