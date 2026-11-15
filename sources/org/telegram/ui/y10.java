package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class y10 extends org.telegram.ui.Components.voip.l0 {
    public final /* synthetic */ c40 R0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y10(c40 c40Var, LaunchActivity launchActivity, k30 k30Var, u10 u10Var, ArrayList arrayList, org.telegram.messenger.r3 r3Var, c40 c40Var2) {
        super(launchActivity, k30Var, u10Var, arrayList, r3Var, c40Var2);
        this.R0 = c40Var;
    }

    @Override // org.telegram.ui.Components.voip.l0, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.R0.Y4) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.Components.voip.l0
    public final void i(boolean z10) {
        c40 c40Var = this.R0;
        a40 a40Var = c40Var.A3;
        a30 a30Var = c40Var.J1;
        k30 k30Var = c40Var.L1;
        org.telegram.ui.Components.l10 l10Var = c40Var.o4;
        y10 y10Var = c40Var.Z3;
        u10 u10Var = c40Var.l4;
        c40Var.n2 = z10;
        if (c40.F5) {
            if (z10 || !y10Var.b) {
                return;
            }
            c40Var.n4.H(c40Var.m4, false, true);
            return;
        }
        if (z10) {
            c40Var.e2[0].d(1, false);
            y10Var.L0[0].d(2, false);
            if (!y10Var.b) {
                k30Var.setVisibility(0);
                a30Var.setVisibility(0);
                if (a40Var != null) {
                    a40Var.setVisibility(0);
                }
            }
            c40Var.V1(true, false);
            c40Var.p1.requestLayout();
            if (u10Var.getVisibility() != 0) {
                u10Var.setVisibility(0);
                l10Var.F(u10Var, true);
                l10Var.G(u10Var, false);
            } else {
                l10Var.F(u10Var, true);
                c40Var.Q0(true);
            }
        } else {
            if (y10Var.b) {
                a30Var.setVisibility(8);
                k30Var.setVisibility(8);
                if (a40Var != null) {
                    a40Var.setVisibility(8);
                }
            } else {
                u10Var.setVisibility(8);
                l10Var.F(u10Var, false);
            }
            if (u10Var.getVisibility() == 0) {
                for (int i7 = 0; i7 < u10Var.getChildCount(); i7++) {
                    View childAt = u10Var.getChildAt(i7);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.k10) childAt).setProgressToFullscreen(y10Var.c);
                }
            }
        }
        c40Var.J4.setVisibility(z10 ? 0 : 8);
        if (c40Var.n2) {
            return;
        }
        c40Var.Q0(true);
    }

    @Override // org.telegram.ui.Components.voip.l0
    public final void l() {
        invalidate();
        c40 c40Var = this.R0;
        float f10 = c40Var.T3;
        y10 y10Var = c40Var.Z3;
        c40Var.H0 = org.telegram.messenger.g0.S0(Math.max(f10, y10Var == null ? 0.0f : y10Var.c), 1.0f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.ah, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Xg, false));
        c40Var.b.invalidate();
        c40Var.G1(c40Var.T3);
    }
}
