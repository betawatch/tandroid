package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vg1 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.voip.u1, r0.n, org.telegram.ui.Components.voip.j3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ph1 b;

    public /* synthetic */ vg1(ph1 ph1Var, int i10) {
        this.a = i10;
        this.b = ph1Var;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        WindowInsets g7 = k1Var.g();
        ph1 ph1Var = this.b;
        ph1Var.r0 = g7;
        ((FrameLayout.LayoutParams) ph1Var.j0.getLayoutParams()).bottomMargin = ph1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ph1Var.e0.getLayoutParams()).bottomMargin = ph1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ph1Var.H.getLayoutParams()).topMargin = ph1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ph1Var.I.getLayoutParams()).topMargin = ph1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ph1Var.K.getLayoutParams()).topMargin = ph1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) ph1Var.X.getLayoutParams()).topMargin = ph1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) ph1Var.N.getLayoutParams()).topMargin = ph1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) ph1Var.y.getLayoutParams()).topMargin = ph1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) ph1Var.O.getLayoutParams()).topMargin = ph1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ph1Var.R.getLayoutParams()).topMargin = ph1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) ph1Var.Q.getLayoutParams()).topMargin = ph1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) ph1Var.Z.getLayoutParams()).bottomMargin = ph1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ph1Var.M0.getLayoutParams()).bottomMargin = ph1Var.r0.getSystemWindowInsetBottom();
        ph1Var.Y.setInsets(ph1Var.r0);
        ph1Var.Z.setInsets(ph1Var.r0);
        ph1Var.s.requestLayout();
        ih1 ih1Var = ph1Var.o0;
        if (ih1Var != null) {
            ih1Var.setBottomPadding(ph1Var.r0.getSystemWindowInsetBottom());
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.voip.j3
    public void d(org.telegram.ui.Components.voip.k3 k3Var) {
        switch (this.a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    ph1 ph1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(ph1Var.S0);
                    ph1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (ph1Var.w0.isTouchExplorationEnabled()) {
                        k3Var.announceForAccessibility(LocaleController.getString(!isMicMute ? R.string.AccDescrVoipMicOff : R.string.AccDescrVoipMicOn));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    ph1Var.q0 = ph1Var.p0;
                    ph1Var.G();
                    break;
                }
                break;
            default:
                ph1 ph1Var2 = this.b;
                AndroidUtilities.cancelRunOnUIThread(ph1Var2.S0);
                ph1Var2.R0 = false;
                if (ph1Var2.b.checkSelfPermission("android.permission.CAMERA") == 0) {
                    ph1Var2.B();
                    break;
                } else {
                    ph1Var2.b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 0:
                hh1 hh1Var = this.b.u0;
                if (hh1Var != null) {
                    hh1Var.b();
                    break;
                }
                break;
            default:
                this.b.u0.b();
                break;
        }
    }
}
