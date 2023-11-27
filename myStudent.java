public class myStudent{
    String name;
    private int rno=50;
    double percentage;

    public int getRno(){
        return rno;
    } //getter function

    public void setRno(int rno){
        // rno=y;
        //use of this keyword
        this.rno=rno;
    }

    //let us creaate a default constructor
    public myStudent(){

    }

    public myStudent(String naam, double per){
        name=naam;
        percentage=per;
    }
}