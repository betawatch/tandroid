// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class yz3 extends zo {
    public final /* synthetic */ o24 c;

    public yz3(o24 o24Var) {
        this.c = o24Var;
    }

    @Override // zo
    public final int i(int i) {
        o24 o24Var = this.c;
        j24 j24Var = o24Var.A0;
        j79 adapter = o24Var.E0.getAdapter();
        g24 g24Var = o24Var.z0;
        if (adapter != g24Var) {
            if (i == j24Var.y || !(j24Var.r.get(i) == null || (j24Var.r.get(i) instanceof TLRPC.Document))) {
                return g24Var.d;
            }
            return 1;
        }
        if (i == 0) {
            return g24Var.d;
        }
        if (i == g24Var.s || !(g24Var.h.get(i) == null || (g24Var.h.get(i) instanceof TLRPC.Document))) {
            return g24Var.d;
        }
        return 1;
    }
}
