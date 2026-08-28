package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ug1 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.voip.r1, r0.o, org.telegram.ui.Components.voip.h3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mh1 b;

    public /* synthetic */ ug1(mh1 mh1Var, int i9) {
        this.a = i9;
        this.b = mh1Var;
    }

    @Override // r0.o
    public r0.m1 L0(View view, r0.m1 m1Var) {
        WindowInsets g10 = m1Var.g();
        mh1 mh1Var = this.b;
        mh1Var.n0 = g10;
        ((FrameLayout.LayoutParams) mh1Var.f0.getLayoutParams()).bottomMargin = mh1Var.n0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) mh1Var.a0.getLayoutParams()).bottomMargin = mh1Var.n0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) mh1Var.D.getLayoutParams()).topMargin = mh1Var.n0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) mh1Var.E.getLayoutParams()).topMargin = mh1Var.n0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) mh1Var.G.getLayoutParams()).topMargin = mh1Var.n0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) mh1Var.T.getLayoutParams()).topMargin = mh1Var.n0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) mh1Var.J.getLayoutParams()).topMargin = mh1Var.n0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) mh1Var.y.getLayoutParams()).topMargin = mh1Var.n0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) mh1Var.K.getLayoutParams()).topMargin = mh1Var.n0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) mh1Var.N.getLayoutParams()).topMargin = mh1Var.n0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) mh1Var.M.getLayoutParams()).topMargin = mh1Var.n0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) mh1Var.V.getLayoutParams()).bottomMargin = mh1Var.n0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) mh1Var.I0.getLayoutParams()).bottomMargin = mh1Var.n0.getSystemWindowInsetBottom();
        mh1Var.U.setInsets(mh1Var.n0);
        mh1Var.V.setInsets(mh1Var.n0);
        mh1Var.s.requestLayout();
        fh1 fh1Var = mh1Var.k0;
        if (fh1Var != null) {
            fh1Var.setBottomPadding(mh1Var.n0.getSystemWindowInsetBottom());
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.voip.h3
    public void d(org.telegram.ui.Components.voip.i3 i3Var) {
        switch (this.a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    mh1 mh1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(mh1Var.O0);
                    mh1Var.N0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (mh1Var.s0.isTouchExplorationEnabled()) {
                        i3Var.announceForAccessibility(LocaleController.getString(!isMicMute ? R.string.AccDescrVoipMicOff : R.string.AccDescrVoipMicOn));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    mh1Var.m0 = mh1Var.l0;
                    mh1Var.H();
                    break;
                }
                break;
            default:
                mh1.i(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 0:
                eh1 eh1Var = this.b.q0;
                if (eh1Var != null) {
                    eh1Var.b();
                    break;
                }
                break;
            default:
                this.b.q0.b();
                break;
        }
    }
}
