package labs_examples.objects_classes_methods.labs.methods;
import java.lang.Math;
public class MethodTraining {
    public static void main(String[] args) {
        System.out.println(fantasticFour(63,4,5,6));
        System.out.println(isPrime(42));
        System.out.println(countConsonants("MethodTraining"));
        System.out.println("Method with int signature "+ uniqueAdd(5,4));
        System.out.println("Method with double signature "+ uniqueAdd(234.2334, 234.8767));

        Student whatsHisFace = new Student(30, "whatsHisFace", 3.7f);
        System.out.println("Current student details - id : "+whatsHisFace.id+" name: "+whatsHisFace.name+ " GPA: "+whatsHisFace.GPA);
        changeStudentID(whatsHisFace);
        System.out.println("After pass by reference, new student details - id : "+whatsHisFace.id+" name: "+whatsHisFace.name+ " GPA: "+whatsHisFace.GPA);

    }
    public static int fantasticFour(int a, int b, int c, int d){
       int maximum = a;
       if (b > maximum) {
           maximum = b;
       } if (c > maximum) {
           maximum = c;
       } if (d > maximum) {
           maximum = d;
       }
       return maximum;
    }

    public static boolean isPrime(int n) {
        if (n<2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n > 2) {
            for (int k = 3; k <= Math.sqrt(n); k++) {
                if (n%k == 0) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return true;
    }

    public static int countConsonants(String s) {
        String vowels = "aeiou";
        int count = 0;
        char[] givenString = s.toCharArray();
        for(int i = 0;i < givenString.length;i++) {
            if (vowels.indexOf(givenString[i]) == -1)  {
                count += 1;
            }
        }
        return count;
    }

    // method overloading - overloading the same method with different signatures
    public static int uniqueAdd(int a, int b) {
        return a+b;
    }
    public static double uniqueAdd(double a, double b) {
        return a+b/(a-1);
    }

    // pass by value vs pass by reference
    public static void changeStudentID(Student randomArgument) {
        randomArgument.id = 102;
        randomArgument.name = "hisFaceIsKaboom!!!";
    }
}
class Student {
    int id;
    String name;
    float GPA;

    public Student(int id, String name, float GPA) {
        this.id = id;
        this.name = name;
        this.GPA = GPA;
    }
}
