package th;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.kp;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.u10;
import org.telegram.ui.Components.zt;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u5 {
    public final int a;
    public final zt b;
    public final u10 c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.w4 f;
    public final org.telegram.ui.Components.w4 g;
    public boolean h;
    public kp i;
    public int j;

    public u5(View view) {
        zt ztVar = new zt(1, view);
        this.a = d20.s0;
        this.b = ztVar;
        gr grVar = gr.h;
        this.f = new org.telegram.ui.Components.w4(ztVar, 350L, grVar);
        this.g = new org.telegram.ui.Components.w4(ztVar, 350L, grVar);
        u10 u10Var = new u10();
        this.c = u10Var;
        u10Var.a = true;
        u10Var.b = true;
        b(false);
        u10Var.c.setStrokeWidth(org.telegram.messenger.i0.N(2.0f));
        u10Var.c.setStyle(Paint.Style.STROKE);
        u10Var.c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int m10;
        int n10;
        int i10 = this.j;
        int i11 = org.telegram.ui.ActionBar.a7.b;
        org.telegram.ui.Components.w4 w4Var = this.g;
        org.telegram.ui.Components.w4 w4Var2 = this.f;
        if (i10 != i11) {
            this.j = i11;
            try {
                if (this.h) {
                    m10 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Vk, false);
                    n10 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Wk, false);
                } else {
                    kp kpVar = this.i;
                    if (kpVar != null) {
                        m10 = kpVar.m(org.telegram.ui.ActionBar.t6.I.q());
                        n10 = this.i.n(org.telegram.ui.ActionBar.t6.I.q());
                    }
                }
                if (m10 != this.d || n10 != this.e) {
                    this.d = m10;
                    this.e = n10;
                    w4Var2.a(m10, true);
                    w4Var.a(n10, true);
                }
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
        int a2 = w4Var2.a(this.d, false);
        int a10 = w4Var.a(this.e, false);
        u10 u10Var = this.c;
        u10Var.d(a2, a10, 0, 0);
        u10Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return u10Var.c;
    }

    public final void b(boolean z10) {
        this.h = true;
        this.i = null;
        this.j = org.telegram.ui.ActionBar.a7.b;
        d(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Vk, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Wk, false), z10);
    }

    public final void c(kp kpVar, boolean z10) {
        this.i = kpVar;
        this.j = org.telegram.ui.ActionBar.a7.b;
        if (kpVar == null) {
            b(z10);
        } else {
            this.h = false;
            d(kpVar.m(org.telegram.ui.ActionBar.t6.I.q()), kpVar.n(org.telegram.ui.ActionBar.t6.I.q()), z10);
        }
    }

    public final void d(int i10, int i11, boolean z10) {
        this.d = i10;
        this.e = i11;
        if (!z10) {
            this.f.a(i10, true);
            this.g.a(i11, true);
        }
        zt ztVar = this.b;
        if (ztVar != null) {
            ztVar.run();
        }
    }
}
