package org.telegram.ui;

import android.graphics.Point;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class wv0 implements r0.n, org.telegram.ui.Components.u81, org.telegram.ui.Components.cr0, org.telegram.ui.Components.lp0, org.telegram.ui.Components.ap0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wv0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        switch (this.a) {
            case 0:
                zv0 zv0Var = (zv0) this.b;
                i0.b g7 = k1Var.a.g(519);
                zv0Var.r = g7;
                zv0Var.d.setPadding(g7.a, g7.b, g7.c, g7.d);
                zv0Var.c.requestLayout();
                break;
            default:
                kd1 kd1Var = (kd1) this.b;
                i0.b g10 = k1Var.a.g(519);
                kd1Var.n = g10;
                kd1Var.c.setPadding(g10.a, g10.b, g10.c, g10.d);
                kd1Var.b.requestLayout();
                break;
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.cr0
    public void R() {
        ((StickersActivity) this.b).k0();
    }

    @Override // org.telegram.ui.Components.lp0
    public void U(float f7, boolean z10) {
        switch (this.a) {
            case 3:
                ThemeActivity.Z(((ta1) this.b).e, Math.round((r5.b * f7) + 0), false);
                break;
            default:
                eb1 eb1Var = (eb1) this.b;
                ThemeActivity.l0(eb1Var.n, Math.round(((eb1Var.d - r1) * f7) + eb1Var.c));
                break;
        }
    }

    @Override // org.telegram.ui.Components.ap0
    public void a(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((ye1) this.b).v0.movePreviewFragment(f7);
        }
    }

    @Override // org.telegram.ui.Components.u81
    public void c(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        x31 x31Var = secretMediaViewer.y;
        if (x31Var != null) {
            long p10 = x31Var.p();
            if (p10 != -9223372036854775807L) {
                secretMediaViewer.y.L((long) (f7 * p10), false);
            }
            secretMediaViewer.y.C();
        }
    }

    @Override // org.telegram.ui.Components.ap0
    public void d(org.telegram.ui.Cells.p2 p2Var) {
        cf1 cf1Var = ((ye1) this.b).v0;
        HashSet hashSet = cf1.q1;
        cf1Var.M0(p2Var);
    }

    @Override // org.telegram.ui.Components.u81
    public void f(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        x31 x31Var = secretMediaViewer.y;
        if (x31Var != null) {
            x31Var.B();
            long p10 = secretMediaViewer.y.p();
            if (p10 != -9223372036854775807L) {
                secretMediaViewer.y.L((long) (f7 * p10), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.ap0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((ye1) this.b).v0.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.lp0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                return String.valueOf(Math.round((((ta1) this.b).a.getProgress() * r0.b) + 0));
            default:
                eb1 eb1Var = (eb1) this.b;
                return String.valueOf(Math.round((eb1Var.b.getProgress() * (eb1Var.d - r1)) + eb1Var.c));
        }
    }

    @Override // org.telegram.ui.Components.lp0
    public int k0() {
        switch (this.a) {
            case 3:
                return ((ta1) this.b).b;
            default:
                eb1 eb1Var = (eb1) this.b;
                return eb1Var.d - eb1Var.c;
        }
    }

    @Override // org.telegram.ui.Components.cr0
    public void v0() {
        ((StickersActivity) this.b).k0();
    }

    @Override // org.telegram.ui.Components.lp0
    public void y() {
        int i10 = this.a;
    }

    private final void b() {
    }

    private final void e() {
    }
}
