public class Exercise1 {

    static boolean iwillBehave = true;
    static boolean IwillGraduate = true;
    public static void main(String[] args) throws Exception {

        // Agreement
        // Precondition

        assert iwillBehave == true : "puro ako laro";

        College();

        assert IwillGraduate == true : "sure na sure lods";
    }

    static void College() {

        IwillGraduate = false ;
        System.out.println("VALORANT") ;


    }
}
