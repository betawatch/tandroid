package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class sb1 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.voip.p1, r0.m, org.telegram.ui.Components.voip.c3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hc1 b;

    public /* synthetic */ sb1(hc1 hc1Var, int i7) {
        this.a = i7;
        this.b = hc1Var;
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        hc1 hc1Var = this.b;
        hc1Var.r0 = g10;
        ((FrameLayout.LayoutParams) hc1Var.j0.getLayoutParams()).bottomMargin = hc1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) hc1Var.f0.getLayoutParams()).bottomMargin = hc1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) hc1Var.I.getLayoutParams()).topMargin = hc1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) hc1Var.J.getLayoutParams()).topMargin = hc1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) hc1Var.L.getLayoutParams()).topMargin = hc1Var.r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(56.0f);
        ((FrameLayout.LayoutParams) hc1Var.Y.getLayoutParams()).topMargin = hc1Var.r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(135.0f);
        ((FrameLayout.LayoutParams) hc1Var.O.getLayoutParams()).topMargin = hc1Var.r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(17.0f);
        ((FrameLayout.LayoutParams) hc1Var.E.getLayoutParams()).topMargin = hc1Var.r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(93.0f);
        ((FrameLayout.LayoutParams) hc1Var.P.getLayoutParams()).topMargin = hc1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) hc1Var.S.getLayoutParams()).topMargin = hc1Var.r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(118.0f);
        ((FrameLayout.LayoutParams) hc1Var.R.getLayoutParams()).topMargin = hc1Var.r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(380.0f);
        ((FrameLayout.LayoutParams) hc1Var.a0.getLayoutParams()).bottomMargin = hc1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) hc1Var.M0.getLayoutParams()).bottomMargin = hc1Var.r0.getSystemWindowInsetBottom();
        hc1Var.Z.setInsets(hc1Var.r0);
        hc1Var.a0.setInsets(hc1Var.r0);
        hc1Var.s.requestLayout();
        bc1 bc1Var = hc1Var.o0;
        if (bc1Var != null) {
            bc1Var.setBottomPadding(hc1Var.r0.getSystemWindowInsetBottom());
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.voip.c3
    public void g(org.telegram.ui.Components.voip.d3 d3Var) {
        int i7 = this.a;
        hc1 hc1Var = this.b;
        switch (i7) {
            case 4:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    org.telegram.messenger.g0.r(hc1Var.S0);
                    hc1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (hc1Var.w0.isTouchExplorationEnabled()) {
                        d3Var.announceForAccessibility(org.telegram.messenger.gd.M0(!isMicMute ? 2131754729 : 2131754728, null));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    hc1Var.q0 = hc1Var.p0;
                    hc1Var.y();
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.r(hc1Var.S0);
                hc1Var.R0 = false;
                if (hc1Var.b.checkSelfPermission("android.permission.CAMERA") == 0) {
                    hc1Var.t();
                    break;
                } else {
                    hc1Var.b.requestPermissions(new String[]{"android.permission.CAMERA"}, org.telegram.messenger.ks.n1);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.b.u0.b();
    }
}
