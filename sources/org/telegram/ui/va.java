package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class va extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ va(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                g3 g3Var = (g3) this.b;
                if (animator.equals(((mb) g3Var.b).R)) {
                    ((mb) g3Var.b).R = null;
                    break;
                }
                break;
            case 1:
                mb mbVar = (mb) this.b;
                if (animator.equals(mbVar.R)) {
                    mbVar.R = null;
                    break;
                }
                break;
            case 2:
                ((tb) this.b).H.setVisibility(8);
                break;
            case 3:
                rc rcVar = (rc) this.b;
                cc ccVar = rcVar.m0;
                if (ccVar != null) {
                    if (ccVar.getParent() != null) {
                        ((ViewGroup) rcVar.m0.getParent()).removeView(rcVar.m0);
                    }
                    rcVar.m0 = null;
                }
                rcVar.o0 = null;
                super.onAnimationEnd(animator);
                break;
            case 4:
                lh lhVar = (lh) this.b;
                if (lhVar.a) {
                    lhVar.d.setTranslationY(0.0f);
                }
                if (lhVar.b) {
                    lhVar.e.setTranslationY(0.0f);
                }
                if (lhVar.f) {
                    lhVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.l9 l9Var = lhVar.c;
                if (l9Var != null) {
                    l9Var.setTranslationY(0.0f);
                }
                lhVar.n.V2[1] = null;
                break;
            case 5:
                sj sjVar = (sj) this.b;
                sjVar.setAnimatedTop(0);
                View view = sjVar.G1;
                if (view != null && view.getVisibility() == 0) {
                    sjVar.G1.setTranslationY(((1.0f - sjVar.getTopViewEnterProgress()) * sjVar.G1.getLayoutParams().height) + sjVar.T1);
                }
                sjVar.w5.K9 = null;
                break;
            case 6:
                ah.l lVar = (ah.l) this.b;
                org.telegram.ui.Components.u40 u40Var = ((jl) lVar.c).c.Q.p3;
                if (u40Var != null) {
                    u40Var.setIsMessageTransition(false);
                    ((jl) lVar.c).c.Q.p3.d(true);
                    ((jl) lVar.c).c.Q.p3.setVisibility(4);
                    break;
                }
                break;
            case 7:
                jl jlVar = (jl) this.b;
                ll llVar = jlVar.c;
                ArrayList arrayList = llVar.Q.D6;
                org.telegram.ui.Cells.q1 q1Var = jlVar.b;
                arrayList.remove(q1Var);
                View view2 = llVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    llVar.Q.z0.invalidate();
                }
                q1Var.setAlpha(1.0f);
                q1Var.getTransitionParams().y0 = false;
                break;
            case 8:
                xo xoVar = (xo) this.b;
                xoVar.L = 0.0f;
                xoVar.K = 1.0f;
                View view3 = xoVar.a0;
                if (view3 != null) {
                    view3.invalidate();
                }
                xoVar.T.invalidate();
                dh dhVar = xoVar.Y;
                if (dhVar != null) {
                    dhVar.run();
                    xoVar.Y = null;
                    break;
                }
                break;
            case 9:
                xp xpVar = (xp) this.b;
                View view4 = xpVar.b;
                view4.setAlpha(1.0f);
                v4.n0.x0(view4);
                ((qq) xpVar.d).c.removeView(view4);
                break;
            case 10:
                org.telegram.ui.Components.voip.y yVar = ((org.telegram.ui.Components.voip.u) this.b).s0;
                if (yVar.x0.getParent() != null) {
                    yVar.a.removeView(yVar.x0);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Components.voip.a0 a0Var = (org.telegram.ui.Components.voip.a0) this.b;
                a0Var.s = null;
                a0Var.r = 1.0f;
                a0Var.b();
                a0Var.e();
                break;
            case 12:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.t0 t0Var = (org.telegram.ui.Components.voip.t0) this.b;
                if (t0Var.getParent() != null) {
                    ((ViewGroup) t0Var.getParent()).removeView(t0Var);
                    break;
                }
                break;
            case 13:
                cc1 cc1Var = (cc1) this.b;
                if (!cc1Var.a) {
                    cc1Var.V.w.S = true;
                    cc1Var.V.w.invalidate();
                    break;
                }
                break;
            case 14:
                org.telegram.ui.Components.voip.i1 i1Var = (org.telegram.ui.Components.voip.i1) this.b;
                i1Var.i = false;
                i1Var.l.setAlpha(35);
                i1Var.k.setAlpha(org.telegram.messenger.qs.n1);
                i1Var.j.setAlpha(35);
                i1Var.c();
                break;
            case 15:
                org.telegram.ui.Components.voip.n1 n1Var = ((org.telegram.ui.Components.voip.l1) this.b).c;
                n1Var.O = false;
                n1Var.requestLayout();
                break;
            case 16:
                org.telegram.ui.Components.voip.k2 k2Var = (org.telegram.ui.Components.voip.k2) this.b;
                k2Var.N = 0.0f;
                k2Var.O = 0.0f;
                org.telegram.ui.Components.voip.j2 j2Var = k2Var.d;
                j2Var.setScaleX(k2Var.T);
                j2Var.setScaleY(k2Var.T);
                TextureView textureView = k2Var.e;
                if (textureView != null) {
                    textureView.setScaleX(k2Var.U);
                    textureView.setScaleY(k2Var.U);
                }
                k2Var.setTranslationY(0.0f);
                k2Var.setTranslationX(0.0f);
                k2Var.W = k2Var.V;
                k2Var.b0 = null;
                break;
            case 17:
                org.telegram.ui.Components.voip.n2 n2Var = (org.telegram.ui.Components.voip.n2) this.b;
                n2Var.Q = n2Var.P ? 1.0f : 0.0f;
                n2Var.a(n2Var.R, n2Var.S);
                break;
            case 18:
                ((org.telegram.ui.Components.voip.o2) this.b).c.e();
                org.telegram.messenger.g0.Q3(((org.telegram.ui.Components.voip.o2) this.b).a);
                if (((org.telegram.ui.Components.voip.o2) this.b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.o2) this.b).a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.o2) this.b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.o2) this.b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    break;
                }
                break;
            case 19:
                org.telegram.ui.Components.voip.u2 u2Var = (org.telegram.ui.Components.voip.u2) this.b;
                u2Var.J = false;
                u2Var.T.e = false;
                if (u2Var.U && (animatorSet = u2Var.Q) != null) {
                    animatorSet.cancel();
                    u2Var.Q.start();
                }
                u2Var.c();
                break;
            case 20:
                ((org.telegram.ui.Components.voip.b3) this.b).e.setVisibility(8);
                break;
            case 21:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            case 22:
                xs xsVar = (xs) this.b;
                if (animator.equals(xsVar.n[0])) {
                    xsVar.n[0] = null;
                    break;
                }
                break;
            case 23:
                au auVar = (au) this.b;
                cu cuVar = auVar.n;
                bu[] buVarArr = cuVar.f;
                cuVar.h = null;
                if (cuVar.s) {
                    buVarArr[1].setVisibility(8);
                } else {
                    bu buVar = buVarArr[0];
                    buVarArr[0] = buVarArr[1];
                    buVarArr[1] = buVar;
                    buVar.setVisibility(8);
                    cuVar.x = cuVar.f[0].f == cuVar.e.getFirstTabId();
                    cuVar.e.i(1.0f, cuVar.f[0].f);
                }
                cuVar.n = false;
                auVar.c = false;
                auVar.b = false;
                kVar = ((org.telegram.ui.ActionBar.f2) cuVar).actionBar;
                kVar.setEnabled(true);
                cuVar.e.setEnabled(true);
                break;
            case 24:
                ev evVar = (ev) this.b;
                yw.u1(evVar.M, evVar.L, 0.0f);
                break;
            case 25:
                yw ywVar = (yw) this.b;
                boolean z9 = ywVar.G0;
                ywVar.H0 = z9 ? 1.0f : 0.0f;
                if (!z9) {
                    ywVar.E0.setVisibility(8);
                }
                View view5 = ywVar.fragmentView;
                if (view5 != null) {
                    view5.invalidate();
                    break;
                }
                break;
            case 26:
                yw ywVar2 = ((rw) this.b).n0;
                ywVar2.h3 = null;
                if (!ywVar2.l3) {
                    xw[] xwVarArr = ywVar2.e0;
                    xw xwVar = xwVarArr[0];
                    xw xwVar2 = xwVarArr[1];
                    xwVarArr[0] = xwVar2;
                    xwVarArr[1] = xwVar;
                    ywVar2.z0.g(1.0f, xwVar2.h);
                    ywVar2.f5(false);
                    ywVar2.e0[0].d.getClass();
                    ywVar2.e0[1].d.getClass();
                }
                ywVar2.e0[1].setVisibility(8);
                yw.j1(ywVar2, true);
                ywVar2.i3 = false;
                ywVar2.o3 = false;
                kVar2 = ((org.telegram.ui.ActionBar.f2) ywVar2).actionBar;
                kVar2.setEnabled(true);
                ywVar2.z0.setEnabled(true);
                ywVar2.C3(ywVar2.e0[0]);
                break;
            case 27:
                super.onAnimationEnd(animator);
                ((uw) this.b).setScrollEnabled(true);
                break;
            case 28:
                ox oxVar = (ox) this.b;
                if (oxVar.w == animator) {
                    oxVar.w = null;
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.n70 n70Var = (org.telegram.ui.Components.n70) this.b;
                FrameLayout frameLayout = n70Var.b;
                fi.p5 p5Var = (fi.p5) n70Var.c;
                if (p5Var.getParent() != null) {
                    frameLayout.removeView(p5Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((e7) n70Var.d);
                break;
        }
    }

    public va(xp xpVar, v4.n0 n0Var) {
        this.a = 9;
        this.b = xpVar;
    }
}
