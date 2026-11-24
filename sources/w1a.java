// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class w1a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z3a b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ int d;

    public /* synthetic */ w1a(z3a z3aVar, TLRPC.Message message, int i, byte b) {
        this.a = b;
        this.b = z3aVar;
        this.c = message;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.d;
        TLRPC.Message message = this.c;
        z3a z3aVar = this.b;
        switch (b) {
            case 0:
                message.send_state = 2;
                z3aVar.getNotificationCenter().k(23, Integer.valueOf(message.id));
                z3aVar.c0(message.id);
                z3aVar.h0(message.id, i != 0);
                break;
            default:
                message.send_state = 0;
                z3aVar.getNotificationCenter().k(20, Integer.valueOf(i));
                break;
        }
    }
}
