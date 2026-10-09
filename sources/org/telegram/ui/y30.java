package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class y30 extends org.telegram.ui.Components.voip.m0 {
    public final /* synthetic */ g60 Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y30(g60 g60Var, LaunchActivity launchActivity, m50 m50Var, u30 u30Var, ArrayList arrayList, ChatObject.Call call, g60 g60Var2) {
        super(launchActivity, m50Var, u30Var, arrayList, call, g60Var2);
        this.Q0 = g60Var;
    }

    @Override // org.telegram.ui.Components.voip.m0, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.Q0.Z2) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.Components.voip.m0
    public final void i(boolean z10) {
        g60 g60Var = this.Q0;
        e60 e60Var = g60Var.B1;
        c50 c50Var = g60Var.O;
        m50 m50Var = g60Var.Q;
        org.telegram.ui.Components.j30 j30Var = g60Var.p2;
        y30 y30Var = g60Var.a2;
        u30 u30Var = g60Var.m2;
        g60Var.s0 = z10;
        if (g60.G3) {
            if (z10 || !y30Var.b) {
                return;
            }
            g60Var.o2.H(g60Var.n2, false, true);
            return;
        }
        if (z10) {
            g60Var.j0[0].e(1, false);
            y30Var.K0[0].e(2, false);
            if (!y30Var.b) {
                m50Var.setVisibility(0);
                c50Var.setVisibility(0);
                if (e60Var != null) {
                    e60Var.setVisibility(0);
                }
            }
            g60Var.O1(true, false);
            g60Var.e.requestLayout();
            if (u30Var.getVisibility() != 0) {
                u30Var.setVisibility(0);
                j30Var.F(u30Var, true);
                j30Var.G(u30Var, false);
            } else {
                j30Var.F(u30Var, true);
                g60Var.P0(true);
            }
        } else {
            if (y30Var.b) {
                c50Var.setVisibility(8);
                m50Var.setVisibility(8);
                if (e60Var != null) {
                    e60Var.setVisibility(8);
                }
            } else {
                u30Var.setVisibility(8);
                j30Var.F(u30Var, false);
            }
            if (u30Var.getVisibility() == 0) {
                for (int i10 = 0; i10 < u30Var.getChildCount(); i10++) {
                    View childAt = u30Var.getChildAt(i10);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.i30) childAt).setProgressToFullscreen(y30Var.c);
                }
            }
        }
        g60Var.K2.setVisibility(z10 ? 0 : 8);
        if (g60Var.s0) {
            return;
        }
        g60Var.P0(true);
    }

    @Override // org.telegram.ui.Components.voip.m0
    public final void l() {
        ViewGroup viewGroup;
        invalidate();
        g60 g60Var = this.Q0;
        float f7 = g60Var.U1;
        y30 y30Var = g60Var.a2;
        ((org.telegram.ui.ActionBar.f3) g60Var).navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.jg, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.gg, false), Math.max(f7, y30Var == null ? 0.0f : y30Var.c), 1.0f);
        viewGroup = ((org.telegram.ui.ActionBar.f3) g60Var).containerView;
        viewGroup.invalidate();
        g60Var.C1(g60Var.U1);
    }
}
