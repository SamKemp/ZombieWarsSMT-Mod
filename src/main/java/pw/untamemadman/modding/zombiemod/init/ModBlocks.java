package pw.untamemadman.modding.zombiemod.init;
import pw.untamemadman.modding.zombiemod.block.BlockChurn;
import pw.untamemadman.modding.zombiemod.block.BlockSheep;
import pw.untamemadman.modding.zombiemod.block.BlockWrap;
import pw.untamemadman.modding.zombiemod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockWrap Sheep = new BlockSheep();
    public static final BlockWrap Churn = new BlockChurn();
    public static void init()
    {
        GameRegistry.registerBlock(Sheep, "Sheep");
        GameRegistry.registerBlock(Churn, "Churn");
    }
}