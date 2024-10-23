Public class HelloWorld{
  public static void main(String[] args){
    print();
    printSchool();
  }

  static void print(){
    for(int i= 0; i < 2; i++){
      System.out.println("Hello World");
    } 
  }
  
  static void printSchool(){
    for(int i= 0; i < 5; i++){
      System.out.println("日本電子専門学校");
    } 
  }
}
