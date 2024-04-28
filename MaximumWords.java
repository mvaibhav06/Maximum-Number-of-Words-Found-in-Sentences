public class MaximumWords {
    public int mostWordsFound(String[] sentences) {
        int out = Integer.MIN_VALUE;
        for(int i=0; i<sentences.length; i++){
            String[] word = sentences[i].split(" ");
            if(word.length > out){
                out = word.length;
            }
        }
        return out;
    }
}
