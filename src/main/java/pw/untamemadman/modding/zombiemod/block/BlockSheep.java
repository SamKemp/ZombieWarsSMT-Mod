package pw.untamemadman.modding.zombiemod.block;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import pw.untamemadman.modding.zombiemod.ZombieMod;
import pw.untamemadman.modding.zombiemod.init.ModBlocks;
import pw.untamemadman.modding.zombiemod.reference.Reference;

import javax.swing.text.html.parser.Entity;
import java.util.Random;

public class BlockSheep extends BlockWrap
{
    public BlockSheep()
    {
        super();
        this.setBlockName("Sheep");
        this.setBlockTextureName("Sheep");
        this.setHardness(0.9F);
    }
}