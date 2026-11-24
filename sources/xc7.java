// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class xc7 {
    public final long a;
    public final TLRPC.TL_messageReactions b;
    public final TLRPC.TL_messageReactions c;

    public xc7(long j, TLRPC.Message message, TLRPC.Message message2) {
        this.a = k27.Q1(j, message2);
        this.b = message.reactions;
        this.c = message2.reactions;
    }
}
