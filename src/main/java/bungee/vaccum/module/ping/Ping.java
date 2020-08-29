package bungee.vaccum.module.ping;

import bungee.vaccum.module.ping.commands.PingCommand;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.md_5.bungee.api.plugin.Plugin;

import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public final class Ping extends Plugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getProxy().getConsole().sendMessage("§7[" + getDescription().getName() + "] Loading...");
        getProxy().getPluginManager().registerCommand(this, new PingCommand());
        getProxy().getConsole().sendMessage("§7[" + getDescription().getName() + "] Successfully version " + getDescription().getVersion() + " loaded");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
