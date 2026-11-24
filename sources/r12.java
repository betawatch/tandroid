// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class r12 implements n32 {
    public final /* synthetic */ i22 a;

    public r12(i22 i22Var) {
        this.a = i22Var;
    }

    @Override // n32
    public final void a(ArrayList arrayList, String str, boolean z, int i, long j, boolean z2) {
        ((yv1) this.a.Z1).Ab(arrayList, str, z, i, j, z2);
    }

    @Override // n32
    public final void b(TLRPC.TL_userContact_old2 tL_userContact_old2, boolean z, int i, long j) {
        yv1 yv1Var = (yv1) this.a.Z1;
        if (yv1Var.s5()) {
            y5a g = y5a.g(tL_userContact_old2, yv1Var.l6, yv1Var.F5, yv1Var.m4, null, null, z, i, 0);
            g.K = yv1Var.X6();
            g.O = 0L;
            g.L = false;
            g.Q = j;
            g.R = yv1Var.k7();
            g.T = yv1Var.y5;
            yv1Var.getSendMessagesHelper().q0(g);
            yv1Var.E4();
        }
    }
}
