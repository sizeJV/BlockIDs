package com.sizejv;

import com.sizejv.listener.ItemListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class BlockIDs extends JavaPlugin {

    public static String PREFIX = "§8[§4BlockIds§8] ";

    @Override
    public void onEnable() {

        Bukkit.getPluginManager().registerEvents(new ItemListener(), this);

        Bukkit.getConsoleSender().sendMessage(PREFIX + "§aSuccessfully enabled plugin!");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(PREFIX + "§cSuccessfully disabled plugin!");
    }
}
