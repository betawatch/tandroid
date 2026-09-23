package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class x30 extends org.telegram.ui.Components.voip.m0 {
    public final /* synthetic */ f60 Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x30(f60 f60Var, LaunchActivity launchActivity, l50 l50Var, t30 t30Var, ArrayList arrayList, ChatObject.Call call, f60 f60Var2) {
        super(launchActivity, l50Var, t30Var, arrayList, call, f60Var2);
        this.Q0 = f60Var;
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
        f60 f60Var = this.Q0;
        d60 d60Var = f60Var.B1;
        b50 b50Var = f60Var.O;
        l50 l50Var = f60Var.Q;
        org.telegram.ui.Components.t20 t20Var = f60Var.p2;
        x30 x30Var = f60Var.a2;
        t30 t30Var = f60Var.m2;
        f60Var.s0 = z10;
        if (f60.G3) {
            if (z10 || !x30Var.b) {
                return;
            }
            f60Var.o2.H(f60Var.n2, false, true);
            return;
        }
        if (z10) {
            f60Var.j0[0].e(1, false);
            x30Var.K0[0].e(2, false);
            if (!x30Var.b) {
                l50Var.setVisibility(0);
                b50Var.setVisibility(0);
                if (d60Var != null) {
                    d60Var.setVisibility(0);
                }
            }
            f60Var.N1(true, false);
            f60Var.e.requestLayout();
            if (t30Var.getVisibility() != 0) {
                t30Var.setVisibility(0);
                t20Var.F(t30Var, true);
                t20Var.G(t30Var, false);
            } else {
                t20Var.F(t30Var, true);
                f60Var.O0(true);
            }
        } else {
            if (x30Var.b) {
                b50Var.setVisibility(8);
                l50Var.setVisibility(8);
                if (d60Var != null) {
                    d60Var.setVisibility(8);
                }
            } else {
                t30Var.setVisibility(8);
                t20Var.F(t30Var, false);
            }
            if (t30Var.getVisibility() == 0) {
                for (int i10 = 0; i10 < t30Var.getChildCount(); i10++) {
                    View childAt = t30Var.getChildAt(i10);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.s20) childAt).setProgressToFullscreen(x30Var.c);
                }
            }
        }
        f60Var.K2.setVisibility(z10 ? 0 : 8);
        if (f60Var.s0) {
            return;
        }
        f60Var.O0(true);
    }

    @Override // org.telegram.ui.Components.voip.m0
    public final void l() {
        ViewGroup viewGroup;
        invalidate();
        f60 f60Var = this.Q0;
        float f7 = f60Var.U1;
        x30 x30Var = f60Var.a2;
        ((org.telegram.ui.ActionBar.f3) f60Var).navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.jg, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.gg, false), Math.max(f7, x30Var == null ? 0.0f : x30Var.c), 1.0f);
        viewGroup = ((org.telegram.ui.ActionBar.f3) f60Var).containerView;
        viewGroup.invalidate();
        f60Var.B1(f60Var.U1);
    }
}
