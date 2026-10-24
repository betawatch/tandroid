package org.telegram.ui;

import android.graphics.Point;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class rv0 implements r0.n, org.telegram.ui.Components.k81, org.telegram.ui.Components.xq0, org.telegram.ui.Components.gp0, org.telegram.ui.Components.vo0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rv0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        switch (this.a) {
            case 0:
                uv0 uv0Var = (uv0) this.b;
                i0.b g10 = k1Var.a.g(519);
                uv0Var.r = g10;
                uv0Var.d.setPadding(g10.a, g10.b, g10.c, g10.d);
                uv0Var.c.requestLayout();
                break;
            default:
                ed1 ed1Var = (ed1) this.b;
                i0.b g11 = k1Var.a.g(519);
                ed1Var.n = g11;
                ed1Var.c.setPadding(g11.a, g11.b, g11.c, g11.d);
                ed1Var.b.requestLayout();
                break;
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.xq0
    public void H() {
        ((StickersActivity) this.b).j0();
    }

    @Override // org.telegram.ui.Components.gp0
    public void L(float f7, boolean z10) {
        switch (this.a) {
            case 3:
                ThemeActivity.Y(((pa1) this.b).e, Math.round((r5.b * f7) + 0), false);
                break;
            default:
                ab1 ab1Var = (ab1) this.b;
                ThemeActivity.k0(ab1Var.n, Math.round(((ab1Var.d - r1) * f7) + ab1Var.c));
                break;
        }
    }

    @Override // org.telegram.ui.Components.gp0
    public int Y() {
        switch (this.a) {
            case 3:
                return ((pa1) this.b).b;
            default:
                ab1 ab1Var = (ab1) this.b;
                return ab1Var.d - ab1Var.c;
        }
    }

    @Override // org.telegram.ui.Components.k81
    public void a(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        t31 t31Var = secretMediaViewer.y;
        if (t31Var != null) {
            long p5 = t31Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.y.L((long) (f7 * p5), false);
            }
            secretMediaViewer.y.C();
        }
    }

    @Override // org.telegram.ui.Components.k81
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        t31 t31Var = secretMediaViewer.y;
        if (t31Var != null) {
            t31Var.B();
            long p5 = secretMediaViewer.y.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.y.L((long) (f7 * p5), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.vo0
    public void d(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((te1) this.b).t0.movePreviewFragment(f7);
        }
    }

    @Override // org.telegram.ui.Components.vo0
    public void e(org.telegram.ui.Cells.q2 q2Var) {
        ye1 ye1Var = ((te1) this.b).t0;
        HashSet hashSet = ye1.q1;
        ye1Var.L0(q2Var);
    }

    @Override // org.telegram.ui.Components.vo0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((te1) this.b).t0.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.xq0
    public void g0() {
        ((StickersActivity) this.b).j0();
    }

    @Override // org.telegram.ui.Components.gp0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                return String.valueOf(Math.round((((pa1) this.b).a.getProgress() * r0.b) + 0));
            default:
                ab1 ab1Var = (ab1) this.b;
                return String.valueOf(Math.round((ab1Var.b.getProgress() * (ab1Var.d - r1)) + ab1Var.c));
        }
    }

    @Override // org.telegram.ui.Components.gp0
    public void v() {
        int i10 = this.a;
    }

    private final void c() {
    }

    private final void f() {
    }
}
