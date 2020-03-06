package exercice1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

class ValidParentheses {


    public static void main(String[] args) {

        System.out.println("(} ? " + ValidParentheses.isValid("(}"));
        System.out.println("(3+1)*8 ? " + ValidParentheses.isValid("(3+1)*8"));
        System.out.println("([3]+1)*8 ? " + ValidParentheses.isValid("([3]+1)*8"));
    }

    // Hash table that takes care of the mappings.
    private static final HashMap<Character, Character> mappings;

    // Initialize hash map with mappings. This simply makes the code easier to read.
    static {
        HashMap<Character, Character> aMap = new HashMap<>();
        aMap.put(')', '(');
        aMap.put('}', '{');
        aMap.put(']', '[');
        mappings = aMap;
    }


    public static boolean isValid(String s) {

        assert true: "no pre-condition!"; 		// assertion 1

        boolean result= true;

        // Initialize a stack to be used in the algorithm.
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c==')' || c=='('|| c=='}' || c=='{' || c==']' || c=='[') {


                // If the current character is a closing bracket.
                if (mappings.containsKey(c)) {

                    // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
                    char topElement = stack.size() == 0 ? '#' : stack.pollLast();

                    assert (stack.size() == 0) || (topElement!='#'): "Invariant: if the stack is empty we get the symbol #";	// assertion 2
                    // If the mapping for this bracket doesn't match the stack's top element, return false.
                    if (topElement != mappings.get(c)) {
                        return false;
                    }
                } else {
                    // If it was an opening bracket, push to the stack.
                    stack.offer(c);
                }
            }
        }

        assert (stack.size() != 0) || (result == true) : "post-condition: when s is empty we return true";	//assertion 3
        // If the stack still contains elements, then it is an invalid expression.
        return stack.isEmpty();
    }


}
