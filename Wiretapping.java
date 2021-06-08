package Interpreter;

public class Wiretapping {
    public static void main(String[] args) {
Phrases getTerrorist = getTerrorist();


        System.out.println("Is this telephone conversation a terrorist? "
                + getTerrorist.interpret("What is the weapon bimba ?"));

        System.out.println("Is this telephone conversation a terrorist? "
                + getTerrorist.interpret("as Azirov said - it's a bimba"));


    }

public static Phrases getTerrorist(){
        Phrases bimba = new TerminalPhrases("bimba");
        Phrases weapon = new TerminalPhrases("weapon");
        return new TerroristPhrases(bimba, weapon);

}


}
