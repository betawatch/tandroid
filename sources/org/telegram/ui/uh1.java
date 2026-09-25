package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uh1 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.voip.u1, r0.n, org.telegram.ui.Components.voip.j3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mi1 b;

    public /* synthetic */ uh1(mi1 mi1Var, int i10) {
        this.a = i10;
        this.b = mi1Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        mi1 mi1Var = this.b;
        mi1Var.r0 = g10;
        ((FrameLayout.LayoutParams) mi1Var.j0.getLayoutParams()).bottomMargin = mi1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) mi1Var.e0.getLayoutParams()).bottomMargin = mi1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) mi1Var.H.getLayoutParams()).topMargin = mi1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) mi1Var.I.getLayoutParams()).topMargin = mi1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) mi1Var.K.getLayoutParams()).topMargin = mi1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) mi1Var.X.getLayoutParams()).topMargin = mi1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) mi1Var.N.getLayoutParams()).topMargin = mi1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) mi1Var.y.getLayoutParams()).topMargin = mi1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) mi1Var.O.getLayoutParams()).topMargin = mi1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) mi1Var.R.getLayoutParams()).topMargin = mi1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) mi1Var.Q.getLayoutParams()).topMargin = mi1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) mi1Var.Z.getLayoutParams()).bottomMargin = mi1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) mi1Var.M0.getLayoutParams()).bottomMargin = mi1Var.r0.getSystemWindowInsetBottom();
        mi1Var.Y.setInsets(mi1Var.r0);
        mi1Var.Z.setInsets(mi1Var.r0);
        mi1Var.s.requestLayout();
        fi1 fi1Var = mi1Var.o0;
        if (fi1Var != null) {
            fi1Var.setBottomPadding(mi1Var.r0.getSystemWindowInsetBottom());
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                ei1 ei1Var = this.b.u0;
                if (ei1Var != null) {
                    ei1Var.b();
                    break;
                }
                break;
            default:
                this.b.u0.b();
                break;
        }
    }

    @Override // org.telegram.ui.Components.voip.j3
    public void h(org.telegram.ui.Components.voip.k3 k3Var) {
        switch (this.a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    mi1 mi1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(mi1Var.S0);
                    mi1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (mi1Var.w0.isTouchExplorationEnabled()) {
                        k3Var.announceForAccessibility(LocaleController.getString(!isMicMute ? R.string.AccDescrVoipMicOff : R.string.AccDescrVoipMicOn));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    mi1Var.q0 = mi1Var.p0;
                    mi1Var.H();
                    break;
                }
                break;
            default:
                mi1.i(this.b);
                break;
        }
    }
}
