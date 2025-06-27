// Q4)Write a program to implement constructor reference


interface StudentFactory {
  Students create(String name, int age);
}


class Students{
  String name;
  int age;
  public Students(String name, int age) {
     this.name= name;
     this.age = age;
  }


  void display(){
     System.out.println(this.name + " " + this.age);
  }
}




class Main {
  public static void main(String[] args) {
     StudentFactory stu = Students::new;
     Students s = stu.create("Aman", 22);
     s.display();
  }
}
