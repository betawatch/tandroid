package org.telegram.ui;

import android.graphics.Point;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class uv0 implements r0.n, org.telegram.ui.Components.t81, org.telegram.ui.Components.br0, org.telegram.ui.Components.kp0, org.telegram.ui.Components.zo0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uv0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        switch (this.a) {
            case 0:
                xv0 xv0Var = (xv0) this.b;
                i0.b g7 = k1Var.a.g(519);
                xv0Var.r = g7;
                xv0Var.d.setPadding(g7.a, g7.b, g7.c, g7.d);
                xv0Var.c.requestLayout();
                break;
            default:
                id1 id1Var = (id1) this.b;
                i0.b g10 = k1Var.a.g(519);
                id1Var.n = g10;
                id1Var.c.setPadding(g10.a, g10.b, g10.c, g10.d);
                id1Var.b.requestLayout();
                break;
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.br0
    public void R() {
        ((StickersActivity) this.b).k0();
    }

    @Override // org.telegram.ui.Components.kp0
    public void U(float f7, boolean z10) {
        switch (this.a) {
            case 3:
                ThemeActivity.Z(((ra1) this.b).e, Math.round((r5.b * f7) + 0), false);
                break;
            default:
                cb1 cb1Var = (cb1) this.b;
                ThemeActivity.l0(cb1Var.n, Math.round(((cb1Var.d - r1) * f7) + cb1Var.c));
                break;
        }
    }

    @Override // org.telegram.ui.Components.zo0
    public void a(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((we1) this.b).v0.movePreviewFragment(f7);
        }
    }

    @Override // org.telegram.ui.Components.t81
    public void c(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        u31 u31Var = secretMediaViewer.y;
        if (u31Var != null) {
            long p10 = u31Var.p();
            if (p10 != -9223372036854775807L) {
                secretMediaViewer.y.L((long) (f7 * p10), false);
            }
            secretMediaViewer.y.C();
        }
    }

    @Override // org.telegram.ui.Components.zo0
    public void d(org.telegram.ui.Cells.p2 p2Var) {
        af1 af1Var = ((we1) this.b).v0;
        HashSet hashSet = af1.q1;
        af1Var.M0(p2Var);
    }

    @Override // org.telegram.ui.Components.t81
    public void f(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        u31 u31Var = secretMediaViewer.y;
        if (u31Var != null) {
            u31Var.B();
            long p10 = secretMediaViewer.y.p();
            if (p10 != -9223372036854775807L) {
                secretMediaViewer.y.L((long) (f7 * p10), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.zo0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((we1) this.b).v0.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.kp0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                return String.valueOf(Math.round((((ra1) this.b).a.getProgress() * r0.b) + 0));
            default:
                cb1 cb1Var = (cb1) this.b;
                return String.valueOf(Math.round((cb1Var.b.getProgress() * (cb1Var.d - r1)) + cb1Var.c));
        }
    }

    @Override // org.telegram.ui.Components.kp0
    public int k0() {
        switch (this.a) {
            case 3:
                return ((ra1) this.b).b;
            default:
                cb1 cb1Var = (cb1) this.b;
                return cb1Var.d - cb1Var.c;
        }
    }

    @Override // org.telegram.ui.Components.br0
    public void v0() {
        ((StickersActivity) this.b).k0();
    }

    @Override // org.telegram.ui.Components.kp0
    public void y() {
        int i10 = this.a;
    }

    private final void b() {
    }

    private final void e() {
    }
}
