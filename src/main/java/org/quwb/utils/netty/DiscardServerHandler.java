package org.quwb.utils.netty;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * @author quwb
 * @create 2018-05-07 17:21
 * @desc
 **/
public class DiscardServerHandler extends ChannelInboundHandlerAdapter {
    /**
     * 该方法用于接收从客户端接收的信息
     */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        super.channelRead(ctx, msg);
    }
}
