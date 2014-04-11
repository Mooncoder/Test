package deadspacemod.client.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DSModelLeaper extends ModelBase
{
	//fields
	ModelRenderer Left_finger_part_2;
	ModelRenderer Left_finger_part_3;
	ModelRenderer Left_finger_part_4;
	ModelRenderer Right_finger_part_1;
	ModelRenderer Right_finger_part_2;
	ModelRenderer Right_finger_part_3;
	ModelRenderer Right_hand_part_1;
	ModelRenderer Right_hand_part_2;
	ModelRenderer Right_hand_part_3;
	ModelRenderer Left_hand_part_1;
	ModelRenderer Left_hand_part_2;
	ModelRenderer Left_hand_part_3;
	ModelRenderer Bone_spike_part_1;
	ModelRenderer Bone_spike_part_2;
	ModelRenderer Bone_spike_part_3;
	ModelRenderer Bone_spike_part_4;
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
	ModelRenderer Shape8;
	ModelRenderer Shape9;
	ModelRenderer Shape10;
	ModelRenderer Shape11;
	ModelRenderer Shape12;
	ModelRenderer Shape13;
	ModelRenderer Shape14;
	ModelRenderer Shape15;
	ModelRenderer Shape16;
	ModelRenderer Shape17;
	ModelRenderer Shape18;
	ModelRenderer Shape19;
	ModelRenderer Shape20;
	ModelRenderer Shape21;
	ModelRenderer Shape22;
	ModelRenderer Shape23;
	ModelRenderer body;
	ModelRenderer Tale_part_3;
	ModelRenderer Tale_part_4;
	ModelRenderer Tale_part_7;
	ModelRenderer Tale_part_8;
	ModelRenderer Tale_part_1;
	ModelRenderer Tale_part_10;
	ModelRenderer Tale_part_5;
	ModelRenderer Tale_part_6;
	ModelRenderer Tale_part_9;
	ModelRenderer Tale_part_2;
	ModelRenderer Right_finger_part_4;
	ModelRenderer Left_finger_part_1;
	ModelRenderer Shape24;
	ModelRenderer Shape25;
	ModelRenderer Shape26;
	ModelRenderer Shape27;
	ModelRenderer Shape28;
	ModelRenderer Shape29;
	ModelRenderer Shape30;
	ModelRenderer Shape31;

	public DSModelLeaper()
	{
		textureWidth = 512;
		textureHeight = 512;

		Left_finger_part_2 = new ModelRenderer(this, 62, 36);
		Left_finger_part_2.addBox(0F, 0F, 0F, 1, 1, 3);
		Left_finger_part_2.setRotationPoint(8.6F, 22F, -20.5F);
		Left_finger_part_2.setTextureSize(512, 512);
		Left_finger_part_2.mirror = true;
		setRotation(Left_finger_part_2, -0.3490659F, 0.1396263F, 0F);
		Left_finger_part_3 = new ModelRenderer(this, 72, 36);
		Left_finger_part_3.addBox(0F, 0F, 0F, 1, 1, 3);
		Left_finger_part_3.setRotationPoint(10.4F, 22F, -20.6F);
		Left_finger_part_3.setTextureSize(512, 512);
		Left_finger_part_3.mirror = true;
		setRotation(Left_finger_part_3, -0.3490659F, -0.1396263F, 0F);
		Left_finger_part_4 = new ModelRenderer(this, 21, 36);
		Left_finger_part_4.addBox(0F, 0F, 0F, 1, 1, 3);
		Left_finger_part_4.setRotationPoint(11.8F, 22.1F, -19.4F);
		Left_finger_part_4.setTextureSize(512, 512);
		Left_finger_part_4.mirror = true;
		setRotation(Left_finger_part_4, -0.3839724F, -0.8028515F, 0F);
		Right_finger_part_1 = new ModelRenderer(this, 52, 36);
		Right_finger_part_1.addBox(0F, 0F, 0F, 1, 1, 3);
		Right_finger_part_1.setRotationPoint(-11.6F, 22F, -20.5F);
		Right_finger_part_1.setTextureSize(512, 512);
		Right_finger_part_1.mirror = true;
		setRotation(Right_finger_part_1, -0.3490659F, -0.1396263F, 0F);
		Right_finger_part_2 = new ModelRenderer(this, 42, 36);
		Right_finger_part_2.addBox(0F, 0F, 0F, 1, 1, 3);
		Right_finger_part_2.setRotationPoint(-13.3F, 22F, -20.4F);
		Right_finger_part_2.setTextureSize(512, 512);
		Right_finger_part_2.mirror = true;
		setRotation(Right_finger_part_2, -0.3490659F, 0.1396263F, 0F);
		Right_finger_part_3 = new ModelRenderer(this, 31, 36);
		Right_finger_part_3.addBox(0F, 0F, 0F, 1, 1, 3);
		Right_finger_part_3.setRotationPoint(-14.5F, 22F, -18.7F);
		Right_finger_part_3.setTextureSize(512, 512);
		Right_finger_part_3.mirror = true;
		setRotation(Right_finger_part_3, -0.3490659F, 0.8028515F, 0F);
		Right_hand_part_1 = new ModelRenderer(this, 0, 26);
		Right_hand_part_1.addBox(0F, 0F, 0F, 8, 2, 2);
		Right_hand_part_1.setRotationPoint(-12F, 19F, -6F);
		Right_hand_part_1.setTextureSize(512, 512);
		Right_hand_part_1.mirror = true;
		setRotation(Right_hand_part_1, 0F, 0F, -0.1745329F);
		Right_hand_part_2 = new ModelRenderer(this, 28, 41);
		Right_hand_part_2.addBox(0F, 0F, 0F, 2, 2, 11);
		Right_hand_part_2.setRotationPoint(-13F, 21.7F, -15.2F);
		Right_hand_part_2.setTextureSize(512, 512);
		Right_hand_part_2.mirror = true;
		setRotation(Right_hand_part_2, 0.2443461F, 0F, 0F);
		Right_hand_part_3 = new ModelRenderer(this, 0, 55);
		Right_hand_part_3.addBox(0F, 0F, 0F, 2, 2, 3);
		Right_hand_part_3.setRotationPoint(-13F, 22F, -17.7F);
		Right_hand_part_3.setTextureSize(512, 512);
		Right_hand_part_3.mirror = true;
		setRotation(Right_hand_part_3, 0F, 0F, 0F);
		Left_hand_part_1 = new ModelRenderer(this, 0, 36);
		Left_hand_part_1.addBox(0F, 0F, 0F, 8, 2, 2);
		Left_hand_part_1.setRotationPoint(2F, 18F, -6F);
		Left_hand_part_1.setTextureSize(512, 512);
		Left_hand_part_1.mirror = true;
		setRotation(Left_hand_part_1, 0F, 0.0523599F, 0.1745329F);
		Left_hand_part_2 = new ModelRenderer(this, 0, 41);
		Left_hand_part_2.addBox(0F, 0F, 0F, 2, 2, 11);
		Left_hand_part_2.setRotationPoint(9F, 22F, -15.2F);
		Left_hand_part_2.setTextureSize(512, 512);
		Left_hand_part_2.mirror = true;
		setRotation(Left_hand_part_2, 0.2443461F, 0F, 0F);
		Left_hand_part_3 = new ModelRenderer(this, 11, 54);
		Left_hand_part_3.addBox(0F, 0F, 0F, 2, 2, 3);
		Left_hand_part_3.setRotationPoint(9F, 22F, -17.7F);
		Left_hand_part_3.setTextureSize(512, 512);
		Left_hand_part_3.mirror = true;
		setRotation(Left_hand_part_3, 0F, 0F, 0F);
		Bone_spike_part_1 = new ModelRenderer(this, 3, 225);
		Bone_spike_part_1.addBox(0F, 0F, 0F, 1, 4, 1);
		Bone_spike_part_1.setRotationPoint(-1.5F, 19.9F, 49F);
		Bone_spike_part_1.setTextureSize(512, 512);
		Bone_spike_part_1.mirror = true;
		setRotation(Bone_spike_part_1, 0F, 0F, 0F);
		Bone_spike_part_2 = new ModelRenderer(this, 3, 232);
		Bone_spike_part_2.addBox(0F, 0F, 0F, 1, 3, 3);
		Bone_spike_part_2.setRotationPoint(-1.5F, 20.9F, 50F);
		Bone_spike_part_2.setTextureSize(512, 512);
		Bone_spike_part_2.mirror = true;
		setRotation(Bone_spike_part_2, 0F, 0F, 0F);
		Bone_spike_part_3 = new ModelRenderer(this, 3, 240);
		Bone_spike_part_3.addBox(0F, 0F, 0F, 1, 2, 1);
		Bone_spike_part_3.setRotationPoint(-1.5F, 21.9F, 53F);
		Bone_spike_part_3.setTextureSize(512, 512);
		Bone_spike_part_3.mirror = true;
		setRotation(Bone_spike_part_3, 0F, 0F, 0F);
		Bone_spike_part_4 = new ModelRenderer(this, 3, 245);
		Bone_spike_part_4.addBox(0F, 0F, 0F, 1, 1, 2);
		Bone_spike_part_4.setRotationPoint(-1.5F, 22.9F, 54F);
		Bone_spike_part_4.setTextureSize(512, 512);
		Bone_spike_part_4.mirror = true;
		setRotation(Bone_spike_part_4, 0F, 0F, 0F);
		Shape1 = new ModelRenderer(this, 230, 0);
		Shape1.addBox(0F, 0F, 0F, 4, 2, 5);
		Shape1.setRotationPoint(-2.9F, 14.2F, -12.4F);
		Shape1.setTextureSize(512, 512);
		Shape1.mirror = true;
		setRotation(Shape1, -0.296706F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 50, 0);
		Shape2.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape2.setRotationPoint(-2.9F, 21F, -15.5F);
		Shape2.setTextureSize(512, 512);
		Shape2.mirror = true;
		setRotation(Shape2, 0.296706F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 61, 0);
		Shape3.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape3.setRotationPoint(-2.9F, 18F, -16.2F);
		Shape3.setTextureSize(512, 512);
		Shape3.mirror = true;
		setRotation(Shape3, -0.122173F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 280, 0);
		Shape4.addBox(0F, 0F, 0F, 4, 1, 4);
		Shape4.setRotationPoint(-2.9F, 22.7F, -15F);
		Shape4.setTextureSize(512, 512);
		Shape4.mirror = true;
		setRotation(Shape4, 0.296706F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 300, 0);
		Shape5.addBox(0F, 0F, 0F, 4, 1, 1);
		Shape5.setRotationPoint(-2.9F, 21F, -12F);
		Shape5.setTextureSize(512, 512);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 177, 0);
		Shape6.addBox(0F, 0F, 0F, 4, 2, 8);
		Shape6.setRotationPoint(-2.9F, 16F, -16F);
		Shape6.setTextureSize(512, 512);
		Shape6.mirror = true;
		setRotation(Shape6, -0.122173F, 0F, 0F);
		Shape7 = new ModelRenderer(this, 160, 0);
		Shape7.addBox(0F, 0F, 0F, 4, 4, 4);
		Shape7.setRotationPoint(-2.9F, 17F, -12F);
		Shape7.setTextureSize(512, 512);
		Shape7.mirror = true;
		setRotation(Shape7, 0F, 0F, 0F);
		Shape8 = new ModelRenderer(this, 0, 101);
		Shape8.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape8.setRotationPoint(-1.5F, 13F, 8F);
		Shape8.setTextureSize(512, 512);
		Shape8.mirror = true;
		setRotation(Shape8, 0F, 0F, 0F);
		Shape9 = new ModelRenderer(this, 150, 0);
		Shape9.addBox(0F, 0F, 0F, 3, 3, 1);
		Shape9.setRotationPoint(-2.5F, 17F, -8F);
		Shape9.setTextureSize(512, 512);
		Shape9.mirror = true;
		setRotation(Shape9, 0F, 0F, 0F);
		Shape10 = new ModelRenderer(this, 0, 100);
		Shape10.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape10.setRotationPoint(-1.5F, 13F, 6F);
		Shape10.setTextureSize(512, 512);
		Shape10.mirror = true;
		setRotation(Shape10, 0F, 0F, 0F);
		Shape11 = new ModelRenderer(this, 0, 76);
		Shape11.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape11.setRotationPoint(-1.5F, 13F, -2F);
		Shape11.setTextureSize(512, 512);
		Shape11.mirror = true;
		setRotation(Shape11, 0F, 0F, 0F);
		Shape12 = new ModelRenderer(this, 0, 94);
		Shape12.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape12.setRotationPoint(-1.5F, 13F, 4F);
		Shape12.setTextureSize(512, 512);
		Shape12.mirror = true;
		setRotation(Shape12, 0F, 0F, 0F);
		Shape13 = new ModelRenderer(this, 0, 111);
		Shape13.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape13.setRotationPoint(-1.5F, 15F, 12F);
		Shape13.setTextureSize(512, 512);
		Shape13.mirror = true;
		setRotation(Shape13, 0F, 0F, 0F);
		Shape14 = new ModelRenderer(this, 0, 106);
		Shape14.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape14.setRotationPoint(-1.5F, 14F, 10F);
		Shape14.setTextureSize(512, 512);
		Shape14.mirror = true;
		setRotation(Shape14, 0F, 0F, 0F);
		Shape15 = new ModelRenderer(this, 0, 88);
		Shape15.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape15.setRotationPoint(-1.5F, 13F, 2F);
		Shape15.setTextureSize(512, 512);
		Shape15.mirror = true;
		setRotation(Shape15, 0F, 0F, 0F);
		Shape16 = new ModelRenderer(this, 0, 67);
		Shape16.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape16.setRotationPoint(-1.5F, 15F, -6F);
		Shape16.setTextureSize(512, 512);
		Shape16.mirror = true;
		setRotation(Shape16, 0F, 0F, 0F);
		Shape17 = new ModelRenderer(this, 0, 71);
		Shape17.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape17.setRotationPoint(-1.5F, 14F, -4F);
		Shape17.setTextureSize(512, 512);
		Shape17.mirror = true;
		setRotation(Shape17, 0F, 0F, 0F);
		Shape18 = new ModelRenderer(this, 0, 82);
		Shape18.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape18.setRotationPoint(-1.5F, 13F, 0F);
		Shape18.setTextureSize(512, 512);
		Shape18.mirror = true;
		setRotation(Shape18, 0F, 0F, 0F);
		Shape19 = new ModelRenderer(this, 56, 0);
		Shape19.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape19.setRotationPoint(0.1F, 21F, -15.5F);
		Shape19.setTextureSize(512, 512);
		Shape19.mirror = true;
		setRotation(Shape19, 0.296706F, 0F, 0F);
		Shape20 = new ModelRenderer(this, 250, 0);
		Shape20.addBox(0F, 0F, 0F, 4, 2, 4);
		Shape20.setRotationPoint(-2.9F, 16F, -16F);
		Shape20.setTextureSize(512, 512);
		Shape20.mirror = true;
		setRotation(Shape20, 0.4537856F, 0F, 0F);
		Shape21 = new ModelRenderer(this, 67, 0);
		Shape21.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape21.setRotationPoint(0.1F, 18F, -16.2F);
		Shape21.setTextureSize(512, 512);
		Shape21.mirror = true;
		setRotation(Shape21, -0.122173F, 0F, 0F);
		Shape22 = new ModelRenderer(this, 0, 10);
		Shape22.addBox(0F, 0F, 0F, 1, 1, 6);
		Shape22.setRotationPoint(10F, 21.5F, -11F);
		Shape22.setTextureSize(512, 512);
		Shape22.mirror = true;
		setRotation(Shape22, 0.2443461F, 0.4886922F, 0F);
		Shape23 = new ModelRenderer(this, 0, 0);
		Shape23.addBox(0F, 0F, 0F, 1, 1, 6);
		Shape23.setRotationPoint(-13F, 21.5F, -11F);
		Shape23.setTextureSize(512, 512);
		Shape23.mirror = true;
		setRotation(Shape23, 0.2443461F, -0.4886922F, 0F);
		body = new ModelRenderer(this, 202, 0);
		body.addBox(-5F, -10F, -7F, 6, 20, 5);
		body.setRotationPoint(1F, 14F, 3F);
		body.setTextureSize(512, 512);
		body.mirror = true;
		setRotation(body, 1.570796F, 0F, 0F);
		Tale_part_3 = new ModelRenderer(this, 6, 132);
		Tale_part_3.addBox(0F, 0F, 0F, 1, 1, 19);
		Tale_part_3.setRotationPoint(-0.5F, 19F, 13F);
		Tale_part_3.setTextureSize(512, 512);
		Tale_part_3.mirror = true;
		setRotation(Tale_part_3, -0.2094395F, 0F, 0F);
		Tale_part_4 = new ModelRenderer(this, 6, 154);
		Tale_part_4.addBox(0F, 0F, 0F, 1, 1, 19);
		Tale_part_4.setRotationPoint(-2.5F, 19F, 13F);
		Tale_part_4.setTextureSize(512, 512);
		Tale_part_4.mirror = true;
		setRotation(Tale_part_4, -0.2094395F, 0F, 0F);
		Tale_part_7 = new ModelRenderer(this, 48, 88);
		Tale_part_7.addBox(0F, 0F, 0F, 1, 1, 18);
		Tale_part_7.setRotationPoint(-0.5F, 20.9F, 31.3F);
		Tale_part_7.setTextureSize(512, 512);
		Tale_part_7.mirror = true;
		setRotation(Tale_part_7, 0F, -0.0523599F, 0F);
		Tale_part_8 = new ModelRenderer(this, 48, 128);
		Tale_part_8.addBox(0F, 0F, 0F, 1, 1, 18);
		Tale_part_8.setRotationPoint(-2.5F, 22.9F, 31.3F);
		Tale_part_8.setTextureSize(512, 512);
		Tale_part_8.mirror = true;
		setRotation(Tale_part_8, 0F, 0.0523599F, 0F);
		Tale_part_1 = new ModelRenderer(this, 6, 66);
		Tale_part_1.addBox(0F, 0F, 0F, 1, 1, 19);
		Tale_part_1.setRotationPoint(-0.5F, 17F, 13F);
		Tale_part_1.setTextureSize(512, 512);
		Tale_part_1.mirror = true;
		setRotation(Tale_part_1, -0.2094395F, 0F, 0F);
		Tale_part_10 = new ModelRenderer(this, 48, 108);
		Tale_part_10.addBox(0F, 0F, 0F, 1, 1, 18);
		Tale_part_10.setRotationPoint(-1.5F, 21.9F, 31.3F);
		Tale_part_10.setTextureSize(512, 512);
		Tale_part_10.mirror = true;
		setRotation(Tale_part_10, 0F, 0F, 0F);
		Tale_part_5 = new ModelRenderer(this, 6, 110);
		Tale_part_5.addBox(0F, 0F, 0F, 1, 1, 19);
		Tale_part_5.setRotationPoint(-1.5F, 18F, 13F);
		Tale_part_5.setTextureSize(512, 512);
		Tale_part_5.mirror = true;
		setRotation(Tale_part_5, -0.2094395F, 0F, 0F);
		Tale_part_6 = new ModelRenderer(this, 48, 67);
		Tale_part_6.addBox(0F, 0F, 0F, 1, 1, 18);
		Tale_part_6.setRotationPoint(-2.5F, 20.9F, 31.3F);
		Tale_part_6.setTextureSize(512, 512);
		Tale_part_6.mirror = true;
		setRotation(Tale_part_6, 0F, 0.0523599F, 0F);
		Tale_part_9 = new ModelRenderer(this, 48, 148);
		Tale_part_9.addBox(0F, 0F, 0F, 1, 1, 18);
		Tale_part_9.setRotationPoint(-0.5F, 22.9F, 31.3F);
		Tale_part_9.setTextureSize(512, 512);
		Tale_part_9.mirror = true;
		setRotation(Tale_part_9, 0F, -0.0523599F, 0F);
		Tale_part_2 = new ModelRenderer(this, 6, 88);
		Tale_part_2.addBox(0F, 0F, 0F, 1, 1, 19);
		Tale_part_2.setRotationPoint(-2.5F, 17F, 13F);
		Tale_part_2.setTextureSize(512, 512);
		Tale_part_2.mirror = true;
		setRotation(Tale_part_2, -0.2094395F, 0F, 0F);
		Right_finger_part_4 = new ModelRenderer(this, 21, 36);
		Right_finger_part_4.addBox(0F, 0F, 0F, 1, 1, 3);
		Right_finger_part_4.setRotationPoint(-10F, 22.1F, -19.3F);
		Right_finger_part_4.setTextureSize(512, 512);
		Right_finger_part_4.mirror = true;
		setRotation(Right_finger_part_4, -0.3839724F, -0.8028515F, 0F);
		Left_finger_part_1 = new ModelRenderer(this, 31, 36);
		Left_finger_part_1.addBox(0F, 0F, 0F, 1, 1, 3);
		Left_finger_part_1.setRotationPoint(7F, 22F, -19F);
		Left_finger_part_1.setTextureSize(512, 512);
		Left_finger_part_1.mirror = true;
		setRotation(Left_finger_part_1, -0.3490659F, 0.8028515F, 0F);
		Shape24 = new ModelRenderer(this, 21, 36);
		Shape24.addBox(0F, 0F, 0F, 1, 1, 3);
		Shape24.setRotationPoint(-13.7F, 23F, -23.4F);
		Shape24.setTextureSize(512, 512);
		Shape24.mirror = true;
		setRotation(Shape24, 0.3141593F, 0.1396263F, -0.0349066F);
		Shape25 = new ModelRenderer(this, 21, 36);
		Shape25.addBox(0F, 0F, 1F, 1, 1, 3);
		Shape25.setRotationPoint(-11F, 23.3F, -24.5F);
		Shape25.setTextureSize(512, 512);
		Shape25.mirror = true;
		setRotation(Shape25, 0.3316126F, -0.1396263F, 0F);
		Shape26 = new ModelRenderer(this, 21, 36);
		Shape26.addBox(0F, 0F, 0F, 1, 1, 3);
		Shape26.setRotationPoint(-16.9F, 23F, -21F);
		Shape26.setTextureSize(512, 512);
		Shape26.mirror = true;
		setRotation(Shape26, 0.3316126F, 0.8028515F, 0F);
		Shape27 = new ModelRenderer(this, 21, 36);
		Shape27.addBox(0F, 0F, 0F, 1, 1, 3);
		Shape27.setRotationPoint(10.9F, 23F, -23.9F);
		Shape27.setTextureSize(512, 512);
		Shape27.mirror = true;
		setRotation(Shape27, 0.3316126F, -0.1570796F, 0F);
		Shape28 = new ModelRenderer(this, 21, 36);
		Shape28.addBox(0F, 0F, 0F, 1, 1, 3);
		Shape28.setRotationPoint(8.2F, 23F, -23.7F);
		Shape28.setTextureSize(512, 512);
		Shape28.mirror = true;
		setRotation(Shape28, 0.3839724F, 0.122173F, -0.0349066F);
		Shape29 = new ModelRenderer(this, 21, 36);
		Shape29.addBox(0F, 0F, 0F, 1, 1, 3);
		Shape29.setRotationPoint(14.3F, 23F, -21.8F);
		Shape29.setTextureSize(512, 512);
		Shape29.mirror = true;
		setRotation(Shape29, 0.3316126F, -0.8028515F, 0F);
		Shape30 = new ModelRenderer(this, 21, 36);
		Shape30.addBox(0F, 0F, 0F, 1, 1, 3);
		Shape30.setRotationPoint(5F, 23F, -21F);
		Shape30.setTextureSize(512, 512);
		Shape30.mirror = true;
		setRotation(Shape30, 0.3316126F, 0.8028515F, 0F);
		Shape31 = new ModelRenderer(this, 21, 36);
		Shape31.addBox(0F, 0F, 0F, 1, 1, 3);
		Shape31.setRotationPoint(-8F, 23F, -21.2F);
		Shape31.setTextureSize(512, 512);
		Shape31.mirror = true;
		setRotation(Shape31, 0.3316126F, -0.8203047F, 0F);
	}

	public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
	{
		super.render(par1Entity, par2, par3, par4, par5, par6, par7);
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);

		Left_finger_part_2.render(par7);
		Left_finger_part_3.render(par7);
		Left_finger_part_4.render(par7);
		Right_finger_part_1.render(par7);
		Right_finger_part_2.render(par7);
		Right_finger_part_3.render(par7);
		Right_hand_part_1.render(par7);
		Right_hand_part_2.render(par7);
		Right_hand_part_3.render(par7);
		Left_hand_part_1.render(par7);
		Left_hand_part_2.render(par7);
		Left_hand_part_3.render(par7);
		Bone_spike_part_1.render(par7);
		Bone_spike_part_2.render(par7);
		Bone_spike_part_3.render(par7);
		Bone_spike_part_4.render(par7);
		Shape1.render(par7);
		Shape2.render(par7);
		Shape3.render(par7);
		Shape4.render(par7);
		Shape5.render(par7);
		Shape6.render(par7);
		Shape7.render(par7);
		Shape8.render(par7);
		Shape9.render(par7);
		Shape10.render(par7);
		Shape11.render(par7);
		Shape12.render(par7);
		Shape13.render(par7);
		Shape14.render(par7);
		Shape15.render(par7);
		Shape16.render(par7);
		Shape17.render(par7);
		Shape18.render(par7);
		Shape19.render(par7);
		Shape20.render(par7);
		Shape21.render(par7);
		Shape22.render(par7);
		Shape23.render(par7);
		body.render(par7);
		Tale_part_3.render(par7);
		Tale_part_4.render(par7);
		Tale_part_7.render(par7);
		Tale_part_8.render(par7);
		Tale_part_1.render(par7);
		Tale_part_10.render(par7);
		Tale_part_5.render(par7);
		Tale_part_6.render(par7);
		Tale_part_9.render(par7);
		Tale_part_2.render(par7);
		Right_finger_part_4.render(par7);
		Left_finger_part_1.render(par7);
		Shape24.render(par7);
		Shape25.render(par7);
		Shape26.render(par7);
		Shape27.render(par7);
		Shape28.render(par7);
		Shape29.render(par7);
		Shape30.render(par7);
		Shape31.render(par7);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
	{
		super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
	}
}