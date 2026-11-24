// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class u3a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a6a b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ u3a(a6a a6aVar, TLRPC.Message message, boolean z, byte b) {
        this.a = b;
        this.b = a6aVar;
        this.c = message;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        TLRPC.Message message = this.c;
        a6a a6aVar = this.b;
        switch (b) {
            case 0:
                a6aVar.c0(message.id);
                a6aVar.h0(message.id, z);
                break;
            case 1:
                a6aVar.c0(message.id);
                a6aVar.h0(message.id, z);
                break;
            default:
                a6aVar.f0(message, z);
                break;
        }
    }
}
