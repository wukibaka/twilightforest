// Date: 4/28/2012 9:46:20 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package twilightforest.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import twilightforest.entity.passive.EntityTFBird;


public class ModelTFRaven extends ModelBase {
	//fields
	ModelRenderer head;
	ModelRenderer beak1;
	ModelRenderer beak2;
	ModelRenderer body;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer rightfoot;
	ModelRenderer leftfoot;
	ModelRenderer tail;

	public ModelTFRaven() {
		textureWidth = 32;
		textureHeight = 32;

		head = new ModelRenderer(this, 0, 0);
		head.addBox(-1.5F, -1.5F, -3F, 3, 3, 3);
		head.setRotationPoint(0F, 18F, 0F);
		head.setTextureSize(32, 32);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);

		beak1 = new ModelRenderer(this, 12, 0);
		beak1.addBox(-0.5F, -1F, -2F, 1, 1, 2);
		beak1.setRotationPoint(0F, 0F, -2.5F);
		beak1.rotateAngleX = 0.2617994F;
		head.addChild(beak1);

		beak2 = new ModelRenderer(this, 12, 0);
		beak2.addBox(-0.5F, 0F, -2F, 1, 1, 2);
		beak2.setRotationPoint(0F, 0F, -2.5F);
		beak2.rotateAngleX = -0.2617994F;
		head.addChild(beak2);

		body = new ModelRenderer(this, 0, 6);
		body.addBox(-1.5F, 0F, -1F, 3, 4, 6);
		body.setRotationPoint(0F, 17F, 1F);
		body.setTextureSize(32, 32);
		setRotation(body, -0.5235988F, 0F, 0F);

		rightarm = new ModelRenderer(this, 0, 16);
		rightarm.addBox(-1F, 0F, -1.5F, 1, 3, 6);
		rightarm.setRotationPoint(-1.5F, 18F, 1F);
		rightarm.setTextureSize(32, 32);

		leftarm = new ModelRenderer(this, 0, 16);
		leftarm.addBox(0F, 0F, -1.5F, 1, 3, 6);
		leftarm.setRotationPoint(1.5F, 18F, 1F);
		leftarm.setTextureSize(32, 32);

		rightleg = new ModelRenderer(this, 14, 16);
		rightleg.addBox(0F, 0F, 0F, 1, 2, 1);
		rightleg.setRotationPoint(-1.5F, 21F, 1F);
		rightleg.setTextureSize(32, 32);

		rightfoot = new ModelRenderer(this, 14, 20);
		rightfoot.addBox(0F, -1F, -2F, 1, 1, 2);
		rightfoot.setRotationPoint(0F, 2F, 1F);
		rightfoot.setTextureSize(32, 32);
		setRotation(rightfoot, 0.5235988F, 0F, 0F);
		rightleg.addChild(rightfoot);

		leftleg = new ModelRenderer(this, 14, 16);
		leftleg.addBox(0F, 0F, 0F, 1, 2, 1);
		leftleg.setRotationPoint(0.5F, 21F, 1F);
		leftleg.setTextureSize(32, 32);

		leftfoot = new ModelRenderer(this, 14, 20);
		leftfoot.addBox(0F, -1F, -2F, 1, 1, 2);
		leftfoot.setRotationPoint(0F, 2F, 1F);
		leftfoot.setTextureSize(32, 32);
		setRotation(leftfoot, 0.5235988F, 0F, 0F);
		leftleg.addChild(leftfoot);

		tail = new ModelRenderer(this, 0, 25);
		tail.addBox(-1.5F, -0.5F, 0F, 3, 1, 3);
		tail.setRotationPoint(0F, 21F, 4F);
		tail.setTextureSize(32, 32);
		setRotation(tail, -0.5235988F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		head.render(f5);
		body.render(f5);
		rightarm.render(f5);
		leftarm.render(f5);
		rightleg.render(f5);
		leftleg.render(f5);

		tail.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}


	/**
	 * Sets the models various rotation angles.
	 */
	@Override
	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
		head.rotateAngleX = par5 / (180F / (float) Math.PI);
		head.rotateAngleY = par4 / (180F / (float) Math.PI);
		head.rotateAngleZ = par4 > 5 ? -0.2617994F : 0;

		rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		leftleg.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float) Math.PI) * 1.4F * par2;

		rightarm.rotateAngleZ = par3;
		leftarm.rotateAngleZ = -par3;

		if (((EntityTFBird) par7Entity).isBirdLanded()) {
			rightleg.rotationPointY = 21;
			leftleg.rotationPointY = 21;
		} else {
			rightleg.rotationPointY = 20F;
			leftleg.rotationPointY = 20F;
		}
	}


}
