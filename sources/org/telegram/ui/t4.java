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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                ((u9) this.b).s = null;
                break;
            case 4:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.b;
                ((v01) jVar).c0.e.c.r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    break;
                }
                break;
            case 5:
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
                h3 h3Var = (h3) this.b;
                if (animator.equals(((ub) h3Var.b).R)) {
                    ((ub) h3Var.b).R = null;
                    break;
                }
                break;
            case 15:
                ub ubVar = (ub) this.b;
                if (animator.equals(ubVar.R)) {
                    ubVar.R = null;
                    break;
                }
                break;
            case 16:
                ((cc) this.b).I.setVisibility(8);
                break;
            case 17:
                ad adVar = (ad) this.b;
                lc lcVar = adVar.m0;
                if (lcVar != null) {
                    if (lcVar.getParent() != null) {
                        ((ViewGroup) adVar.m0.getParent()).removeView(adVar.m0);
                    }
                    adVar.m0 = null;
                }
                adVar.o0 = null;
                super.onAnimationEnd(animator);
                break;
            case 18:
                mk mkVar = (mk) this.b;
                mkVar.setAnimatedTop(0);
                View view = mkVar.F1;
                if (view != null && view.getVisibility() == 0) {
                    mkVar.F1.setTranslationY(((1.0f - mkVar.getTopViewEnterProgress()) * mkVar.F1.getLayoutParams().height) + mkVar.S1);
                }
                mkVar.r5.p9 = null;
                break;
            case 19:
                org.telegram.ui.Components.i40 i40Var = ((xi) this.b).b.e2;
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
                dj djVar = zpVar.Y;
                if (djVar != null) {
                    djVar.run();
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
                h8 h8Var = (h8) this.b;
                for (int i10 = 0; i10 < h8Var.b.getChildCount(); i10++) {
                    e8.a((e8) h8Var.b.getChildAt(i10), h8Var.P, h8Var.Q);
                }
                break;
            case 3:
            default:
                super.onAnimationStart(animator);
                break;
            case 4:
                ((v01) ((org.telegram.ui.Cells.j) this.b)).c0.e.c.r = true;
                break;
        }
    }

    public t4(br brVar, s4.o0 o0Var) {
        this.a = 25;
        this.b = brVar;
    }
}
