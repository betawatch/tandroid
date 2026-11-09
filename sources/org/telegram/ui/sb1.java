package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class sb1 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.voip.m1, r0.m, org.telegram.ui.Components.voip.z2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ic1 b;

    public /* synthetic */ sb1(ic1 ic1Var, int i7) {
        this.a = i7;
        this.b = ic1Var;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        ic1 ic1Var = this.b;
        ic1Var.q0 = g10;
        ((FrameLayout.LayoutParams) ic1Var.i0.getLayoutParams()).bottomMargin = ic1Var.q0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ic1Var.e0.getLayoutParams()).bottomMargin = ic1Var.q0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ic1Var.H.getLayoutParams()).topMargin = ic1Var.q0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ic1Var.I.getLayoutParams()).topMargin = ic1Var.q0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ic1Var.K.getLayoutParams()).topMargin = ic1Var.q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(56.0f);
        ((FrameLayout.LayoutParams) ic1Var.X.getLayoutParams()).topMargin = ic1Var.q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(135.0f);
        ((FrameLayout.LayoutParams) ic1Var.N.getLayoutParams()).topMargin = ic1Var.q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(17.0f);
        ((FrameLayout.LayoutParams) ic1Var.D.getLayoutParams()).topMargin = ic1Var.q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(93.0f);
        ((FrameLayout.LayoutParams) ic1Var.O.getLayoutParams()).topMargin = ic1Var.q0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ic1Var.R.getLayoutParams()).topMargin = ic1Var.q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(118.0f);
        ((FrameLayout.LayoutParams) ic1Var.Q.getLayoutParams()).topMargin = ic1Var.q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(380.0f);
        ((FrameLayout.LayoutParams) ic1Var.Z.getLayoutParams()).bottomMargin = ic1Var.q0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ic1Var.L0.getLayoutParams()).bottomMargin = ic1Var.q0.getSystemWindowInsetBottom();
        ic1Var.Y.setInsets(ic1Var.q0);
        ic1Var.Z.setInsets(ic1Var.q0);
        ic1Var.s.requestLayout();
        cc1 cc1Var = ic1Var.n0;
        if (cc1Var != null) {
            cc1Var.setBottomPadding(ic1Var.q0.getSystemWindowInsetBottom());
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.voip.z2
    public void d(org.telegram.ui.Components.voip.a3 a3Var) {
        int i7 = this.a;
        ic1 ic1Var = this.b;
        switch (i7) {
            case 4:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    org.telegram.messenger.g0.r(ic1Var.R0);
                    ic1Var.Q0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z9 = !isMicMute;
                    if (ic1Var.v0.isTouchExplorationEnabled()) {
                        a3Var.announceForAccessibility(org.telegram.messenger.id.M0(!isMicMute ? 2131754729 : 2131754728, null));
                    }
                    sharedInstance.setMicMute(z9, false, true);
                    ic1Var.p0 = ic1Var.o0;
                    ic1Var.y();
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.r(ic1Var.R0);
                ic1Var.Q0 = false;
                if (ic1Var.b.checkSelfPermission("android.permission.CAMERA") == 0) {
                    ic1Var.t();
                    break;
                } else {
                    ic1Var.b.requestPermissions(new String[]{"android.permission.CAMERA"}, org.telegram.messenger.qs.n1);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.b.t0.b();
    }
}
