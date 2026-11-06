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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
                jh jhVar = (jh) this.b;
                if (jhVar.a) {
                    jhVar.d.setTranslationY(0.0f);
                }
                if (jhVar.b) {
                    jhVar.e.setTranslationY(0.0f);
                }
                if (jhVar.f) {
                    jhVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.l9 l9Var = jhVar.c;
                if (l9Var != null) {
                    l9Var.setTranslationY(0.0f);
                }
                jhVar.n.V2[1] = null;
                break;
            case 5:
                qj qjVar = (qj) this.b;
                qjVar.setAnimatedTop(0);
                View view = qjVar.G1;
                if (view != null && view.getVisibility() == 0) {
                    qjVar.G1.setTranslationY(((1.0f - qjVar.getTopViewEnterProgress()) * qjVar.G1.getLayoutParams().height) + qjVar.T1);
                }
                qjVar.w5.I9 = null;
                break;
            case 6:
                ah.l lVar = (ah.l) this.b;
                org.telegram.ui.Components.t40 t40Var = ((hl) lVar.c).c.Q.p3;
                if (t40Var != null) {
                    t40Var.setIsMessageTransition(false);
                    ((hl) lVar.c).c.Q.p3.c(true);
                    ((hl) lVar.c).c.Q.p3.setVisibility(4);
                    break;
                }
                break;
            case 7:
                hl hlVar = (hl) this.b;
                jl jlVar = hlVar.c;
                ArrayList arrayList = jlVar.Q.D6;
                org.telegram.ui.Cells.q1 q1Var = hlVar.b;
                arrayList.remove(q1Var);
                View view2 = jlVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    jlVar.Q.z0.invalidate();
                }
                q1Var.setAlpha(1.0f);
                q1Var.getTransitionParams().y0 = false;
                break;
            case 8:
                vo voVar = (vo) this.b;
                voVar.L = 0.0f;
                voVar.K = 1.0f;
                View view3 = voVar.a0;
                if (view3 != null) {
                    view3.invalidate();
                }
                voVar.T.invalidate();
                bh bhVar = voVar.Y;
                if (bhVar != null) {
                    bhVar.run();
                    voVar.Y = null;
                    break;
                }
                break;
            case 9:
                vp vpVar = (vp) this.b;
                View view4 = vpVar.b;
                view4.setAlpha(1.0f);
                v4.n0.x0(view4);
                ((oq) vpVar.d).c.removeView(view4);
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
                yb1 yb1Var = (yb1) this.b;
                if (!yb1Var.a) {
                    yb1Var.V.w.S = true;
                    yb1Var.V.w.invalidate();
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
                vs vsVar = (vs) this.b;
                if (animator.equals(vsVar.n[0])) {
                    vsVar.n[0] = null;
                    break;
                }
                break;
            case 23:
                yt ytVar = (yt) this.b;
                au auVar = ytVar.n;
                zt[] ztVarArr = auVar.f;
                auVar.h = null;
                if (auVar.s) {
                    ztVarArr[1].setVisibility(8);
                } else {
                    zt ztVar = ztVarArr[0];
                    ztVarArr[0] = ztVarArr[1];
                    ztVarArr[1] = ztVar;
                    ztVar.setVisibility(8);
                    auVar.x = auVar.f[0].f == auVar.e.getFirstTabId();
                    auVar.e.i(1.0f, auVar.f[0].f);
                }
                auVar.n = false;
                ytVar.c = false;
                ytVar.b = false;
                kVar = ((org.telegram.ui.ActionBar.f2) auVar).actionBar;
                kVar.setEnabled(true);
                auVar.e.setEnabled(true);
                break;
            case 24:
                cv cvVar = (cv) this.b;
                ww.u1(cvVar.M, cvVar.L, 0.0f);
                break;
            case 25:
                ww wwVar = (ww) this.b;
                boolean z9 = wwVar.G0;
                wwVar.H0 = z9 ? 1.0f : 0.0f;
                if (!z9) {
                    wwVar.E0.setVisibility(8);
                }
                View view5 = wwVar.fragmentView;
                if (view5 != null) {
                    view5.invalidate();
                    break;
                }
                break;
            case 26:
                ww wwVar2 = ((pw) this.b).n0;
                wwVar2.g3 = null;
                if (!wwVar2.k3) {
                    vw[] vwVarArr = wwVar2.e0;
                    vw vwVar = vwVarArr[0];
                    vw vwVar2 = vwVarArr[1];
                    vwVarArr[0] = vwVar2;
                    vwVarArr[1] = vwVar;
                    wwVar2.z0.g(1.0f, vwVar2.h);
                    wwVar2.f5(false);
                    wwVar2.e0[0].d.getClass();
                    wwVar2.e0[1].d.getClass();
                }
                wwVar2.e0[1].setVisibility(8);
                ww.j1(wwVar2, true);
                wwVar2.h3 = false;
                wwVar2.n3 = false;
                kVar2 = ((org.telegram.ui.ActionBar.f2) wwVar2).actionBar;
                kVar2.setEnabled(true);
                wwVar2.z0.setEnabled(true);
                wwVar2.C3(wwVar2.e0[0]);
                break;
            case 27:
                super.onAnimationEnd(animator);
                ((sw) this.b).setScrollEnabled(true);
                break;
            case 28:
                mx mxVar = (mx) this.b;
                if (mxVar.w == animator) {
                    mxVar.w = null;
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.m70 m70Var = (org.telegram.ui.Components.m70) this.b;
                FrameLayout frameLayout = m70Var.b;
                fi.p5 p5Var = (fi.p5) m70Var.c;
                if (p5Var.getParent() != null) {
                    frameLayout.removeView(p5Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((e7) m70Var.d);
                break;
        }
    }

    public va(vp vpVar, v4.n0 n0Var) {
        this.a = 9;
        this.b = vpVar;
    }
}
