package vh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.m20;
import org.telegram.messenger.r20;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.qp0;
import org.telegram.ui.hk;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class u1 extends org.telegram.ui.ActionBar.z2 implements us {
    public static int y1 = 1;
    public String i1;
    public int j1;
    public final w0 k1;
    public final x0 l1;
    public final hk m1;
    public final t1 n1;
    public float o1;
    public final boolean p1;
    public final boolean q1;
    public boolean r1;
    public int s1;
    public qh.d t1;
    public float u1;
    public m20 v1;
    public ag.n w1;
    public r20 x1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, boolean z11) {
        super(1, context, p6Var, true);
        int i10 = 1;
        this.i1 = null;
        this.j1 = -1;
        this.k1 = new w0();
        this.l1 = new x0();
        this.o1 = -1.0f;
        this.p1 = z10;
        this.q1 = z11;
        this.F = true;
        P(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, p6Var));
        this.s1 = this.G0;
        this.x = true;
        int i11 = 0;
        G0(false);
        this.b = new qp0(this, context);
        hk hkVar = new hk(this, context, 7);
        this.m1 = hkVar;
        hkVar.b = z10 ? 0 : y1;
        hkVar.setAdapter(new y0(this, z10, context));
        this.b.addView(hkVar, w7.b6.e(-1, -1, 87));
        new r2(this.b, false, new v0(this, i11));
        if (!z10) {
            t1 t1Var = new t1(context);
            this.n1 = t1Var;
            t1Var.G = new v0(this, i10);
            t1Var.F = hkVar.b;
            t1Var.invalidate();
            this.b.addView(t1Var, w7.b6.e(-1, -2, 87));
        }
        zs.f(this.a).c(this, zs.x0);
        zs.f(this.a).c(this, zs.B0);
        boolean z12 = org.telegram.messenger.f8.j;
        if (!z10) {
            ui.b0(this.a).B(5);
            ui.b0(this.a).w();
            ui.b0(this.a).V0(0, true, true, false);
        }
        ui.b0(this.a).B(0);
        ui.b0(this.a).V0(0, false, true, false);
        ui.b0(this.a).V0(2, false, true, false);
        ui.b0(this.a).V0(7, false, true, false);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean H() {
        return this.m1.getTranslationY() >= ((float) ((int) this.o1));
    }

    public boolean I0(Integer num) {
        return true;
    }

    public boolean J0(Integer num) {
        return true;
    }

    public boolean K0(Runnable runnable) {
        return true;
    }

    public final void L0() {
        p1 p1Var;
        this.d = false;
        this.c.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.m1.w).start();
        for (View view : this.m1.getViewPages()) {
            if (view instanceof l1) {
                p1 p1Var2 = ((l1) view).f;
                if (p1Var2 != null) {
                    org.telegram.messenger.i0.v1(p1Var2.e);
                }
            } else if ((view instanceof g1) && (p1Var = ((g1) view).d) != null) {
                org.telegram.messenger.i0.v1(p1Var.e);
            }
        }
    }

    public final void M0(int i10) {
        if (I0(Integer.valueOf(i10))) {
            if ((i10 != 1 || K0(new org.telegram.utils.twidget.v(this, i10, 7))) && ((Boolean) this.x1.a(Integer.valueOf(i10))).booleanValue()) {
                dismiss();
            }
        }
    }

    public final void N0(r20 r20Var) {
        this.x1 = r20Var;
        for (View view : this.m1.getViewPages()) {
            if (view instanceof l1) {
                k1 k1Var = ((l1) view).c;
                if (k1Var.H == null) {
                    k1Var.D(null);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final int S() {
        return this.b.getMeasuredHeight() <= 0 ? org.telegram.messenger.i0.q.y : (int) (this.b.getMeasuredHeight() - this.m1.getY());
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = zs.x0;
        int i13 = zs.B0;
        if (i10 == i12 || i10 == i13) {
            for (View view : this.m1.getViewPages()) {
                if (view instanceof l1) {
                    l1 l1Var = (l1) view;
                    if (i10 == i13 || ((l1Var.a == 0 && ((Integer) objArr[0]).intValue() == 5) || (l1Var.a == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        k1 k1Var = l1Var.c;
                        if (k1Var.H == null) {
                            k1Var.D(null);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        zs.f(this.a).n(this, zs.x0);
        zs.f(this.a).n(this, zs.B0);
        L0();
        super.dismiss();
        boolean z10 = org.telegram.messenger.f8.j;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.F0 >= 0 || this.G0 != this.s1 || (w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, this.I0)) == this.G0) {
                return;
            }
            this.G0 = w02;
            this.s1 = w02;
            E0(w02);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
