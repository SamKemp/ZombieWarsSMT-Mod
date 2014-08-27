package pw.untamemadman.modding.zombiemod.proxy;

import pw.untamemadman.modding.developercapes.DevCapes;
import pw.untamemadman.modding.zombiemod.reference.Reference;
import pw.untamemadman.modding.zombiemod.utility.LogHelper;

public class ClientProxy extends CommonProxy
{
    @Override
    public void initCapes()
    {
        DevCapes.getInstance().registerConfig(Reference.DevCapes, Reference.MOD_ID);
        LogHelper.info("Capes Loaded");
    }
}