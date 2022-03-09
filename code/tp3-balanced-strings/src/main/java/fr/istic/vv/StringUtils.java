package fr.istic.vv;
import java.util.Stack;

public class StringUtils {

    private StringUtils() {}

    public static boolean isBalanced(String str) {
        Stack<Character> pile = new Stack<>();
		for (Character character: str.toCharArray()) {
			switch (character) {
				case '{':
					pile.add(character);
					break;
				case '(':
					pile.add(character);
					break;
				case '[':
					pile.add(character);
					break;
				case '}':
					if (pile.isEmpty() || pile.pop() != '{'){
						return false;
					}
					break;
				case ')':
					if (pile.isEmpty() || pile.pop() != '(') {
						return false;
					}
					break;
				case ']':
					if (pile.isEmpty() || pile.pop() != '[') {
						return false;
					}
					break;
				default:
					break;
			}
		}
		return pile.isEmpty();
    }

}
