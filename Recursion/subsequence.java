import java.util.ArrayList;

public class subsequence {
static ArrayList<String> getSSQ(String s){
    ArrayList<String> ans = new ArrayList<>();

    if (s.length() == 0){
        ans.add("");
        return ans;
    }

    char curr = s.charAt(0);
    ArrayList<String>  smallAns = getSSQ(s.substring(1));
    for(String ss:smallAns){
        ans.add(ss);
        ans.add(curr + ss);
    }
    return ans;
}

static void printSSQ(String s, String currAns){
    if(s.length() == 0){
        System.out.println(currAns);
        return;
    }
    char currChar = s.charAt(0);
    String remString = s.substring(1);
    printSSQ(remString, currAns + currChar);
    printSSQ(remString, currAns);
}
    public static void main(String[] args) {
        ArrayList<String> ans = getSSQ("abc");
        System.out.println(ans);
        System.out.println("the subsequence is : ");
        printSSQ("abc", "");
    }
}
