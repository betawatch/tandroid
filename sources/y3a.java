// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class y3a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a6a b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ int d;

    public /* synthetic */ y3a(a6a a6aVar, TLRPC.Message message, int i, byte b) {
        this.a = b;
        this.b = a6aVar;
        this.c = message;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.d;
        TLRPC.Message message = this.c;
        a6a a6aVar = this.b;
        switch (b) {
            case 0:
                message.send_state = 2;
                a6aVar.getNotificationCenter().k(23, Integer.valueOf(message.id));
                a6aVar.c0(message.id);
                a6aVar.h0(message.id, i != 0);
                break;
            default:
                message.send_state = 0;
                a6aVar.getNotificationCenter().k(20, Integer.valueOf(i));
                break;
        }
    }
}
