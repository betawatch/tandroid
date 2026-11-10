package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ub1 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.voip.m1, r0.m, org.telegram.ui.Components.voip.z2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jc1 b;

    public /* synthetic */ ub1(jc1 jc1Var, int i7) {
        this.a = i7;
        this.b = jc1Var;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        jc1 jc1Var = this.b;
        jc1Var.q0 = g10;
        ((FrameLayout.LayoutParams) jc1Var.i0.getLayoutParams()).bottomMargin = jc1Var.q0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) jc1Var.e0.getLayoutParams()).bottomMargin = jc1Var.q0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) jc1Var.H.getLayoutParams()).topMargin = jc1Var.q0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) jc1Var.I.getLayoutParams()).topMargin = jc1Var.q0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) jc1Var.K.getLayoutParams()).topMargin = jc1Var.q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(56.0f);
        ((FrameLayout.LayoutParams) jc1Var.X.getLayoutParams()).topMargin = jc1Var.q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(135.0f);
        ((FrameLayout.LayoutParams) jc1Var.N.getLayoutParams()).topMargin = jc1Var.q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(17.0f);
        ((FrameLayout.LayoutParams) jc1Var.D.getLayoutParams()).topMargin = jc1Var.q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(93.0f);
        ((FrameLayout.LayoutParams) jc1Var.O.getLayoutParams()).topMargin = jc1Var.q0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) jc1Var.R.getLayoutParams()).topMargin = jc1Var.q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(118.0f);
        ((FrameLayout.LayoutParams) jc1Var.Q.getLayoutParams()).topMargin = jc1Var.q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(380.0f);
        ((FrameLayout.LayoutParams) jc1Var.Z.getLayoutParams()).bottomMargin = jc1Var.q0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) jc1Var.L0.getLayoutParams()).bottomMargin = jc1Var.q0.getSystemWindowInsetBottom();
        jc1Var.Y.setInsets(jc1Var.q0);
        jc1Var.Z.setInsets(jc1Var.q0);
        jc1Var.s.requestLayout();
        dc1 dc1Var = jc1Var.n0;
        if (dc1Var != null) {
            dc1Var.setBottomPadding(jc1Var.q0.getSystemWindowInsetBottom());
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.voip.z2
    public void d(org.telegram.ui.Components.voip.a3 a3Var) {
        int i7 = this.a;
        jc1 jc1Var = this.b;
        switch (i7) {
            case 4:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    org.telegram.messenger.g0.r(jc1Var.R0);
                    jc1Var.Q0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z9 = !isMicMute;
                    if (jc1Var.v0.isTouchExplorationEnabled()) {
                        a3Var.announceForAccessibility(org.telegram.messenger.id.M0(!isMicMute ? 2131754729 : 2131754728, null));
                    }
                    sharedInstance.setMicMute(z9, false, true);
                    jc1Var.p0 = jc1Var.o0;
                    jc1Var.y();
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.r(jc1Var.R0);
                jc1Var.Q0 = false;
                if (jc1Var.b.checkSelfPermission("android.permission.CAMERA") == 0) {
                    jc1Var.t();
                    break;
                } else {
                    jc1Var.b.requestPermissions(new String[]{"android.permission.CAMERA"}, org.telegram.messenger.qs.n1);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.b.t0.b();
    }
}
