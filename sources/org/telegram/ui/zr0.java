package org.telegram.ui;

import android.graphics.Point;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class zr0 implements r0.m, org.telegram.ui.Components.u51, org.telegram.ui.Components.co0, org.telegram.ui.Components.lm0, org.telegram.ui.Components.bm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zr0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.bm0
    public void A(float f10) {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            ((v91) this.b).v0.movePreviewFragment(f10);
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
        z91 z91Var = ((v91) this.b).v0;
        HashSet hashSet = z91.q1;
        z91Var.Q0(t2Var);
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        switch (this.a) {
            case 0:
                cs0 cs0Var = (cs0) this.b;
                i0.b g10 = k1Var.a.g(519);
                cs0Var.r = g10;
                cs0Var.d.setPadding(g10.a, g10.b, g10.c, g10.d);
                cs0Var.c.requestLayout();
                break;
            default:
                i81 i81Var = (i81) this.b;
                i0.b g11 = k1Var.a.g(519);
                i81Var.n = g11;
                i81Var.c.setPadding(g11.a, g11.b, g11.c, g11.d);
                i81Var.b.requestLayout();
                break;
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.co0
    public void W() {
        ((StickersActivity) this.b).o0();
    }

    @Override // org.telegram.ui.Components.u51
    public void a(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        np0 np0Var = secretMediaViewer.D;
        if (np0Var != null) {
            long U = np0Var.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.D.q0((long) (f10 * U), false);
            }
            secretMediaViewer.D.h0();
        }
    }

    @Override // org.telegram.ui.Components.u51
    public void d(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        np0 np0Var = secretMediaViewer.D;
        if (np0Var != null) {
            np0Var.g0();
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
            ((v91) this.b).v0.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.lm0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                return String.valueOf(Math.round((((y51) this.b).a.getProgress() * r0.b) + 0));
            default:
                i61 i61Var = (i61) this.b;
                return String.valueOf(Math.round((i61Var.b.getProgress() * (i61Var.e - r1)) + i61Var.d));
        }
    }

    @Override // org.telegram.ui.Components.lm0
    public void l(boolean z9, float f10) {
        switch (this.a) {
            case 3:
                ThemeActivity.d0(((y51) this.b).e, Math.round((r4.b * f10) + 0), false);
                break;
            default:
                i61 i61Var = (i61) this.b;
                ThemeActivity.p0(i61Var.r, Math.round(((i61Var.e - r1) * f10) + i61Var.d));
                break;
        }
    }

    @Override // org.telegram.ui.Components.lm0
    public int q0() {
        switch (this.a) {
            case 3:
                return ((y51) this.b).b;
            default:
                i61 i61Var = (i61) this.b;
                return i61Var.e - i61Var.d;
        }
    }

    private final void b() {
    }

    private final void c() {
    }
}
