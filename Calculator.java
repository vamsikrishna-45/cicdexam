class Calculator{

    int add(int a, int b){
        return a + b;
    }

    int subtract(int a, int b){
        return a - b;
    }

    int multiply(int a, int b){
        return a * b;
    }

    int divide(int a, int b){
        return a / b;
    }

    int modulus(int a, int b){
        return a % b;
    }

    int square(int a){
        return a * a;
    }

    int cube(int a){
        return a * a * a;
    }

    int maximum(int a, int b){
        if(a > b)
            return a;
        else
            return b;
    }

    int minimum(int a, int b){
        if(a < b)
            return a;
        else
            return b;
    }

    public static void main(String args[]){

        Calculator c = new Calculator();

        int a = 20;
        int b = 10;

        System.out.println("Addition = " + c.add(a,b));
        System.out.println("Subtraction = " + c.subtract(a,b));
        System.out.println("Multiplication = " + c.multiply(a,b));
        System.out.println("Division = " + c.divide(a,b));


        System.out.println("Square of a = " + c.square(a));
        System.out.println("Cube of b = " + c.cube(b));

        System.out.println("Maximum Number = " + c.maximum(a,b));
        System.out.println("Minimum Number = " + c.minimum(a,b));
    }
}
