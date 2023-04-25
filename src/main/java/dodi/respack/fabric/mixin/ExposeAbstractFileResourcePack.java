package dodi.respack.fabric.mixin;
import dodi.respack.fabric.repository.ResourcePackUtils.IExposedResourcePack;
import net.minecraft.resource.AbstractFileResourcePack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import java.io.File;

@Mixin(AbstractFileResourcePack.class)
public abstract class ExposeAbstractFileResourcePack implements IExposedResourcePack{
	@Shadow
	protected File base;
	
	@Override
	public File getFileOrFolder(){
		return base;
	}
}
