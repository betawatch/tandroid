package org.telegram.ui;

import android.graphics.Point;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ur0 implements r0.m, org.telegram.ui.Components.v51, org.telegram.ui.Components.fo0, org.telegram.ui.Components.pm0, org.telegram.ui.Components.fm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ur0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.fm0
    public void A(float f10) {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            ((q91) this.b).w0.movePreviewFragment(f10);
        }
    }

    @Override // org.telegram.ui.Components.pm0
    public void C() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.fm0
    public void D(org.telegram.ui.Cells.t2 t2Var) {
        u91 u91Var = ((q91) this.b).w0;
        HashSet hashSet = u91.r1;
        u91Var.Q0(t2Var);
    }

    @Override // r0.m
    public r0.k1 M0(View view, r0.k1 k1Var) {
        switch (this.a) {
            case 0:
                xr0 xr0Var = (xr0) this.b;
                i0.c g10 = k1Var.a.g(519);
                xr0Var.r = g10;
                xr0Var.d.setPadding(g10.a, g10.b, g10.c, g10.d);
                xr0Var.c.requestLayout();
                break;
            default:
                e81 e81Var = (e81) this.b;
                i0.c g11 = k1Var.a.g(519);
                e81Var.n = g11;
                e81Var.c.setPadding(g11.a, g11.b, g11.c, g11.d);
                e81Var.b.requestLayout();
                break;
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.fo0
    public void W() {
        ((StickersActivity) this.b).o0();
    }

    @Override // org.telegram.ui.Components.v51
    public void e(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        ip0 ip0Var = secretMediaViewer.E;
        if (ip0Var != null) {
            long U = ip0Var.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.E.q0((long) (f10 * U), false);
            }
            secretMediaViewer.E.h0();
        }
    }

    @Override // org.telegram.ui.Components.fm0
    public void finish() {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            ((q91) this.b).w0.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.v51
    public void g(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        ip0 ip0Var = secretMediaViewer.E;
        if (ip0Var != null) {
            ip0Var.g0();
            long U = secretMediaViewer.E.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.E.q0((long) (f10 * U), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.pm0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                return String.valueOf(Math.round((((t51) this.b).a.getProgress() * r0.b) + 0));
            default:
                d61 d61Var = (d61) this.b;
                return String.valueOf(Math.round((d61Var.b.getProgress() * (d61Var.e - r1)) + d61Var.d));
        }
    }

    @Override // org.telegram.ui.Components.pm0
    public void l(boolean z10, float f10) {
        switch (this.a) {
            case 3:
                ThemeActivity.d0(((t51) this.b).e, Math.round((r4.b * f10) + 0), false);
                break;
            default:
                d61 d61Var = (d61) this.b;
                ThemeActivity.p0(d61Var.r, Math.round(((d61Var.e - r1) * f10) + d61Var.d));
                break;
        }
    }

    @Override // org.telegram.ui.Components.pm0
    public int p0() {
        switch (this.a) {
            case 3:
                return ((t51) this.b).b;
            default:
                d61 d61Var = (d61) this.b;
                return d61Var.e - d61Var.d;
        }
    }

    @Override // org.telegram.ui.Components.fo0
    public void x0() {
        ((StickersActivity) this.b).o0();
    }

    private final void a() {
    }

    private final void b() {
    }
}
