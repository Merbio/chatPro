package ChatPRO_merbio_pl_com;

import ChatPRO_merbio_pl_com._KOMENDY.TAHC_Kommand;
import ChatPRO_merbio_pl_com._Listenery.gdy_gracz_cos_napisze_LISTENER;
import ChatPRO_merbio_pl_com.UTIL.Location$UTIL;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

public final class chat_PRO extends JavaPlugin {
    
    //#OnlyNotepad++
    //#KodyProstoZMc4u.peel
    //#!ProProgramista
    //#MamKodWiekszyNizTwoj
    //#Ty <=? Ja
    //#PiszeGildieW0,4Dnia
    //#LepszyNiz_piterka&best241&OtekPlay&dekros123&CzlowiekVAC&gotofinal&NorthPL&OldisPL&PabloTL&kamcio&digi&Molka&Xtremek
    //#Challage_ZrobiszLepiej???
    
    public static chat_PRO GET_DOSTEP_do_PRO_CHATA;
    public static boolean Chat__WLACZONY = true;
    public static Location __SPAWN__;
    
    public static final String author = "Merbio ~i nie podmieniaj kutafonie!";

    @Override
    public void onEnable() {
        GET_DOSTEP_do_PRO_CHATA = this;
        Chat__WLACZONY = true;
        zainicjalizujCommands();
        zainicjalizujListeners();
        if(getConfig().isSet("spawn") == false) {
            new Location$UTIL().zapisLokacjeDOSectionConfiguration(getConfig().createSection("spawn"), Bukkit.getServer().getWorlds().get(0).getSpawnLocation());
            saveConfig();
        }
        __SPAWN__ = new Location$UTIL().pobierzLokacjeZSectionConfiguration(getConfig().getConfigurationSection("spawn"));
    }

    @Override
    public void onDisable() {
        GET_DOSTEP_do_PRO_CHATA = this;
    }
    
    public void zainicjalizujCommands() {
        getCommand("tahc").setExecutor(new TAHC_Kommand());
    }
    
    public void zainicjalizujListeners() {
        getServer().getPluginManager().registerEvents(new gdy_gracz_cos_napisze_LISTENER(), this);
    }
}
