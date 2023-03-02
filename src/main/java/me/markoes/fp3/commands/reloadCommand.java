package me.markoes.fp3.commands;

import me.markoes.fp3.FP3;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class reloadCommand implements CommandExecutor {

    private final FP3 plugin;

    public reloadCommand(FP3 plugin) {
        this.plugin = plugin;
    }


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player p){
            plugin.reloadConfig();
            p.sendMessage(ChatColor.GREEN + "Config reloaded!");
        }
        return true;
    }
}
