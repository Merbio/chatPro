package ChatPRO_merbio_pl_com._KOMENDY;

import ChatPRO_merbio_pl_com.UTIL.Location$UTIL;
import ChatPRO_merbio_pl_com.UTIL.chat$utils;
import ChatPRO_merbio_pl_com.chat_PRO;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public final class TAHC_Kommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender SENDER, Command KOM, String KLUCZ, String[] ARGUMENTY_KOMENDY) {
        if(SENDER instanceof Player) {
            Player pepe = (Player) SENDER;
            if(pepe.hasPermission("tahc.admion")) {
                if(ARGUMENTY_KOMENDY.length == 1) {
                    if(ARGUMENTY_KOMENDY[0].equalsIgnoreCase("mute")) {
                        if(chat_PRO.Chat__WLACZONY == false) {
                            pepe.sendMessage(chat$utils.T("$eChat jest juz wylaczony!"));
                        } else {
                            chat_PRO.Chat__WLACZONY = false;
                            Bukkit.broadcastMessage(chat$utils.T("$bChat zostal wylaczony!"));
                        }
                    } else if(ARGUMENTY_KOMENDY[0].equalsIgnoreCase("unmute")) {
                        if(chat_PRO.Chat__WLACZONY == true) {
                            pepe.sendMessage(chat$utils.T("$eChat jest juz wlaczony!"));
                        } else {
                           chat_PRO.Chat__WLACZONY = true; 
                           Bukkit.broadcastMessage(chat$utils.T("$bChat zostal wlaczony!"));
                        }
                    } else if(ARGUMENTY_KOMENDY[0].equalsIgnoreCase("spawn")) {
                        new Location$UTIL().zapisLokacjeDOSectionConfiguration(chat_PRO.GET_DOSTEP_do_PRO_CHATA.getConfig().getConfigurationSection("spawn"), pepe.getLocation());
                        chat_PRO.__SPAWN__ = pepe.getLocation();
                        chat_PRO.GET_DOSTEP_do_PRO_CHATA.saveConfig();
                        pepe.sendMessage(chat$utils.T("$dLokacja spawnu w prochatcie zostala ustawiona!"));
                    } else {
                        for (int iterator = 0; iterator < 1000; iterator++) {
                            Bukkit.broadcastMessage(chat$utils.T(" "));
                        }
                        Bukkit.broadcastMessage(chat$utils.T("$bChat zostal wyczyszczony!"));
                    }
                } else {
                    pepe.sendMessage(chat$utils.T("$4Uzycie: /tahc mute|unmute|clear|spawn"));
                }
            } else {
                pepe.sendMessage(chat$utils.T("$4Musisz miec permisje zeby uzywac tej komendy!"));
            }
        } else {
            SENDER.sendMessage(chat$utils.T("$4Musisz byc graczem zeby uzyc tej komendy!"));
        }
        return true;
    }

}
