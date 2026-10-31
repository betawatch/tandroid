package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y20 extends org.telegram.ui.Components.voip.w {
    public final /* synthetic */ b50 Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y20(b50 b50Var, LaunchActivity launchActivity, i40 i40Var, u20 u20Var, ArrayList arrayList, org.telegram.messenger.u3 u3Var, b50 b50Var2) {
        super(launchActivity, i40Var, u20Var, arrayList, u3Var, b50Var2);
        this.Q0 = b50Var;
    }

    @Override // org.telegram.ui.Components.voip.w, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.Q0.Q4) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.voip.w
    public final void i(boolean z10) {
        b50 b50Var = this.Q0;
        z40 z40Var = b50Var.s3;
        y30 y30Var = b50Var.F1;
        i40 i40Var = b50Var.H1;
        org.telegram.ui.Components.z10 z10Var = b50Var.g4;
        y20 y20Var = b50Var.R3;
        u20 u20Var = b50Var.d4;
        b50Var.j2 = z10;
        if (b50.x5) {
            if (z10 || !y20Var.b) {
                return;
            }
            b50Var.f4.H(b50Var.e4, false, true);
            return;
        }
        if (z10) {
            b50Var.a2[0].d(1, false);
            y20Var.K0[0].d(2, false);
            if (!y20Var.b) {
                i40Var.setVisibility(0);
                y30Var.setVisibility(0);
                if (z40Var != null) {
                    z40Var.setVisibility(0);
                }
            }
            b50Var.Q1(true, false);
            b50Var.l1.requestLayout();
            if (u20Var.getVisibility() != 0) {
                u20Var.setVisibility(0);
                z10Var.F(u20Var, true);
                z10Var.G(u20Var, false);
            } else {
                z10Var.F(u20Var, true);
                b50Var.Q0(true);
            }
        } else {
            if (y20Var.b) {
                y30Var.setVisibility(8);
                i40Var.setVisibility(8);
                if (z40Var != null) {
                    z40Var.setVisibility(8);
                }
            } else {
                u20Var.setVisibility(8);
                z10Var.F(u20Var, false);
            }
            if (u20Var.getVisibility() == 0) {
                for (int i10 = 0; i10 < u20Var.getChildCount(); i10++) {
                    View childAt = u20Var.getChildAt(i10);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.y10) childAt).setProgressToFullscreen(y20Var.c);
                }
            }
        }
        b50Var.B4.setVisibility(z10 ? 0 : 8);
        if (b50Var.j2) {
            return;
        }
        b50Var.Q0(true);
    }

    @Override // org.telegram.ui.Components.voip.w
    public final void l() {
        invalidate();
        b50 b50Var = this.Q0;
        float f7 = b50Var.L3;
        y20 y20Var = b50Var.R3;
        b50Var.G0 = org.telegram.messenger.i0.S0(Math.max(f7, y20Var == null ? 0.0f : y20Var.c), 1.0f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Xg, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ug, false));
        b50Var.b.invalidate();
        b50Var.D1(b50Var.L3);
    }
}
