package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rg1 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.voip.r1, r0.n, org.telegram.ui.Components.voip.g3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jh1 b;

    public /* synthetic */ rg1(jh1 jh1Var, int i10) {
        this.a = i10;
        this.b = jh1Var;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        jh1 jh1Var = this.b;
        jh1Var.r0 = g10;
        ((FrameLayout.LayoutParams) jh1Var.j0.getLayoutParams()).bottomMargin = jh1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) jh1Var.e0.getLayoutParams()).bottomMargin = jh1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) jh1Var.H.getLayoutParams()).topMargin = jh1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) jh1Var.I.getLayoutParams()).topMargin = jh1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) jh1Var.K.getLayoutParams()).topMargin = jh1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) jh1Var.X.getLayoutParams()).topMargin = jh1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) jh1Var.N.getLayoutParams()).topMargin = jh1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) jh1Var.y.getLayoutParams()).topMargin = jh1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) jh1Var.O.getLayoutParams()).topMargin = jh1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) jh1Var.R.getLayoutParams()).topMargin = jh1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) jh1Var.Q.getLayoutParams()).topMargin = jh1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) jh1Var.Z.getLayoutParams()).bottomMargin = jh1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) jh1Var.M0.getLayoutParams()).bottomMargin = jh1Var.r0.getSystemWindowInsetBottom();
        jh1Var.Y.setInsets(jh1Var.r0);
        jh1Var.Z.setInsets(jh1Var.r0);
        jh1Var.s.requestLayout();
        ch1 ch1Var = jh1Var.o0;
        if (ch1Var != null) {
            ch1Var.setBottomPadding(jh1Var.r0.getSystemWindowInsetBottom());
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.voip.g3
    public void c(org.telegram.ui.Components.voip.h3 h3Var) {
        switch (this.a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    jh1 jh1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(jh1Var.S0);
                    jh1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (jh1Var.w0.isTouchExplorationEnabled()) {
                        h3Var.announceForAccessibility(LocaleController.getString(!isMicMute ? R.string.AccDescrVoipMicOff : R.string.AccDescrVoipMicOn));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    jh1Var.q0 = jh1Var.p0;
                    jh1Var.G();
                    break;
                }
                break;
            default:
                jh1 jh1Var2 = this.b;
                AndroidUtilities.cancelRunOnUIThread(jh1Var2.S0);
                jh1Var2.R0 = false;
                if (jh1Var2.b.checkSelfPermission("android.permission.CAMERA") == 0) {
                    jh1Var2.B();
                    break;
                } else {
                    jh1Var2.b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                bh1 bh1Var = this.b.u0;
                if (bh1Var != null) {
                    bh1Var.b();
                    break;
                }
                break;
            default:
                this.b.u0.b();
                break;
        }
    }
}
