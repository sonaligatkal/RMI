import java.rmi.*;
public class MyClient{

public static void main(String args[]){
try{

Adder stub=(Adder)Naming.lookup("rmi://localhost:5000/sonoo");

System.out.println("Addition is: " + stub.add(10,20));

}
catch(Exception e)
{System.out.println(e);}
}

}