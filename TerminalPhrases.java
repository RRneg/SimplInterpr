package Interpreter;

public class TerminalPhrases implements Phrases{
    private String data;

    public TerminalPhrases(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String content) {
        if (content.contains(data)){
            return true;
        }
        return false;
    }
}
