package se.nackademin.solarsystemplanetinfo;

/**
 * Created by Oskar on 2018-02-07.
 */
// Binder itemrow id med customadapter och används i mainactivity array
public class DataItem {
    public static int planetInfo;
    public static int compareinfo;
    int resIdThumbnail;
    String planetName;

    public DataItem(int resIdThumbnail, String planetName) {
        this.resIdThumbnail = resIdThumbnail;
        this.planetName = planetName;
        this.planetInfo = planetInfo;
        this.compareinfo = compareinfo;
    }
}