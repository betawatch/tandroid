package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class vv0 implements r0.o, org.telegram.ui.Components.k71, org.telegram.ui.Components.aq0, org.telegram.ui.Components.jo0, org.telegram.ui.ActionBar.g6, org.telegram.ui.Components.zn0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vv0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.jo0
    public void A() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public int B0(int i10) {
        return ((fd1) this.b).f.a.B0(i10);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public Paint F(String str) {
        return ((fd1) this.b).f.a.F(str);
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        switch (this.a) {
            case 0:
                yv0 yv0Var = (yv0) this.b;
                i0.b g10 = m1Var.a.g(519);
                yv0Var.r = g10;
                yv0Var.d.setPadding(g10.a, g10.b, g10.c, g10.d);
                yv0Var.c.requestLayout();
                break;
            default:
                zd1 zd1Var = (zd1) this.b;
                i0.b g11 = m1Var.a.g(519);
                zd1Var.n = g11;
                zd1Var.c.setPadding(g11.a, g11.b, g11.c, g11.d);
                zd1Var.b.requestLayout();
                break;
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.aq0
    public void U() {
        ((StickersActivity) this.b).j0();
    }

    @Override // org.telegram.ui.Components.jo0
    public void X(float f10, boolean z4) {
        switch (this.a) {
            case 3:
                ThemeActivity.Y(((ib1) this.b).d, Math.round((r5.b * f10) + 0), false);
                break;
            default:
                tb1 tb1Var = (tb1) this.b;
                ThemeActivity.k0(tb1Var.h, Math.round(((tb1Var.d - r1) * f10) + tb1Var.c));
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public int Z0(int i10) {
        return ((fd1) this.b).f.a.Z0(i10);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public boolean a() {
        return ((fd1) this.b).f.a.a();
    }

    @Override // org.telegram.ui.Components.k71
    public void b(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        o41 o41Var = secretMediaViewer.y;
        if (o41Var != null) {
            long p10 = o41Var.p();
            if (p10 != -9223372036854775807L) {
                secretMediaViewer.y.L((long) (f10 * p10), false);
            }
            secretMediaViewer.y.C();
        }
    }

    @Override // org.telegram.ui.Components.k71
    public void d(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        o41 o41Var = secretMediaViewer.y;
        if (o41Var != null) {
            o41Var.B();
            long p10 = secretMediaViewer.y.p();
            if (p10 != -9223372036854775807L) {
                secretMediaViewer.y.L((long) (f10 * p10), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.zn0
    public void e(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((of1) this.b).q0.movePreviewFragment(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public int e0(int i10) {
        return ((fd1) this.b).f.a.B0(i10);
    }

    @Override // org.telegram.ui.Components.zn0
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        sf1 sf1Var = ((of1) this.b).q0;
        HashSet hashSet = sf1.k1;
        sf1Var.M0(r2Var);
    }

    @Override // org.telegram.ui.Components.zn0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((of1) this.b).q0.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.jo0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                return String.valueOf(Math.round((((ib1) this.b).a.getProgress() * r0.b) + 0));
            default:
                tb1 tb1Var = (tb1) this.b;
                return String.valueOf(Math.round((tb1Var.b.getProgress() * (tb1Var.d - r1)) + tb1Var.c));
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public Drawable getDrawable(String str) {
        jd1 jd1Var = ((fd1) this.b).f;
        if (str.equals("drawableMsgOut")) {
            return jd1Var.O;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return jd1Var.P;
        }
        if (str.equals("drawableMsgOutMedia")) {
            return jd1Var.Q;
        }
        if (str.equals("drawableMsgOutMediaSelected")) {
            return jd1Var.R;
        }
        ic1 ic1Var = jd1Var.a;
        return ic1Var != null ? ic1Var.getDrawable(str) : org.telegram.ui.ActionBar.k6.O0(str);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public void l(float f10, float f11, int i10, int i11) {
        ic1 ic1Var = ((fd1) this.b).f.a;
        if (ic1Var != null) {
            ic1Var.l(f10, f11, i10, i11);
        } else {
            org.telegram.ui.ActionBar.k6.q(f10, f11, i10, i11);
        }
    }

    @Override // org.telegram.ui.Components.jo0
    public int m0() {
        switch (this.a) {
            case 3:
                return ((ib1) this.b).b;
            default:
                tb1 tb1Var = (tb1) this.b;
                return tb1Var.d - tb1Var.c;
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public boolean o0() {
        return ((fd1) this.b).f.a.o0();
    }

    @Override // org.telegram.ui.Components.aq0
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
