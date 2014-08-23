package pw.untamemadman.modding.zombiemod.creativetab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import pw.untamemadman.modding.zombiemod.init.ModItems;
import pw.untamemadman.modding.zombiemod.reference.Reference;
public class CreativeTabZombieMod
{
    public static final CreativeTabs ZOMBIEMOD_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.Chocolate;
        }
    };
}