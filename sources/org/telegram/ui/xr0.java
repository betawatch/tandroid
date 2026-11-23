package org.telegram.ui;

import android.graphics.Point;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class xr0 implements r0.m, org.telegram.ui.Components.j61, org.telegram.ui.Components.qo0, org.telegram.ui.Components.an0, org.telegram.ui.Components.qm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xr0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.an0
    public void C() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.qo0
    public void D0() {
        ((StickersActivity) this.b).o0();
    }

    @Override // org.telegram.ui.Components.qm0
    public void F(org.telegram.ui.Cells.u2 u2Var) {
        y91 y91Var = ((u91) this.b).w0;
        HashSet hashSet = y91.s1;
        y91Var.Q0(u2Var);
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
        switch (this.a) {
            case 0:
                as0 as0Var = (as0) this.b;
                i0.b g10 = l1Var.a.g(519);
                as0Var.r = g10;
                as0Var.d.setPadding(g10.a, g10.b, g10.c, g10.d);
                as0Var.c.requestLayout();
                break;
            default:
                i81 i81Var = (i81) this.b;
                i0.b g11 = l1Var.a.g(519);
                i81Var.n = g11;
                i81Var.c.setPadding(g11.a, g11.b, g11.c, g11.d);
                i81Var.b.requestLayout();
                break;
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.qo0
    public void Q() {
        ((StickersActivity) this.b).o0();
    }

    @Override // org.telegram.ui.Components.j61
    public void a(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        lp0 lp0Var = secretMediaViewer.E;
        if (lp0Var != null) {
            long U = lp0Var.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.E.q0((long) (f10 * U), false);
            }
            secretMediaViewer.E.h0();
        }
    }

    @Override // org.telegram.ui.Components.qm0
    public void finish() {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            ((u91) this.b).w0.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.j61
    public void g(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        lp0 lp0Var = secretMediaViewer.E;
        if (lp0Var != null) {
            lp0Var.g0();
            long U = secretMediaViewer.E.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.E.q0((long) (f10 * U), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.an0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                return String.valueOf(Math.round((((x51) this.b).a.getProgress() * r0.b) + 0));
            default:
                h61 h61Var = (h61) this.b;
                return String.valueOf(Math.round((h61Var.b.getProgress() * (h61Var.e - r1)) + h61Var.d));
        }
    }

    @Override // org.telegram.ui.Components.an0
    public void n(boolean z10, float f10) {
        switch (this.a) {
            case 3:
                ThemeActivity.d0(((x51) this.b).e, Math.round((r4.b * f10) + 0), false);
                break;
            default:
                h61 h61Var = (h61) this.b;
                ThemeActivity.p0(h61Var.r, Math.round(((h61Var.e - r1) * f10) + h61Var.d));
                break;
        }
    }

    @Override // org.telegram.ui.Components.qm0
    public void o(float f10) {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            ((u91) this.b).w0.movePreviewFragment(f10);
        }
    }

    @Override // org.telegram.ui.Components.an0
    public int r0() {
        switch (this.a) {
            case 3:
                return ((x51) this.b).b;
            default:
                h61 h61Var = (h61) this.b;
                return h61Var.e - h61Var.d;
        }
    }

    private final void b() {
    }

    private final void c() {
    }
}
