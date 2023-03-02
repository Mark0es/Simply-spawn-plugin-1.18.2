package me.markoes.fp3.commands;

import me.markoes.fp3.FP3;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class setspawnCommand implements CommandExecutor {

    private final FP3 plugin;
    public setspawnCommand(FP3 plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] strings) {
        if (commandSender instanceof Player player){
            Location location = player.getLocation();
            plugin.getConfig().set("spawn", location);
            plugin.saveConfig();
            player.sendMessage("Spawn location set!");
        }else{
            System.out.println("nigga console");
        }
        return true;
    }
}
