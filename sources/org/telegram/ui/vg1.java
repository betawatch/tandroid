package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vg1 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.voip.r1, r0.n, org.telegram.ui.Components.voip.g3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oh1 b;

    public /* synthetic */ vg1(oh1 oh1Var, int i10) {
        this.a = i10;
        this.b = oh1Var;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        oh1 oh1Var = this.b;
        oh1Var.r0 = g10;
        ((FrameLayout.LayoutParams) oh1Var.j0.getLayoutParams()).bottomMargin = oh1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) oh1Var.e0.getLayoutParams()).bottomMargin = oh1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) oh1Var.H.getLayoutParams()).topMargin = oh1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) oh1Var.I.getLayoutParams()).topMargin = oh1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) oh1Var.K.getLayoutParams()).topMargin = oh1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) oh1Var.X.getLayoutParams()).topMargin = oh1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) oh1Var.N.getLayoutParams()).topMargin = oh1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) oh1Var.y.getLayoutParams()).topMargin = oh1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) oh1Var.O.getLayoutParams()).topMargin = oh1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) oh1Var.R.getLayoutParams()).topMargin = oh1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) oh1Var.Q.getLayoutParams()).topMargin = oh1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) oh1Var.Z.getLayoutParams()).bottomMargin = oh1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) oh1Var.M0.getLayoutParams()).bottomMargin = oh1Var.r0.getSystemWindowInsetBottom();
        oh1Var.Y.setInsets(oh1Var.r0);
        oh1Var.Z.setInsets(oh1Var.r0);
        oh1Var.s.requestLayout();
        hh1 hh1Var = oh1Var.o0;
        if (hh1Var != null) {
            hh1Var.setBottomPadding(oh1Var.r0.getSystemWindowInsetBottom());
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.voip.g3
    public void f(org.telegram.ui.Components.voip.h3 h3Var) {
        switch (this.a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    oh1 oh1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(oh1Var.S0);
                    oh1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (oh1Var.w0.isTouchExplorationEnabled()) {
                        h3Var.announceForAccessibility(LocaleController.getString(!isMicMute ? R.string.AccDescrVoipMicOff : R.string.AccDescrVoipMicOn));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    oh1Var.q0 = oh1Var.p0;
                    oh1Var.G();
                    break;
                }
                break;
            default:
                oh1 oh1Var2 = this.b;
                AndroidUtilities.cancelRunOnUIThread(oh1Var2.S0);
                oh1Var2.R0 = false;
                if (oh1Var2.b.checkSelfPermission("android.permission.CAMERA") == 0) {
                    oh1Var2.B();
                    break;
                } else {
                    oh1Var2.b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                gh1 gh1Var = this.b.u0;
                if (gh1Var != null) {
                    gh1Var.b();
                    break;
                }
                break;
            default:
                this.b.u0.b();
                break;
        }
    }
}
