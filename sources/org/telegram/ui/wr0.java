package org.telegram.ui;

import android.graphics.Point;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class wr0 implements r0.m, org.telegram.ui.Components.k61, org.telegram.ui.Components.po0, org.telegram.ui.Components.zm0, org.telegram.ui.Components.pm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wr0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.po0
    public void K() {
        ((StickersActivity) this.b).o0();
    }

    @Override // org.telegram.ui.Components.zm0
    public int a0() {
        switch (this.a) {
            case 3:
                return ((v51) this.b).b;
            default:
                f61 f61Var = (f61) this.b;
                return f61Var.e - f61Var.d;
        }
    }

    @Override // org.telegram.ui.Components.k61
    public void e(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        kp0 kp0Var = secretMediaViewer.E;
        if (kp0Var != null) {
            long U = kp0Var.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.E.q0((long) (f10 * U), false);
            }
            secretMediaViewer.E.h0();
        }
    }

    @Override // org.telegram.ui.Components.pm0
    public void finish() {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            ((s91) this.b).w0.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.zm0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                return String.valueOf(Math.round((((v51) this.b).a.getProgress() * r0.b) + 0));
            default:
                f61 f61Var = (f61) this.b;
                return String.valueOf(Math.round((f61Var.b.getProgress() * (f61Var.e - r1)) + f61Var.d));
        }
    }

    @Override // org.telegram.ui.Components.k61
    public void h(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        kp0 kp0Var = secretMediaViewer.E;
        if (kp0Var != null) {
            kp0Var.g0();
            long U = secretMediaViewer.E.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.E.q0((long) (f10 * U), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.zm0
    public void j(boolean z10, float f10) {
        switch (this.a) {
            case 3:
                ThemeActivity.d0(((v51) this.b).e, Math.round((r4.b * f10) + 0), false);
                break;
            default:
                f61 f61Var = (f61) this.b;
                ThemeActivity.p0(f61Var.r, Math.round(((f61Var.e - r1) * f10) + f61Var.d));
                break;
        }
    }

    @Override // org.telegram.ui.Components.po0
    public void l0() {
        ((StickersActivity) this.b).o0();
    }

    @Override // r0.m
    public r0.l1 l1(View view, r0.l1 l1Var) {
        switch (this.a) {
            case 0:
                zr0 zr0Var = (zr0) this.b;
                i0.b g10 = l1Var.a.g(519);
                zr0Var.r = g10;
                zr0Var.d.setPadding(g10.a, g10.b, g10.c, g10.d);
                zr0Var.c.requestLayout();
                break;
            default:
                g81 g81Var = (g81) this.b;
                i0.b g11 = l1Var.a.g(519);
                g81Var.n = g11;
                g81Var.c.setPadding(g11.a, g11.b, g11.c, g11.d);
                g81Var.b.requestLayout();
                break;
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.pm0
    public void v(float f10) {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            ((s91) this.b).w0.movePreviewFragment(f10);
        }
    }

    @Override // org.telegram.ui.Components.zm0
    public void w() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.pm0
    public void y(org.telegram.ui.Cells.u2 u2Var) {
        w91 w91Var = ((s91) this.b).w0;
        HashSet hashSet = w91.s1;
        w91Var.Q0(u2Var);
    }

    private final void a() {
    }

    private final void b() {
    }
}
