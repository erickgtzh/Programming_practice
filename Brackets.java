import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String str = "[[";

        System.out.println(stacker(str));
    }

    private static boolean stacker(String s) {
        if(s.length()==1 || s.length()%2==1)
            return false;

        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++) {
            char voy = s.charAt(i);
            if(voy=='(' || voy=='{' || voy=='[')
                stack.push(voy);
            else{
                if(!stack.isEmpty()){
                    if(voy==')'){
                        if(!stack.pop().equals('(')){
                            return false;
                        }
                    }
                    else if(voy==']'){
                        if(!stack.pop().equals('[')){
                            return false;
                        }
                    }
                    else if(voy=='}'){
                        if(!stack.pop().equals('{')){
                            return false;
                        }
                    }
                }else return false;
            }
        }
        if(!stack.isEmpty())
            return false;
        return true;
    }
}
