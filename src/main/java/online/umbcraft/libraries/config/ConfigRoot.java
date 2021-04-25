package online.umbcraft.libraries.config;

public enum ConfigRoot {

    //  1.12 autocraft dupe root path
    AUTOCRAFT("autocraft-dupe"),

    //  1.15 donkey dupe root path
    DONKEY("autocraft-dupe"),

    //  item limits root path
    NON_STACK("non-stackables"),

    //  shulker settings root path
    SHULKERS("shulkers"),

    //  totem settings root path
    TOTEMS("totems");

    private final String path;

    ConfigRoot(String path) {
        this.path = path;
    }

    public String path() {
        return path;
    }
}