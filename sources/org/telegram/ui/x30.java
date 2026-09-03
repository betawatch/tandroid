package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class x30 extends org.telegram.ui.Components.voip.k0 {
    public final /* synthetic */ e60 N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x30(e60 e60Var, LaunchActivity launchActivity, l50 l50Var, t30 t30Var, ArrayList arrayList, ChatObject.Call call, e60 e60Var2) {
        super(launchActivity, l50Var, t30Var, arrayList, call, e60Var2);
        this.N0 = e60Var;
    }

    @Override // org.telegram.ui.Components.voip.k0, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.N0.W2) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.voip.k0
    public final void i(boolean z4) {
        e60 e60Var = this.N0;
        c60 c60Var = e60Var.y1;
        b50 b50Var = e60Var.L;
        l50 l50Var = e60Var.N;
        org.telegram.ui.Components.u20 u20Var = e60Var.m2;
        x30 x30Var = e60Var.X1;
        t30 t30Var = e60Var.j2;
        e60Var.p0 = z4;
        if (e60.D3) {
            if (z4 || !x30Var.b) {
                return;
            }
            e60Var.l2.H(e60Var.k2, false, true);
            return;
        }
        if (z4) {
            e60Var.g0[0].e(1, false);
            x30Var.H0[0].e(2, false);
            if (!x30Var.b) {
                l50Var.setVisibility(0);
                b50Var.setVisibility(0);
                if (c60Var != null) {
                    c60Var.setVisibility(0);
                }
            }
            e60Var.N1(true, false);
            e60Var.e.requestLayout();
            if (t30Var.getVisibility() != 0) {
                t30Var.setVisibility(0);
                u20Var.F(t30Var, true);
                u20Var.G(t30Var, false);
            } else {
                u20Var.F(t30Var, true);
                e60Var.O0(true);
            }
        } else {
            if (x30Var.b) {
                b50Var.setVisibility(8);
                l50Var.setVisibility(8);
                if (c60Var != null) {
                    c60Var.setVisibility(8);
                }
            } else {
                t30Var.setVisibility(8);
                u20Var.F(t30Var, false);
            }
            if (t30Var.getVisibility() == 0) {
                for (int i10 = 0; i10 < t30Var.getChildCount(); i10++) {
                    View childAt = t30Var.getChildAt(i10);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.t20) childAt).setProgressToFullscreen(x30Var.c);
                }
            }
        }
        e60Var.H2.setVisibility(z4 ? 0 : 8);
        if (e60Var.p0) {
            return;
        }
        e60Var.O0(true);
    }

    @Override // org.telegram.ui.Components.voip.k0
    public final void l() {
        ViewGroup viewGroup;
        invalidate();
        e60 e60Var = this.N0;
        float f10 = e60Var.R1;
        x30 x30Var = e60Var.X1;
        ((org.telegram.ui.ActionBar.g3) e60Var).navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.jg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gg, false), Math.max(f10, x30Var == null ? 0.0f : x30Var.c), 1.0f);
        viewGroup = ((org.telegram.ui.ActionBar.g3) e60Var).containerView;
        viewGroup.invalidate();
        e60Var.B1(e60Var.R1);
    }
}
