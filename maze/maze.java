import java.util.Scanner;

public class maze {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int input;
        boolean hasPhone = false;
        boolean hasKey = false;
        String currRoom="TractorRoom";
        System.out.println ("""
                You wake up in the center of a corn maze at night,
                you need your key and phone for light to escape.
                Good Luck. 
                """);
        do {

            System.out.println ("""
                    Your options: 1. Take the tractor.
                                  2. Look around.
                                  3. Go straight.
                                  4. Scream.
                    """);
            input = Integer.parseInt (console.nextLine ());
            switch (input) {
                case 1:
                    if (hasKey) {
                        System.out.println ("You get the Tractor started and " +
                                "escape the maze. Congrats!");
                        return;
                    } else {
                        System.out.println ("You notice that it requires a key " +
                                "but it should be somewhere");
                        System.out.println ("You notice a phone sitting in the cupholder.");
                        hasPhone = true;
                        break;
                    }
                case 2:
                    System.out.println ("you notice the tractor has a faint glow");
                    break;
                case 3:
                    if (!hasPhone) {
                        System.out.println ("You try to traverse the maze at night and " +
                                "twist your ankle cause its too dark, GAME OVER.");
                    } else {
                        System.out.println ("You went straight ahead.");
                        currRoom = "centerRoom";
                    }


                    return;
                default:
                    System.out.println ("You scream no matter what else you do.");
                    break;


            }
        } while (input != 1);
        System.out.println ("""
                You notice 3 paths in front of you.
                To your right, you notice a reflection of light.
                To your left, you see a dark pool with no light reflected.
                Straight ahead, you see a gap through the corn field with traces of blood.
                Think wisely.
                """);
        do {
            System.out.println ("""
                    Your options: 1. Go left.
                                  2. Go straight.
                                  3. Go right.
                                  4. Scream.
                    """);
            input = console.nextInt ();
            switch (input) {
                case 1:
                    System.out.println ("You approach the dark pool and notice something brush your ankle.");
                    currRoom = "darkPool";
                    break;
                case 2:
                    System.out.println ("You break through to the corn field but get abducted by cultist " +
                            "aliens. Game Over.");
                    return;
                case 3:
                    System.out.println ("You approach the glimmer and notice its a key on the ground.");
                    hasKey = true;
                    currRoom = "keyRoom";
                    break;
                default:
                    System.out.println ("You scream no matter what else you do.");
                    break;
            }
        } while (currRoom != "darkPool" && currRoom != "keyRoom");
        do {
            if (currRoom == "darkPool") {
                System.out.println ("""
                        Your options are: 1. Scream.
                        """);
                input = console.nextInt ();
                switch (input) {
                    default:
                        System.out.println ("Kelpies ambush you and drag you to the depths. Game Over.");
                        return;

                }
            } else {
                System.out.println ("""
                        You found the key.
                        Your options are: 1. go back to tractor room.
                                          2. scream.
                        """);
                input = console.nextInt ();
                if (input == 1) {
                    System.out.println ("You made it back to the tractor and escaped! You win!");
                } else {
                    System.out.println ("You stayed and screamed and passed out. Game over.");
                }
            }
        }
        while (input != 1);


    }

}