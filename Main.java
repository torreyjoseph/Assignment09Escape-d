import java.util.Scanner;

public class Main {
    public static Scanner sc;
    public static boolean inFoyer = true;
    public static boolean inConservatory = false;
    public static boolean openChest = false;
    public static boolean hasMatches = false;
    public static boolean litCandle = false;
    public static boolean foyerDoorUnlocked = false;
    public static boolean foyerDoorOpen = false;
    public static boolean inLibrary = false;
    public static boolean lookBook = false;
    public static boolean hasPen = false;
    public static boolean libraryDoorUnlocked = false;
    public static boolean libraryDoorOpen = false;
    public static boolean trumpetPlayed = false;
    public static boolean pianoPlayed = false;
    public static boolean drumsPlayed = false;
    public static boolean conservatoryDoorUnlocked = false;
    public static boolean conservatoryDoorOpened = false;
    public static boolean completed = false;
    public static int turns = 30;

    public static void main(String[] args) {
        help();
        intro();
        turns(0);
        turns(1);
        turns(2);
        turns(3);
        turns(4);
        turns(5);
        turns(6);
        turns(7);
        turns(8);
        turns(9);
        turns(10);
        turns(11);
        turns(12);
        turns(13);
        turns(14);
        turns(15);
        turns(16);
        turns(17);
        turns(18);
        turns(19);
        turns(20);
        turns(21);
        turns(22);
        turns(23);
        turns(24);
        turns(25);
        turns(26);
        turns(27);
        turns(28);
        turns(29);
        turns(30);
    }
    private static void turns(int i){
            if (!completed){
                System.out.print("\nYou have " + (turns - i) + " turn(s) left to escape.");
                if (inFoyer)
                    foyer();
                else if (inLibrary)
                    library();
                else if (inConservatory)
                    conservatory();
            } else if (completed) {
                System.out.println(" Congratulations! You made it out of the mansion!");
                completed = false;
            }
            if ((turns - i) < 2) {
                System.out.print("\nGAME OVER\nYou've run out of turns and have failed to escape the mansion in time.\nBetter luck next time.\n");
            }
        }
    private static void foyer(){
        System.out.print("\n\n>> ");
        sc = new Scanner(System.in);
        String foyer = sc.nextLine();
        switch(foyer.toLowerCase()){
            case "help":
                help();
                break;
            case "look":
            case "look around":
                intro();
                break;
            case "look candle":
                lookCandle();
                break;
            case "look bench":
                lookBench();
                break;
            case "look table":
            case "look chest":
                lookChest();
                break;
            case "read note":
                readNote();
                break;
            case "open chest":
                openChest();
                break;
            case "get match":
            case "take match":
            case "get matches":
            case "take matches":
            case "get matchbox":
            case "take matchbox":
                getMatch();
                break;
            case "light candle":
                lightCandle();
                break;
            case "look door":
                lookDoor1();
                break;
            case "open door":
                openDoor1();
                break;
            case "go north":
            case "walk north":
            case "move north":
                goThroughDoor1();
                break;
            case "ponder life":
                ponderlife();
                break;
            case "fbi open up":
                fbiopenupFoyer();
                break;
            default:
                error();
                break;
        }
    }
    private static void library(){
        System.out.print("\n\n>> ");
        sc = new Scanner(System.in);
        String library = sc.nextLine();
        switch (library.toLowerCase()){
            case "help":
                help();
            case "look":
            case "look around":
                lookLibrary();
                break;
            case "look bookshelf":
            case "look bookshelves":
            case "look shelf":
            case "look shelves":
                lookShelf();
                break;
            case "look book":
                lookBook();
                break;
            case "look desk":
                lookDesk();
                break;
            case "look pen":
                lookPen();
                break;
            case "look scroll":
                lookScroll();
                break;
            case "read writing":
            case "read scroll":
                readScroll();
                break;
            case "take book":
            case "get book":
                getBook();
                break;
            case "take pen":
            case "get pen":
                getPen();
                break;
            case "write name":
            case "write book":
                writeName();
                break;
            case "look door":
                lookDoor2();
                break;
            case "open door":
                openDoor2();
                break;
            case "break door":
            case "hit door":
            case "punch door":
            case "kick door":
                breakDoor();
                break;
            case "go north":
            case "walk north":
            case "move north":
                goThroughDoor2();
                break;
            case "fbi open up":
                fbiopenupLibrary();
                break;
            default:
                error();
                break;
        }

    }
    private static void conservatory(){
        System.out.print("\n\n>> ");
        sc = new Scanner(System.in);
        String conservatory = sc.nextLine();
        switch (conservatory.toLowerCase()){
            case "look":
            case "look around":
                lookAround();
                break;
            case "help":
                help();
                break;
            case "look music stand":
            case "look music":
            case "read music":
                lookMusic();
                break;
            case "play trumpet":
                playTrumpet();
                break;
            case "play piano":
                playPiano();
                break;
            case "play drum":
            case "play drums":
                playDrum();
                break;
            case "look door":
                lookDoor3();
                break;
            case "open door":
                openDoor3();
                break;
            case "go north":
            case "walk north":
            case "move north":
                goThroughDoor3();
                break;
            case "fbi open up":
                fbiopenupConservatory();
                break;
            default:
                error();
                break;
        }
    }
    private static void intro(){
        System.out.print("\nYou wake up sprawled on a cold, ornate marble floor in what appears to be a dimly lit foyer. There are no visible windows, and the small amount" +
                "\nof light there is comes from seemingly nowhere. A heavy-looking mahogany door is to the north. To the west, there is a sleek bench pushed against" +
                "\nthe wall. To the east is a console table with a small chest on top. A large, old-fashioned candle sits on a pedestal in the centre of the room. The" +
                "\ncandle is unlit.");
    }
    private static void help(){
        System.out.print("\nWhile playing, follow one verb with one noun, i.e. 'look around,' 'go north,' or 'open book. Do not use more than 2 words per statement. Looking" +
                "\naround at objects in the room first is always a good idea, and if something isn't working, try spelling it differently or using a synonym.\n");
    }
    private static void error(){
        System.out.print("\nWeird. Nothing happened.");
    }
    private static void fbiopenupFoyer() {
        System.out.print("\n*kaboom*\nThe door opens.");
        foyerDoorUnlocked = true;
        foyerDoorOpen = true;
    }
    private static void fbiopenupLibrary() {
        System.out.print("\n*kaboom*\nThe door opens.");
        libraryDoorUnlocked = true;
        libraryDoorOpen = true;
    }
    private static void fbiopenupConservatory() {
        System.out.print("\n*kaboom*\nThe door opens.");
        conservatoryDoorUnlocked = true;
        conservatoryDoorOpened = true;
    }
    //Things for the Foyer
    private static void lookCandle(){
        System.out.print("\n The candle sits unlit on the pedestal.");
    }
    private static void lookBench(){
        System.out.print("\nOn the bench lies a neatly folded note.");
    }
    private static void lookChest() {
        System.out.print("\nThe chest is an intricately designed wooden masterpiece, closed, but no visible locks.");
    }
    private static void readNote(){
        System.out.print("\nThe note simply says 'May my light show you the way.'");
    }
    private static void openChest(){
        System.out.print("\nInside the small chest on the table you find an elegant cylindrical metal matchbox.");
        openChest = true;
    }
    private static void getMatch(){
        if (openChest) {
            System.out.print("\nYou take the matches.");
            hasMatches = true;
        } else {
            System.out.print("\nWhat matches?");
        }
    }
    private static void lightCandle(){
        if (hasMatches) {
            litCandle = true;
            foyerDoorUnlocked = true;
            System.out.print("\nThe candle adds a little more light to the shadowy room. You hear a brief but loud buzzing sound coming from the dark wooden door to the North.");
        } else {
            System.out.print("\nYou don't have anything to light the candle with.");
        }
    }
    private static void lookDoor1(){
        if (foyerDoorUnlocked) {
            System.out.print("The door is still closed, but it certainly seems to be unlocked.");
        } else {
            System.out.print("The door is locked.");
        }
    }
    private static void openDoor1(){
        if (foyerDoorUnlocked){
            System.out.print("\nThe door swings open with a heavy thud.");
            foyerDoorOpen = true;
        } else {
            System.out.print("\nThe door won't budge; it is still locked.");
        }
    }
    private static void goThroughDoor1(){
        if (foyerDoorOpen) {
            System.out.print("\nBehind the Northern Door is a strange library neatly lined with ancient books in languages from across the world, many of which you have never " +
                    "\neven seen before then. Pushed against the Eastern wall is a smooth white desk, with a gilded pen and scroll laid out on top. All other walls are made of " +
                    "\nrichly-decorated bookshelves. Once again, there is a lack of natural light and windows. To the North lies a door made of frosted glass. All you can see " +
                    "\nthrough it is vague shapes. As you walk in, the door behind you abruptly shuts.");
            inFoyer = false;
            inLibrary = true;
        } else if (foyerDoorUnlocked) {
            System.out.print("\nThe door is unlocked, but still closed.");
        } else {
            System.out.print("\nThe door won't budge; it is still locked.");
        }
    }
    private static void ponderlife(){ System.out.print("\nYou realize that God is a lie and you have no purpose in life. You contemplate suicide.");
    }
    //Library Shenanigans
    private static void lookLibrary() {
        System.out.print("\nThe strange library is neatly lined with ancient books in languages from across the world, many of which you have never even seen before then. Pushed " +
                "\nagainst the Eastern wall is a smooth white desk, with a gilded pen and scroll laid out on top. All other walls are made of the richly-decorated bookshelves. Once " +
                "\nagain, there is a lack of natural light and windows. To the North lies a door made of frosted glass. All you can see through it is vague shapes.");
    }
    private static void lookDesk(){
        System.out.print("\nThe smooth desk has some sort of ancient papyrus scroll and a pen engraved with classical designs on the sides. It looks almost like there's writing in the scroll.");
    }
    private static void lookScroll(){
        System.out.print("\nThe scroll is yellowed with age. You can make out some writing on it.");
    }
    private static void readScroll(){
        System.out.print("\nAll the scroll reads is ''Share your story.''");
    }
    private static void lookShelf() {
        System.out.print("\nAs you skim the titles, you find a dark leather cover of an empty book titled ''The Autobiography of ... ,'' with the rest of the title empty.");
    }
    private static void lookBook() {
        System.out.print("\nThe book is made of dark leather, and is titled ''The Autobiography of ...,'' with the rest of the title empty.");
        lookBook = true;
    }
    private static void getBook() {
        System.out.print("\nYou grab the book from shelf and bring it to the desk. You lay it flat.");
        lookBook = true;
    }
    private static void lookPen() {
        System.out.print("\nThe pen is engraved with classical designs on the sides. It looks like a fountain pen of some sort, except the tip is already blackened with ink and there's no " +
                "\nvisible inkwell.");
    }
    private static void getPen() {
        System.out.print("\nYou take hold of the pen. The metal is cold to the touch.");
        hasPen = true;
    }
    private static void writeName() {
        if (hasPen){
            System.out.print("\nYou put your name in front of the book. Nearly the second you finish writing, the same odd sound from before echoes throughout the room.");
            libraryDoorUnlocked = true;
        } else if (!lookBook){
            System.out.print("\nYou don't have anything to write in.");
        } else if (!hasPen){
            System.out.print("\nYou don't have anything to write with.");
        }
    }
    private static void lookDoor2() {
        if (libraryDoorUnlocked) {
            System.out.print("\nThe North door is still shut, but the sound you heard lets you infer that it's unlocked.");
        } else {
            System.out.print("\nThe North door is still sealed shut.");
        }
    }
    private static void openDoor2() {
        if (libraryDoorUnlocked) {
            System.out.print("\nThe elegant door slides open with ease.");
            libraryDoorOpen = true;
        } else {
            System.out.print("\nThe door is still locked.");
        }
    }
    private static void goThroughDoor2(){
        if (libraryDoorOpen) {
            System.out.print("\nBeyond the door lies yet another room, this one with an expensive-looking herringbone floor and mint green walls adorned with crown mouldings and mirrors. A " +
                    "\npearly white grand piano lies in the centre of the room, along with a silver French trumpet and a ceremonial Chinese drum. A stand in front of these all holds a piece of " +
                    "\nsheet music. Once again, the door closes behind you. To the North is yet another door, this one much larger than the previous ones and made of reinforced steel.");
            inLibrary = false;
            inConservatory = true;
        } else if (libraryDoorUnlocked) {
            System.out.print("\nThe door is unlocked, but is still closed.");
        } else {
            System.out.print("\nThe door is still locked and won't budge. The frosted glass-like material is remarkably strong.");
        }
    }
    private static void breakDoor(){
        System.out.print("The glass is unusually strong. All you manage is hurting yourself.");
    }
    //Conservatoire de la Chateau
    private static void lookAround() {
        System.out.print("\nAn expensive-looking herringbone floor and mint green walls adorned with crown mouldings and mirrors provide an opulent glimplse into someone's life." +
                "\npearly white grand piano lies in the centre of the room, along with a silver French trumpet and a ceremonial Chinese drum. A stand in front of these all holds a piece of " +
                "\nsheet music. To the North is yet another door, this one much larger than the previous ones and made of reinforced steel. An unlit green light sits above the frame.");
    }
    private static void lookMusic() {
        System.out.print("\nThe music itself has no notes; however, the phrase ''Timbre, Tone, and Time'' is sprawled on the music staff.");
    }
    // FIX THINGS IT'S BAD AAAAAAAAAAAAAA
    private static void playTrumpet() {
        System.out.print("\nThe French trumpet lets out a sharp sound, and you think you hear a light click coming from the North door.");
        trumpetPlayed = true;
    }
    private static void playPiano() {
        System.out.print("\nYou hit a random key on the piano.");
        if (trumpetPlayed){
            pianoPlayed = true;
            System.out.print(" You definitely hear a click coming from the door.");
        }
        trumpetPlayed = false;
    }
    private static void playDrum() {
        System.out.print("\nThe drum lets out a deep, resonating banging sound.");
        if (pianoPlayed){
            drumsPlayed = true;
            pianoPlayed = false;
            System.out.print("\nThe screeching sound of metal-on-metal indicates that the final door has been unlocked.");
            conservatoryDoorUnlocked = true;
        }
    }
    private static void lookDoor3() {
        if (conservatoryDoorUnlocked) {
            System.out.print("\nA small green light above the door is on, indicating that it is unlocked, but the door is closed.");
        } else {
            System.out.print("\nThe door is still locked.");
        }
    }
    private static void openDoor3() {
        if (conservatoryDoorUnlocked) {
            System.out.print("The heavy metal door retracts sideways into the wall with a mechanical buzz, revealing a brightly lit room.");
            conservatoryDoorOpened = true;
        } else {
            System.out.print("The door is locked. Besides, it looks much too heavy to move.");
        }
    }
    private static void goThroughDoor3() {
        if (conservatoryDoorOpened) {
            System.out.print("\nYou enter into the light.");
            completed = true;
        } else if (conservatoryDoorUnlocked) {
            System.out.print("\nThe door is unlocked, but still closed.");
        } else {
            System.out.print("\nThe door won't budge; it is still locked.");
        }

    }
}
