package pw.untamemadman.modding.zombiemod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import pw.untamemadman.modding.zombiemod.armor.DerpyMask;
import pw.untamemadman.modding.zombiemod.armor.Glasses;
import pw.untamemadman.modding.zombiemod.armor.GlassesUpgrade;
import pw.untamemadman.modding.zombiemod.armor.SheepArmor;

public class Recipes {
    public static void init()
    {
        //Butter
        GameRegistry.addSmelting(new ItemStack(Items.milk_bucket), new ItemStack(ModItems.Butter), 1);

        //Wrapper
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.Wrapper), " L ", "L L", " L ", 'L', new ItemStack(Items.leather));

        //Chocolate
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.Chocolate), " S ", "SBS", " W ", 'S', new ItemStack(Items.cookie), 'B', new ItemStack(ModItems.Butter), 'W', new ItemStack(ModItems.Wrapper));

        //Glasses
        GameRegistry.addRecipe(new ItemStack(Glasses.Glasses), "WWW", "GWG", "WWW", 'G', new ItemStack(Blocks.glass_pane), 'W', new ItemStack(Items.iron_ingot));

        //Better Glasses
        GameRegistry.addRecipe(new ItemStack(GlassesUpgrade.GlassesUpgrade), "WWW", "WGW", "WWW", 'W', new ItemStack(ModItems.Chocolate), 'G', new ItemStack(Glasses.Glasses));

        //Derpy Mask
        GameRegistry.addRecipe(new ItemStack(DerpyMask.DerpyMask), "XXX", "SXS", "XXX", 'X', new ItemStack(Blocks.wool), 'S', new ItemStack(Items.string));

        //Chocolate Apples
        GameRegistry.addRecipe(new ItemStack(ModItems.ChocolateApple), "XXX", "XCX", "XXX", 'X', new ItemStack(ModItems.Chocolate), 'C', new ItemStack(Items.golden_apple));

        //Sheep
        //Helmet
        GameRegistry.addRecipe(new ItemStack(SheepArmor.SheepHelmet), "XXX", "X X", "   ", 'X', new ItemStack(Blocks.wool));
        //Chestplate
        GameRegistry.addRecipe(new ItemStack(SheepArmor.SheepChestplate), "X X", "XXX","XXX",'X', new ItemStack(Blocks.wool));
        //Pants
        GameRegistry.addRecipe(new ItemStack(SheepArmor.SheepPants), "XXX", "X X", "X X", 'X', new ItemStack(Blocks.wool));
        //Boots
        GameRegistry.addRecipe(new ItemStack(SheepArmor.SheepBoots), "   ", "X X", "X X", 'X', new ItemStack(Blocks.wool));
        //Blocks
        GameRegistry.addRecipe(new ItemStack(ModBlocks.Sheep), "XXX", "XXX", "XXX", 'X', new ItemStack(Blocks.wool));
    }
}