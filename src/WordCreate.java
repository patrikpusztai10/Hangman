public class WordCreate {
    public static String word () {
        String[] words = {"bottle", "people", "animal", "butter", "orange", "garden", "artist", "bishop", "castle", "dragon", "family", "guitar", "island", "jungle", "kitten", "leader", "mystic", "notary", "pencil", "quartz", "rescue", "silver", "temple", "unfold", "winter", "yellow", "zipper", "button", "dancer", "energy", "flower", "galaxy", "hunter", "impact", "jacket", "knight", "laptop", "moment", "nature", "option", "packet", "remote", "server", "talent", "united", "vision", "weight", "youths", "bounce", "custom", "divine", "editor", "flight", "gather", "honest", "income", "jewels", "kindle", "lessen", "easier", "simple", "border"};
        int pos=(int)(Math.random()*59)+1;
        return words[pos];
    }

}
