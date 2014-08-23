package pw.untamemadman.modding.zombiemod.init;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;
public class Recipes {
    public static void init()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.Churn), "wsw", "w w", "www", 'w', "logWood", 's', "stickWood"));
    }
}