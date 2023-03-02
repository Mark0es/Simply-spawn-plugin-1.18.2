package me.markoes.fp3.commands;

import me.markoes.fp3.FP3;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class spawnCommand implements CommandExecutor {

    private final FP3 plugin;
    public spawnCommand(FP3 plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player p){
            Location location = plugin.getConfig().getLocation("spawn");
            if (location != null){
                p.teleport(location);
                p.sendMessage("You have been sent to spawn.");
            }else{
                p.sendMessage("There is no spawn point set.");
            }
        }
        return true;
    }
}
