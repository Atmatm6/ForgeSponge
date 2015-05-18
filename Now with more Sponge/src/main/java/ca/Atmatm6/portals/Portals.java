package ca.Atmatm6.portals;

import org.spongepowered.api.event.state.ServerStartedEvent;
import org.spongepowered.api.plugin.Plugin;

import java.util.logging.Level;
import java.util.logging.Logger;

@Plugin(id = "Portals: Multidimensional Transportation through thingies", name = Portals.name, version = "Build-1A")
public class Portals {
    public static final String name = "PortalsMT";
    public Logger Portalog = Logger.getLogger(name);
    public void serverStart(ServerStartedEvent serverStarted){
        Portalog.log(Level.FINE, "If you are seeing this message, you have installed the Trans Dimensional Transportation System");

    }
}
