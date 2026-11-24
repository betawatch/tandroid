// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ze7 {
    public final long a;
    public final TLRPC.TL_messageReactions b;
    public final TLRPC.TL_messageReactions c;

    public ze7(long j, TLRPC.Message message, TLRPC.Message message2) {
        this.a = k47.Q1(j, message2);
        this.b = message.reactions;
        this.c = message2.reactions;
    }
}
