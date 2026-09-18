package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zh1 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.voip.t1, r0.n, org.telegram.ui.Components.voip.i3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ si1 b;

    public /* synthetic */ zh1(si1 si1Var, int i10) {
        this.a = i10;
        this.b = si1Var;
    }

    @Override // r0.n
    public r0.m1 Q0(View view, r0.m1 m1Var) {
        WindowInsets g10 = m1Var.g();
        si1 si1Var = this.b;
        si1Var.r0 = g10;
        ((FrameLayout.LayoutParams) si1Var.j0.getLayoutParams()).bottomMargin = si1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) si1Var.e0.getLayoutParams()).bottomMargin = si1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) si1Var.H.getLayoutParams()).topMargin = si1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) si1Var.I.getLayoutParams()).topMargin = si1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) si1Var.K.getLayoutParams()).topMargin = si1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) si1Var.X.getLayoutParams()).topMargin = si1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) si1Var.N.getLayoutParams()).topMargin = si1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) si1Var.y.getLayoutParams()).topMargin = si1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) si1Var.O.getLayoutParams()).topMargin = si1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) si1Var.R.getLayoutParams()).topMargin = si1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) si1Var.Q.getLayoutParams()).topMargin = si1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) si1Var.Z.getLayoutParams()).bottomMargin = si1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) si1Var.M0.getLayoutParams()).bottomMargin = si1Var.r0.getSystemWindowInsetBottom();
        si1Var.Y.setInsets(si1Var.r0);
        si1Var.Z.setInsets(si1Var.r0);
        si1Var.s.requestLayout();
        li1 li1Var = si1Var.o0;
        if (li1Var != null) {
            li1Var.setBottomPadding(si1Var.r0.getSystemWindowInsetBottom());
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                ki1 ki1Var = this.b.u0;
                if (ki1Var != null) {
                    ki1Var.b();
                    break;
                }
                break;
            default:
                this.b.u0.b();
                break;
        }
    }

    @Override // org.telegram.ui.Components.voip.i3
    public void h(org.telegram.ui.Components.voip.j3 j3Var) {
        switch (this.a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    si1 si1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(si1Var.S0);
                    si1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (si1Var.w0.isTouchExplorationEnabled()) {
                        j3Var.announceForAccessibility(LocaleController.getString(!isMicMute ? R.string.AccDescrVoipMicOff : R.string.AccDescrVoipMicOn));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    si1Var.q0 = si1Var.p0;
                    si1Var.H();
                    break;
                }
                break;
            default:
                si1.i(this.b);
                break;
        }
    }
}
