class StaticBlock {
  public static void main(String[] args) {
    System.out.println("You are using Windows operating system.");
  }
 
  static {
    String os = System.getenv("OS");
    if (os.equals("Windows_NT") != true) {
      System.exit(1);
    }
  }
}