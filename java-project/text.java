import java.util.Properties;

class text{
    public static void printSystemProperties(){
        Properties props=System.getProperties();
System.out.println("printing system properties using java"+" "+ props);

    }
    public static void main(String[] args) {
        System.out.println("Java Pogram started");
printSystemProperties();
    }
}