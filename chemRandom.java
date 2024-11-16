package week28102024.chemQuestRepo;
import java.util.*; 

public class chemRandom {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            HashMap<String, Integer> dict4VNum = chap4IntQuestions();
            HashMap<String, String> dict4Word = chap4WordQuestions();
            HashMap<String, Integer> d6Int = ch6IntQuestions();
            HashMap<String, String> d6Word = ch6WordQuestions();  

            System.out.print("What chapter of the textbook would you like to answer questions from?  (so far there's only ch 4 and ch 6) :: ");
            int chapter = input.nextInt();
            System.out.print("How many Chem questions would you like to answer?  :: ");
            int userCont = input.nextInt();
            System.out.print("Do you prefer to give long answers (1) or just short number answers? (2) :: ");
            int userAnsEffort = input.nextInt();

            // Chooses which Hashmap to choose from, the String String or String Integer ones.
            switch (userAnsEffort) {
                case 1:

                    // Chooses which chapter from the textbook to pull questions from.
                    switch (chapter) {
                        case 4:
                            qAskerWord(userCont, dict4Word);
                            break;
                        case 6:
                            qAskerWord(userCont, d6Word);
                        default:
                            break;
                    }  

                    break;

                case 2:

                    //
                    switch (chapter) {
                        case 4:
                            qAsker(userCont, dict4VNum);
                            break;
                        case 6:
                            qAsker(userCont, d6Int);
                        default:
                            break;
                    }

                default:
                    System.out.println("To continue, please put in 1 or 2. :: ");
                    userAnsEffort = input.nextInt();
                    break;
            }


    }

    public static void qAsker(int userQCount, HashMap<String, Integer> dict4Num){
        Scanner input = new Scanner(System.in);

        while(userQCount > 0){
            Object[] ch4Num = dict4Num.keySet().toArray();
            Object key = ch4Num[new Random().nextInt(ch4Num.length)];
            System.out.println("************ Random Chem Question ************ \n" + key);
            int userAnswer = input.nextInt();
            if(userAnswer == dict4Num.get(key)){
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect! Or you put it in wrong.");
                System.out.println("It's actually: " + dict4Num.get(key));
            }

            userQCount--;
        }
    }

    public static void qAskerWord(int userQCount, HashMap<String, String> dict4Num){
        Scanner input = new Scanner(System.in);

        while(userQCount > 0){
            Object[] ch4Num = dict4Num.keySet().toArray();
            Object key = ch4Num[new Random().nextInt(ch4Num.length)];
            System.out.println("************ Random Chem Question ************ \n" + key);
            System.out.println("Type your answer:");
            input.nextLine();
            System.out.println();
            System.out.println("REVIEWED ANSWER: " + dict4Num.get(key));
            userQCount--;
        }
    }


    public static HashMap<String, Integer> chap4IntQuestions() {
        HashMap<String, Integer> dict4VNum = new HashMap<String, Integer>() {{
            put("Determine the number of valence electrons in neutral atoms of the following element: Li", 1);
            put("Determine the number of valence electrons in neutral atoms of the following element: C", 4);
            put("Determine the number of valence electrons in neutral atoms of the following element: Mg", 2);
            put("Determine the number of valence electrons in neutral atoms of the following element: Ar", 8);

            put("Determine the number of valence electrons in neutral atoms of the following element: Fe", 8);
            put("Determine the number of valence electrons in neutral atoms of the following element: Zr", 4);
            put("Determine the number of valence electrons in neutral atoms of the following element: Bi", 5);
            put("Determine the number of valence electrons in neutral atoms of the following element: I", 7);
            
            put("Determine the number of valence electrons in the following negative ions. C^(4-)", 8);
            put("Determine the number of valence electrons in the following negative ions. N^(3-)", 8);
            put("Determine the number of valence electrons in the following negative ions. S^(2-)", 8);
            put("Determine the number of valence electrons in the following negative ions. I^(-)", 8);
            put("How many valence electrons surround an F atom in F2? How many are around an O atom in O2?",6);
            put("How many valence electrons surround around an O atom in O2?",4);
        }}; 
        
        return dict4VNum; 
    }

    public static HashMap<String, String> chap4WordQuestions() {
                
        HashMap<String, String> dict4Words = new HashMap<String, String>() {{
            put("Define the term valence electrons.","Valence electrons are the electrons in the outer shell. Ex: O has 6 because its e-configuration is 1s(2)2s(2)2p(4) and the electrons in the outter most shell (2) would be 2 + 4 = 6.");
            put("Explain why filled d and subshells are ignored when the valence electrons on an atom are counted.","Because the count for the previous shell when they're filled, so they wouldn't be part of the outter most shell. Ex: Bi -> [Xe]6s(2)5s(10)6p(3) but has 5 valence e-");
            put("What is meant by the term 'octet rule'?","The Octet rule states that an atom should have 8 electrons in its valence shield, meaning all bonds and lone pairs of an atom in a lewis structure should have 8 e-, unless it can expand its octet (any atom after Si on the periodic table).");
            put("Describe the difference between the covalent bonds in O2 and F2.","An O2 bond is a double bond to fufill the extra bond needs of O's 2 valence e-. An F2 element has a single bond for a similar reason, both atoms only have 1 valence e-, so they bond as such.");
        }};
        
        return dict4Words; 
    }

    public static HashMap<String, Integer> ch6IntQuestions() {
        HashMap<String, Integer> dict6Int = new HashMap<String, Integer>() {{
            put("Test question 1", 1);
            put("Test question 2", 2);
            put("Test question 3", 3);
            put("Test question 4", 4);
        }}; 
        
        return dict6Int; 
    }

    public static HashMap<String, String> ch6WordQuestions() {
                
        HashMap<String, String> dict6Words = new HashMap<String, String>() {{
            put("Works ands Testing?","Works ands Testing!");
            put("Works ands Testing?","Works ands Testing!!");
            put("Works ands Testing?","Works ands Testing!!!");
            put("Works ands Testing?","Works ands Testing!!!!");
        }};
        
        return dict6Words; 
    }

    
    
    
}
