package bungee.vaccum.module.ping.commands;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class PingCommand extends Command {

    public PingCommand() {
        super("ping");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if(sender instanceof ProxiedPlayer) {
            ProxiedPlayer proxiedPlayer = (ProxiedPlayer) sender;

            if(args.length == 0) {
                proxiedPlayer.sendMessage("§aDein Ping§7: §e" + proxiedPlayer.getPing() + "ms");
            } else {
                proxiedPlayer.sendMessage("command_not_found");
            }
        }
    }
}
