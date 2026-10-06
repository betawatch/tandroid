package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class sh1 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.voip.u1, r0.n, org.telegram.ui.Components.voip.j3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ki1 b;

    public /* synthetic */ sh1(ki1 ki1Var, int i10) {
        this.a = i10;
        this.b = ki1Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        ki1 ki1Var = this.b;
        ki1Var.r0 = g10;
        ((FrameLayout.LayoutParams) ki1Var.j0.getLayoutParams()).bottomMargin = ki1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ki1Var.e0.getLayoutParams()).bottomMargin = ki1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ki1Var.H.getLayoutParams()).topMargin = ki1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ki1Var.I.getLayoutParams()).topMargin = ki1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ki1Var.K.getLayoutParams()).topMargin = ki1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) ki1Var.X.getLayoutParams()).topMargin = ki1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) ki1Var.N.getLayoutParams()).topMargin = ki1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) ki1Var.y.getLayoutParams()).topMargin = ki1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) ki1Var.O.getLayoutParams()).topMargin = ki1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ki1Var.R.getLayoutParams()).topMargin = ki1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) ki1Var.Q.getLayoutParams()).topMargin = ki1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) ki1Var.Z.getLayoutParams()).bottomMargin = ki1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ki1Var.M0.getLayoutParams()).bottomMargin = ki1Var.r0.getSystemWindowInsetBottom();
        ki1Var.Y.setInsets(ki1Var.r0);
        ki1Var.Z.setInsets(ki1Var.r0);
        ki1Var.s.requestLayout();
        di1 di1Var = ki1Var.o0;
        if (di1Var != null) {
            di1Var.setBottomPadding(ki1Var.r0.getSystemWindowInsetBottom());
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.voip.j3
    public void f(org.telegram.ui.Components.voip.k3 k3Var) {
        switch (this.a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    ki1 ki1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(ki1Var.S0);
                    ki1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (ki1Var.w0.isTouchExplorationEnabled()) {
                        k3Var.announceForAccessibility(LocaleController.getString(!isMicMute ? R.string.AccDescrVoipMicOff : R.string.AccDescrVoipMicOn));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    ki1Var.q0 = ki1Var.p0;
                    ki1Var.H();
                    break;
                }
                break;
            default:
                ki1.i(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                ci1 ci1Var = this.b.u0;
                if (ci1Var != null) {
                    ci1Var.b();
                    break;
                }
                break;
            default:
                this.b.u0.b();
                break;
        }
    }
}
