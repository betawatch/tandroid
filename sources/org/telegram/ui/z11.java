package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class z11 extends org.telegram.ui.Components.ja implements org.telegram.messenger.is {
    public final org.telegram.ui.Components.oy T1;
    public final hi.d U1;
    public final fi.k6 V1;
    public final HashMap W1;
    public final int X1;
    public int Y1;
    public org.telegram.ui.Components.p41 Z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z11(org.telegram.ui.ActionBar.e2 e2Var, long j3, int i7, di.h3 h3Var) {
        super(r2, e2Var, new org.telegram.ui.Components.ia(r3));
        Activity parentActivity = e2Var.getParentActivity();
        org.telegram.ui.Components.ia iaVar = new org.telegram.ui.Components.ia();
        iaVar.a = false;
        iaVar.c = false;
        iaVar.f = 2;
        iaVar.g = e2Var.getResourceProvider();
        this.W1 = new HashMap();
        this.X1 = i7;
        fi.k6 A = org.telegram.messenger.np.s1(e2Var.getCurrentAccount()).P1().A(1, -1, j3, true);
        this.V1 = A;
        A.p(30, false);
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        O();
        Y0();
        FrameLayout frameLayout = new FrameLayout(getContext());
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.h5, frameLayout, this.J0);
        int i10 = this.u0;
        frameLayout.setPadding(i10, 0, i10, 0);
        this.b.addView(frameLayout, c8.ja.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d7, view, this.J0);
        frameLayout.addView(view, c8.ja.a(-1.0f, 1.0f / org.telegram.messenger.g0.p, 55));
        hi.d dVar = new hi.d(getContext(), this.J0, true);
        this.U1 = dVar;
        dVar.i(org.telegram.messenger.hd.M0(2131744798, null), false, true);
        dVar.setEnabled(false);
        dVar.setOnClickListener(new a90(17, this, h3Var));
        frameLayout.addView(dVar, c8.ja.d(-1, 48.0f, org.telegram.messenger.ns.E1, 10.0f, (1.0f / org.telegram.messenger.g0.p) + 10.0f, 10.0f, 10.0f));
        getContext();
        org.telegram.ui.Components.oy oyVar = new org.telegram.ui.Components.oy(i7, false);
        this.T1 = oyVar;
        oyVar.O = new bi.y1(this, 17);
        org.telegram.ui.Components.uj0 uj0Var = this.o1;
        int i11 = this.u0;
        uj0Var.setPadding(i11, 0, i11, 0);
        this.o1.setSelectorType(9);
        this.o1.setSelectorDrawableColor(0);
        this.o1.setLayoutManager(oyVar);
        this.o1.setOnItemClickListener(new ux0(this, 4));
        this.o1.setOnItemLongClickListener(new ni0(this, 16));
        this.o1.setOnScrollListener(new y11(this, 0));
        this.Z1.O(true);
    }

    @Override // org.telegram.ui.Components.ja
    public final org.telegram.ui.Components.tj0 L0(org.telegram.ui.Components.uj0 uj0Var) {
        org.telegram.ui.Components.p41 p41Var = new org.telegram.ui.Components.p41(uj0Var, getContext(), this.a, 0, false, new a5(this, 26), this.J0);
        this.Z1 = p41Var;
        p41Var.r = false;
        return p41Var;
    }

    @Override // org.telegram.ui.Components.ja
    public final CharSequence O0() {
        return org.telegram.messenger.hd.M0(2131744798, null);
    }

    public final void d1() {
        org.telegram.ui.Components.oy oyVar = this.T1;
        int L0 = oyVar.L0();
        int abs = L0 == -1 ? 0 : Math.abs(oyVar.N0() - L0) + 1;
        fi.k6 k6Var = this.V1;
        if (k6Var != null) {
            int i7 = L0 + abs;
            int i10 = k6Var.i();
            int i11 = this.X1;
            if (i7 > i10 - i11) {
                k6Var.p(Math.min(100, Math.max(1, i11 / 2) * i11 * i11), false);
            }
        }
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.x5 && ((fi.k6) objArr[0]) == this.V1) {
            this.Z1.O(false);
            d1();
        }
    }

    public final boolean e1(int i7, View view) {
        org.telegram.ui.Components.b41 G;
        org.telegram.ui.Components.p41 p41Var = this.Z1;
        if (p41Var == null || i7 == 0 || (G = p41Var.G(i7 - 1)) == null) {
            return false;
        }
        Object obj = G.G;
        if (obj instanceof org.telegram.messenger.gj) {
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
            int e12 = gjVar.e1();
            Integer valueOf = Integer.valueOf(e12);
            HashMap hashMap = this.W1;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(e12));
                G.e = false;
                ((org.telegram.ui.Cells.n7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(e12), gjVar.l);
                G.e = true;
                ((org.telegram.ui.Cells.n7) view).i(true, true);
            }
            boolean z10 = !hashMap.isEmpty();
            hi.d dVar = this.U1;
            dVar.setEnabled(z10);
            dVar.c(hashMap.size(), true);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Y1 = this.V1.o();
        org.telegram.messenger.ns.f(this.a).c(this, org.telegram.messenger.ns.x5);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.V1.z(this.Y1);
        org.telegram.messenger.ns.f(this.a).n(this, org.telegram.messenger.ns.x5);
    }
}
