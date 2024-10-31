package week28102024.chemQuestRepo;
import java.util.*; 

public class chemRandom {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

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
            // Dictionary<String, Integer> dict4VNum = new HashMap<String, Integer>();

            
            HashMap<String, String> dict4Words = new HashMap<String, String>() {{
                put("Define the term valence electrons.","Valence electrons are the electrons in the outer shell. Ex: O has 6 because its e-configuration is 1s(2)2s(2)2p(4) and the electrons in the outter most shell (2) would be 2 + 4 = 6.");
                put("Explain why filled d and subshells are ignored when the valence electrons on an atom are counted.","Because the count for the previous shell when they're filled, so they wouldn't be part of the outter most shell. Ex: Bi -> [Xe]6s(2)5s(10)6p(3) but has 5 valence e-");
                put("What is meant by the term 'octet rule'?","The Octet rule states that an atom should have 8 electrons in its valence shield, meaning all bonds and lone pairs of an atom in a lewis structure should have 8 e-, unless ");
                put("Describe the difference between the covalent bonds in O2 and F2.","An O2 bond is a double bond to fufill the extra bond needs of O's 2 valence e-. An F2 element has a single bond for a similar reason, both atoms only have 1 valence e-, so they bond as such.");
            }};
            // Dictionary<String, String> dict4Words = new Hashtable<>();

            


            // Object[] ch4Num = dict4VNum.keySet().toArray();
            // Object key = ch4Num[new Random().nextInt(ch4Num.length)];
            // System.out.println("************ Random Chem Question ************ \n" + key + " :: " + dict4VNum.get(key));

            System.out.print("How many Chem questions would you like to answer?  :: ");
            int userCont = input.nextInt();

            while(userCont >= 0){
                Object[] ch4Num = dict4VNum.keySet().toArray();
                Object key = ch4Num[new Random().nextInt(ch4Num.length)];
                System.out.println("************ Random Chem Question ************ \n" + key);
                int userAnswer = input.nextInt();
                if(userAnswer == dict4VNum.get(key)){
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! Or you put it in wrong.");
                    System.out.println("It's actually: " + dict4VNum.get(key));
                }
    
                userCont--;
            }




            




            // System.out.println(dict.get("Bob")); // 30
    
            // int oldValue = dict.put("Charlie", 40);
            // System.out.println(oldValue); // 35
    
            // dict.remove("Alice");
    
            // System.out.println(dict.size()); // 2
    
            // Enumeration<String> k = dict.keys();
            // while (k.hasMoreElements()) {
            //     String key = k.nextElement();
            //     System.out.println("Key: " + key + ", Value: "
            //                     + dict.get(key));
            // }
    }

    // public static void continuer(int questionAmount, Object[] qArray, HashMap<String, Integer> dicHashMap) {
    //     Scanner inputCon = new Scanner(System.in);
    //     while(questionAmount > 0){
    //         Object[] ch4Num = qArray;
    //         Object key = ch4Num[new Random().nextInt(ch4Num.length)];
    //         System.out.println("************ Random Chem Question ************ \n" + key);
    //         int userAnswer = inputCon.nextInt();
    //         if(userAnswer == dicHashMap.get(key)){
    //             System.out.println("Correct!");
    //         } else {
    //             System.out.println("Incorrect! Or you put it in wrong.");
    //             System.out.println("It's actually: " + dicHashMap.get(key));
    //         }

    //         questionAmount--;
    //     }
        
    // }
    
    
}
