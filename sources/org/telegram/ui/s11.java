package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s11 extends org.telegram.ui.Components.ma implements org.telegram.messenger.cs {
    public final org.telegram.ui.Components.hy Q1;
    public final gi.d R1;
    public final ei.r6 S1;
    public final HashMap T1;
    public final int U1;
    public int V1;
    public org.telegram.ui.Components.f41 W1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s11(org.telegram.ui.ActionBar.d2 d2Var, long j10, int i3, ci.q3 q3Var) {
        super(r2, d2Var, new org.telegram.ui.Components.la(r3));
        Activity parentActivity = d2Var.getParentActivity();
        org.telegram.ui.Components.la laVar = new org.telegram.ui.Components.la();
        laVar.a = false;
        laVar.c = false;
        laVar.f = 2;
        laVar.g = d2Var.getResourceProvider();
        this.T1 = new HashMap();
        this.U1 = i3;
        ei.r6 A = org.telegram.messenger.hp.s1(d2Var.getCurrentAccount()).P1().A(1, -1, j10, true);
        this.S1 = A;
        A.p(30, false);
        this.C1 = org.telegram.messenger.g0.L(12.0f);
        N();
        Y0();
        FrameLayout frameLayout = new FrameLayout(getContext());
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, frameLayout, this.J0);
        int i10 = this.u0;
        frameLayout.setPadding(i10, 0, i10, 0);
        this.b.addView(frameLayout, b8.mf.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view, this.J0);
        frameLayout.addView(view, b8.mf.a(-1.0f, 1.0f / org.telegram.messenger.g0.p, 55));
        gi.d dVar = new gi.d(getContext(), this.J0, true);
        this.R1 = dVar;
        dVar.i(org.telegram.messenger.bd.M0(2131744808, null), false, true);
        dVar.setEnabled(false);
        dVar.setOnClickListener(new hb0(15, this, q3Var));
        frameLayout.addView(dVar, b8.mf.d(-1, 48.0f, org.telegram.messenger.hs.E1, 10.0f, (1.0f / org.telegram.messenger.g0.p) + 10.0f, 10.0f, 10.0f));
        getContext();
        org.telegram.ui.Components.hy hyVar = new org.telegram.ui.Components.hy(i3, false);
        this.Q1 = hyVar;
        hyVar.O = new ai.g2(this, 17);
        org.telegram.ui.Components.tj0 tj0Var = this.l1;
        int i11 = this.u0;
        tj0Var.setPadding(i11, 0, i11, 0);
        this.l1.setSelectorType(9);
        this.l1.setSelectorDrawableColor(0);
        this.l1.setLayoutManager(hyVar);
        this.l1.setOnItemClickListener(new nx0(this, 4));
        this.l1.setOnItemLongClickListener(new ci0(this, 17));
        this.l1.setOnScrollListener(new r11(this, 0));
        this.W1.O(true);
    }

    @Override // org.telegram.ui.Components.ma
    public final org.telegram.ui.Components.sj0 L0(org.telegram.ui.Components.tj0 tj0Var) {
        org.telegram.ui.Components.f41 f41Var = new org.telegram.ui.Components.f41(tj0Var, getContext(), this.a, 0, false, new c5(this, 25), this.J0);
        this.W1 = f41Var;
        f41Var.r = false;
        return f41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return org.telegram.messenger.bd.M0(2131744808, null);
    }

    public final void d1() {
        org.telegram.ui.Components.hy hyVar = this.Q1;
        int L0 = hyVar.L0();
        int abs = L0 == -1 ? 0 : Math.abs(hyVar.N0() - L0) + 1;
        ei.r6 r6Var = this.S1;
        if (r6Var != null) {
            int i3 = L0 + abs;
            int i10 = r6Var.i();
            int i11 = this.U1;
            if (i3 > i10 - i11) {
                r6Var.p(Math.min(100, Math.max(1, i11 / 2) * i11 * i11), false);
            }
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.x5 && ((ei.r6) objArr[0]) == this.S1) {
            this.W1.O(false);
            d1();
        }
    }

    public final boolean e1(int i3, View view) {
        org.telegram.ui.Components.r31 G;
        org.telegram.ui.Components.f41 f41Var = this.W1;
        if (f41Var == null || i3 == 0 || (G = f41Var.G(i3 - 1)) == null) {
            return false;
        }
        Object obj = G.G;
        if (obj instanceof org.telegram.messenger.zi) {
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj;
            int f12 = ziVar.f1();
            Integer valueOf = Integer.valueOf(f12);
            HashMap hashMap = this.T1;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(f12));
                G.e = false;
                ((org.telegram.ui.Cells.n7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(f12), ziVar.l);
                G.e = true;
                ((org.telegram.ui.Cells.n7) view).i(true, true);
            }
            boolean z10 = !hashMap.isEmpty();
            gi.d dVar = this.R1;
            dVar.setEnabled(z10);
            dVar.c(hashMap.size(), true);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.V1 = this.S1.o();
        org.telegram.messenger.hs.f(this.a).c(this, org.telegram.messenger.hs.x5);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.S1.z(this.V1);
        org.telegram.messenger.hs.f(this.a).n(this, org.telegram.messenger.hs.x5);
    }
}
