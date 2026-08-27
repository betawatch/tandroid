package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tg1 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.voip.r1, r0.o, org.telegram.ui.Components.voip.h3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lh1 b;

    public /* synthetic */ tg1(lh1 lh1Var, int i10) {
        this.a = i10;
        this.b = lh1Var;
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        WindowInsets g10 = m1Var.g();
        lh1 lh1Var = this.b;
        lh1Var.n0 = g10;
        ((FrameLayout.LayoutParams) lh1Var.f0.getLayoutParams()).bottomMargin = lh1Var.n0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) lh1Var.a0.getLayoutParams()).bottomMargin = lh1Var.n0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) lh1Var.D.getLayoutParams()).topMargin = lh1Var.n0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) lh1Var.E.getLayoutParams()).topMargin = lh1Var.n0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) lh1Var.G.getLayoutParams()).topMargin = lh1Var.n0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) lh1Var.T.getLayoutParams()).topMargin = lh1Var.n0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) lh1Var.J.getLayoutParams()).topMargin = lh1Var.n0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) lh1Var.y.getLayoutParams()).topMargin = lh1Var.n0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) lh1Var.K.getLayoutParams()).topMargin = lh1Var.n0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) lh1Var.N.getLayoutParams()).topMargin = lh1Var.n0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) lh1Var.M.getLayoutParams()).topMargin = lh1Var.n0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) lh1Var.V.getLayoutParams()).bottomMargin = lh1Var.n0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) lh1Var.I0.getLayoutParams()).bottomMargin = lh1Var.n0.getSystemWindowInsetBottom();
        lh1Var.U.setInsets(lh1Var.n0);
        lh1Var.V.setInsets(lh1Var.n0);
        lh1Var.s.requestLayout();
        eh1 eh1Var = lh1Var.k0;
        if (eh1Var != null) {
            eh1Var.setBottomPadding(lh1Var.n0.getSystemWindowInsetBottom());
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.voip.h3
    public void d(org.telegram.ui.Components.voip.i3 i3Var) {
        switch (this.a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    lh1 lh1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(lh1Var.O0);
                    lh1Var.N0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (lh1Var.s0.isTouchExplorationEnabled()) {
                        i3Var.announceForAccessibility(LocaleController.getString(!isMicMute ? R.string.AccDescrVoipMicOff : R.string.AccDescrVoipMicOn));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    lh1Var.m0 = lh1Var.l0;
                    lh1Var.H();
                    break;
                }
                break;
            default:
                lh1.i(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                dh1 dh1Var = this.b.q0;
                if (dh1Var != null) {
                    dh1Var.b();
                    break;
                }
                break;
            default:
                this.b.q0.b();
                break;
        }
    }
}
