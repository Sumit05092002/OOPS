public class Student {
    // creating datatype
    public static class cars {
        String name;
        int modelNo;
        Double price;
    }

    public static void print(cars c) {
        System.out.println(c.name);
    }

    public static void update(cars c) {
        c.name = "BMW";
    }

    public static void main(String args[]) {
        // initializing the datatype
        cars c1 = new cars();
        c1.name = "Audi";
        c1.modelNo = 1;
        c1.price = 2.5;
        // Accessing the dataType
        // System.out.println(c1.name);
        // If we declare the car class in the main function then we cannot use it
        // anywhere outside the main function
        // we can pass the object of a class in a function if and only if we have
        // declared the class outside the main function
        print(c1);
        // we can also update the value of an object by passing it in a function and the
        // updation happens because of call by reference
        update(c1);
        print(c1);
        // will use myStudent class attribute in this class
        myStudent s1 = new myStudent();
        s1.name = "Sumit";
        // s1.rno=122;
        s1.percentage = 80.00;
        // public access modifiers allows us to access an attribute outside the folders
        // or package also
        // private access modifiers allows us to access an attribute within the scope of
        // the class only
        // default access modifiers allows us to access an attribute within a the same
        // package or folder
        // If a particular attribute is set to private we can neither change its value
        // nor print its value that is neither we can set its value nor we can access it
        // we are able to use the myStudent class in another class because it is
        // initialized by public access specifier
        // Now if I make the rno attribute of myStudent class private we cannot access
        // it in this class
        // If I want to access any private attribute of a particular class I need to use
        // getter function
        System.out.println(s1.getRno());
        //Now if we want to set the value of Rno then we can do by setter function

        s1.setRno(76);
        System.out.println(s1.getRno());

        //let us use a constructor to create an identity of a student in one line only
        myStudent s2=new myStudent("Rahul",98.00);
        System.out.println(s2.name);
        System.out.println(s2.percentage);
    }
}

