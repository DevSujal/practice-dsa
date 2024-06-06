public class findAllPossibleSubsequence {

    public static void findAllPossibleSubsequenceWithsequence(String sequence, String subsequence, int idx){

        if(idx >= sequence.length()){
            System.out.println(subsequence);
            return;
        }

        // agar vo aana chahta hai subsequence ke andar
        findAllPossibleSubsequenceWithsequence(sequence, subsequence + sequence.charAt(idx), idx+1);

        // agar vo nahi aana chahta 
        findAllPossibleSubsequenceWithsequence(sequence, subsequence, idx+1);
    }
    public static void main(String[] args) {
        

        String sequence = "abcd";

        findAllPossibleSubsequenceWithsequence(sequence, "", 0);
    }
}
