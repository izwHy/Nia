package ml.nanoudieum.nia;

import ml.nanoudieum.nia.commands.broadcast;
import ml.nanoudieum.nia.commands.poupeff;
import org.bukkit.plugin.java.JavaPlugin;

public final class Nia extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Niaaa Je suis là");

        getCommand("broadcast").setExecutor(new broadcast());
        getCommand("poupeff").setExecutor(new poupeff());

    }

    @Override
    public void onDisable() {
        System.out.println("Niaaaa Je m'envaaaaiiis");
    }
}
