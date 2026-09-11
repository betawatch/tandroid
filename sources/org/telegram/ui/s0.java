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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class s0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s0(Object obj, int i10) {
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
                qq qqVar = (qq) this.b;
                qqVar.h.b(qqVar.H ? 1.0f : 0.0f);
                qqVar.h.invalidateSelf();
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
                i4 i4Var = (i4) this.b;
                Runnable runnable = i4Var.a0;
                if (runnable != null) {
                    runnable.run();
                    i4Var.a0 = null;
                    break;
                }
                break;
            case 1:
                v3 v3Var = (v3) this.b;
                v3Var.w = 1.0f;
                v3Var.n();
                v3Var.i();
                v3Var.h();
                v3Var.a.unlock();
                break;
            case 2:
                r4 r4Var = (r4) this.b;
                r4Var.getClass();
                r4Var.setVisibility(8);
                break;
            case 3:
                u4 u4Var = (u4) this.b;
                u4Var.c = false;
                u4Var.invalidate();
                break;
            case 4:
                ((v5) this.b).f0.setVisibility(8);
                break;
            case 5:
            case 27:
            default:
                super.onAnimationEnd(animator);
                break;
            case 6:
                ((u9) this.b).s = null;
                break;
            case 7:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.b;
                ((v01) jVar).c0.e.c.r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.b;
                Button button = wVar.n;
                org.telegram.ui.Components.xh0 xh0Var = wVar.f;
                if (button != xh0Var) {
                    xh0Var.setVisibility(4);
                    break;
                } else {
                    wVar.e.setVisibility(4);
                    break;
                }
            case 9:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.e0) this.b).x = null;
                break;
            case 10:
                ((org.telegram.ui.Cells.f4) this.b).G = null;
                break;
            case 11:
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) this.b;
                if (animator.equals(s5Var.n)) {
                    s5Var.n = null;
                    break;
                }
                break;
            case 12:
                androidx.activity.i iVar = (androidx.activity.i) this.b;
                if (animator.equals(((org.telegram.ui.Cells.u5) iVar.b).d)) {
                    ((org.telegram.ui.Cells.u5) iVar.b).d = null;
                    break;
                }
                break;
            case 13:
                AndroidUtilities.runOnUIThread(((org.telegram.ui.Cells.u5) this.b).e, 1000L);
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
                org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) this.b;
                ((org.telegram.ui.Cells.ga) faVar.b).a.getTransitionParams().j();
                ((org.telegram.ui.Cells.ga) faVar.b).a.getTransitionParams().g = false;
                ((org.telegram.ui.Cells.ga) faVar.b).a.getTransitionParams().K1 = 1.0f;
                break;
            case 17:
                i3 i3Var = (i3) this.b;
                if (animator.equals(((ub) i3Var.b).V)) {
                    ((ub) i3Var.b).V = null;
                    break;
                }
                break;
            case 18:
                ub ubVar = (ub) this.b;
                if (animator.equals(ubVar.V)) {
                    ubVar.V = null;
                    break;
                }
                break;
            case 19:
                ((cc) this.b).I.setVisibility(8);
                break;
            case 20:
                bd bdVar = (bd) this.b;
                mc mcVar = bdVar.m0;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) bdVar.m0.getParent()).removeView(bdVar.m0);
                    }
                    bdVar.m0 = null;
                }
                bdVar.o0 = null;
                super.onAnimationEnd(animator);
                break;
            case 21:
                mk mkVar = (mk) this.b;
                mkVar.setAnimatedTop(0);
                View view = mkVar.F1;
                if (view != null && view.getVisibility() == 0) {
                    mkVar.F1.setTranslationY(((1.0f - mkVar.getTopViewEnterProgress()) * mkVar.F1.getLayoutParams().height) + mkVar.S1);
                }
                mkVar.q5.p9 = null;
                break;
            case 22:
                org.telegram.ui.Components.i40 i40Var = ((xi) this.b).b.e2;
                if (i40Var != null) {
                    i40Var.setVisibility(8);
                    break;
                }
                break;
            case 23:
                am amVar = (am) this.b;
                if (amVar.a) {
                    amVar.d.setTranslationY(0.0f);
                }
                if (amVar.b) {
                    amVar.e.setTranslationY(0.0f);
                }
                if (amVar.f) {
                    amVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.x9 x9Var = amVar.c;
                if (x9Var != null) {
                    x9Var.setTranslationY(0.0f);
                }
                amVar.n.H2[1] = null;
                break;
            case 24:
                im imVar = (im) ((bi.t) this.b).c;
                gl glVar = ((om) imVar.c).Q.b3;
                if (glVar != null) {
                    glVar.setIsMessageTransition(false);
                    ((om) imVar.c).Q.b3.h(true);
                    ((om) imVar.c).Q.b3.setVisibility(4);
                    break;
                }
                break;
            case 25:
                nm nmVar = (nm) this.b;
                om omVar = nmVar.b;
                ArrayList arrayList = omVar.Q.n6;
                org.telegram.ui.Cells.t1 t1Var = nmVar.a;
                arrayList.remove(t1Var);
                View view2 = omVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    omVar.Q.x0.invalidate();
                }
                t1Var.setAlpha(1.0f);
                t1Var.getTransitionParams().x0 = false;
                break;
            case 26:
                aq aqVar = (aq) this.b;
                aqVar.L = 0.0f;
                aqVar.K = 1.0f;
                View view3 = aqVar.a0;
                if (view3 != null) {
                    view3.invalidate();
                }
                aqVar.T.invalidate();
                dj djVar = aqVar.Y;
                if (djVar != null) {
                    djVar.run();
                    aqVar.Y = null;
                    break;
                }
                break;
            case 28:
                cr crVar = (cr) this.b;
                View view4 = crVar.b;
                view4.setAlpha(1.0f);
                s4.o0.x0(view4);
                ((vr) crVar.d).c.removeView(view4);
                break;
            case 29:
                org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) this.b;
                h6Var.d = null;
                h6Var.b.clear();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 2:
                ((r4) this.b).setVisibility(0);
                break;
            case 5:
                h8 h8Var = (h8) this.b;
                for (int i10 = 0; i10 < h8Var.b.getChildCount(); i10++) {
                    e8.a((e8) h8Var.b.getChildAt(i10), h8Var.P, h8Var.Q);
                }
                break;
            case 7:
                ((v01) ((org.telegram.ui.Cells.j) this.b)).c0.e.c.r = true;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public s0(cr crVar, s4.o0 o0Var) {
        this.a = 28;
        this.b = crVar;
    }
}
