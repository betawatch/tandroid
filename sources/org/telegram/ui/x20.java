package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class x20 extends org.telegram.ui.Components.voip.x {
    public final /* synthetic */ a50 Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x20(a50 a50Var, LaunchActivity launchActivity, h40 h40Var, t20 t20Var, ArrayList arrayList, org.telegram.messenger.u3 u3Var, a50 a50Var2) {
        super(launchActivity, h40Var, t20Var, arrayList, u3Var, a50Var2);
        this.Q0 = a50Var;
    }

    @Override // org.telegram.ui.Components.voip.x, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.Q0.Q4) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.voip.x
    public final void i(boolean z10) {
        a50 a50Var = this.Q0;
        y40 y40Var = a50Var.s3;
        x30 x30Var = a50Var.F1;
        h40 h40Var = a50Var.H1;
        org.telegram.ui.Components.z10 z10Var = a50Var.g4;
        x20 x20Var = a50Var.R3;
        t20 t20Var = a50Var.d4;
        a50Var.j2 = z10;
        if (a50.x5) {
            if (z10 || !x20Var.b) {
                return;
            }
            a50Var.f4.H(a50Var.e4, false, true);
            return;
        }
        if (z10) {
            a50Var.a2[0].d(1, false);
            x20Var.K0[0].d(2, false);
            if (!x20Var.b) {
                h40Var.setVisibility(0);
                x30Var.setVisibility(0);
                if (y40Var != null) {
                    y40Var.setVisibility(0);
                }
            }
            a50Var.Q1(true, false);
            a50Var.l1.requestLayout();
            if (t20Var.getVisibility() != 0) {
                t20Var.setVisibility(0);
                z10Var.F(t20Var, true);
                z10Var.G(t20Var, false);
            } else {
                z10Var.F(t20Var, true);
                a50Var.Q0(true);
            }
        } else {
            if (x20Var.b) {
                x30Var.setVisibility(8);
                h40Var.setVisibility(8);
                if (y40Var != null) {
                    y40Var.setVisibility(8);
                }
            } else {
                t20Var.setVisibility(8);
                z10Var.F(t20Var, false);
            }
            if (t20Var.getVisibility() == 0) {
                for (int i10 = 0; i10 < t20Var.getChildCount(); i10++) {
                    View childAt = t20Var.getChildAt(i10);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.y10) childAt).setProgressToFullscreen(x20Var.c);
                }
            }
        }
        a50Var.B4.setVisibility(z10 ? 0 : 8);
        if (a50Var.j2) {
            return;
        }
        a50Var.Q0(true);
    }

    @Override // org.telegram.ui.Components.voip.x
    public final void l() {
        invalidate();
        a50 a50Var = this.Q0;
        float f7 = a50Var.L3;
        x20 x20Var = a50Var.R3;
        a50Var.G0 = org.telegram.messenger.i0.S0(Math.max(f7, x20Var == null ? 0.0f : x20Var.c), 1.0f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Xg, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ug, false));
        a50Var.b.invalidate();
        a50Var.D1(a50Var.L3);
    }
}
