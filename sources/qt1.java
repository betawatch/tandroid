// default package

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class qt1 extends taa {
    public final /* synthetic */ k27 U2;
    public final /* synthetic */ wt1 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt1(wt1 wt1Var, Activity activity, mu1 mu1Var, ArrayList arrayList, boolean z, boolean z2, wjb wjbVar, boolean z3, k27 k27Var) {
        super(activity, mu1Var, arrayList, null, null, z, null, null, false, false, z2, null, wjbVar);
        this.V2 = wt1Var;
        this.U2 = k27Var;
        this.V1 = z3;
    }

    @Override // taa, fx0
    public final void I() {
        int i;
        mu1 mu1Var = this.V2.a;
        Activity parentActivity = mu1Var.getParentActivity();
        i = ((d) mu1Var).classGuid;
        gl.V2(parentActivity, i);
        super.I();
        if (mu1Var.a0.getVisibility() == 0) {
            mu1Var.fragmentView.requestLayout();
        }
    }

    @Override // taa
    public final void L0(vf6 vf6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        int i2;
        mu1 mu1Var = this.V2.a;
        int i3 = mu1.nd;
        mu1Var.b6();
        if (mu1Var.N3 == null || !z) {
            return;
        }
        if (vf6Var.m() != 1) {
            mu1Var.N3.k(0L, 53, Integer.valueOf(i), Integer.valueOf(vf6Var.m()), null, null);
            return;
        }
        if (((TLRPC.Dialog) vf6Var.n(0)).id == mu1Var.getUserConfig().e()) {
            i2 = i;
            if (u21.b0(mu1Var).h0(i2, ((TLRPC.Dialog) vf6Var.n(0)).id)) {
                return;
            }
        } else {
            i2 = i;
        }
        mu1Var.N3.k(((TLRPC.Dialog) vf6Var.n(0)).id, 53, Integer.valueOf(i2), tL_forumTopic, null, null);
    }

    @Override // taa
    public final void M0(View view) {
        mu1 mu1Var = this.V2.a;
        m7b b = view instanceof waa ? o7b.b((waa) view) : null;
        ArrayList arrayList = new ArrayList();
        k27 k27Var = this.U2;
        f27 f27Var = k27Var.c1() != 0 ? (f27) mu1Var.P6.f(k27Var.c1()) : null;
        if (f27Var != null) {
            arrayList.addAll(f27Var.d);
        } else {
            arrayList.add(k27Var);
        }
        t7b C = t7b.C(mu1Var.getParentActivity(), this.a);
        C.S = new lt1(this, C, view, (byte) 0);
        C.T(b, f4b.x(arrayList));
    }
}
