package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class w30 extends org.telegram.ui.Components.voip.l0 {
    public final /* synthetic */ d60 N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w30(d60 d60Var, LaunchActivity launchActivity, k50 k50Var, s30 s30Var, ArrayList arrayList, ChatObject.Call call, d60 d60Var2) {
        super(launchActivity, k50Var, s30Var, arrayList, call, d60Var2);
        this.N0 = d60Var;
    }

    @Override // org.telegram.ui.Components.voip.l0, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.N0.W2) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.voip.l0
    public final void i(boolean z4) {
        d60 d60Var = this.N0;
        b60 b60Var = d60Var.y1;
        a50 a50Var = d60Var.L;
        k50 k50Var = d60Var.N;
        org.telegram.ui.Components.u20 u20Var = d60Var.m2;
        w30 w30Var = d60Var.X1;
        s30 s30Var = d60Var.j2;
        d60Var.p0 = z4;
        if (d60.D3) {
            if (z4 || !w30Var.b) {
                return;
            }
            d60Var.l2.H(d60Var.k2, false, true);
            return;
        }
        if (z4) {
            d60Var.g0[0].e(1, false);
            w30Var.H0[0].e(2, false);
            if (!w30Var.b) {
                k50Var.setVisibility(0);
                a50Var.setVisibility(0);
                if (b60Var != null) {
                    b60Var.setVisibility(0);
                }
            }
            d60Var.N1(true, false);
            d60Var.e.requestLayout();
            if (s30Var.getVisibility() != 0) {
                s30Var.setVisibility(0);
                u20Var.F(s30Var, true);
                u20Var.G(s30Var, false);
            } else {
                u20Var.F(s30Var, true);
                d60Var.O0(true);
            }
        } else {
            if (w30Var.b) {
                a50Var.setVisibility(8);
                k50Var.setVisibility(8);
                if (b60Var != null) {
                    b60Var.setVisibility(8);
                }
            } else {
                s30Var.setVisibility(8);
                u20Var.F(s30Var, false);
            }
            if (s30Var.getVisibility() == 0) {
                for (int i10 = 0; i10 < s30Var.getChildCount(); i10++) {
                    View childAt = s30Var.getChildAt(i10);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.t20) childAt).setProgressToFullscreen(w30Var.c);
                }
            }
        }
        d60Var.H2.setVisibility(z4 ? 0 : 8);
        if (d60Var.p0) {
            return;
        }
        d60Var.O0(true);
    }

    @Override // org.telegram.ui.Components.voip.l0
    public final void l() {
        ViewGroup viewGroup;
        invalidate();
        d60 d60Var = this.N0;
        float f10 = d60Var.R1;
        w30 w30Var = d60Var.X1;
        ((org.telegram.ui.ActionBar.h3) d60Var).navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.jg, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.gg, false), Math.max(f10, w30Var == null ? 0.0f : w30Var.c), 1.0f);
        viewGroup = ((org.telegram.ui.ActionBar.h3) d60Var).containerView;
        viewGroup.invalidate();
        d60Var.B1(d60Var.R1);
    }
}
