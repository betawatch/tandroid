// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class s5a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r7a b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ s5a(r7a r7aVar, TLRPC.Message message, boolean z, byte b) {
        this.a = b;
        this.b = r7aVar;
        this.c = message;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        TLRPC.Message message = this.c;
        r7a r7aVar = this.b;
        switch (b) {
            case 0:
                r7aVar.c0(message.id);
                r7aVar.h0(message.id, z);
                break;
            case 1:
                r7aVar.c0(message.id);
                r7aVar.h0(message.id, z);
                break;
            default:
                r7aVar.f0(message, z);
                break;
        }
    }
}
