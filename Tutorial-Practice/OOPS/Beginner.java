package OOPS;

class Student{
   
    private String name;
    private int age;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
   
     public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
        
   
    

    
    public void printInfo(){
     
       System.out.println("Name and age of the student is: "+name+" and "+ age);
    }
}
public class Beginner {
    public static void main(String[] args) {
      
        //  Student[] students = new Student[4];

        // students[0] = new Student("Ram", 20);
        // students[1] = new Student("Som", 21);
        // students[2] = new Student("Ditiya", 20);
        // students[3] = new Student("Debarghya", 22);

        // for (int i = 0; i < students.length; i++) {
        //     students[i].printInfo();
        // }
        // Student s1 = new Student();
        // s1.setName("Deepak");
        // System.out.println(s1.getName());
        Student[] students = new Student[4];
        
        students[0] = new Student();
        students[0].setName("Som");
        students[0].setAge(21);

        students[1] = new Student();
        students[1].setName("Ditiya");
        students[1].setAge(20);
        
        students[2] = new Student();
        students[2].setName("Debarghya");
        students[2].setAge(22);

        students[3] = new Student();
        students[3].setName("Sreya");
        students[3].setAge(21);

        for(int i=0; i<students.length; i++){
            students[i].printInfo();
            System.out.println("---------------------------------------------------");
        }




    }
}  

