package ph;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.ga;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zz;
import org.telegram.ui.rv0;
import rh.v5;
import w7.b6;
import w7.b9;
import w7.e6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t3 extends ha implements us {
    public final int P1;
    public final v5 Q1;
    public final HashSet R1;
    public final yy S1;
    public final FrameLayout T1;
    public final vh.d U1;
    public z60 V1;
    public final hi.c W1;
    public final hi.c X1;
    public p51 Y1;
    public i0.c Z1;
    public boolean a2;
    public int b2;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t3(org.telegram.ui.ActionBar.k2 k2Var, long j10, int i10, jg.o2 o2Var) {
        super(r3, k2Var, new ga(r4));
        Activity parentActivity = k2Var.getParentActivity();
        ga gaVar = new ga();
        gaVar.f = 2;
        gaVar.b = 3;
        gaVar.g = k2Var.getResourceProvider();
        this.R1 = new HashSet();
        this.Z1 = i0.c.e;
        Context context = getContext();
        hi.c cVar = new hi.c();
        this.W1 = cVar;
        cVar.a(t6.w0(t6.d6, this.I0));
        tg.b bVar = new tg.b(cVar);
        hi.c cVar2 = new hi.c();
        this.X1 = cVar2;
        int i11 = t6.a7;
        cVar2.a(t6.w0(i11, this.I0));
        tg.b bVar2 = new tg.b(cVar2);
        this.C1 = false;
        this.B1 = org.telegram.messenger.i0.L(12.0f);
        v0(t6.w0(i11, this.I0));
        Y0();
        this.P1 = i10;
        this.Q1 = new v5(this.a, j10, true);
        this.l1.setActionBarMenuOnItemClick(new s3(this, this.l1.p().a(1, R.drawable.ic_ab_other), j10));
        vh.d dVar = new vh.d(getContext(), this.I0, true);
        this.U1 = dVar;
        dVar.i(cd.L0(2131750259, null), false, true);
        dVar.setEnabled(false);
        dVar.setStateListAnimator(null);
        dVar.f();
        FrameLayout frameLayout = new FrameLayout(context);
        this.T1 = frameLayout;
        int i12 = this.t0;
        frameLayout.setPadding(i12, 0, i12, 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        frameLayout2.addView(dVar, b6.c(-1.0f, -1));
        frameLayout2.setOnClickListener(new rv0(22, this, o2Var));
        vg.f c10 = bVar.c(frameLayout2, null, false);
        c10.o(b9.j(this.I0));
        c10.q(org.telegram.messenger.i0.L(28.0f));
        c10.p(org.telegram.messenger.i0.L(5.0f));
        frameLayout2.setBackground(c10);
        e6.b(frameLayout2, 0.02f, 1.5f);
        frameLayout.addView(frameLayout2, b6.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        tg.c cVar3 = new tg.c(bVar2.c(frameLayout, null, false));
        cVar3.b(org.telegram.messenger.i0.L(40.0f), true);
        cVar3.G = zs.x3;
        frameLayout.setBackground(cVar3);
        this.b.addView(frameLayout, b6.e(-1, -2, 80));
        getContext();
        yy yyVar = new yy(3, false);
        this.S1 = yyVar;
        int i13 = 13;
        yyVar.O = new jg.h1(this, i13);
        this.k1.setPadding(org.telegram.messenger.i0.L(9.0f) + this.t0, 0, org.telegram.messenger.i0.L(9.0f) + this.t0, 0);
        this.k1.setClipToPadding(false);
        this.k1.setSelectorType(9);
        this.k1.setSelectorDrawableColor(0);
        this.k1.setLayoutManager(yyVar);
        this.k1.setOnItemClickListener(new ag.y0(this, 10));
        this.k1.j(new bu0(this, i13));
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(gr.h);
        jVar.n(350L);
        this.k1.setItemAnimator(jVar);
        this.Y1.O(true);
        zs.f(this.a).c(this, zs.G3);
        d1();
    }

    @Override // org.telegram.ui.Components.ha
    public final sk0 L0(tk0 tk0Var) {
        p51 p51Var = new p51(tk0Var, getContext(), this.a, 0, false, new ag.a(this, 29), this.I0);
        this.Y1 = p51Var;
        p51Var.r = false;
        return p51Var;
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        return cd.L0(2131750258, null);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final r0.j1 b0(r0.j1 j1Var) {
        this.Z1 = org.telegram.messenger.i0.I0(j1Var, false);
        d1();
        return r0.j1.b;
    }

    public final void d1() {
        this.k1.setPadding(org.telegram.messenger.i0.L(9.0f) + this.Z1.a + this.t0, 0, org.telegram.messenger.i0.L(9.0f) + this.Z1.c + this.t0, this.Z1.d);
        i0.c cVar = this.Z1;
        int i10 = cVar.a;
        int i11 = this.t0;
        this.T1.setPadding(i10 + i11, 0, cVar.c + i11, cVar.d);
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        p51 p51Var;
        if (i10 != zs.G3 || (p51Var = this.Y1) == null) {
            return;
        }
        p51Var.O(true);
        if (e1()) {
            this.Q1.b();
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        zs.f(this.a).n(this, zs.G3);
        super.dismiss();
    }

    public final boolean e1() {
        tk0 tk0Var = this.k1;
        if (tk0Var != null && tk0Var.G) {
            for (int i10 = 0; i10 < tk0Var.getChildCount(); i10++) {
                if (tk0Var.getChildAt(i10) instanceof zz) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        super.s0();
        try {
            hi.c cVar = this.W1;
            if (cVar != null) {
                cVar.a(t6.w0(t6.d6, this.I0));
            }
            hi.c cVar2 = this.X1;
            if (cVar2 != null) {
                cVar2.a(t6.w0(t6.a7, this.I0));
            }
            int w02 = t6.w0(t6.a7, this.I0);
            if (this.a2 && w02 == this.b2) {
                return;
            }
            this.a2 = true;
            this.b2 = w02;
            v0(w02);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
