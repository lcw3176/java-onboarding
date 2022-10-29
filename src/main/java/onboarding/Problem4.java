package onboarding;

import onboarding.problem4.ReverseTranslator;

public class Problem4 {
    public static String solution(String word) {
        ReverseTranslator reverseTranslator = new ReverseTranslator();

        return reverseTranslator.generate(word);
    }
}
