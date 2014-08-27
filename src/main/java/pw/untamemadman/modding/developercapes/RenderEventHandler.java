package pw.untamemadman.modding.developercapes;

import pw.untamemadman.modding.developercapes.cape.ICape;
import pw.untamemadman.modding.developercapes.user.User;
import pw.untamemadman.modding.developercapes.user.UserManager;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraftforge.client.event.RenderPlayerEvent;

/**
 * @author jadar
 */
public class RenderEventHandler {

    @SubscribeEvent
    public void renderPlayer(RenderPlayerEvent.Specials.Pre event) {
        AbstractClientPlayer player = (AbstractClientPlayer) event.entityPlayer;

        UserManager manager = UserManager.INSTANCE;
        User user = manager.getUser(player.getCommandSenderName());
        if (user == null) return;

        ICape cape = user.capes.get(0);
        if (cape == null) return;

        boolean flag = cape.isTextureLoaded(player);
        if (!flag) {
            cape.loadTexture(player);
        }
    }

}
