// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
