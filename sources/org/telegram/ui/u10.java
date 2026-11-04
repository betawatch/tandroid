package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u10 extends org.telegram.ui.Components.voip.x {
    public final /* synthetic */ x30 R0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u10(x30 x30Var, LaunchActivity launchActivity, f30 f30Var, q10 q10Var, ArrayList arrayList, org.telegram.messenger.r3 r3Var, x30 x30Var2) {
        super(launchActivity, f30Var, q10Var, arrayList, r3Var, x30Var2);
        this.R0 = x30Var;
    }

    @Override // org.telegram.ui.Components.voip.x, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.R0.R4) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.voip.x
    public final void i(boolean z10) {
        x30 x30Var = this.R0;
        v30 v30Var = x30Var.t3;
        u20 u20Var = x30Var.G1;
        f30 f30Var = x30Var.I1;
        org.telegram.ui.Components.e10 e10Var = x30Var.h4;
        u10 u10Var = x30Var.S3;
        q10 q10Var = x30Var.e4;
        x30Var.k2 = z10;
        if (x30.y5) {
            if (z10 || !u10Var.b) {
                return;
            }
            x30Var.g4.H(x30Var.f4, false, true);
            return;
        }
        if (z10) {
            x30Var.b2[0].d(1, false);
            u10Var.L0[0].d(2, false);
            if (!u10Var.b) {
                f30Var.setVisibility(0);
                u20Var.setVisibility(0);
                if (v30Var != null) {
                    v30Var.setVisibility(0);
                }
            }
            x30Var.Q1(true, false);
            x30Var.m1.requestLayout();
            if (q10Var.getVisibility() != 0) {
                q10Var.setVisibility(0);
                e10Var.F(q10Var, true);
                e10Var.G(q10Var, false);
            } else {
                e10Var.F(q10Var, true);
                x30Var.Q0(true);
            }
        } else {
            if (u10Var.b) {
                u20Var.setVisibility(8);
                f30Var.setVisibility(8);
                if (v30Var != null) {
                    v30Var.setVisibility(8);
                }
            } else {
                q10Var.setVisibility(8);
                e10Var.F(q10Var, false);
            }
            if (q10Var.getVisibility() == 0) {
                for (int i3 = 0; i3 < q10Var.getChildCount(); i3++) {
                    View childAt = q10Var.getChildAt(i3);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.d10) childAt).setProgressToFullscreen(u10Var.c);
                }
            }
        }
        x30Var.C4.setVisibility(z10 ? 0 : 8);
        if (x30Var.k2) {
            return;
        }
        x30Var.Q0(true);
    }

    @Override // org.telegram.ui.Components.voip.x
    public final void l() {
        invalidate();
        x30 x30Var = this.R0;
        float f10 = x30Var.M3;
        u10 u10Var = x30Var.S3;
        x30Var.H0 = org.telegram.messenger.g0.S0(Math.max(f10, u10Var == null ? 0.0f : u10Var.c), 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Xg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ug, false));
        x30Var.b.invalidate();
        x30Var.D1(x30Var.M3);
    }
}
