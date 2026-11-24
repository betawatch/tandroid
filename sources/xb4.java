// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class xb4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bc4 b;
    public final /* synthetic */ TLRPC.Document c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ xb4(bc4 bc4Var, TLRPC.Document document, boolean z, byte b) {
        this.a = b;
        this.b = bc4Var;
        this.c = document;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        TLRPC.Document document = this.c;
        bc4 bc4Var = this.b;
        switch (b) {
            case 0:
                bc4Var.d0(document, z);
                break;
            default:
                bc4Var.a0(document, z);
                break;
        }
    }
}
