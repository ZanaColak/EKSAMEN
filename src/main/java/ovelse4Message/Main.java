package ovelse4Message;

public class Main {
    public static void main(String[] args) {
        CodeMessage codeMessage = new CodeMessage();
        codeMessage.convertLetters("A");
        System.out.println(codeMessage.toString());
    }
}
