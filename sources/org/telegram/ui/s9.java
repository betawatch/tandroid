package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class s9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s9(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 8:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((u9) this.b).w = null;
                break;
            case 1:
                org.telegram.ui.Cells.i iVar = (org.telegram.ui.Cells.i) this.b;
                ((rx0) iVar).e0.e.c.r = false;
                FrameLayout frameLayout = iVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(iVar.K);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) this.b;
                Button button = vVar.n;
                org.telegram.ui.Components.dh0 dh0Var = vVar.f;
                if (button != dh0Var) {
                    dh0Var.setVisibility(4);
                    break;
                } else {
                    vVar.e.setVisibility(4);
                    break;
                }
            case 3:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.c0) this.b).x = null;
                break;
            case 4:
                ((org.telegram.ui.Cells.j4) this.b).G = null;
                break;
            case 5:
                org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) this.b;
                if (animator.equals(v5Var.n)) {
                    v5Var.n = null;
                    break;
                }
                break;
            case 6:
                mg.c2 c2Var = (mg.c2) this.b;
                if (animator.equals(((org.telegram.ui.Cells.x5) c2Var.b).d)) {
                    ((org.telegram.ui.Cells.x5) c2Var.b).d = null;
                    break;
                }
                break;
            case 7:
                org.telegram.messenger.i0.h3(((org.telegram.ui.Cells.x5) this.b).e, 1000L);
                break;
            case 8:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    break;
                }
                break;
            case 9:
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) this.b;
                s7Var.n.N0 = true;
                s7Var.invalidate();
                break;
            case 10:
                super.onAnimationEnd(animator);
                org.telegram.ui.ActionBar.l1 l1Var = (org.telegram.ui.ActionBar.l1) this.b;
                ((org.telegram.ui.Cells.y9) ((lg.f) l1Var.b).b).getTransitionParams().e();
                ((org.telegram.ui.Cells.y9) ((lg.f) l1Var.b).b).getTransitionParams().h = false;
                ((org.telegram.ui.Cells.y9) ((lg.f) l1Var.b).b).getTransitionParams().L1 = 1.0f;
                break;
            case 11:
                h3 h3Var = (h3) this.b;
                if (animator.equals(((sb) h3Var.b).R)) {
                    ((sb) h3Var.b).R = null;
                    break;
                }
                break;
            case 12:
                sb sbVar = (sb) this.b;
                if (animator.equals(sbVar.R)) {
                    sbVar.R = null;
                    break;
                }
                break;
            case 13:
                ((zb) this.b).H.setVisibility(8);
                break;
            case 14:
                zc zcVar = (zc) this.b;
                ic icVar = zcVar.m0;
                if (icVar != null) {
                    if (icVar.getParent() != null) {
                        ((ViewGroup) zcVar.m0.getParent()).removeView(zcVar.m0);
                    }
                    zcVar.m0 = null;
                }
                zcVar.o0 = null;
                super.onAnimationEnd(animator);
                break;
            case 15:
                ei eiVar = (ei) this.b;
                if (eiVar.a) {
                    eiVar.d.setTranslationY(0.0f);
                }
                if (eiVar.b) {
                    eiVar.e.setTranslationY(0.0f);
                }
                if (eiVar.f) {
                    eiVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.g9 g9Var = eiVar.c;
                if (g9Var != null) {
                    g9Var.setTranslationY(0.0f);
                }
                eiVar.n.V2[1] = null;
                break;
            case 16:
                mk mkVar = (mk) this.b;
                mkVar.setAnimatedTop(0);
                View view = mkVar.G1;
                if (view != null && view.getVisibility() == 0) {
                    mkVar.G1.setTranslationY(((1.0f - mkVar.getTopViewEnterProgress()) * mkVar.G1.getLayoutParams().height) + mkVar.T1);
                }
                mkVar.w5.I9 = null;
                break;
            case 17:
                org.telegram.ui.Components.q30 q30Var = ((bi) this.b).b.s2;
                if (q30Var != null) {
                    q30Var.setVisibility(8);
                    break;
                }
                break;
            case 18:
                bg.f fVar = (bg.f) this.b;
                org.telegram.ui.Components.j50 j50Var = ((dm) fVar.b).c.Q.p3;
                if (j50Var != null) {
                    j50Var.setIsMessageTransition(false);
                    ((dm) fVar.b).c.Q.p3.c(true);
                    ((dm) fVar.b).c.Q.p3.setVisibility(4);
                    break;
                }
                break;
            case 19:
                dm dmVar = (dm) this.b;
                fm fmVar = dmVar.c;
                ArrayList arrayList = fmVar.Q.D6;
                org.telegram.ui.Cells.q1 q1Var = dmVar.b;
                arrayList.remove(q1Var);
                View view2 = fmVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    fmVar.Q.z0.invalidate();
                }
                q1Var.setAlpha(1.0f);
                q1Var.getTransitionParams().y0 = false;
                break;
            case 20:
                tp tpVar = (tp) this.b;
                tpVar.L = 0.0f;
                tpVar.K = 1.0f;
                View view3 = tpVar.a0;
                if (view3 != null) {
                    view3.invalidate();
                }
                tpVar.T.invalidate();
                rh rhVar = tpVar.Y;
                if (rhVar != null) {
                    rhVar.run();
                    tpVar.Y = null;
                    break;
                }
                break;
            case 21:
                uq uqVar = (uq) this.b;
                View view4 = uqVar.b;
                view4.setAlpha(1.0f);
                s4.n0.x0(view4);
                ((pr) uqVar.d).c.removeView(view4);
                break;
            case 22:
                org.telegram.ui.Components.voip.r rVar = ((org.telegram.ui.Components.voip.n) this.b).s0;
                if (rVar.x0.getParent() != null) {
                    rVar.a.removeView(rVar.x0);
                    break;
                }
                break;
            case 23:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.f0 f0Var = (org.telegram.ui.Components.voip.f0) this.b;
                if (f0Var.getParent() != null) {
                    ((ViewGroup) f0Var.getParent()).removeView(f0Var);
                    break;
                }
                break;
            case 24:
                sd1 sd1Var = (sd1) this.b;
                if (!sd1Var.a) {
                    sd1Var.V.w.S = true;
                    sd1Var.V.w.invalidate();
                    break;
                }
                break;
            case 25:
                org.telegram.ui.Components.voip.y0 y0Var = (org.telegram.ui.Components.voip.y0) this.b;
                y0Var.i = false;
                y0Var.l.setAlpha(35);
                y0Var.k.setAlpha(org.telegram.messenger.at.n1);
                y0Var.j.setAlpha(35);
                y0Var.c();
                break;
            case 26:
                org.telegram.ui.Components.voip.c1 c1Var = ((org.telegram.ui.Components.voip.a1) this.b).c;
                c1Var.O = false;
                c1Var.requestLayout();
                break;
            case 27:
                org.telegram.ui.Components.voip.z1 z1Var = (org.telegram.ui.Components.voip.z1) this.b;
                z1Var.N = 0.0f;
                z1Var.O = 0.0f;
                org.telegram.ui.Components.voip.y1 y1Var = z1Var.d;
                y1Var.setScaleX(z1Var.T);
                y1Var.setScaleY(z1Var.T);
                TextureView textureView = z1Var.e;
                if (textureView != null) {
                    textureView.setScaleX(z1Var.U);
                    textureView.setScaleY(z1Var.U);
                }
                z1Var.setTranslationY(0.0f);
                z1Var.setTranslationX(0.0f);
                z1Var.W = z1Var.V;
                z1Var.b0 = null;
                break;
            case 28:
                org.telegram.ui.Components.voip.c2 c2Var2 = (org.telegram.ui.Components.voip.c2) this.b;
                c2Var2.Q = c2Var2.P ? 1.0f : 0.0f;
                c2Var2.a(c2Var2.R, c2Var2.S);
                break;
            default:
                ((org.telegram.ui.Components.voip.d2) this.b).c.e();
                org.telegram.messenger.i0.P3(((org.telegram.ui.Components.voip.d2) this.b).a);
                if (((org.telegram.ui.Components.voip.d2) this.b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.d2) this.b).a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.d2) this.b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.d2) this.b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                ((rx0) ((org.telegram.ui.Cells.i) this.b)).e0.e.c.r = true;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public s9(uq uqVar, s4.n0 n0Var) {
        this.a = 21;
        this.b = uqVar;
    }
}
