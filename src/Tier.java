public class Tier {
    private String name;
    private String art;
    private int alter;

    public Tier(String name, String art, int alter) {
        this.name = name;
        this.art = art;
        this.alter = alter;
    }

    public String getName() { return name; }
    public String getArt() { return art; }
    public int getAlter() { return alter; }

    @Override
    public String toString() {
        return name + " (" + art + "), " + alter + " Jahre alt";
    }
}
