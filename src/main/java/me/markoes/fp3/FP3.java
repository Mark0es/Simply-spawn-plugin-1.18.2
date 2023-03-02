package me.markoes.fp3;

import me.markoes.fp3.commands.reloadCommand;
import me.markoes.fp3.commands.setspawnCommand;
import me.markoes.fp3.commands.spawnCommand;
import me.markoes.fp3.listeners.spawnListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class FP3 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        getCommand("setspawn").setExecutor(new setspawnCommand(this));
        getCommand("spawn").setExecutor(new spawnCommand(this));
        getCommand("sreload").setExecutor(new reloadCommand(this));

        getServer().getPluginManager().registerEvents(new spawnListener(this), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
