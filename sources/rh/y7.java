package rh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.cd;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.xz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.mk;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y7 extends ha implements us {
    public final FrameLayout P1;
    public p51 Q1;
    public boolean R1;

    public y7(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, null, false, false, p6Var);
        tk0 tk0Var = this.k1;
        int i10 = this.t0;
        tk0Var.setPadding(i10, 0, i10, 0);
        this.k1.setOnItemClickListener(new ag.y0(this, 15));
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(gr.h);
        jVar.n(350L);
        this.k1.setItemAnimator(jVar);
        int i11 = org.telegram.ui.ActionBar.t6.d6;
        w0(i11);
        Q(i11);
        this.l1.setTitle(cd.L0(2131745169, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.P1 = frameLayout;
        p80 p80Var = new p80(context, p6Var);
        frameLayout.setPadding(0, org.telegram.messenger.i0.L(11.0f), 0, org.telegram.messenger.i0.L(11.0f));
        p80Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.B6, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.Uc, p6Var);
        p80Var.setText(org.telegram.messenger.i0.T2(cd.L0(2131744985, null), new ph.x1(this, 27)));
        p80Var.setGravity(17);
        p80Var.setMaxWidth(vh.p2.a(p80Var.getText(), p80Var.getPaint()));
        frameLayout.addView(p80Var, w7.b6.e(-2, -1, 17));
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.h5, frameLayout, p6Var);
        this.b.addView(new xz(getContext()), w7.b6.c(-1.0f, -1));
        p51 p51Var = this.Q1;
        if (p51Var != null) {
            p51Var.O(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void L() {
        super.L();
        zs.f(this.a).n(this, zs.v3);
        zs.f(this.a).n(this, zs.y3);
    }

    @Override // org.telegram.ui.Components.ha
    public final sk0 L0(tk0 tk0Var) {
        p51 p51Var = new p51(this.k1, getContext(), this.a, 0, true, new qh.d(this, 11), this.I0);
        this.Q1 = p51Var;
        p51Var.r = false;
        return p51Var;
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        return cd.L0(2131745169, null);
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        p51 p51Var;
        if ((i10 == zs.v3 || i10 == zs.y3) && (p51Var = this.Q1) != null) {
            p51Var.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void show() {
        mk mkVar;
        long j10 = e6.y(this.a, false).p().amount;
        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
        if (Q instanceof un) {
            un unVar = (un) Q;
            if (unVar.J9() && (mkVar = unVar.Z) != null) {
                mkVar.L();
            }
        }
        super.show();
        zs.f(this.a).c(this, zs.v3);
        zs.f(this.a).c(this, zs.y3);
    }
}
