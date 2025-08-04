import java.util.Scanner;

public class removeOccurrences {
    static String removeA(String s, int idx) {      //input -- abacx
        if (idx == s.length())
            return "";
        String smallAns = removeA(s, idx + 1);    //bcx
        char currChar = s.charAt(idx);
        if (currChar != 'a') {
            return currChar + smallAns;        //d+bcx
        }
            return smallAns;
    }

static String reverse(String s, int idx){
        if (idx == s.length())
            return "";
        String smallAns = reverse(s, idx +1);
        return smallAns + s.charAt(idx);
    }

static void checkPlaindrome(String s){              // this uses the reverse method
        String reversed = reverse(s , 0);
        if (s.equals(reversed))
            System.out.println(" The given string is palindrome ");
        else
            System.out.println(" The given string is NOT palindrome ");
}
static boolean checkPlaindrome2(String s, int l, int r) {             // this by itself solves the problem
    if (l >= r)
        return true;
    else if (s.charAt(l) == s.charAt(r)) {
        return checkPlaindrome2(s, l + 1, r - 1);
    } else
        return false;
}


public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the string : ");
        String s = sc.nextLine();
        System.out.println(removeA(s, 0));
        System.out.println(reverse(s, 0));             // now prints reversed string

        checkPlaindrome(s);


    if (checkPlaindrome2(s, 0, s.length() - 1))
        System.out.println("The given string is a palindrome (method 2)");
    else
        System.out.println("The given string is NOT a palindrome (method 2)");
    }
}
//lec - 35
