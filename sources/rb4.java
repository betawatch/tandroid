// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class rb4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xb4 b;
    public final /* synthetic */ TLRPC.Document c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ rb4(xb4 xb4Var, TLRPC.Document document, boolean z, byte b) {
        this.a = b;
        this.b = xb4Var;
        this.c = document;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        TLRPC.Document document = this.c;
        xb4 xb4Var = this.b;
        switch (b) {
            case 0:
                xb4Var.d0(document, z);
                break;
            default:
                xb4Var.a0(document, z);
                break;
        }
    }
}
