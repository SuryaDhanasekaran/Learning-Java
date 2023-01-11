public class Main {



    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++){
            
            LPAStudent s = new LPAStudent("231" + i,
                    switch(i){
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";

                    },
                     "5/10/1985", 
                     "Java Masterclass");
            System.out.println(s);

        }

        Student pojoStudent = new Student("231106", "surya", "11/12/2002", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("231107", "shishi", "12/12/2002", "Java Masterclass");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
        
    }
    
}





/**
 * POJO - plain old java object
 * generally only have instance fields
 * used to house data pass data between functional classes.@interface
 * databases use POJO to read data from or write data to databses,files or streams.
 * bean or JavaBean.
 * Entitiy-because it mirrors database entites.
 * 
 */