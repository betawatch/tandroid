// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
