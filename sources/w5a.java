// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class w5a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r7a b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ int d;

    public /* synthetic */ w5a(r7a r7aVar, TLRPC.Message message, int i, byte b) {
        this.a = b;
        this.b = r7aVar;
        this.c = message;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.d;
        TLRPC.Message message = this.c;
        r7a r7aVar = this.b;
        switch (b) {
            case 0:
                message.send_state = 2;
                r7aVar.getNotificationCenter().k(23, Integer.valueOf(message.id));
                r7aVar.c0(message.id);
                r7aVar.h0(message.id, i != 0);
                break;
            default:
                message.send_state = 0;
                r7aVar.getNotificationCenter().k(20, Integer.valueOf(i));
                break;
        }
    }
}
