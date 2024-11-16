package week28102024.chemQuestRepo;
import java.util.*; 

public class chemRandom {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            HashMap<String, Double> dict4VNum = chap4IntQuestions();
            HashMap<String, String> dict4Word = chap4WordQuestions();
            HashMap<String, Double> d6Int = ch6IntQuestions();
            HashMap<String, String> d6Word = ch6WordQuestions();  

            System.out.print("What chapter of the textbook would you like to answer questions from?  (so far there's only ch 4 and ch 6) :: ");
            int chapter = input.nextInt();
            System.out.print("How many Chem questions would you like to answer?  :: ");
            int userCont = input.nextInt();
            System.out.print("Do you prefer to give long answers (1) or just short number answers? (2) :: ");
            int userAnsEffort = input.nextInt();

            // Chooses which Hashmap to choose from, the String String or String Double ones.
            switch (userAnsEffort) {

                // If user says they like long answers
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

                // If user says they like short number answers, all user inputs from here should be ints
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
                    
                    break;

                // If the user puts something besides a 1 or 2. (hopefully, tried fixing it but... haha)
                // Would love to fix it but I haven't done any actual chem problems and my exam is in a couple days... So yeah no.
                default:
                    System.out.println("To continue, please put in 1 or 2. :: ");
                    userAnsEffort = input.nextInt();
                    break;
            }


    }

    // New problem arising that was very obvious: The Random() is not random enough- it keeps taking the same questions >:(
    public static void qAsker(int userQCount, HashMap<String, Double> dict4Num){
        Scanner input = new Scanner(System.in);

        while(userQCount > 0){
            Object[] ch4Num = dict4Num.keySet().toArray();
            Object key = ch4Num[new Random().nextInt(ch4Num.length)];
            System.out.println("\n\n************ Random Chem Question ************ \n" + key);
            double userAnswer = input.nextDouble();
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


    public static HashMap<String, Double> chap4IntQuestions() {
        HashMap<String, Double> dict4VNum = new HashMap<String, Double>() {{
            put("Determine the number of valence electrons in neutral atoms of the following element: Li", 1.0);
            put("Determine the number of valence electrons in neutral atoms of the following element: C", 4.0);
            put("Determine the number of valence electrons in neutral atoms of the following element: Mg", 2.0);
            put("Determine the number of valence electrons in neutral atoms of the following element: Ar", 8.0);

            put("Determine the number of valence electrons in neutral atoms of the following element: Fe", 8.0);
            put("Determine the number of valence electrons in neutral atoms of the following element: Zr", 4.0);
            put("Determine the number of valence electrons in neutral atoms of the following element: Bi", 5.0);
            put("Determine the number of valence electrons in neutral atoms of the following element: I", 7.0);
            
            put("Determine the number of valence electrons in the following negative ions. C^(4-)", 8.0);
            put("Determine the number of valence electrons in the following negative ions. N^(3-)", 8.0);
            put("Determine the number of valence electrons in the following negative ions. S^(2-)", 8.0);
            put("Determine the number of valence electrons in the following negative ions. I^(-)", 8.0);
            put("How many valence electrons surround an F atom in F2?",7.0);
            put("How many valence electrons surround around an O atom in O2?",4.0);
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

    public static HashMap<String, Double> ch6IntQuestions() {
        HashMap<String, Double> dict6Int = new HashMap<String, Double>() {{
            put("Calculate the pressure exerted by the shoes of a 200-lb man wearing size 10 shoes if each shoe makes contact with an area of the floor that is 20 in^2.\nAnswer will be in lbs/in^2, do not enter units.", 5.0);
            put("What is the pressure in units of atmospheres when a barometer reads 745.8 mmHg?\n(To 3 sig figs)", 0.981);
            put("What is the pressure in  pascals when a barometer reads 745.8 mmHg?\n(To 3 sig figs)", 99430.222);
            put("How many inches of mercury would exert a pressure of 1.00 atm?\n (to 3 sig figs)", 29.921);
            put("What is 1.00 atm in pascals?", 101325.0);
            put("Calculate the force exerted on the earth by the atmosphere if atmospheric pressure is 14.7 lb/in^2 and the surface area of the planet is 5.1 x 10^8 km^2.\n(enter sci-notation as a 000 after rounding to thousands place. Ex: 1.234 x 10^8 => 1.2340008)", 1.16200019);
        }}; 
        
        return dict6Int; 
    }

    public static HashMap<String, String> ch6WordQuestions() {
                
        HashMap<String, String> dict6Words = new HashMap<String, String>() {{
            put("Define 'temperature'.", "Temperature is the measure of average kinetic energy. Essentially, temperature answers the question: 'how much are those atoms movin' in that thang?'");
            put("If the average kinetic energies of the atoms composing two different substances are the same, what can be said about the temperatures of the two substances?", "That the temperatures of those substances are equal, because temperature is the measure of average kinetic energy.");
            put("What makes a molecule or element more likely to be in gas phase at room temp?", "If it is a nonmetals and/or a compound comprised of only non-metals, with a low Atomic or Molecular Weight, it's more likely to be a gas at room temp.");
            put("How does the volume of a mole of liquid water compare to that of a mole of gaseous water both at 25C and 1 atm?", "A mol of gaseous water would take up more volume than liquid water. The increase factor is about 800.");
            put("In what way is pressure related to force?", "Pressure is the force of the gas divided by the area it contains: \nP = F/A\nWhich is why it's measured in pounds per square inch (psi), the force exserted  against the atmosphere (atm), the force exserted against 1 millimetre of mercury in a manometer (mmHg) or newtons per square metre (N/m^2 or Pa).");
            // put("Works ands Testing?","Works ands Testing!!!!");
        }};
        
        return dict6Words; 
    }

    
    
    
}
