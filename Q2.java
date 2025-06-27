// Q2)Using (instance) Method reference create and apply add and subtract method and using (Static) Method reference create and apply multiplication method for the functional interface created

class Number{
  int Add(int a, int b){
     return a + b;
  }


  int Subtract(int a, int b){
     return a > b ? a - b : b - a;
  }


  public static int Multiply(int a, int b){
     return a * b;
  }
}


interface NumberMethods{
  int Calculate (int a, int b);
}


class Main{
  public static void main(String[] args) {
     Number number = new Number();
     NumberMethods add = number::Add;
     System.out.println("Addition method: " + add.Calculate(10,20));


     NumberMethods substract = number::Subtract;
     System.out.println("Substraction method: " + substract.Calculate(10,20));


     NumberMethods multiply = Number::Multiply;
     System.out.println("Substraction method: " + multiply.Calculate(10,20));
  }
}
