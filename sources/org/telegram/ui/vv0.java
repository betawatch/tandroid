package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class vv0 implements r0.o, org.telegram.ui.Components.j71, org.telegram.ui.Components.aq0, org.telegram.ui.Components.io0, org.telegram.ui.ActionBar.f6, org.telegram.ui.Components.yn0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vv0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.io0
    public void B() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public Paint G(String str) {
        return ((fd1) this.b).f.a.G(str);
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
                yd1 yd1Var = (yd1) this.b;
                i0.b g11 = m1Var.a.g(519);
                yd1Var.n = g11;
                yd1Var.c.setPadding(g11.a, g11.b, g11.c, g11.d);
                yd1Var.b.requestLayout();
                break;
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.aq0
    public void V() {
        ((StickersActivity) this.b).j0();
    }

    @Override // org.telegram.ui.Components.io0
    public void Y(float f10, boolean z4) {
        switch (this.a) {
            case 3:
                ThemeActivity.Y(((jb1) this.b).d, Math.round((r5.b * f10) + 0), false);
                break;
            default:
                ub1 ub1Var = (ub1) this.b;
                ThemeActivity.k0(ub1Var.h, Math.round(((ub1Var.d - r1) * f10) + ub1Var.c));
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public boolean a() {
        return ((fd1) this.b).f.a.a();
    }

    @Override // org.telegram.ui.Components.j71
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

    @Override // org.telegram.ui.Components.j71
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

    @Override // org.telegram.ui.ActionBar.f6
    public int d0(int i10) {
        return ((fd1) this.b).f.a.x0(i10);
    }

    @Override // org.telegram.ui.Components.yn0
    public void e(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((of1) this.b).q0.movePreviewFragment(f10);
        }
    }

    @Override // org.telegram.ui.Components.yn0
    public void f(org.telegram.ui.Cells.q2 q2Var) {
        sf1 sf1Var = ((of1) this.b).q0;
        HashSet hashSet = sf1.k1;
        sf1Var.M0(q2Var);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int f1(int i10) {
        return ((fd1) this.b).f.a.f1(i10);
    }

    @Override // org.telegram.ui.Components.yn0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((of1) this.b).q0.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.io0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                return String.valueOf(Math.round((((jb1) this.b).a.getProgress() * r0.b) + 0));
            default:
                ub1 ub1Var = (ub1) this.b;
                return String.valueOf(Math.round((ub1Var.b.getProgress() * (ub1Var.d - r1)) + ub1Var.c));
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
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
        jc1 jc1Var = jd1Var.a;
        return jc1Var != null ? jc1Var.getDrawable(str) : org.telegram.ui.ActionBar.j6.O0(str);
    }

    @Override // org.telegram.ui.Components.io0
    public int j0() {
        switch (this.a) {
            case 3:
                return ((jb1) this.b).b;
            default:
                ub1 ub1Var = (ub1) this.b;
                return ub1Var.d - ub1Var.c;
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public void l(float f10, float f11, int i10, int i11) {
        jc1 jc1Var = ((fd1) this.b).f.a;
        if (jc1Var != null) {
            jc1Var.l(f10, f11, i10, i11);
        } else {
            org.telegram.ui.ActionBar.j6.q(f10, f11, i10, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public boolean m0() {
        return ((fd1) this.b).f.a.m0();
    }

    @Override // org.telegram.ui.Components.aq0
    public void q0() {
        ((StickersActivity) this.b).j0();
    }

    @Override // org.telegram.ui.ActionBar.f6
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.v3;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int x0(int i10) {
        return ((fd1) this.b).f.a.x0(i10);
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ void J0(int i10, int i11) {
    }
}
