 class subject {
     double maths;
     double english;
     double hindi;
     double science;
     double sanskrit;
 };
class student{
    public static void main(String[] args) {
        subject a = new subject();
        double avg;
        a.maths = 20;
        a.english = 30;
        a.hindi = 15;
        a.science = 12;
        a.sanskrit = 20;

        avg = (a.maths + a.english + a.hindi + a.science + a.science) / 5;
        System.out.println("avg is" + avg);
    }
}