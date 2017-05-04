
package callinginheritedclassmembers;

public class Shark extends Fish{
    private int numberOfFins=8;
    
    public Shark(int age){
        super(age);
        this.size=4;        //Using this can also access members of Parent Class.
    }
    public void displaySharkDetails(){
        System.out.println("shark with age "+ this.getAge());   //"this" -> accessing parents members.
        System.out.println("shark with age "+ super.getAge());  //"super"-> accessing parents members 
        System.out.println(this.size +" meter Long");
        System.out.println(super.size +" meter Long");
        System.out.println(this.numberOfFins+" fins");
        //System.out.println(super.numberOfFins+" fins"); Compile time Error. // Cant use super to access members of current class.
    }
    
    
}
