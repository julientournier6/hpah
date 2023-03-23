package core;

public class year3 {
    public static boolean goodSpell;
    static int defense = 0;
    public static void main(){
        introYear3();
        preBattleYear3();
    }

    public static void introYear3(){
        BasicClass.clearConsole();
        System.out.println("""
                Vous entrez dans le bureau du professeur Lupin, votre enseignant de Défense contre les Forces du Mal.
                Soudainement un détraqueur se dresse devant vous.
                "Ridiculous !", rugit Lupin.
                Ce que tu as vu c'est un épouventard sous la forme d'un détraqueur, utilise le sort Expecto Patronum face à eux pour les repousser.""");
        System.out.println("Vous vous dites que Expecto Patronum est un sort plutôt utile ! Il faudrait le garder en mémoire...");
        BasicClass.anythingToContinue();
    }

    public static void preBattleYear3(){
        BasicClass.clearConsole();
        System.out.println("""
                Vous vous balladez à Pré au Lard, d'un coup, le ciel s'assombrit, le température chute.
                Pas de doutes, ce sont les détraqueurs que le professeur Lupin a mentionné lors de ses cours.
                D'un coup, 3 se dresse devant vous.
                Pas le choix, il faut les affronter.""");
        BasicClass.anythingToContinue();
        BasicClass.clearConsole();
    }
}
