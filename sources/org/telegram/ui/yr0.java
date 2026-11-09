package org.telegram.ui;

import android.graphics.Point;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class yr0 implements r0.m, org.telegram.ui.Components.v51, org.telegram.ui.Components.do0, org.telegram.ui.Components.mm0, org.telegram.ui.Components.cm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yr0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.cm0
    public void A(float f10) {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            ((u91) this.b).v0.movePreviewFragment(f10);
        }
    }

    @Override // org.telegram.ui.Components.do0
    public void C0() {
        ((StickersActivity) this.b).o0();
    }

    @Override // org.telegram.ui.Components.mm0
    public void D() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.cm0
    public void O(org.telegram.ui.Cells.t2 t2Var) {
        y91 y91Var = ((u91) this.b).v0;
        HashSet hashSet = y91.q1;
        y91Var.Q0(t2Var);
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        switch (this.a) {
            case 0:
                bs0 bs0Var = (bs0) this.b;
                i0.b g10 = k1Var.a.g(519);
                bs0Var.r = g10;
                bs0Var.d.setPadding(g10.a, g10.b, g10.c, g10.d);
                bs0Var.c.requestLayout();
                break;
            default:
                h81 h81Var = (h81) this.b;
                i0.b g11 = k1Var.a.g(519);
                h81Var.n = g11;
                h81Var.c.setPadding(g11.a, g11.b, g11.c, g11.d);
                h81Var.b.requestLayout();
                break;
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.do0
    public void W() {
        ((StickersActivity) this.b).o0();
    }

    @Override // org.telegram.ui.Components.v51
    public void a(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        mp0 mp0Var = secretMediaViewer.D;
        if (mp0Var != null) {
            long U = mp0Var.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.D.q0((long) (f10 * U), false);
            }
            secretMediaViewer.D.h0();
        }
    }

    @Override // org.telegram.ui.Components.v51
    public void d(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        mp0 mp0Var = secretMediaViewer.D;
        if (mp0Var != null) {
            mp0Var.g0();
            long U = secretMediaViewer.D.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.D.q0((long) (f10 * U), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.cm0
    public void finish() {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            ((u91) this.b).v0.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.mm0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                return String.valueOf(Math.round((((x51) this.b).a.getProgress() * r0.b) + 0));
            default:
                h61 h61Var = (h61) this.b;
                return String.valueOf(Math.round((h61Var.b.getProgress() * (h61Var.e - r1)) + h61Var.d));
        }
    }

    @Override // org.telegram.ui.Components.mm0
    public void l(boolean z9, float f10) {
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

    @Override // org.telegram.ui.Components.mm0
    public int q0() {
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
