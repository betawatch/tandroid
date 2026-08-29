package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wg1 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.voip.s1, r0.o, org.telegram.ui.Components.voip.k3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oh1 b;

    public /* synthetic */ wg1(oh1 oh1Var, int i10) {
        this.a = i10;
        this.b = oh1Var;
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        WindowInsets g10 = m1Var.g();
        oh1 oh1Var = this.b;
        oh1Var.n0 = g10;
        ((FrameLayout.LayoutParams) oh1Var.f0.getLayoutParams()).bottomMargin = oh1Var.n0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) oh1Var.a0.getLayoutParams()).bottomMargin = oh1Var.n0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) oh1Var.D.getLayoutParams()).topMargin = oh1Var.n0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) oh1Var.E.getLayoutParams()).topMargin = oh1Var.n0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) oh1Var.G.getLayoutParams()).topMargin = oh1Var.n0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) oh1Var.T.getLayoutParams()).topMargin = oh1Var.n0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) oh1Var.J.getLayoutParams()).topMargin = oh1Var.n0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) oh1Var.y.getLayoutParams()).topMargin = oh1Var.n0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) oh1Var.K.getLayoutParams()).topMargin = oh1Var.n0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) oh1Var.N.getLayoutParams()).topMargin = oh1Var.n0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) oh1Var.M.getLayoutParams()).topMargin = oh1Var.n0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) oh1Var.V.getLayoutParams()).bottomMargin = oh1Var.n0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) oh1Var.I0.getLayoutParams()).bottomMargin = oh1Var.n0.getSystemWindowInsetBottom();
        oh1Var.U.setInsets(oh1Var.n0);
        oh1Var.V.setInsets(oh1Var.n0);
        oh1Var.s.requestLayout();
        hh1 hh1Var = oh1Var.k0;
        if (hh1Var != null) {
            hh1Var.setBottomPadding(oh1Var.n0.getSystemWindowInsetBottom());
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.voip.k3
    public void d(org.telegram.ui.Components.voip.l3 l3Var) {
        switch (this.a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    oh1 oh1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(oh1Var.O0);
                    oh1Var.N0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (oh1Var.s0.isTouchExplorationEnabled()) {
                        l3Var.announceForAccessibility(LocaleController.getString(!isMicMute ? R.string.AccDescrVoipMicOff : R.string.AccDescrVoipMicOn));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    oh1Var.m0 = oh1Var.l0;
                    oh1Var.H();
                    break;
                }
                break;
            default:
                oh1.i(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                gh1 gh1Var = this.b.q0;
                if (gh1Var != null) {
                    gh1Var.b();
                    break;
                }
                break;
            default:
                this.b.q0.b();
                break;
        }
    }
}
