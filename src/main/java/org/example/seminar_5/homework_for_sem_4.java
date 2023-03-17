package org.example.seminar_5;

public class homework_for_sem_4 {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }
    public static Boolean isValid(String s) {

        LinkedList<String> inputList = new LinkedList<>(Arrays.asList(s.split("")));

        HashMap <String, String> brackets = new HashMap<>();
        brackets.put(")", "(");
        brackets.put("]", "[");
        brackets.put("}", "{");

        LinkedList<String> startBrackets = new LinkedList<>();

        for (String bracket : inputList) {
            if (brackets.containsValue(bracket)) startBrackets.add(bracket);
            else if (brackets.containsKey(bracket)){
                if (!Objects.equals(startBrackets.pollLast(), brackets.get(bracket))) {
                    return false;
                }
            }
        }
        return startBrackets.isEmpty();
    }
}
