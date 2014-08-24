package pw.untamemadman.modding.zombiemod.init;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
    public static void init()
    {
        GameRegistry.addSmelting(new ItemStack(Items.milk_bucket), new ItemStack(ModItems.Butter), 1);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.Wrapper), " L ", "L L", " L ", 'L', new ItemStack(Items.leather));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.Chocolate), " S ", "SBS", " W ", 'S', new ItemStack(Items.cookie), 'B', new ItemStack(ModItems.Butter), 'W', new ItemStack(ModItems.Wrapper));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.Churn), "wsw", "w w", "www", 'w', "logWood", 's', "stickWood"));
    }
}