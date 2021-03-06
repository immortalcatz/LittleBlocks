package net.minecraft.littleblocks.network.EurysNetworkCore;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.World;

public interface IPacketHandling {
	public void handleTileEntityPacket(PacketTileEntity packet,
			EntityPlayer entityplayer, World world);

	public void handleGuiPacket(PacketUpdate packet, EntityPlayer entityplayer,
			World world);

}