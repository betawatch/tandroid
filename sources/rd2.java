// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class rd2 implements imb {
    public final /* synthetic */ xd2 a;

    public rd2(xd2 xd2Var) {
        this.a = xd2Var;
    }

    @Override // imb
    public final void E(boolean z) {
        xd2 xd2Var = this.a;
        mu1 mu1Var = xd2Var.u1;
        xd2Var.G1 = !xd2Var.G1;
        if (xd2Var.F1 != null) {
            xd2Var.I1 = true;
            mu1Var.w7 = true;
            TLRPC.WallPaper wallPaper = xd2Var.J0() ? null : xd2Var.r1.g;
            jy3 jy3Var = xd2Var.F1.a;
            boolean z2 = jy3Var.a;
            ku1 ku1Var = xd2Var.r1;
            if (z2) {
                ku1Var.q(null, wallPaper, z, Boolean.valueOf(xd2Var.G1), false);
            } else {
                ku1Var.q(jy3Var, wallPaper, z, Boolean.valueOf(xd2Var.G1), false);
            }
            mu1Var.w7 = false;
        }
    }

    @Override // imb
    public final boolean a() {
        return this.a.G1;
    }

    @Override // imb
    public final boolean w() {
        return true;
    }
}
