package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class z10 extends org.telegram.ui.Components.voip.k0 {
    public final /* synthetic */ c40 Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z10(c40 c40Var, LaunchActivity launchActivity, k30 k30Var, v10 v10Var, ArrayList arrayList, org.telegram.messenger.r3 r3Var, c40 c40Var2) {
        super(launchActivity, k30Var, v10Var, arrayList, r3Var, c40Var2);
        this.Q0 = c40Var;
    }

    @Override // org.telegram.ui.Components.voip.k0, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.Q0.Q4) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.Components.voip.k0
    public final void i(boolean z9) {
        c40 c40Var = this.Q0;
        a40 a40Var = c40Var.s3;
        z20 z20Var = c40Var.F1;
        k30 k30Var = c40Var.H1;
        org.telegram.ui.Components.i10 i10Var = c40Var.g4;
        z10 z10Var = c40Var.R3;
        v10 v10Var = c40Var.d4;
        c40Var.j2 = z9;
        if (c40.x5) {
            if (z9 || !z10Var.b) {
                return;
            }
            c40Var.f4.H(c40Var.e4, false, true);
            return;
        }
        if (z9) {
            c40Var.a2[0].d(1, false);
            z10Var.K0[0].d(2, false);
            if (!z10Var.b) {
                k30Var.setVisibility(0);
                z20Var.setVisibility(0);
                if (a40Var != null) {
                    a40Var.setVisibility(0);
                }
            }
            c40Var.T1(true, false);
            c40Var.l1.requestLayout();
            if (v10Var.getVisibility() != 0) {
                v10Var.setVisibility(0);
                i10Var.F(v10Var, true);
                i10Var.G(v10Var, false);
            } else {
                i10Var.F(v10Var, true);
                c40Var.Q0(true);
            }
        } else {
            if (z10Var.b) {
                z20Var.setVisibility(8);
                k30Var.setVisibility(8);
                if (a40Var != null) {
                    a40Var.setVisibility(8);
                }
            } else {
                v10Var.setVisibility(8);
                i10Var.F(v10Var, false);
            }
            if (v10Var.getVisibility() == 0) {
                for (int i7 = 0; i7 < v10Var.getChildCount(); i7++) {
                    View childAt = v10Var.getChildAt(i7);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.h10) childAt).setProgressToFullscreen(z10Var.c);
                }
            }
        }
        c40Var.B4.setVisibility(z9 ? 0 : 8);
        if (c40Var.j2) {
            return;
        }
        c40Var.Q0(true);
    }

    @Override // org.telegram.ui.Components.voip.k0
    public final void l() {
        invalidate();
        c40 c40Var = this.Q0;
        float f10 = c40Var.L3;
        z10 z10Var = c40Var.R3;
        c40Var.G0 = org.telegram.messenger.g0.S0(Math.max(f10, z10Var == null ? 0.0f : z10Var.c), 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Xg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ug, false));
        c40Var.b.invalidate();
        c40Var.G1(c40Var.L3);
    }
}
