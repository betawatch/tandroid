package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class qv0 implements r0.o, org.telegram.ui.Components.l71, org.telegram.ui.Components.bq0, org.telegram.ui.Components.ko0, org.telegram.ui.ActionBar.g6, org.telegram.ui.Components.ao0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qv0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.ko0
    public void A() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public int B0(int i10) {
        return ((ad1) this.b).f.a.B0(i10);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public Paint F(String str) {
        return ((ad1) this.b).f.a.F(str);
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        switch (this.a) {
            case 0:
                tv0 tv0Var = (tv0) this.b;
                i0.b g10 = m1Var.a.g(519);
                tv0Var.r = g10;
                tv0Var.d.setPadding(g10.a, g10.b, g10.c, g10.d);
                tv0Var.c.requestLayout();
                break;
            default:
                ud1 ud1Var = (ud1) this.b;
                i0.b g11 = m1Var.a.g(519);
                ud1Var.n = g11;
                ud1Var.c.setPadding(g11.a, g11.b, g11.c, g11.d);
                ud1Var.b.requestLayout();
                break;
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.bq0
    public void U() {
        ((StickersActivity) this.b).j0();
    }

    @Override // org.telegram.ui.Components.ko0
    public void X(float f10, boolean z4) {
        switch (this.a) {
            case 3:
                ThemeActivity.Y(((cb1) this.b).d, Math.round((r5.b * f10) + 0), false);
                break;
            default:
                nb1 nb1Var = (nb1) this.b;
                ThemeActivity.k0(nb1Var.h, Math.round(((nb1Var.d - r1) * f10) + nb1Var.c));
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public int Z0(int i10) {
        return ((ad1) this.b).f.a.Z0(i10);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public boolean a() {
        return ((ad1) this.b).f.a.a();
    }

    @Override // org.telegram.ui.Components.l71
    public void b(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        j41 j41Var = secretMediaViewer.y;
        if (j41Var != null) {
            long p10 = j41Var.p();
            if (p10 != -9223372036854775807L) {
                secretMediaViewer.y.L((long) (f10 * p10), false);
            }
            secretMediaViewer.y.C();
        }
    }

    @Override // org.telegram.ui.Components.l71
    public void d(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        j41 j41Var = secretMediaViewer.y;
        if (j41Var != null) {
            j41Var.B();
            long p10 = secretMediaViewer.y.p();
            if (p10 != -9223372036854775807L) {
                secretMediaViewer.y.L((long) (f10 * p10), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.ao0
    public void e(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((if1) this.b).q0.movePreviewFragment(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public int e0(int i10) {
        return ((ad1) this.b).f.a.B0(i10);
    }

    @Override // org.telegram.ui.Components.ao0
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        mf1 mf1Var = ((if1) this.b).q0;
        HashSet hashSet = mf1.k1;
        mf1Var.M0(r2Var);
    }

    @Override // org.telegram.ui.Components.ao0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((if1) this.b).q0.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.ko0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                return String.valueOf(Math.round((((cb1) this.b).a.getProgress() * r0.b) + 0));
            default:
                nb1 nb1Var = (nb1) this.b;
                return String.valueOf(Math.round((nb1Var.b.getProgress() * (nb1Var.d - r1)) + nb1Var.c));
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public Drawable getDrawable(String str) {
        ed1 ed1Var = ((ad1) this.b).f;
        if (str.equals("drawableMsgOut")) {
            return ed1Var.O;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return ed1Var.P;
        }
        if (str.equals("drawableMsgOutMedia")) {
            return ed1Var.Q;
        }
        if (str.equals("drawableMsgOutMediaSelected")) {
            return ed1Var.R;
        }
        dc1 dc1Var = ed1Var.a;
        return dc1Var != null ? dc1Var.getDrawable(str) : org.telegram.ui.ActionBar.k6.O0(str);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public void l(float f10, float f11, int i10, int i11) {
        dc1 dc1Var = ((ad1) this.b).f.a;
        if (dc1Var != null) {
            dc1Var.l(f10, f11, i10, i11);
        } else {
            org.telegram.ui.ActionBar.k6.q(f10, f11, i10, i11);
        }
    }

    @Override // org.telegram.ui.Components.ko0
    public int m0() {
        switch (this.a) {
            case 3:
                return ((cb1) this.b).b;
            default:
                nb1 nb1Var = (nb1) this.b;
                return nb1Var.d - nb1Var.c;
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public boolean o0() {
        return ((ad1) this.b).f.a.o0();
    }

    @Override // org.telegram.ui.Components.bq0
    public void u0() {
        ((StickersActivity) this.b).j0();
    }

    @Override // org.telegram.ui.ActionBar.g6
    public ColorFilter w() {
        return org.telegram.ui.ActionBar.k6.v3;
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override // org.telegram.ui.ActionBar.g6
    public /* synthetic */ void J0(int i10, int i11) {
    }
}
