package com.jtrent238.foodmod;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class GuiFridge extends GuiContainer
{
	private static final ResourceLocation gui = new ResourceLocation("cfm:textures/gui/fridge.png");

	public GuiFridge(IInventory par1IInventory, IInventory par2IInventory)
	{
		super(new ContainerFridge(par1IInventory, par2IInventory));
		this.xSize = 176;
		this.ySize = 167;
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		this.fontRendererObj.drawString("Fridge", (this.xSize / 2) - 44, 6, 4210752);
		this.fontRendererObj.drawString("Inventory", 8, this.ySize - 94, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(gui);
		int l = (width - xSize) / 2;
		int i1 = (height - ySize) / 2;
		this.drawTexturedModalRect(l, i1, 0, 0, xSize, ySize);
	}
}
