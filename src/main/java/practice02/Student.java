package practice02;

public class Student extends Person{
    private int kclass;
    Student(String name,int age,int kclass){
        super(name,age);
        this.kclass=kclass;
    }

    public int getKlass(){
        return  kclass;
    }

    public String introduce(){
        return "I am a Student. I am at Class "+kclass+".";
    }

}
