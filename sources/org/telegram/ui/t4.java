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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                ((v9) this.b).v = null;
                break;
            case 4:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.b;
                ((t01) jVar).c0.e.c.r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.b;
                Button button = wVar.n;
                org.telegram.ui.Components.cj0 cj0Var = wVar.f;
                if (button != cj0Var) {
                    cj0Var.setVisibility(4);
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
                ai.r4 r4Var = (ai.r4) this.b;
                if (animator.equals(((org.telegram.ui.Cells.v5) r4Var.b).d)) {
                    ((org.telegram.ui.Cells.v5) r4Var.b).d = null;
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
                org.telegram.ui.Cells.da daVar = (org.telegram.ui.Cells.da) this.b;
                ((org.telegram.ui.Cells.ea) daVar.b).a.getTransitionParams().j();
                ((org.telegram.ui.Cells.ea) daVar.b).a.getTransitionParams().g = false;
                ((org.telegram.ui.Cells.ea) daVar.b).a.getTransitionParams().K1 = 1.0f;
                break;
            case 14:
                i3 i3Var = (i3) this.b;
                if (animator.equals(((vb) i3Var.b).R)) {
                    ((vb) i3Var.b).R = null;
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
                ((cc) this.b).I.setVisibility(8);
                break;
            case 17:
                bd bdVar = (bd) this.b;
                lc lcVar = bdVar.m0;
                if (lcVar != null) {
                    if (lcVar.getParent() != null) {
                        ((ViewGroup) bdVar.m0.getParent()).removeView(bdVar.m0);
                    }
                    bdVar.m0 = null;
                }
                bdVar.o0 = null;
                super.onAnimationEnd(animator);
                break;
            case 18:
                ci ciVar = (ci) this.b;
                if (ciVar.a) {
                    ciVar.d.setTranslationY(0.0f);
                }
                if (ciVar.b) {
                    ciVar.e.setTranslationY(0.0f);
                }
                if (ciVar.f) {
                    ciVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.y9 y9Var = ciVar.c;
                if (y9Var != null) {
                    y9Var.setTranslationY(0.0f);
                }
                ciVar.n.H2[1] = null;
                break;
            case 19:
                ok okVar = (ok) this.b;
                okVar.setAnimatedTop(0);
                View view = okVar.G1;
                if (view != null && view.getVisibility() == 0) {
                    okVar.G1.setTranslationY(((1.0f - okVar.getTopViewEnterProgress()) * okVar.G1.getLayoutParams().height) + okVar.T1);
                }
                okVar.r5.p9 = null;
                break;
            case 20:
                org.telegram.ui.Components.z40 z40Var = ((xi) this.b).b.e2;
                if (z40Var != null) {
                    z40Var.setVisibility(8);
                    break;
                }
                break;
            case 21:
                ai.z zVar = (ai.z) this.b;
                org.telegram.ui.Components.y60 y60Var = ((mm) ((gm) zVar.c).c).Q.b3;
                if (y60Var != null) {
                    y60Var.setIsMessageTransition(false);
                    ((mm) ((gm) zVar.c).c).Q.b3.c(true);
                    ((mm) ((gm) zVar.c).c).Q.b3.setVisibility(4);
                    break;
                }
                break;
            case 22:
                lm lmVar = (lm) this.b;
                mm mmVar = lmVar.b;
                ArrayList arrayList = mmVar.Q.n6;
                org.telegram.ui.Cells.u1 u1Var = lmVar.a;
                arrayList.remove(u1Var);
                View view2 = mmVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    mmVar.Q.x0.invalidate();
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
                s4.p0.x0(view4);
                ((tr) zqVar.d).c.removeView(view4);
                break;
            case 26:
                org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) this.b;
                j6Var.d = null;
                j6Var.b.clear();
                break;
            case 27:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.b;
                animatedPhoneNumberEditText.n = null;
                animatedPhoneNumberEditText.f.clear();
                break;
            case 28:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.q6 q6Var = (org.telegram.ui.Components.q6) this.b;
                q6Var.b();
                q6Var.o = null;
                q6Var.j = 0.0f;
                q6Var.m = 0.0f;
                q6Var.l = 0.0f;
                q6Var.k = 0.0f;
                q6Var.r = 0.0f;
                q6Var.q = 0.0f;
                q6Var.invalidateSelf();
                Runnable runnable = q6Var.b0;
                if (runnable != null) {
                    runnable.run();
                }
                q6Var.t = null;
                CharSequence charSequence = q6Var.u;
                if (charSequence == null) {
                    org.telegram.ui.Components.rg rgVar = q6Var.I;
                    if (rgVar != null) {
                        rgVar.run();
                        break;
                    }
                } else {
                    q6Var.t(charSequence, true, q6Var.v);
                    q6Var.u = null;
                    q6Var.v = false;
                    break;
                }
                break;
            case 29:
                org.telegram.ui.Components.y9 y9Var2 = (org.telegram.ui.Components.y9) this.b;
                y9Var2.setVisibility(8);
                y9Var2.setImageDrawable(null);
                y9Var2.setAlpha(1.0f);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 2:
                g8 g8Var = (g8) this.b;
                for (int i10 = 0; i10 < g8Var.b.getChildCount(); i10++) {
                    d8.a((d8) g8Var.b.getChildAt(i10), g8Var.P, g8Var.Q);
                }
                break;
            case 3:
            default:
                super.onAnimationStart(animator);
                break;
            case 4:
                ((t01) ((org.telegram.ui.Cells.j) this.b)).c0.e.c.r = true;
                break;
        }
    }

    public t4(zq zqVar, s4.p0 p0Var) {
        this.a = 25;
        this.b = zqVar;
    }
}
