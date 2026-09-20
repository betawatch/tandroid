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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) this.b;
                AnimatorSet animatorSet = r7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    r7Var.h = null;
                    break;
                }
                break;
            case 24:
                nq nqVar = (nq) this.b;
                nqVar.h.b(nqVar.H ? 1.0f : 0.0f);
                nqVar.h.invalidateSelf();
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
                ((v9) this.b).s = null;
                break;
            case 4:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.b;
                ((u01) jVar).c0.e.c.r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.b;
                Button button = wVar.n;
                org.telegram.ui.Components.hi0 hi0Var = wVar.f;
                if (button != hi0Var) {
                    hi0Var.setVisibility(4);
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
                ((org.telegram.ui.Cells.h4) this.b).G = null;
                break;
            case 8:
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) this.b;
                if (animator.equals(u5Var.n)) {
                    u5Var.n = null;
                    break;
                }
                break;
            case 9:
                ai.q4 q4Var = (ai.q4) this.b;
                if (animator.equals(((org.telegram.ui.Cells.w5) q4Var.b).d)) {
                    ((org.telegram.ui.Cells.w5) q4Var.b).d = null;
                    break;
                }
                break;
            case 10:
                AndroidUtilities.runOnUIThread(((org.telegram.ui.Cells.w5) this.b).e, 1000L);
                break;
            case 11:
                org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) this.b;
                AnimatorSet animatorSet = r7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    r7Var.h = null;
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) this.b;
                u7Var.n.isMediaSpoilersRevealedInSharedMedia = true;
                u7Var.invalidate();
                break;
            case 13:
                super.onAnimationEnd(animator);
                org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) this.b;
                ((org.telegram.ui.Cells.ha) gaVar.b).a.getTransitionParams().j();
                ((org.telegram.ui.Cells.ha) gaVar.b).a.getTransitionParams().g = false;
                ((org.telegram.ui.Cells.ha) gaVar.b).a.getTransitionParams().K1 = 1.0f;
                break;
            case 14:
                h3 h3Var = (h3) this.b;
                if (animator.equals(((vb) h3Var.b).R)) {
                    ((vb) h3Var.b).R = null;
                    break;
                }
                break;
            case 15:
                vb vbVar = (vb) this.b;
                if (animator.equals(vbVar.R)) {
                    vbVar.R = null;
                    break;
                }
                break;
            case 16:
                ((dc) this.b).I.setVisibility(8);
                break;
            case 17:
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
            case 18:
                lk lkVar = (lk) this.b;
                lkVar.setAnimatedTop(0);
                View view = lkVar.F1;
                if (view != null && view.getVisibility() == 0) {
                    lkVar.F1.setTranslationY(((1.0f - lkVar.getTopViewEnterProgress()) * lkVar.F1.getLayoutParams().height) + lkVar.S1);
                }
                lkVar.q5.p9 = null;
                break;
            case 19:
                org.telegram.ui.Components.i40 i40Var = ((wi) this.b).b.e2;
                if (i40Var != null) {
                    i40Var.setVisibility(8);
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
                org.telegram.ui.Components.v9 v9Var = xlVar.c;
                if (v9Var != null) {
                    v9Var.setTranslationY(0.0f);
                }
                xlVar.n.H2[1] = null;
                break;
            case 21:
                ai.z zVar = (ai.z) this.b;
                org.telegram.ui.Components.e60 e60Var = ((lm) ((fm) zVar.c).c).Q.b3;
                if (e60Var != null) {
                    e60Var.setIsMessageTransition(false);
                    ((lm) ((fm) zVar.c).c).Q.b3.c(true);
                    ((lm) ((fm) zVar.c).c).Q.b3.setVisibility(4);
                    break;
                }
                break;
            case 22:
                km kmVar = (km) this.b;
                lm lmVar = kmVar.b;
                ArrayList arrayList = lmVar.Q.n6;
                org.telegram.ui.Cells.u1 u1Var = kmVar.a;
                arrayList.remove(u1Var);
                View view2 = lmVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    lmVar.Q.x0.invalidate();
                }
                u1Var.setAlpha(1.0f);
                u1Var.getTransitionParams().x0 = false;
                break;
            case 23:
                xp xpVar = (xp) this.b;
                xpVar.L = 0.0f;
                xpVar.K = 1.0f;
                View view3 = xpVar.a0;
                if (view3 != null) {
                    view3.invalidate();
                }
                xpVar.T.invalidate();
                cj cjVar = xpVar.Y;
                if (cjVar != null) {
                    cjVar.run();
                    xpVar.Y = null;
                    break;
                }
                break;
            case 25:
                zq zqVar = (zq) this.b;
                View view4 = zqVar.b;
                view4.setAlpha(1.0f);
                s4.o0.x0(view4);
                ((sr) zqVar.d).c.removeView(view4);
                break;
            case 26:
                org.telegram.ui.Components.g6 g6Var = (org.telegram.ui.Components.g6) this.b;
                g6Var.d = null;
                g6Var.b.clear();
                break;
            case 27:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.b;
                animatedPhoneNumberEditText.n = null;
                animatedPhoneNumberEditText.f.clear();
                break;
            case 28:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.n6 n6Var = (org.telegram.ui.Components.n6) this.b;
                n6Var.c();
                n6Var.k = null;
                n6Var.h = 0.0f;
                n6Var.m = 0.0f;
                n6Var.invalidateSelf();
                Runnable runnable = n6Var.V;
                if (runnable != null) {
                    runnable.run();
                }
                n6Var.o = null;
                CharSequence charSequence = n6Var.p;
                if (charSequence == null) {
                    org.telegram.ui.Components.og ogVar = n6Var.C;
                    if (ogVar != null) {
                        ogVar.run();
                        break;
                    }
                } else {
                    n6Var.q(charSequence, true, n6Var.q);
                    n6Var.p = null;
                    n6Var.q = false;
                    break;
                }
                break;
            case 29:
                org.telegram.ui.Components.v9 v9Var2 = (org.telegram.ui.Components.v9) this.b;
                v9Var2.setVisibility(8);
                v9Var2.setImageDrawable(null);
                v9Var2.setAlpha(1.0f);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 2:
                i8 i8Var = (i8) this.b;
                for (int i10 = 0; i10 < i8Var.b.getChildCount(); i10++) {
                    f8.a((f8) i8Var.b.getChildAt(i10), i8Var.P, i8Var.Q);
                }
                break;
            case 3:
            default:
                super.onAnimationStart(animator);
                break;
            case 4:
                ((u01) ((org.telegram.ui.Cells.j) this.b)).c0.e.c.r = true;
                break;
        }
    }

    public t4(zq zqVar, s4.o0 o0Var) {
        this.a = 25;
        this.b = zqVar;
    }
}
