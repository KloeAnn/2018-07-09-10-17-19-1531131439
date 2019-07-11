package practice07;

public class Teacher extends Person{
    private Klass kclass;

    Teacher(String name,int age){
        super(name,age);
    }

    Teacher(String name,int age,Klass kclass){
        super(name,age);
        this.kclass=kclass;
    }

    public Klass getKlass(){
        return  kclass;
    }

    public String introduce(){
        if(this.kclass.getNumber()==0)
            return super.introduce()+" I am a Teacher.I teach No Class.";
        else
            return super.introduce()+" I am a Teacher. I teach "+getKlass().getDisplayName()+".";
    }
    public String introduceWith(Student student){
        if(student.getKlass().getNumber()==this.kclass.getNumber())
            return super.introduce()+ " I am a Teacher. I teach "+student.getName()+".";
        else
            return super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
    }
}
