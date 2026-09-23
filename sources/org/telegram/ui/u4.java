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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                lq lqVar = (lq) this.b;
                lqVar.h.b(lqVar.H ? 1.0f : 0.0f);
                lqVar.h.invalidateSelf();
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
                ((u9) this.b).s = null;
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
                org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) this.b;
                ((org.telegram.ui.Cells.ha) gaVar.b).a.getTransitionParams().j();
                ((org.telegram.ui.Cells.ha) gaVar.b).a.getTransitionParams().g = false;
                ((org.telegram.ui.Cells.ha) gaVar.b).a.getTransitionParams().K1 = 1.0f;
                break;
            case 14:
                i3 i3Var = (i3) this.b;
                if (animator.equals(((ub) i3Var.b).R)) {
                    ((ub) i3Var.b).R = null;
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
                ((bc) this.b).I.setVisibility(8);
                break;
            case 17:
                ad adVar = (ad) this.b;
                kc kcVar = adVar.m0;
                if (kcVar != null) {
                    if (kcVar.getParent() != null) {
                        ((ViewGroup) adVar.m0.getParent()).removeView(adVar.m0);
                    }
                    adVar.m0 = null;
                }
                adVar.o0 = null;
                super.onAnimationEnd(animator);
                break;
            case 18:
                jk jkVar = (jk) this.b;
                jkVar.setAnimatedTop(0);
                View view = jkVar.F1;
                if (view != null && view.getVisibility() == 0) {
                    jkVar.F1.setTranslationY(((1.0f - jkVar.getTopViewEnterProgress()) * jkVar.F1.getLayoutParams().height) + jkVar.S1);
                }
                jkVar.r5.p9 = null;
                break;
            case 19:
                org.telegram.ui.Components.j40 j40Var = ((ui) this.b).b.e2;
                if (j40Var != null) {
                    j40Var.setVisibility(8);
                    break;
                }
                break;
            case 20:
                xl xlVar = (xl) this.b;
                if (xlVar.a) {
                    xlVar.d.setTranslationY(0.0f);
                }
                if (xlVar.b) {
                    xlVar.e.setTranslationY(0.0f);
                }
                if (xlVar.f) {
                    xlVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.w9 w9Var = xlVar.c;
                if (w9Var != null) {
                    w9Var.setTranslationY(0.0f);
                }
                xlVar.n.H2[1] = null;
                break;
            case 21:
                em emVar = (em) ((ai.z) this.b).c;
                dl dlVar = ((km) emVar.c).Q.b3;
                if (dlVar != null) {
                    dlVar.setIsMessageTransition(false);
                    ((km) emVar.c).Q.b3.h(true);
                    ((km) emVar.c).Q.b3.setVisibility(4);
                    break;
                }
                break;
            case 22:
                jm jmVar = (jm) this.b;
                km kmVar = jmVar.b;
                ArrayList arrayList = kmVar.Q.n6;
                org.telegram.ui.Cells.t1 t1Var = jmVar.a;
                arrayList.remove(t1Var);
                View view2 = kmVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    kmVar.Q.x0.invalidate();
                }
                t1Var.setAlpha(1.0f);
                t1Var.getTransitionParams().x0 = false;
                break;
            case 23:
                vp vpVar = (vp) this.b;
                vpVar.L = 0.0f;
                vpVar.K = 1.0f;
                View view3 = vpVar.a0;
                if (view3 != null) {
                    view3.invalidate();
                }
                vpVar.T.invalidate();
                aj ajVar = vpVar.Y;
                if (ajVar != null) {
                    ajVar.run();
                    vpVar.Y = null;
                    break;
                }
                break;
            case 25:
                xq xqVar = (xq) this.b;
                View view4 = xqVar.b;
                view4.setAlpha(1.0f);
                s4.o0.x0(view4);
                ((qr) xqVar.d).c.removeView(view4);
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
                    org.telegram.ui.Components.og ogVar = o6Var.C;
                    if (ogVar != null) {
                        ogVar.run();
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
                ((n01) ((org.telegram.ui.Cells.j) this.b)).c0.e.c.r = true;
                break;
        }
    }

    public u4(xq xqVar, s4.o0 o0Var) {
        this.a = 25;
        this.b = xqVar;
    }
}
