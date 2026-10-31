package org.telegram.ui;

import android.graphics.Point;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z01 implements org.telegram.ui.Components.v61, org.telegram.ui.Components.ep0, org.telegram.ui.Components.mn0, r0.m, org.telegram.ui.Components.cn0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z01(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.ep0
    public void B0() {
        ((StickersActivity) this.b).n0();
    }

    @Override // org.telegram.ui.Components.mn0
    public void C() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.cn0
    public void L(org.telegram.ui.Cells.v2 v2Var) {
        pb1 pb1Var = ((lb1) this.b).v0;
        HashSet hashSet = pb1.q1;
        pb1Var.P0(v2Var);
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        x91 x91Var = (x91) this.b;
        i0.c g10 = j1Var.a.g(519);
        x91Var.n = g10;
        x91Var.c.setPadding(g10.a, g10.b, g10.c, g10.d);
        x91Var.b.requestLayout();
        return r0.j1.b;
    }

    @Override // org.telegram.ui.Components.ep0
    public void V() {
        ((StickersActivity) this.b).n0();
    }

    @Override // org.telegram.ui.Components.cn0
    public void a(float f7) {
        Point point = org.telegram.messenger.i0.q;
        if (point.x > point.y) {
            ((lb1) this.b).v0.movePreviewFragment(f7);
        }
    }

    @Override // org.telegram.ui.Components.v61
    public void c(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        uq0 uq0Var = secretMediaViewer.D;
        if (uq0Var != null) {
            long U = uq0Var.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.D.q0((long) (f7 * U), false);
            }
            secretMediaViewer.D.h0();
        }
    }

    @Override // org.telegram.ui.Components.v61
    public void d(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        uq0 uq0Var = secretMediaViewer.D;
        if (uq0Var != null) {
            uq0Var.g0();
            long U = secretMediaViewer.D.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.D.q0((long) (f7 * U), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.cn0
    public void finish() {
        Point point = org.telegram.messenger.i0.q;
        if (point.x > point.y) {
            ((lb1) this.b).v0.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.mn0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 2:
                return String.valueOf(Math.round((((o71) this.b).a.getProgress() * r0.b) + 0));
            default:
                y71 y71Var = (y71) this.b;
                return String.valueOf(Math.round((y71Var.b.getProgress() * (y71Var.e - r1)) + y71Var.d));
        }
    }

    @Override // org.telegram.ui.Components.mn0
    public void k(boolean z10, float f7) {
        switch (this.a) {
            case 2:
                ThemeActivity.c0(((o71) this.b).e, Math.round((r4.b * f7) + 0), false);
                break;
            default:
                y71 y71Var = (y71) this.b;
                ThemeActivity.o0(y71Var.r, Math.round(((y71Var.e - r1) * f7) + y71Var.d));
                break;
        }
    }

    @Override // org.telegram.ui.Components.mn0
    public int p0() {
        switch (this.a) {
            case 2:
                return ((o71) this.b).b;
            default:
                y71 y71Var = (y71) this.b;
                return y71Var.e - y71Var.d;
        }
    }

    private final void b() {
    }

    private final void e() {
    }
}
