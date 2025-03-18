public class FrequencyofWord{
    public static void main(String args[]){
        String str="Java is platform independent language. Java is popular programming language.";
        String[] words=str.toLowerCase().split(" ");
        for(int i=0;i<words.length;i++){
            words[i]=words[i].replaceAll("[^a-zA-Z]"," ");
        }
            boolean[] counted=new boolean[words.length];
            System.out.println("Word Frequencies:");
            for(int i=0;i<words.length;i++){
            if(counted[i]) continue;
            int count=1;
            for(int j=i+1;j<words.length;j++){
                if(words[i].equals(words[j])){
                    count++;
                    counted[j]=true; 
                }
            }
            System.out.println(words[i]+":"+count);
            }
    }
}