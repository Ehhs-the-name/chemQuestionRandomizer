package week28102024;
import java.util.*; 

public class chemRandom {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            HashMap<String, Integer> dict4VNum = new HashMap<String, Integer>();
            // Dictionary<String, Integer> dict4VNum = new HashMap<String, Integer>();

            dict4VNum.put("Determine the number of valence electrons in neutral atoms of the following element: Li", 1);
            dict4VNum.put("Determine the number of valence electrons in neutral atoms of the following element: C", 4);
            dict4VNum.put("Determine the number of valence electrons in neutral atoms of the following element: Mg", 2);
            dict4VNum.put("Determine the number of valence electrons in neutral atoms of the following element: Ar", 8);

            dict4VNum.put("Determine the number of valence electrons in neutral atoms of the following element: Fe", 8);
            dict4VNum.put("Determine the number of valence electrons in neutral atoms of the following element: Zr", 4);
            dict4VNum.put("Determine the number of valence electrons in neutral atoms of the following element: Bi", 5);
            dict4VNum.put("Determine the number of valence electrons in neutral atoms of the following element: I", 7);
            
            dict4VNum.put("Determine the number of valence electrons in the following negative ions. C^(4-)", 8);
            dict4VNum.put("Determine the number of valence electrons in the following negative ions. N^(3-)", 8);
            dict4VNum.put("Determine the number of valence electrons in the following negative ions. S^(2-)", 8);
            dict4VNum.put("Determine the number of valence electrons in the following negative ions. I^(-)", 8);
    
            Dictionary<String, String> dict4Words = new Hashtable<>();

            dict4Words.put("Define the term valence electrons.","Valence electrons are the electrons in the outer shell. Ex: O has 6 because its e-configuration is 1s(2)2s(2)2p(4) and the electrons in the outter most shell (2) would be 2 + 4 = 6.");
            dict4Words.put("Explain why filled d and subshells are ignored when the valence electrons on an atom are counted.","Because the count for the previous shell when they're filled, so they wouldn't be part of the outter most shell. Ex: Bi -> [Xe]6s(2)5s(10)6p(3) but has 5 valence e-");


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
