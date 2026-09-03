package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qh1 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.voip.r1, r0.o, org.telegram.ui.Components.voip.i3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ii1 b;

    public /* synthetic */ qh1(ii1 ii1Var, int i10) {
        this.a = i10;
        this.b = ii1Var;
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        WindowInsets g10 = m1Var.g();
        ii1 ii1Var = this.b;
        ii1Var.o0 = g10;
        ((FrameLayout.LayoutParams) ii1Var.g0.getLayoutParams()).bottomMargin = ii1Var.o0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ii1Var.b0.getLayoutParams()).bottomMargin = ii1Var.o0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ii1Var.E.getLayoutParams()).topMargin = ii1Var.o0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ii1Var.F.getLayoutParams()).topMargin = ii1Var.o0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ii1Var.H.getLayoutParams()).topMargin = ii1Var.o0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) ii1Var.U.getLayoutParams()).topMargin = ii1Var.o0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) ii1Var.K.getLayoutParams()).topMargin = ii1Var.o0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) ii1Var.y.getLayoutParams()).topMargin = ii1Var.o0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) ii1Var.L.getLayoutParams()).topMargin = ii1Var.o0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ii1Var.O.getLayoutParams()).topMargin = ii1Var.o0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) ii1Var.N.getLayoutParams()).topMargin = ii1Var.o0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) ii1Var.W.getLayoutParams()).bottomMargin = ii1Var.o0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ii1Var.J0.getLayoutParams()).bottomMargin = ii1Var.o0.getSystemWindowInsetBottom();
        ii1Var.V.setInsets(ii1Var.o0);
        ii1Var.W.setInsets(ii1Var.o0);
        ii1Var.s.requestLayout();
        bi1 bi1Var = ii1Var.l0;
        if (bi1Var != null) {
            bi1Var.setBottomPadding(ii1Var.o0.getSystemWindowInsetBottom());
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.voip.i3
    public void f(org.telegram.ui.Components.voip.j3 j3Var) {
        switch (this.a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    ii1 ii1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(ii1Var.P0);
                    ii1Var.O0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z4 = !isMicMute;
                    if (ii1Var.t0.isTouchExplorationEnabled()) {
                        j3Var.announceForAccessibility(LocaleController.getString(!isMicMute ? R.string.AccDescrVoipMicOff : R.string.AccDescrVoipMicOn));
                    }
                    sharedInstance.setMicMute(z4, false, true);
                    ii1Var.n0 = ii1Var.m0;
                    ii1Var.H();
                    break;
                }
                break;
            default:
                ii1.i(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                ai1 ai1Var = this.b.r0;
                if (ai1Var != null) {
                    ai1Var.b();
                    break;
                }
                break;
            default:
                this.b.r0.b();
                break;
        }
    }
}
