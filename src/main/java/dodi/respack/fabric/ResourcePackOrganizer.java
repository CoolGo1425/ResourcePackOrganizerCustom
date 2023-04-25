package dodi.respack.fabric;
import dodi.respack.fabric.repository.NestedFolderPackFinder;
import net.fabricmc.api.ClientModInitializer;

@SuppressWarnings("unused")
public final class ResourcePackOrganizer implements ClientModInitializer{
	@Override
	public void onInitializeClient(){
		NestedFolderPackFinder.register();
	}
}
