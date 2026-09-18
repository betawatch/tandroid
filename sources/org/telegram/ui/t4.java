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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class t4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t4(Object obj, int i10) {
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
                pq pqVar = (pq) this.b;
                pqVar.h.b(pqVar.H ? 1.0f : 0.0f);
                pqVar.h.invalidateSelf();
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
                u4 u4Var = (u4) this.b;
                u4Var.c = false;
                u4Var.invalidate();
                break;
            case 1:
                ((v5) this.b).f0.setVisibility(8);
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
                ((w01) jVar).c0.e.c.r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.b;
                Button button = wVar.n;
                org.telegram.ui.Components.yh0 yh0Var = wVar.f;
                if (button != yh0Var) {
                    yh0Var.setVisibility(4);
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
                ((org.telegram.ui.Cells.f4) this.b).G = null;
                break;
            case 8:
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) this.b;
                if (animator.equals(s5Var.n)) {
                    s5Var.n = null;
                    break;
                }
                break;
            case 9:
                ai.q4 q4Var = (ai.q4) this.b;
                if (animator.equals(((org.telegram.ui.Cells.u5) q4Var.b).d)) {
                    ((org.telegram.ui.Cells.u5) q4Var.b).d = null;
                    break;
                }
                break;
            case 10:
                AndroidUtilities.runOnUIThread(((org.telegram.ui.Cells.u5) this.b).e, 1000L);
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
                h3 h3Var = (h3) this.b;
                if (animator.equals(((wb) h3Var.b).R)) {
                    ((wb) h3Var.b).R = null;
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
                ((ec) this.b).I.setVisibility(8);
                break;
            case 17:
                cd cdVar = (cd) this.b;
                nc ncVar = cdVar.m0;
                if (ncVar != null) {
                    if (ncVar.getParent() != null) {
                        ((ViewGroup) cdVar.m0.getParent()).removeView(cdVar.m0);
                    }
                    cdVar.m0 = null;
                }
                cdVar.o0 = null;
                super.onAnimationEnd(animator);
                break;
            case 18:
                nk nkVar = (nk) this.b;
                nkVar.setAnimatedTop(0);
                View view = nkVar.F1;
                if (view != null && view.getVisibility() == 0) {
                    nkVar.F1.setTranslationY(((1.0f - nkVar.getTopViewEnterProgress()) * nkVar.F1.getLayoutParams().height) + nkVar.S1);
                }
                nkVar.r5.p9 = null;
                break;
            case 19:
                org.telegram.ui.Components.i40 i40Var = ((yi) this.b).b.e2;
                if (i40Var != null) {
                    i40Var.setVisibility(8);
                    break;
                }
                break;
            case 20:
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
                org.telegram.ui.Components.u9 u9Var = amVar.c;
                if (u9Var != null) {
                    u9Var.setTranslationY(0.0f);
                }
                amVar.n.H2[1] = null;
                break;
            case 21:
                hm hmVar = (hm) ((ai.z) this.b).c;
                gl glVar = ((nm) hmVar.c).Q.b3;
                if (glVar != null) {
                    glVar.setIsMessageTransition(false);
                    ((nm) hmVar.c).Q.b3.h(true);
                    ((nm) hmVar.c).Q.b3.setVisibility(4);
                    break;
                }
                break;
            case 22:
                mm mmVar = (mm) this.b;
                nm nmVar = mmVar.b;
                ArrayList arrayList = nmVar.Q.n6;
                org.telegram.ui.Cells.t1 t1Var = mmVar.a;
                arrayList.remove(t1Var);
                View view2 = nmVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    nmVar.Q.x0.invalidate();
                }
                t1Var.setAlpha(1.0f);
                t1Var.getTransitionParams().x0 = false;
                break;
            case 23:
                zp zpVar = (zp) this.b;
                zpVar.L = 0.0f;
                zpVar.K = 1.0f;
                View view3 = zpVar.a0;
                if (view3 != null) {
                    view3.invalidate();
                }
                zpVar.T.invalidate();
                ej ejVar = zpVar.Y;
                if (ejVar != null) {
                    ejVar.run();
                    zpVar.Y = null;
                    break;
                }
                break;
            case 25:
                br brVar = (br) this.b;
                View view4 = brVar.b;
                view4.setAlpha(1.0f);
                s4.o0.x0(view4);
                ((ur) brVar.d).c.removeView(view4);
                break;
            case 26:
                org.telegram.ui.Components.f6 f6Var = (org.telegram.ui.Components.f6) this.b;
                f6Var.d = null;
                f6Var.b.clear();
                break;
            case 27:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.b;
                animatedPhoneNumberEditText.n = null;
                animatedPhoneNumberEditText.f.clear();
                break;
            case 28:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.m6 m6Var = (org.telegram.ui.Components.m6) this.b;
                m6Var.c();
                m6Var.k = null;
                m6Var.h = 0.0f;
                m6Var.m = 0.0f;
                m6Var.invalidateSelf();
                Runnable runnable = m6Var.V;
                if (runnable != null) {
                    runnable.run();
                }
                m6Var.o = null;
                CharSequence charSequence = m6Var.p;
                if (charSequence == null) {
                    org.telegram.ui.Components.ng ngVar = m6Var.C;
                    if (ngVar != null) {
                        ngVar.run();
                        break;
                    }
                } else {
                    m6Var.q(charSequence, true, m6Var.q);
                    m6Var.p = null;
                    m6Var.q = false;
                    break;
                }
                break;
            case 29:
                org.telegram.ui.Components.u9 u9Var2 = (org.telegram.ui.Components.u9) this.b;
                u9Var2.setVisibility(8);
                u9Var2.setImageDrawable(null);
                u9Var2.setAlpha(1.0f);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 2:
                j8 j8Var = (j8) this.b;
                for (int i10 = 0; i10 < j8Var.b.getChildCount(); i10++) {
                    g8.a((g8) j8Var.b.getChildAt(i10), j8Var.P, j8Var.Q);
                }
                break;
            case 3:
            default:
                super.onAnimationStart(animator);
                break;
            case 4:
                ((w01) ((org.telegram.ui.Cells.j) this.b)).c0.e.c.r = true;
                break;
        }
    }

    public t4(br brVar, s4.o0 o0Var) {
        this.a = 25;
        this.b = brVar;
    }
}
