package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class v30 extends org.telegram.ui.Components.voip.m0 {
    public final /* synthetic */ d60 Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v30(d60 d60Var, LaunchActivity launchActivity, j50 j50Var, r30 r30Var, ArrayList arrayList, ChatObject.Call call, d60 d60Var2) {
        super(launchActivity, j50Var, r30Var, arrayList, call, d60Var2);
        this.Q0 = d60Var;
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
        d60 d60Var = this.Q0;
        b60 b60Var = d60Var.B1;
        z40 z40Var = d60Var.O;
        j50 j50Var = d60Var.Q;
        org.telegram.ui.Components.t20 t20Var = d60Var.p2;
        v30 v30Var = d60Var.a2;
        r30 r30Var = d60Var.m2;
        d60Var.s0 = z10;
        if (d60.G3) {
            if (z10 || !v30Var.b) {
                return;
            }
            d60Var.o2.H(d60Var.n2, false, true);
            return;
        }
        if (z10) {
            d60Var.j0[0].e(1, false);
            v30Var.K0[0].e(2, false);
            if (!v30Var.b) {
                j50Var.setVisibility(0);
                z40Var.setVisibility(0);
                if (b60Var != null) {
                    b60Var.setVisibility(0);
                }
            }
            d60Var.N1(true, false);
            d60Var.e.requestLayout();
            if (r30Var.getVisibility() != 0) {
                r30Var.setVisibility(0);
                t20Var.F(r30Var, true);
                t20Var.G(r30Var, false);
            } else {
                t20Var.F(r30Var, true);
                d60Var.O0(true);
            }
        } else {
            if (v30Var.b) {
                z40Var.setVisibility(8);
                j50Var.setVisibility(8);
                if (b60Var != null) {
                    b60Var.setVisibility(8);
                }
            } else {
                r30Var.setVisibility(8);
                t20Var.F(r30Var, false);
            }
            if (r30Var.getVisibility() == 0) {
                for (int i10 = 0; i10 < r30Var.getChildCount(); i10++) {
                    View childAt = r30Var.getChildAt(i10);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.s20) childAt).setProgressToFullscreen(v30Var.c);
                }
            }
        }
        d60Var.K2.setVisibility(z10 ? 0 : 8);
        if (d60Var.s0) {
            return;
        }
        d60Var.O0(true);
    }

    @Override // org.telegram.ui.Components.voip.m0
    public final void l() {
        ViewGroup viewGroup;
        invalidate();
        d60 d60Var = this.Q0;
        float f7 = d60Var.U1;
        v30 v30Var = d60Var.a2;
        ((org.telegram.ui.ActionBar.e3) d60Var).navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.jg, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.gg, false), Math.max(f7, v30Var == null ? 0.0f : v30Var.c), 1.0f);
        viewGroup = ((org.telegram.ui.ActionBar.e3) d60Var).containerView;
        viewGroup.invalidate();
        d60Var.B1(d60Var.U1);
    }
}
