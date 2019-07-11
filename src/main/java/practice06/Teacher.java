package practice06;

public class Teacher extends Person{
    private int kclass;
    Teacher(String name,int age){
        super(name,age);
    }
    Teacher(String name,int age,int kclass){
        super(name,age);
        this.kclass=kclass;
    }

    public int getKlass(){
        return kclass;
    }

    public String introduce(){
        if(this.kclass==0)
            return super.introduce()+" I am a Teacher. I teach No Class.";
        else
            return super.introduce()+" I am a Teacher. I teach Class "+kclass+".";
    }
}
