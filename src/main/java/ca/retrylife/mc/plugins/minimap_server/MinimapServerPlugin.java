package ca.retrylife.mc.plugins.minimap_server;

import kr.entree.spigradle.annotations.PluginMain;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.JavaPluginLoader;

@PluginMain
public class MinimapServerPlugin extends JavaPlugin {

    public MinimapServerPlugin() {
    }

    public MinimapServerPlugin(JavaPluginLoader loader, PluginDescriptionFile description, File dataFolder, File file) {
        super(loader, description, dataFolder, file);
    }
    
}