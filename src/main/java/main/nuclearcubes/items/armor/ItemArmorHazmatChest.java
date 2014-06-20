package main.nuclearcubes.items.armor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import main.nuclearcubes.ModInformation;
import main.nuclearcubes.NuclearCubes;
import main.nuclearcubes.client.armor.ModelHazmatChest;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;


public class ItemArmorHazmatChest extends ItemArmor {

	public ItemArmorHazmatChest(ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
		this.setCreativeTab(NuclearCubes.tabNuclearCubes);
		this.setUnlocalizedName(ModInformation.ID + ".armor.hazmat.chest");
		this.setTextureName(ModInformation.ID + ":armor/hazmatChest");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase player, ItemStack stack, int slot) {
		ModelBiped model = new ModelHazmatChest(0.5F);

		model.isSneak = player.isSneaking();
		model.isRiding = player.isRiding();
		model.isChild = player.isChild();

		return model;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public String getArmorTexture(ItemStack Stack, Entity entity, int Slot, String type) {
		return ModInformation.ID + ":textures/models/armor/hazmatChest.png";
	}
}
