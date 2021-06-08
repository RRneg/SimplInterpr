package Interpreter;

public class TerroristPhrases implements Phrases{
    private Phrases phrase1;
    private Phrases phrase2;

    public TerroristPhrases(Phrases phrase1, Phrases phrase2) {
        this.phrase1 = phrase1;
        this.phrase2 = phrase2;
    }

    public boolean interpret(String content) {
        return phrase1.interpret(content) && phrase2.interpret(content);
    }
}
