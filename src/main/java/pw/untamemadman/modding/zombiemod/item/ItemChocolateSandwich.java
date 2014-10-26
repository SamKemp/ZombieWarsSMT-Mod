package pw.untamemadman.modding.zombiemod.item;

import net.minecraft.item.ItemFood;
import pw.untamemadman.modding.zombiemod.creativetab.CreativeTabZombieMod;
import pw.untamemadman.modding.zombiemod.reference.Reference;

/**
 * Created by untamemadman on 26/10/2014.
 */

public class ItemChocolateSandwich extends ItemFood
{
    public ItemChocolateSandwich()
    {
        super(5, 1.0F, false);
        this.setUnlocalizedName("ChocolateSandwich");
        this.setTextureName(Reference.MOD_ID.toLowerCase() + ":" + getUnlocalizedName().substring(5));
        this.setCreativeTab(CreativeTabZombieMod.ZOMBIEMOD_TAB);
    }
}
