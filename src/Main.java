public class Main {

    public static void main(String[] args) {
        goToWalk("Ulan", 27, 35);
        goToWalk("Sanjar", 19, 11);
        goToWalk("Alym", 46, 0);

        System.out.println("_______________________");

        goToWalk("Sam",generaterandomAge(),20);
        goToWalk("Ken",generaterandomAge(),15);
        goToWalk("Ali",generaterandomAge(),33);

        System.out.println("_______________________");

        System.out.println(canWeGoToWalk(generaterandomAge(),22));
        System.out.println(canWeGoToWalk(generaterandomAge(),34));
        System.out.println(canWeGoToWalk(generaterandomAge(),-10));

    }

    public static void goToWalk(String name, int age, int temperature) {
        if (age > 20 && age < 45 && temperature < 30 && temperature > -20) {
            System.out.println(name+ " ,tebe mojno idti gulyat");
        } else if (age <= 20 && temperature > 0 && temperature < 28) {
            System.out.println(name+ " , tebe mojno idti gulyat molodoi");
        } else if (age >= 45 && temperature > -10 && temperature < 28) {
            System.out.println(name+ " ,tebe mojno idti gulyat , no ostorojnee");
        } else {
            System.out.println("Sidi doma, "+ name);
        }
    }

    public static String canWeGoToWalk(int age,int temperature){
        String answer;
        if (age > 20 && age < 45 && temperature < 30 && temperature > -20) {
             answer="tebe mojno idti gulyat";
        } else if (age <= 20 && temperature > 0 && temperature < 28) {
           answer= "tebe mojno idti gulyat molodoi";
        } else if (age >= 45 && temperature > -10 && temperature < 28) {
             answer="tebe mojno idti gulyat , no ostorojnee";
        } else {
           answer="Sidi doma";
        }
        return answer;
    }

    public static int generaterandomAge() {
        int randomNumber = 1+(int) (Math.random() * 107) ;
        System.out.println(randomNumber);
        return randomNumber;
    }
}