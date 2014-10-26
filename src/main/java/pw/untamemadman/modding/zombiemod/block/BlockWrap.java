package pw.untamemadman.modding.zombiemod.block;
import pw.untamemadman.modding.zombiemod.creativetab.CreativeTabZombieMod;
import pw.untamemadman.modding.zombiemod.init.ModBlocks;
import pw.untamemadman.modding.zombiemod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
public class BlockWrap extends Block
{
    public BlockWrap(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabZombieMod.ZOMBIEMOD_TAB);
    }
    public BlockWrap()
    {
        this(Material.cloth);
    }
    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }
    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
