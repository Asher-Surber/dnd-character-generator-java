import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static ArrayList<String> races = new ArrayList<>();
    public static ArrayList<String> classes = new ArrayList<>();
    public static ArrayList<String[]> subclasses = new ArrayList<>();
    boolean genRace = false;
    boolean genClass = false;
    boolean genSubclass = false;
    Scanner sc = new Scanner(System.in);
    String race;
    String charClass;
    String subclass;

    public static void main(String[] args) {

        initLists();
        Random rand = new Random();
        Main m = new Main();

        m.getRace();
        m.getCharClass();
        m.getSubclass();

        String character = "";

        if(m.genRace){
            int i = rand.nextInt(0, races.size());
            m.race = races.get(i);
        }

        if(m.genClass){
            int j = rand.nextInt(0, classes.size());
            m.charClass = classes.get(j);
        }

        if(m.genSubclass){
            int k = rand.nextInt(0, subclasses.get(classes.indexOf(m.charClass)).length);
            m.subclass = subclasses.get(classes.indexOf(m.charClass))[k];
        }

        System.out.println("Your character: \"" + m.race + " " + m.subclass + " " + m.charClass + "\"");
    }

    public void getRace(){
        System.out.println("Generate race? ");
        String input = sc.next();
        if(input.equalsIgnoreCase("Y")) {
            genRace = true;
        }
        else{
            System.out.println("Enter race: ");
            race = sc.next();
        }
    }
    public void getCharClass(){
        System.out.println("Generate class? ");
        String input = sc.next();
        if(input.equalsIgnoreCase("Y")) {
            genClass = true;
        }
        else{
            System.out.println("Enter class: ");
            charClass = sc.next();
        }
    }

    public void getSubclass(){
        System.out.println("Generate subclass? ");
        String input = sc.next();
        if(input.equalsIgnoreCase("Y")) {
            genSubclass = true;
        }
        else{
            System.out.println("Enter subclass: ");
            subclass = sc.next();
        }
    }


    public static void initLists(){
        String[] racesArr = {"aarakocra", "aasimar", "bugbear", "centaur", "changeling", "dhampir", "dragonborn", "dwarf", "duergar",
                "eladrin", "hexblood", "high elf", "sea elf", "wood elf", "fairy", "firbolg", "air genasi", "earth genasi",
                "fire genasi", "water genasi", "githyanki", "githzerai", "deep gnome", "forest gnome", "rock gnome",
                "goblin", "goliath", "half-elf", "lightfoot halfling", "stout halfling", "half-orc", "harengon", "hobgoblin", "human", "kenku",
                "kobold", "lizardfolk", "minotaur", "orc", "reborn", "satyr", "shadar-kai", "shifter", "tabaxi", "tiefling",
                "tortle", "triton", "yuan-ti"};
        for(int i = 0; i < racesArr.length; i++){
            races.add(racesArr[i]);
        }

        String[] classArr = {"artificer", "barbarian", "bard", "blood hunter", "cleric", "druid", "fighter", "monk", "paladin", "ranger",
                "rogue", "sorcerer", "warlock", "wizard"};
        for(int j = 0; j < classArr.length; j++){
            classes.add(classArr[j]);
        }

        String[] artificer = {"alchemist", "armorer", "artillerist", "battle smith"};
        subclasses.add(artificer);
        String[] barbarian = {"ancestral guardian", "beast", "berserker", "storm herald", "totem warrior", "wild magic", "zealot"};
        subclasses.add(barbarian);
        String[] bard = {"creation", "eloquence", "glamour", "lore", "spirits", "swords", "valor", "whispers"};
        subclasses.add(bard);
        String[] bloodhunter = {"ghostslayer", "lycan", "mutant", "profane soul"};
        subclasses.add(bloodhunter);
        String[] cleric = {"death", "forge", "grave", "knowledge", "life", "light", "nature", "order", "peace", "tempest",
                "trickery","twilight", "war"};
        subclasses.add(cleric);
        String[] druid = {"dreams", "arctic", "coast", "desert", "forest", "grassland", "mountain", "swamp", "underdark",
                "moon", "shepherd", "spores", "wildfire"};
        subclasses.add(druid);
        String[] fighter = {"battle master", "cavalier", "champion", "eldritch knight", "gunslinger", "psi warrior",
                "rune knight", "samurai"};
        subclasses.add(fighter);
        String[] monk = {"ascendant dragon", "astral self", "cobalt soul", "drunken master", "four elements", "kensei",
                "mercy", "open hand", "sun soul"};
        subclasses.add(monk);
        String[] paladin = {"ancients", "conquest", "devotion", "glory", "oathbreaker", "open sea", "redemption", "vengeance",
                "watchers"};
        subclasses.add(paladin);
        String[] ranger = {"beast master", "drakewarden", "fey wanderer", "gloom stalker", "horizon walker", "hunter",
                "monster slayer", "swarmkeeper"};
        subclasses.add(ranger);
        String[] rogue = {"arcane trickster", "assassin", "inquisitive", "mastermind", "phantom", "scout", "soulknife",
                "swashbuckler", "thief"};
        subclasses.add(rogue);
        String[] sorcerer = {"aberrant mind", "clockwork soul", "divine soul", "draconic bloodline", "shadow", "storm", "wild magic"};
        subclasses.add(sorcerer);
        String[] warlock = {"archfey", "celestial", "fathomless", "fiend", "genie", "great old one", "hexblade", "undead"};
        subclasses.add(warlock);
        String[] wizard = {"abjuration", "bladesinging", "conjuration", "divination", "enchantment", "evocation",
                "illusion", "necromancy", "scribe", "transmutation", "war"};
        subclasses.add(wizard);
    }
}
