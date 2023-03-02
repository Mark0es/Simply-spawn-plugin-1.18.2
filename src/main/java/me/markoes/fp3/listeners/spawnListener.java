package me.markoes.fp3.listeners;

import me.markoes.fp3.FP3;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

public class spawnListener implements Listener {

    private final FP3 plugin;


    public spawnListener(FP3 plugin) {
        this.plugin = plugin;
    }




    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        Player player = e.getPlayer();
        if (!e.getPlayer().hasPlayedBefore()){
            Location location = plugin.getConfig().getLocation("spawn");
            if (location != null){
                player.teleport(location);
                player.sendMessage("You have been sent to spawn.");
            }else{
                player.sendMessage("There is no spawn point set.");
            }
        }
    }

    @EventHandler
    public void onPlayerRespawn(PlayerRespawnEvent e){
        Location location = plugin.getConfig().getLocation("spawn");
        if (location != null){
            e.setRespawnLocation(location);
        }
    }
}
