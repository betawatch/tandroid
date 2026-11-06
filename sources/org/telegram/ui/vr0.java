package org.telegram.ui;

import android.graphics.Point;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class vr0 implements r0.m, org.telegram.ui.Components.p51, org.telegram.ui.Components.co0, org.telegram.ui.Components.lm0, org.telegram.ui.Components.bm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vr0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.bm0
    public void A(float f10) {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            ((r91) this.b).v0.movePreviewFragment(f10);
        }
    }

    @Override // org.telegram.ui.Components.co0
    public void C0() {
        ((StickersActivity) this.b).o0();
    }

    @Override // org.telegram.ui.Components.lm0
    public void D() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.bm0
    public void O(org.telegram.ui.Cells.t2 t2Var) {
        v91 v91Var = ((r91) this.b).v0;
        HashSet hashSet = v91.q1;
        v91Var.Q0(t2Var);
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        switch (this.a) {
            case 0:
                yr0 yr0Var = (yr0) this.b;
                i0.b g10 = k1Var.a.g(519);
                yr0Var.r = g10;
                yr0Var.d.setPadding(g10.a, g10.b, g10.c, g10.d);
                yr0Var.c.requestLayout();
                break;
            default:
                f81 f81Var = (f81) this.b;
                i0.b g11 = k1Var.a.g(519);
                f81Var.n = g11;
                f81Var.c.setPadding(g11.a, g11.b, g11.c, g11.d);
                f81Var.b.requestLayout();
                break;
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.co0
    public void W() {
        ((StickersActivity) this.b).o0();
    }

    @Override // org.telegram.ui.Components.p51
    public void a(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        jp0 jp0Var = secretMediaViewer.D;
        if (jp0Var != null) {
            long U = jp0Var.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.D.q0((long) (f10 * U), false);
            }
            secretMediaViewer.D.h0();
        }
    }

    @Override // org.telegram.ui.Components.p51
    public void d(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        jp0 jp0Var = secretMediaViewer.D;
        if (jp0Var != null) {
            jp0Var.g0();
            long U = secretMediaViewer.D.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.D.q0((long) (f10 * U), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public void finish() {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            ((r91) this.b).v0.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.lm0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                return String.valueOf(Math.round((((w51) this.b).a.getProgress() * r0.b) + 0));
            default:
                g61 g61Var = (g61) this.b;
                return String.valueOf(Math.round((g61Var.b.getProgress() * (g61Var.e - r1)) + g61Var.d));
        }
    }

    @Override // org.telegram.ui.Components.lm0
    public void l(boolean z9, float f10) {
        switch (this.a) {
            case 3:
                ThemeActivity.d0(((w51) this.b).e, Math.round((r4.b * f10) + 0), false);
                break;
            default:
                g61 g61Var = (g61) this.b;
                ThemeActivity.p0(g61Var.r, Math.round(((g61Var.e - r1) * f10) + g61Var.d));
                break;
        }
    }

    @Override // org.telegram.ui.Components.lm0
    public int q0() {
        switch (this.a) {
            case 3:
                return ((w51) this.b).b;
            default:
                g61 g61Var = (g61) this.b;
                return g61Var.e - g61Var.d;
        }
    }

    private final void b() {
    }

    private final void c() {
    }
}
