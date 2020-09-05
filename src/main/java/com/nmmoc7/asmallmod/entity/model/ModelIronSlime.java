package com.nmmoc7.asmallmod.entity.model;// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelIronSlime extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;

	public ModelIronSlime() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 26, 16, -5.0F, -2.0F, 5.0F, 6, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 16, 32, -7.0F, -8.0F, 5.0F, 2, 8, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 8, 32, 5.0F, -8.0F, -7.0F, 2, 8, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 24, 38, 5.0F, -4.0F, 5.0F, 2, 4, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 40, 18, 3.0F, -2.0F, 5.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 40, 22, 5.0F, -2.0F, 3.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 32, 20, -7.0F, -4.0F, -7.0F, 2, 4, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 38, 30, -5.0F, -2.0F, -7.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 38, 34, -7.0F, -2.0F, -5.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 26, 26, -1.0F, -2.0F, -7.0F, 6, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 24, 5.0F, -2.0F, -5.0F, 2, 2, 6, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 16, 24, -7.0F, -2.0F, -1.0F, 2, 2, 6, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, -4.0F, -11.0F, -4.0F, 8, 8, 8, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 10.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 24, 4, -5.0F, 0.0F, -7.0F, 6, 2, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 32, -7.0F, 0.0F, -7.0F, 2, 8, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 30, 30, 5.0F, 0.0F, 5.0F, 2, 8, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 32, 8, 5.0F, 0.0F, -7.0F, 2, 4, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 38, 12, 3.0F, 0.0F, -7.0F, 2, 2, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 38, 6, 5.0F, 0.0F, -5.0F, 2, 2, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 0, -7.0F, 0.0F, 5.0F, 2, 4, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 38, 2, -5.0F, 0.0F, 5.0F, 2, 2, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 36, 38, -7.0F, 0.0F, 3.0F, 2, 2, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 24, 0, -1.0F, 0.0F, 5.0F, 6, 2, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 16, 16, 5.0F, 0.0F, -1.0F, 2, 2, 6, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 16, -7.0F, 0.0F, -5.0F, 2, 2, 6, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 0, 6, -2.0F, -5.0F, -5.0F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 10, 24, -5.0F, -9.0F, -5.0F, 3, 3, 3, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 10, 16, 2.0F, -9.0F, -5.0F, 3, 3, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
		bone2.render(f5);
		bone3.render(f5);
		bone4.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}