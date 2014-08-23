package pw.untamemadman.modding.zombiemod.client.gui;
import java.util.List;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import pw.untamemadman.modding.zombiemod.handeler.ConfigHandeler;
import pw.untamemadman.modding.zombiemod.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
public class ModGuiConfig extends GuiConfig
{
    public ModGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement(ConfigHandeler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigHandeler.configuration.toString()));
    }
}