package ChatPRO_merbio_pl_com.UTIL;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.ConfigurationSection;

public class Location$UTIL {

    public Location pobierzLokacjeZSectionConfiguration(ConfigurationSection sekcja) {
        return new Location(Bukkit.getServer().getWorld(sekcja.getString("swiat")), sekcja.getDouble("X"), sekcja.getDouble("y"), sekcja.getDouble("Z"), (float) sekcja.getDouble("PitcH"), (float) sekcja.getDouble("YaW"));
    }
    
    public void zapisLokacjeDOSectionConfiguration(ConfigurationSection sekcja, Location LOKACJA_) {
        sekcja.set("swiat", LOKACJA_.getWorld().getName());
        sekcja.set("X", LOKACJA_.getBlockX());
        sekcja.set("y", LOKACJA_.getY());
        sekcja.set("Z", LOKACJA_.getBlockZ());
        sekcja.set("PitcH", LOKACJA_.getPitch());
        sekcja.set("YaW", LOKACJA_.getYaw());
    }
}
