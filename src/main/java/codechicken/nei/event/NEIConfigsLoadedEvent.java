package codechicken.nei.event;

import cpw.mods.fml.common.eventhandler.ListenerList;
import net.minecraftforge.common.MinecraftForge;

import codechicken.nei.api.IConfigureNEI;
import cpw.mods.fml.common.eventhandler.Event;

/**
 * Event is posted from <font color=red>NEI Plugin Loader Thread</font> after all {@link IConfigureNEI} were loaded.
 * <br>
 * This event does not have a result. {@link HasResult}<br>
 * <br>
 * This event is fired on the {@link MinecraftForge#EVENT_BUS}.
 */
public class NEIConfigsLoadedEvent extends Event {
    private static ListenerList LISTENER_LIST;

    protected void setup() {
        super.setup();
        if (LISTENER_LIST == null) {
            LISTENER_LIST = new ListenerList(super.getListenerList());
        }
    }

    public ListenerList getListenerList() {
        return LISTENER_LIST;
    }
}
