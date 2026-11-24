// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class os1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k27 b;

    public /* synthetic */ os1(z3a z3aVar, k27 k27Var) {
        this.a = (byte) 2;
        this.b = k27Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Message message;
        byte b = this.a;
        k27 k27Var = this.b;
        switch (b) {
            case 0:
                k27Var.q = false;
                break;
            case 1:
                if (uyb.k(k27Var)) {
                    uyb.z(k27Var, false, null);
                    break;
                }
                break;
            case 2:
                if (k27Var != null && (message = k27Var.k) != null) {
                    message.reqId = 0;
                    break;
                }
                break;
            case 3:
                n40 n40Var = (n40) bkb.d5.remove(k27Var);
                if (n40Var != null) {
                    n40Var.i = null;
                    break;
                }
                break;
            default:
                kk7.f(k27Var.K1).k(kk7.z1, k27Var);
                break;
        }
    }

    public /* synthetic */ os1(k27 k27Var, byte b) {
        this.a = b;
        this.b = k27Var;
    }
}
