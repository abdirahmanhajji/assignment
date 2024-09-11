class Example {
    int instanceVar = 10;
    static int staticVar = 20;

    void displayVariables() {
        int localVar = 30;

        System.out.println("Local variable: " + localVar); 
        System.out.println("Instance variable: " + instanceVar); 
        System.out.println("Static variable: " + staticVar);
    }
    static void staticMethod() {
        System.out.println("Static variable in static method: " + staticVar);
    }
}

public class Test {
    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example();

        obj1.displayVariables();
    
        obj1.instanceVar = 40; 
        Example.staticVar = 50; 
        obj2.displayVariables();
        
        Example.staticMethod();
    }
}
