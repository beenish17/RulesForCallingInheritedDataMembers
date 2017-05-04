
package callinginheritedclassmembers;

public class Fish {
    //Imp:
    //1: super is used to access the members of Parents class.
    //2: super() is used to acsess the Constructors of Parents class.
    //3: this is used to access the data members of Parents as well as Current Class.
    //4: this() is used to acces the Constructors of current class.
    protected int size;
    private int age;
    
    public Fish(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
