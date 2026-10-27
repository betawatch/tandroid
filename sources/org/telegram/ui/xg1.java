package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xg1 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.voip.u1, r0.n, org.telegram.ui.Components.voip.j3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rh1 b;

    public /* synthetic */ xg1(rh1 rh1Var, int i10) {
        this.a = i10;
        this.b = rh1Var;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        WindowInsets g7 = k1Var.g();
        rh1 rh1Var = this.b;
        rh1Var.r0 = g7;
        ((FrameLayout.LayoutParams) rh1Var.j0.getLayoutParams()).bottomMargin = rh1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) rh1Var.e0.getLayoutParams()).bottomMargin = rh1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) rh1Var.H.getLayoutParams()).topMargin = rh1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) rh1Var.I.getLayoutParams()).topMargin = rh1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) rh1Var.K.getLayoutParams()).topMargin = rh1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) rh1Var.X.getLayoutParams()).topMargin = rh1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) rh1Var.N.getLayoutParams()).topMargin = rh1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) rh1Var.y.getLayoutParams()).topMargin = rh1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) rh1Var.O.getLayoutParams()).topMargin = rh1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) rh1Var.R.getLayoutParams()).topMargin = rh1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) rh1Var.Q.getLayoutParams()).topMargin = rh1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) rh1Var.Z.getLayoutParams()).bottomMargin = rh1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) rh1Var.M0.getLayoutParams()).bottomMargin = rh1Var.r0.getSystemWindowInsetBottom();
        rh1Var.Y.setInsets(rh1Var.r0);
        rh1Var.Z.setInsets(rh1Var.r0);
        rh1Var.s.requestLayout();
        kh1 kh1Var = rh1Var.o0;
        if (kh1Var != null) {
            kh1Var.setBottomPadding(rh1Var.r0.getSystemWindowInsetBottom());
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.voip.j3
    public void d(org.telegram.ui.Components.voip.k3 k3Var) {
        switch (this.a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    rh1 rh1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(rh1Var.S0);
                    rh1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (rh1Var.w0.isTouchExplorationEnabled()) {
                        k3Var.announceForAccessibility(LocaleController.getString(!isMicMute ? R.string.AccDescrVoipMicOff : R.string.AccDescrVoipMicOn));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    rh1Var.q0 = rh1Var.p0;
                    rh1Var.G();
                    break;
                }
                break;
            default:
                rh1 rh1Var2 = this.b;
                AndroidUtilities.cancelRunOnUIThread(rh1Var2.S0);
                rh1Var2.R0 = false;
                if (rh1Var2.b.checkSelfPermission("android.permission.CAMERA") == 0) {
                    rh1Var2.B();
                    break;
                } else {
                    rh1Var2.b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 0:
                jh1 jh1Var = this.b.u0;
                if (jh1Var != null) {
                    jh1Var.b();
                    break;
                }
                break;
            default:
                this.b.u0.b();
                break;
        }
    }
}
