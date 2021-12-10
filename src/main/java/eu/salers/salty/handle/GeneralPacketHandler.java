package eu.salers.salty.handle;


import eu.salers.salty.SaltyAPI;
import eu.salers.salty.manager.EventsManager;
import eu.salers.salty.versions.ServerVersion;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.ChannelPromise;
import net.minecraft.util.io.netty.channel.ChannelHandler;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

import java.lang.reflect.Field;
import java.util.concurrent.ExecutorService;

public class GeneralPacketHandler {


    public static void inject(final Player player) {

        SaltyAPI.get().getProfilesManager().add(player);

        final ServerVersion serverVersion = SaltyAPI.get().getServerVersion();

        final ExecutorService handlerService = SaltyAPI.get().getHandlerService();
        final EventsManager eventManager = SaltyAPI.get().getEventManager();

        if (serverVersion.isMC17()) {

            final ChannelDuplexHandler channel = new ChannelDuplexHandler() {
                @Override
                public void channelRead(ChannelHandlerContext channelHandlerContext, Object packet) throws Exception {

                    handlerService.execute(() -> eventManager.handleReceive(packet, player));


                    super.channelRead(channelHandlerContext, packet);
                }

                @Override
                public void write(ChannelHandlerContext channelHandlerContext, Object packet, ChannelPromise channelPromise) throws Exception {

                    handlerService.execute(() -> eventManager.handleSend(packet, player));

                    super.write(channelHandlerContext, packet, channelPromise);
                }
            };

            //CREDITS HAWK ANTICHEAT BY ISLANDCOUT

            Field channelField = null;
            try {
                channelField = ((org.bukkit.craftbukkit.v1_7_R4.entity.CraftPlayer)
                        player).getHandle().playerConnection.networkManager.getClass().getDeclaredField("m");
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            channelField.setAccessible(true);
            net.minecraft.util.io.netty.channel.Channel c = null;
            try {
                c = (net.minecraft.util.io.netty.channel.Channel) channelField
                        .get(((org.bukkit.craftbukkit.v1_7_R4.entity.CraftPlayer) player).getHandle().playerConnection.networkManager);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            channelField.setAccessible(false);
            net.minecraft.util.io.netty.channel.ChannelPipeline pipeline = c.pipeline();
            if (pipeline == null)
                return;
            String handlerName = player.getName();
            c.eventLoop().submit(() -> {
                if (pipeline.get(handlerName) != null)
                    pipeline.remove(handlerName);
                pipeline.addBefore("packet_handler", handlerName, (ChannelHandler) channel);
                return null;

            });


            //TODO

        } else if (serverVersion.isMC18()) {

            final ChannelDuplexHandler channel = new ChannelDuplexHandler() {
                @Override
                public void channelRead(ChannelHandlerContext channelHandlerContext, Object packet) throws Exception {

                    handlerService.execute(() -> eventManager.handleReceive(packet, player));




                    super.channelRead(channelHandlerContext, packet);
                }

                @Override
                public void write(ChannelHandlerContext channelHandlerContext, Object packet, ChannelPromise channelPromise) throws Exception {

                    handlerService.execute(() -> eventManager.handleSend(packet, player));

                    super.write(channelHandlerContext, packet, channelPromise);
                }
            };

            ChannelPipeline channelPipeline = ((CraftPlayer) player).getHandle().playerConnection.networkManager.channel.pipeline();
            channelPipeline.addBefore("packet_handler", player.getName(), channel);


        } else if (serverVersion.isMC19()) {
            final ChannelDuplexHandler channel = new ChannelDuplexHandler() {
                @Override
                public void channelRead(ChannelHandlerContext channelHandlerContext, Object packet) throws Exception {

                    handlerService.execute(() -> eventManager.handleReceive(packet, player));

                    super.channelRead(channelHandlerContext, packet);
                }

                @Override
                public void write(ChannelHandlerContext channelHandlerContext, Object packet, ChannelPromise channelPromise) throws Exception {

                    handlerService.execute(() -> eventManager.handleSend(packet, player));

                    super.write(channelHandlerContext, packet, channelPromise);
                }
            };

            ChannelPipeline channelPipeline = ((org.bukkit.craftbukkit.v1_9_R2.entity.CraftPlayer) player).getHandle().playerConnection.networkManager.channel.pipeline();
            channelPipeline.addBefore("packet_handler", player.getName(), channel);

        } else if (serverVersion.isMC110()) {
            final ChannelDuplexHandler channel = new ChannelDuplexHandler() {
                @Override
                public void channelRead(ChannelHandlerContext channelHandlerContext, Object packet) throws Exception {

                    handlerService.execute(() -> eventManager.handleReceive(packet, player));


                    super.channelRead(channelHandlerContext, packet);
                }

                @Override
                public void write(ChannelHandlerContext channelHandlerContext, Object packet, ChannelPromise channelPromise) throws Exception {

                    handlerService.execute(() -> eventManager.handleSend(packet, player));

                    super.write(channelHandlerContext, packet, channelPromise);
                }
            };

            ChannelPipeline channelPipeline = ((org.bukkit.craftbukkit.v1_10_R1.entity.CraftPlayer) player).getHandle().playerConnection.networkManager.channel.pipeline();
            channelPipeline.addBefore("packet_handler", player.getName(), channel);

        } else if (serverVersion.isMC111()) {
            final ChannelDuplexHandler channel = new ChannelDuplexHandler() {
                @Override
                public void channelRead(ChannelHandlerContext channelHandlerContext, Object packet) throws Exception {

                    handlerService.execute(() -> eventManager.handleReceive(packet, player));


                    super.channelRead(channelHandlerContext, packet);
                }

                @Override
                public void write(ChannelHandlerContext channelHandlerContext, Object packet, ChannelPromise channelPromise) throws Exception {

                    handlerService.execute(() -> eventManager.handleSend(packet, player));

                    super.write(channelHandlerContext, packet, channelPromise);
                }
            };

            ChannelPipeline channelPipeline = ((org.bukkit.craftbukkit.v1_11_R1.entity.CraftPlayer) player).getHandle().playerConnection.networkManager.channel.pipeline();
            channelPipeline.addBefore("packet_handler", player.getName(), channel);

        } else if (serverVersion.isMC112()) {
            final ChannelDuplexHandler channel = new ChannelDuplexHandler() {
                @Override
                public void channelRead(ChannelHandlerContext channelHandlerContext, Object packet) throws Exception {

                    handlerService.execute(() -> eventManager.handleReceive(packet, player));


                    super.channelRead(channelHandlerContext, packet);
                }

                @Override
                public void write(ChannelHandlerContext channelHandlerContext, Object packet, ChannelPromise channelPromise) throws Exception {

                    handlerService.execute(() -> eventManager.handleSend(packet, player));

                    super.write(channelHandlerContext, packet, channelPromise);
                }
            };

            ChannelPipeline channelPipeline = ((org.bukkit.craftbukkit.v1_12_R1.entity.CraftPlayer) player).getHandle().playerConnection.networkManager.channel.pipeline();
            channelPipeline.addBefore("packet_handler", player.getName(), channel);

        } else if (serverVersion.isMC113()) {
            final ChannelDuplexHandler channel = new ChannelDuplexHandler() {
                @Override
                public void channelRead(ChannelHandlerContext channelHandlerContext, Object packet) throws Exception {

                    handlerService.execute(() -> eventManager.handleReceive(packet, player));


                    super.channelRead(channelHandlerContext, packet);
                }

                @Override
                public void write(ChannelHandlerContext channelHandlerContext, Object packet, ChannelPromise channelPromise) throws Exception {

                    handlerService.execute(() -> eventManager.handleSend(packet, player));

                    super.write(channelHandlerContext, packet, channelPromise);
                }
            };

            ChannelPipeline channelPipeline = ((org.bukkit.craftbukkit.v1_13_R2.entity.CraftPlayer) player).getHandle().playerConnection.networkManager.channel.pipeline();
            channelPipeline.addBefore("packet_handler", player.getName(), channel);

        } else if (serverVersion.isMC114()) {
            final ChannelDuplexHandler channel = new ChannelDuplexHandler() {
                @Override
                public void channelRead(ChannelHandlerContext channelHandlerContext, Object packet) throws Exception {

                    handlerService.execute(() -> eventManager.handleReceive(packet, player));


                    super.channelRead(channelHandlerContext, packet);
                }

                @Override
                public void write(ChannelHandlerContext channelHandlerContext, Object packet, ChannelPromise channelPromise) throws Exception {

                    handlerService.execute(() -> eventManager.handleSend(packet, player));

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

                    handlerService.execute(() -> eventManager.handleReceive(packet, player));


                    super.channelRead(channelHandlerContext, packet);
                }

                @Override
                public void write(ChannelHandlerContext channelHandlerContext, Object packet, ChannelPromise channelPromise) throws Exception {

                    handlerService.execute(() -> eventManager.handleSend(packet, player));

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
