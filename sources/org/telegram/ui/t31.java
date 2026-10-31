package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t31 extends org.telegram.ui.Components.ha implements org.telegram.messenger.us {
    public final org.telegram.ui.Components.yy P1;
    public final vh.d Q1;
    public final th.x4 R1;
    public final HashMap S1;
    public final int T1;
    public int U1;
    public org.telegram.ui.Components.p51 V1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t31(org.telegram.ui.ActionBar.k2 k2Var, long j10, int i10, org.telegram.ui.Components.zb zbVar) {
        super(r2, k2Var, new org.telegram.ui.Components.ga(r3));
        Activity parentActivity = k2Var.getParentActivity();
        org.telegram.ui.Components.ga gaVar = new org.telegram.ui.Components.ga();
        gaVar.a = false;
        gaVar.c = false;
        gaVar.f = 2;
        gaVar.g = k2Var.getResourceProvider();
        this.S1 = new HashMap();
        this.T1 = i10;
        th.x4 A = org.telegram.messenger.vp.r1(k2Var.getCurrentAccount()).O1().A(1, -1, j10, true);
        this.R1 = A;
        A.p(30, false);
        this.B1 = org.telegram.messenger.i0.L(12.0f);
        O();
        Y0();
        FrameLayout frameLayout = new FrameLayout(getContext());
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.h5, frameLayout, this.I0);
        int i11 = this.t0;
        frameLayout.setPadding(i11, 0, i11, 0);
        this.b.addView(frameLayout, w7.b6.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d7, view, this.I0);
        frameLayout.addView(view, w7.b6.a(-1.0f, 1.0f / org.telegram.messenger.i0.p, 55));
        vh.d dVar = new vh.d(getContext(), this.I0, true);
        this.Q1 = dVar;
        dVar.i(org.telegram.messenger.cd.L0(2131744816, null), false, true);
        dVar.setEnabled(false);
        dVar.setOnClickListener(new rv0(3, this, zbVar));
        frameLayout.addView(dVar, w7.b6.d(-1, 48.0f, org.telegram.messenger.zs.E1, 10.0f, (1.0f / org.telegram.messenger.i0.p) + 10.0f, 10.0f, 10.0f));
        getContext();
        org.telegram.ui.Components.yy yyVar = new org.telegram.ui.Components.yy(i10, false);
        this.P1 = yyVar;
        yyVar.O = new jg.h1(this, 10);
        org.telegram.ui.Components.tk0 tk0Var = this.k1;
        int i12 = this.t0;
        tk0Var.setPadding(i12, 0, i12, 0);
        this.k1.setSelectorType(9);
        this.k1.setSelectorDrawableColor(0);
        this.k1.setLayoutManager(yyVar);
        this.k1.setOnItemClickListener(new kz0(this, 4));
        this.k1.setOnItemLongClickListener(new tj0(this, 17));
        this.k1.setOnScrollListener(new h3(this, 29));
        this.V1.O(true);
    }

    @Override // org.telegram.ui.Components.ha
    public final org.telegram.ui.Components.sk0 L0(org.telegram.ui.Components.tk0 tk0Var) {
        org.telegram.ui.Components.p51 p51Var = new org.telegram.ui.Components.p51(tk0Var, getContext(), this.a, 0, false, new z4(this, 25), this.I0);
        this.V1 = p51Var;
        p51Var.r = false;
        return p51Var;
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        return org.telegram.messenger.cd.L0(2131744816, null);
    }

    public final void d1() {
        org.telegram.ui.Components.yy yyVar = this.P1;
        int L0 = yyVar.L0();
        int abs = L0 == -1 ? 0 : Math.abs(yyVar.N0() - L0) + 1;
        th.x4 x4Var = this.R1;
        if (x4Var != null) {
            int i10 = L0 + abs;
            int i11 = x4Var.i();
            int i12 = this.T1;
            if (i10 > i11 - i12) {
                x4Var.p(Math.min(100, Math.max(1, i12 / 2) * i12 * i12), false);
            }
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.x5 && ((th.x4) objArr[0]) == this.R1) {
            this.V1.O(false);
            d1();
        }
    }

    public final boolean e1(int i10, View view) {
        org.telegram.ui.Components.a51 G;
        org.telegram.ui.Components.p51 p51Var = this.V1;
        if (p51Var == null || i10 == 0 || (G = p51Var.G(i10 - 1)) == null) {
            return false;
        }
        Object obj = G.G;
        if (obj instanceof org.telegram.messenger.jj) {
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) obj;
            int f12 = jjVar.f1();
            Integer valueOf = Integer.valueOf(f12);
            HashMap hashMap = this.S1;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(f12));
                G.e = false;
                ((org.telegram.ui.Cells.s7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(f12), jjVar.l);
                G.e = true;
                ((org.telegram.ui.Cells.s7) view).i(true, true);
            }
            boolean z10 = !hashMap.isEmpty();
            vh.d dVar = this.Q1;
            dVar.setEnabled(z10);
            dVar.c(hashMap.size(), true);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U1 = this.R1.o();
        org.telegram.messenger.zs.f(this.a).c(this, org.telegram.messenger.zs.x5);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.R1.z(this.U1);
        org.telegram.messenger.zs.f(this.a).n(this, org.telegram.messenger.zs.x5);
    }
}
