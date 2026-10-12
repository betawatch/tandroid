package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class u0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 14:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    break;
                }
                break;
            case 27:
                tq tqVar = (tq) this.b;
                tqVar.h.b(tqVar.H ? 1.0f : 0.0f);
                tqVar.h.invalidateSelf();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                k4 k4Var = (k4) this.b;
                Runnable runnable = k4Var.a0;
                if (runnable != null) {
                    runnable.run();
                    k4Var.a0 = null;
                    break;
                }
                break;
            case 1:
                x3 x3Var = (x3) this.b;
                x3Var.w = 1.0f;
                x3Var.n();
                x3Var.i();
                x3Var.h();
                x3Var.a.unlock();
                break;
            case 2:
                v4 v4Var = (v4) this.b;
                v4Var.getClass();
                v4Var.setVisibility(8);
                break;
            case 3:
                y4 y4Var = (y4) this.b;
                y4Var.c = false;
                y4Var.invalidate();
                break;
            case 4:
                ((z5) this.b).f0.setVisibility(8);
                break;
            case 5:
            case 27:
            default:
                super.onAnimationEnd(animator);
                break;
            case 6:
                ((z9) this.b).v = null;
                break;
            case 7:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.b;
                ((a11) jVar).c0.e.c.r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.b;
                Button button = wVar.n;
                org.telegram.ui.Components.yi0 yi0Var = wVar.f;
                if (button != yi0Var) {
                    yi0Var.setVisibility(4);
                    break;
                } else {
                    wVar.e.setVisibility(4);
                    break;
                }
            case 9:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.f0) this.b).x = null;
                break;
            case 10:
                ((org.telegram.ui.Cells.g4) this.b).G = null;
                break;
            case 11:
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) this.b;
                if (animator.equals(t5Var.n)) {
                    t5Var.n = null;
                    break;
                }
                break;
            case 12:
                androidx.activity.i iVar = (androidx.activity.i) this.b;
                if (animator.equals(((org.telegram.ui.Cells.v5) iVar.b).d)) {
                    ((org.telegram.ui.Cells.v5) iVar.b).d = null;
                    break;
                }
                break;
            case 13:
                AndroidUtilities.runOnUIThread(((org.telegram.ui.Cells.v5) this.b).e, 1000L);
                break;
            case 14:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) this.b;
                t7Var.n.isMediaSpoilersRevealedInSharedMedia = true;
                t7Var.invalidate();
                break;
            case 16:
                super.onAnimationEnd(animator);
                org.telegram.ui.Cells.da daVar = (org.telegram.ui.Cells.da) this.b;
                ((org.telegram.ui.Cells.ea) daVar.b).a.getTransitionParams().j();
                ((org.telegram.ui.Cells.ea) daVar.b).a.getTransitionParams().g = false;
                ((org.telegram.ui.Cells.ea) daVar.b).a.getTransitionParams().K1 = 1.0f;
                break;
            case 17:
                k3 k3Var = (k3) this.b;
                if (animator.equals(((ac) k3Var.b).R)) {
                    ((ac) k3Var.b).R = null;
                    break;
                }
                break;
            case 18:
                ac acVar = (ac) this.b;
                if (animator.equals(acVar.R)) {
                    acVar.R = null;
                    break;
                }
                break;
            case 19:
                ((ic) this.b).I.setVisibility(8);
                break;
            case 20:
                hd hdVar = (hd) this.b;
                rc rcVar = hdVar.m0;
                if (rcVar != null) {
                    if (rcVar.getParent() != null) {
                        ((ViewGroup) hdVar.m0.getParent()).removeView(hdVar.m0);
                    }
                    hdVar.m0 = null;
                }
                hdVar.o0 = null;
                super.onAnimationEnd(animator);
                break;
            case 21:
                gi giVar = (gi) this.b;
                if (giVar.a) {
                    giVar.d.setTranslationY(0.0f);
                }
                if (giVar.b) {
                    giVar.e.setTranslationY(0.0f);
                }
                if (giVar.f) {
                    giVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.z9 z9Var = giVar.c;
                if (z9Var != null) {
                    z9Var.setTranslationY(0.0f);
                }
                giVar.n.H2[1] = null;
                break;
            case 22:
                sk skVar = (sk) this.b;
                skVar.setAnimatedTop(0);
                View view = skVar.G1;
                if (view != null && view.getVisibility() == 0) {
                    skVar.G1.setTranslationY(((1.0f - skVar.getTopViewEnterProgress()) * skVar.G1.getLayoutParams().height) + skVar.T1);
                }
                skVar.r5.p9 = null;
                break;
            case 23:
                org.telegram.ui.Components.v40 v40Var = ((bj) this.b).b.e2;
                if (v40Var != null) {
                    v40Var.setVisibility(8);
                    break;
                }
                break;
            case 24:
                bi.t tVar = (bi.t) this.b;
                org.telegram.ui.Components.u60 u60Var = ((rm) ((lm) tVar.c).c).Q.b3;
                if (u60Var != null) {
                    u60Var.setIsMessageTransition(false);
                    ((rm) ((lm) tVar.c).c).Q.b3.c(true);
                    ((rm) ((lm) tVar.c).c).Q.b3.setVisibility(4);
                    break;
                }
                break;
            case 25:
                qm qmVar = (qm) this.b;
                rm rmVar = qmVar.b;
                ArrayList arrayList = rmVar.Q.n6;
                org.telegram.ui.Cells.u1 u1Var = qmVar.a;
                arrayList.remove(u1Var);
                View view2 = rmVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    rmVar.Q.x0.invalidate();
                }
                u1Var.setAlpha(1.0f);
                u1Var.getTransitionParams().x0 = false;
                break;
            case 26:
                dq dqVar = (dq) this.b;
                dqVar.L = 0.0f;
                dqVar.K = 1.0f;
                View view3 = dqVar.a0;
                if (view3 != null) {
                    view3.invalidate();
                }
                dqVar.T.invalidate();
                gj gjVar = dqVar.Y;
                if (gjVar != null) {
                    gjVar.run();
                    dqVar.Y = null;
                    break;
                }
                break;
            case 28:
                fr frVar = (fr) this.b;
                View view4 = frVar.b;
                view4.setAlpha(1.0f);
                s4.n0.x0(view4);
                ((yr) frVar.d).c.removeView(view4);
                break;
            case 29:
                org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) this.b;
                j6Var.d = null;
                j6Var.b.clear();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 2:
                ((v4) this.b).setVisibility(0);
                break;
            case 5:
                l8 l8Var = (l8) this.b;
                for (int i10 = 0; i10 < l8Var.b.getChildCount(); i10++) {
                    i8.a((i8) l8Var.b.getChildAt(i10), l8Var.P, l8Var.Q);
                }
                break;
            case 7:
                ((a11) ((org.telegram.ui.Cells.j) this.b)).c0.e.c.r = true;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public u0(fr frVar, s4.n0 n0Var) {
        this.a = 28;
        this.b = frVar;
    }
}
