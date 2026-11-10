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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
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
                org.telegram.ui.Components.k9 k9Var = lhVar.c;
                if (k9Var != null) {
                    k9Var.setTranslationY(0.0f);
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
                ah.l lVar3 = (ah.l) this.b;
                org.telegram.ui.Components.t40 t40Var = ((jl) lVar3.c).c.Q.p3;
                if (t40Var != null) {
                    t40Var.setIsMessageTransition(false);
                    ((jl) lVar3.c).c.Q.p3.d(true);
                    ((jl) lVar3.c).c.Q.p3.setVisibility(4);
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
                ((rq) xpVar.d).c.removeView(view4);
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
                dc1 dc1Var = (dc1) this.b;
                if (!dc1Var.a) {
                    dc1Var.V.w.S = true;
                    dc1Var.V.w.invalidate();
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
                ys ysVar = (ys) this.b;
                if (animator.equals(ysVar.n[0])) {
                    ysVar.n[0] = null;
                    break;
                }
                break;
            case 23:
                bu buVar = (bu) this.b;
                du duVar = buVar.n;
                cu[] cuVarArr = duVar.f;
                duVar.h = null;
                if (duVar.s) {
                    cuVarArr[1].setVisibility(8);
                } else {
                    cu cuVar = cuVarArr[0];
                    cuVarArr[0] = cuVarArr[1];
                    cuVarArr[1] = cuVar;
                    cuVar.setVisibility(8);
                    duVar.x = duVar.f[0].f == duVar.e.getFirstTabId();
                    duVar.e.i(1.0f, duVar.f[0].f);
                }
                duVar.n = false;
                buVar.c = false;
                buVar.b = false;
                lVar = ((org.telegram.ui.ActionBar.f2) duVar).actionBar;
                lVar.setEnabled(true);
                duVar.e.setEnabled(true);
                break;
            case 24:
                fv fvVar = (fv) this.b;
                zw.u1(fvVar.M, fvVar.L, 0.0f);
                break;
            case 25:
                zw zwVar = (zw) this.b;
                boolean z9 = zwVar.G0;
                zwVar.H0 = z9 ? 1.0f : 0.0f;
                if (!z9) {
                    zwVar.E0.setVisibility(8);
                }
                View view5 = zwVar.fragmentView;
                if (view5 != null) {
                    view5.invalidate();
                    break;
                }
                break;
            case 26:
                zw zwVar2 = ((sw) this.b).n0;
                zwVar2.h3 = null;
                if (!zwVar2.l3) {
                    yw[] ywVarArr = zwVar2.e0;
                    yw ywVar = ywVarArr[0];
                    yw ywVar2 = ywVarArr[1];
                    ywVarArr[0] = ywVar2;
                    ywVarArr[1] = ywVar;
                    zwVar2.z0.g(1.0f, ywVar2.h);
                    zwVar2.f5(false);
                    zwVar2.e0[0].d.getClass();
                    zwVar2.e0[1].d.getClass();
                }
                zwVar2.e0[1].setVisibility(8);
                zw.j1(zwVar2, true);
                zwVar2.i3 = false;
                zwVar2.o3 = false;
                lVar2 = ((org.telegram.ui.ActionBar.f2) zwVar2).actionBar;
                lVar2.setEnabled(true);
                zwVar2.z0.setEnabled(true);
                zwVar2.C3(zwVar2.e0[0]);
                break;
            case 27:
                super.onAnimationEnd(animator);
                ((vw) this.b).setScrollEnabled(true);
                break;
            case 28:
                px pxVar = (px) this.b;
                if (pxVar.w == animator) {
                    pxVar.w = null;
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

    public va(xp xpVar, v4.n0 n0Var) {
        this.a = 9;
        this.b = xpVar;
    }
}
