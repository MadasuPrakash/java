
class A{
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }
}

class sub extends A{
}


 class B {
    public static void main(String[] args) {
      
       A a = new A();

        int sum = a.add(10, 5);
        System.out.println("Sum: " + sum);

        int difference = a.subtract(20, 8);
        System.out.println("Difference: " + difference);
    }
}
