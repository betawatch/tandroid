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
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class u4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u4(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 11:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    break;
                }
                break;
            case 24:
                mq mqVar = (mq) this.b;
                mqVar.h.b(mqVar.H ? 1.0f : 0.0f);
                mqVar.h.invalidateSelf();
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
                v4 v4Var = (v4) this.b;
                v4Var.c = false;
                v4Var.invalidate();
                break;
            case 1:
                ((w5) this.b).f0.setVisibility(8);
                break;
            case 2:
            case 24:
            default:
                super.onAnimationEnd(animator);
                break;
            case 3:
                ((w9) this.b).s = null;
                break;
            case 4:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.b;
                ((n01) jVar).c0.e.c.r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.b;
                Button button = wVar.n;
                org.telegram.ui.Components.ki0 ki0Var = wVar.f;
                if (button != ki0Var) {
                    ki0Var.setVisibility(4);
                    break;
                } else {
                    wVar.e.setVisibility(4);
                    break;
                }
            case 6:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.e0) this.b).x = null;
                break;
            case 7:
                ((org.telegram.ui.Cells.g4) this.b).G = null;
                break;
            case 8:
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) this.b;
                if (animator.equals(t5Var.n)) {
                    t5Var.n = null;
                    break;
                }
                break;
            case 9:
                ai.q4 q4Var = (ai.q4) this.b;
                if (animator.equals(((org.telegram.ui.Cells.v5) q4Var.b).d)) {
                    ((org.telegram.ui.Cells.v5) q4Var.b).d = null;
                    break;
                }
                break;
            case 10:
                AndroidUtilities.runOnUIThread(((org.telegram.ui.Cells.v5) this.b).e, 1000L);
                break;
            case 11:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) this.b;
                t7Var.n.isMediaSpoilersRevealedInSharedMedia = true;
                t7Var.invalidate();
                break;
            case 13:
                super.onAnimationEnd(animator);
                org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) this.b;
                ((org.telegram.ui.Cells.ga) faVar.b).a.getTransitionParams().j();
                ((org.telegram.ui.Cells.ga) faVar.b).a.getTransitionParams().g = false;
                ((org.telegram.ui.Cells.ga) faVar.b).a.getTransitionParams().K1 = 1.0f;
                break;
            case 14:
                i3 i3Var = (i3) this.b;
                if (animator.equals(((wb) i3Var.b).R)) {
                    ((wb) i3Var.b).R = null;
                    break;
                }
                break;
            case 15:
                wb wbVar = (wb) this.b;
                if (animator.equals(wbVar.R)) {
                    wbVar.R = null;
                    break;
                }
                break;
            case 16:
                ((dc) this.b).H.setVisibility(8);
                break;
            case 17:
                cd cdVar = (cd) this.b;
                mc mcVar = cdVar.m0;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) cdVar.m0.getParent()).removeView(cdVar.m0);
                    }
                    cdVar.m0 = null;
                }
                cdVar.o0 = null;
                super.onAnimationEnd(animator);
                break;
            case 18:
                jk jkVar = (jk) this.b;
                jkVar.setAnimatedTop(0);
                View view = jkVar.G1;
                if (view != null && view.getVisibility() == 0) {
                    jkVar.G1.setTranslationY(((1.0f - jkVar.getTopViewEnterProgress()) * jkVar.G1.getLayoutParams().height) + jkVar.T1);
                }
                jkVar.r5.n9 = null;
                break;
            case 19:
                org.telegram.ui.Components.m40 m40Var = ((vi) this.b).b.c2;
                if (m40Var != null) {
                    m40Var.setVisibility(8);
                    break;
                }
                break;
            case 20:
                wl wlVar = (wl) this.b;
                if (wlVar.a) {
                    wlVar.d.setTranslationY(0.0f);
                }
                if (wlVar.b) {
                    wlVar.e.setTranslationY(0.0f);
                }
                if (wlVar.f) {
                    wlVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.w9 w9Var = wlVar.c;
                if (w9Var != null) {
                    w9Var.setTranslationY(0.0f);
                }
                wlVar.n.F2[1] = null;
                break;
            case 21:
                ai.z zVar = (ai.z) this.b;
                org.telegram.ui.Components.k60 k60Var = ((jm) ((dm) zVar.c).c).Q.Z2;
                if (k60Var != null) {
                    k60Var.setIsMessageTransition(false);
                    ((jm) ((dm) zVar.c).c).Q.Z2.c(true);
                    ((jm) ((dm) zVar.c).c).Q.Z2.setVisibility(4);
                    break;
                }
                break;
            case 22:
                im imVar = (im) this.b;
                jm jmVar = imVar.b;
                ArrayList arrayList = jmVar.Q.l6;
                org.telegram.ui.Cells.u1 u1Var = imVar.a;
                arrayList.remove(u1Var);
                View view2 = jmVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    jmVar.Q.v0.invalidate();
                }
                u1Var.setAlpha(1.0f);
                u1Var.getTransitionParams().x0 = false;
                break;
            case 23:
                wp wpVar = (wp) this.b;
                wpVar.L = 0.0f;
                wpVar.K = 1.0f;
                View view3 = wpVar.a0;
                if (view3 != null) {
                    view3.invalidate();
                }
                wpVar.T.invalidate();
                bj bjVar = wpVar.Y;
                if (bjVar != null) {
                    bjVar.run();
                    wpVar.Y = null;
                    break;
                }
                break;
            case 25:
                yq yqVar = (yq) this.b;
                View view4 = yqVar.b;
                view4.setAlpha(1.0f);
                s4.o0.x0(view4);
                ((rr) yqVar.d).c.removeView(view4);
                break;
            case 26:
                org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) this.b;
                h6Var.d = null;
                h6Var.b.clear();
                break;
            case 27:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.b;
                animatedPhoneNumberEditText.n = null;
                animatedPhoneNumberEditText.f.clear();
                break;
            case 28:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) this.b;
                o6Var.c();
                o6Var.k = null;
                o6Var.h = 0.0f;
                o6Var.m = 0.0f;
                o6Var.invalidateSelf();
                Runnable runnable = o6Var.V;
                if (runnable != null) {
                    runnable.run();
                }
                o6Var.o = null;
                CharSequence charSequence = o6Var.p;
                if (charSequence == null) {
                    org.telegram.ui.Components.qg qgVar = o6Var.C;
                    if (qgVar != null) {
                        qgVar.run();
                        break;
                    }
                } else {
                    o6Var.q(charSequence, true, o6Var.q);
                    o6Var.p = null;
                    o6Var.q = false;
                    break;
                }
                break;
            case 29:
                org.telegram.ui.Components.w9 w9Var2 = (org.telegram.ui.Components.w9) this.b;
                w9Var2.setVisibility(8);
                w9Var2.setImageDrawable(null);
                w9Var2.setAlpha(1.0f);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 2:
                k8 k8Var = (k8) this.b;
                for (int i10 = 0; i10 < k8Var.b.getChildCount(); i10++) {
                    h8.a((h8) k8Var.b.getChildAt(i10), k8Var.P, k8Var.Q);
                }
                break;
            case 3:
            default:
                super.onAnimationStart(animator);
                break;
            case 4:
                ((n01) ((org.telegram.ui.Cells.j) this.b)).c0.e.c.r = true;
                break;
        }
    }

    public u4(yq yqVar, s4.o0 o0Var) {
        this.a = 25;
        this.b = yqVar;
    }
}
