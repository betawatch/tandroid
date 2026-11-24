// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class x94 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ba4 b;
    public final /* synthetic */ TLRPC.Document c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ x94(ba4 ba4Var, TLRPC.Document document, boolean z, byte b) {
        this.a = b;
        this.b = ba4Var;
        this.c = document;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        TLRPC.Document document = this.c;
        ba4 ba4Var = this.b;
        switch (b) {
            case 0:
                ba4Var.d0(document, z);
                break;
            default:
                ba4Var.a0(document, z);
                break;
        }
    }
}
