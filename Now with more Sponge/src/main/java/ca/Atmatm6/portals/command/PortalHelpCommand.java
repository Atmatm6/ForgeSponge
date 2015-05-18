package ca.Atmatm6.portals.command;

import com.google.common.base.Optional;
import org.spongepowered.api.Server;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.TextBuilder;
import org.spongepowered.api.text.Texts;
import org.spongepowered.api.text.format.TextColors;
import org.spongepowered.api.util.command.CommandCallable;
import org.spongepowered.api.util.command.CommandException;
import org.spongepowered.api.util.command.CommandResult;
import org.spongepowered.api.util.command.CommandSource;

import java.util.List;

public class PortalHelpCommand implements CommandCallable {
    private final Server server;
    private final TextBuilder.Literal textHelp(){
        return Texts.builder("Help command for anyone/thing who want to know what the commands are.");
    }
    private final TextBuilder.Literal textDesc(){
        return Texts.builder("Help command to show commands.");
    }
    private final TextBuilder.Literal textUsage(){
        return Texts.builder("Help command").color(TextColors.RED);
    }

    public PortalHelpCommand(Server server) {
        this.server = server;
    }

    @Override
    public Optional<CommandResult> process(CommandSource source, String arguments) throws CommandException {
        return null;
    }

    @Override
    public List<String> getSuggestions(CommandSource source, String arguments) throws CommandException {
        return null;
    }

    @Override
    public boolean testPermission(CommandSource source) {
        return false;
    }

    @Override
    public Optional<Text> getShortDescription(CommandSource source) {
        return null;
    }

    @Override
    public Optional<Text> getHelp(CommandSource source) {
        return null;
    }

    @Override
    public Text getUsage(CommandSource source) {
        return null;
    }
}
