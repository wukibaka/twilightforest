package twilightforest.client.renderer.entity;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Mob;
import twilightforest.TwilightForestMod;

public class TFGenericMobRenderer<T extends Mob, M extends EntityModel<T>> extends MobRenderer<T, M> {

	private final ResourceLocation textureLoc;

	public TFGenericMobRenderer(EntityRendererProvider.Context manager, M model, float shadowSize, String textureName) {
		super(manager, model, shadowSize);

		if (textureName.startsWith("textures")) {
			textureLoc = ResourceLocation.withDefaultNamespace(textureName);
		} else {
			textureLoc = TwilightForestMod.getModelTexture(textureName);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(T entity) {
		return textureLoc;
	}
}
