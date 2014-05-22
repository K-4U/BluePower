package net.quetzi.bluepower.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.quetzi.bluepower.references.Refs;

public class BlockNikoliteBlock extends Block {
    public BlockNikoliteBlock() {
        super(Material.rock);
        this.textureName = Refs.MODID + ":" + Refs.NIKOLITEBLOCK_NAME;
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setStepSound(soundTypeStone);
        this.setHardness(1.9F);
        this.setResistance(10.0F);
    }

    public void registerBlockIcon(IIconRegister iconRegister) {
        iconRegister.registerIcon(Refs.MODID + ":" + Refs.NIKOLITEBLOCK_NAME);
    }
}