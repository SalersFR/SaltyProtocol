package eu.salers.salty.handle;


import eu.salers.salty.SaltyAPI;
import eu.salers.salty.versions.ServerVersion;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.ChannelPromise;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class GeneralPacketHandler {


    public static void inject(final Player player) {


        final ServerVersion serverVersion = SaltyAPI.get().getServerVersion();

        if (serverVersion.isMC17()) {

            //TODO

        } else if (serverVersion.isMC18()) {

            final ChannelDuplexHandler channel = new ChannelDuplexHandler() {
                @Override
                public void channelRead(ChannelHandlerContext channelHandlerContext, Object packet) throws Exception {


                    super.channelRead(channelHandlerContext, packet);
                }

                @Override
                public void write(ChannelHandlerContext channelHandlerContext, Object packet, ChannelPromise channelPromise) throws Exception {


                    super.write(channelHandlerContext, packet, channelPromise);
                }
            };

            ChannelPipeline channelPipeline = ((CraftPlayer) player).getHandle().playerConnection.networkManager.channel.pipeline();
            channelPipeline.addBefore("packet_handler", player.getName(), channel);


        } else if (serverVersion.isMC19()) {
            final ChannelDuplexHandler channel = new ChannelDuplexHandler() {
                @Override
                public void channelRead(ChannelHandlerContext channelHandlerContext, Object packet) throws Exception {


                    super.channelRead(channelHandlerContext, packet);
                }

                @Override
                public void write(ChannelHandlerContext channelHandlerContext, Object packet, ChannelPromise channelPromise) throws Exception {


                    super.write(channelHandlerContext, packet, channelPromise);
                }
            };

            ChannelPipeline channelPipeline = ((org.bukkit.craftbukkit.v1_9_R2.entity.CraftPlayer) player).getHandle().playerConnection.networkManager.channel.pipeline();
            channelPipeline.addBefore("packet_handler", player.getName(), channel);

        } else if (serverVersion.isMC110()) {
            final ChannelDuplexHandler channel = new ChannelDuplexHandler() {
                @Override
                public void channelRead(ChannelHandlerContext channelHandlerContext, Object packet) throws Exception {


                    super.channelRead(channelHandlerContext, packet);
                }

                @Override
                public void write(ChannelHandlerContext channelHandlerContext, Object packet, ChannelPromise channelPromise) throws Exception {


                    super.write(channelHandlerContext, packet, channelPromise);
                }
            };

            ChannelPipeline channelPipeline = ((org.bukkit.craftbukkit.v1_10_R1.entity.CraftPlayer) player).getHandle().playerConnection.networkManager.channel.pipeline();
            channelPipeline.addBefore("packet_handler", player.getName(), channel);

        } else if (serverVersion.isMC111()) {
            final ChannelDuplexHandler channel = new ChannelDuplexHandler() {
                @Override
                public void channelRead(ChannelHandlerContext channelHandlerContext, Object packet) throws Exception {


                    super.channelRead(channelHandlerContext, packet);
                }

                @Override
                public void write(ChannelHandlerContext channelHandlerContext, Object packet, ChannelPromise channelPromise) throws Exception {


                    super.write(channelHandlerContext, packet, channelPromise);
                }
            };

            ChannelPipeline channelPipeline = ((org.bukkit.craftbukkit.v1_11_R1.entity.CraftPlayer) player).getHandle().playerConnection.networkManager.channel.pipeline();
            channelPipeline.addBefore("packet_handler", player.getName(), channel);

        } else if (serverVersion.isMC112()) {
            final ChannelDuplexHandler channel = new ChannelDuplexHandler() {
                @Override
                public void channelRead(ChannelHandlerContext channelHandlerContext, Object packet) throws Exception {


                    super.channelRead(channelHandlerContext, packet);
                }

                @Override
                public void write(ChannelHandlerContext channelHandlerContext, Object packet, ChannelPromise channelPromise) throws Exception {


                    super.write(channelHandlerContext, packet, channelPromise);
                }
            };

            ChannelPipeline channelPipeline = ((org.bukkit.craftbukkit.v1_12_R1.entity.CraftPlayer) player).getHandle().playerConnection.networkManager.channel.pipeline();
            channelPipeline.addBefore("packet_handler", player.getName(), channel);

        } else if (serverVersion.isMC113()) {
            final ChannelDuplexHandler channel = new ChannelDuplexHandler() {
                @Override
                public void channelRead(ChannelHandlerContext channelHandlerContext, Object packet) throws Exception {


                    super.channelRead(channelHandlerContext, packet);
                }

                @Override
                public void write(ChannelHandlerContext channelHandlerContext, Object packet, ChannelPromise channelPromise) throws Exception {


                    super.write(channelHandlerContext, packet, channelPromise);
                }
            };

            ChannelPipeline channelPipeline = ((org.bukkit.craftbukkit.v1_13_R2.entity.CraftPlayer) player).getHandle().playerConnection.networkManager.channel.pipeline();
            channelPipeline.addBefore("packet_handler", player.getName(), channel);

        } else if (serverVersion.isMC114()) {
            final ChannelDuplexHandler channel = new ChannelDuplexHandler() {
                @Override
                public void channelRead(ChannelHandlerContext channelHandlerContext, Object packet) throws Exception {


                    super.channelRead(channelHandlerContext, packet);
                }

                @Override
                public void write(ChannelHandlerContext channelHandlerContext, Object packet, ChannelPromise channelPromise) throws Exception {


                    super.write(channelHandlerContext, packet, channelPromise);
                }
            };

            ChannelPipeline channelPipeline = ((org.bukkit.craftbukkit.v1_14_R1.entity.CraftPlayer) player).getHandle().playerConnection.networkManager.channel.pipeline();
            channelPipeline.addBefore("packet_handler", player.getName(), channel);

        } else if (serverVersion.isMC115()) {

        } else if (serverVersion.isMC116()) {
            final ChannelDuplexHandler channel = new ChannelDuplexHandler() {
                @Override
                public void channelRead(ChannelHandlerContext channelHandlerContext, Object packet) throws Exception {


                    super.channelRead(channelHandlerContext, packet);
                }

                @Override
                public void write(ChannelHandlerContext channelHandlerContext, Object packet, ChannelPromise channelPromise) throws Exception {


                    super.write(channelHandlerContext, packet, channelPromise);
                }
            };

            ChannelPipeline channelPipeline = ((org.bukkit.craftbukkit.v1_16_R3.entity.CraftPlayer) player).getHandle().playerConnection.networkManager.channel.pipeline();
            channelPipeline.addBefore("packet_handler", player.getName(), channel);

        } else if (serverVersion.isMC117()) {

        } else if (serverVersion.isMC118()) {

        }


    }


}
