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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class u5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 10:
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) this.b;
                AnimatorSet animatorSet = n7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    n7Var.h = null;
                    break;
                }
                break;
            case 23:
                lq lqVar = (lq) this.b;
                lqVar.h.b(lqVar.E ? 1.0f : 0.0f);
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
                ((a6) this.b).c0.setVisibility(8);
                break;
            case 1:
            case 23:
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                ((x9) this.b).s = null;
                break;
            case 3:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.b;
                ((i01) jVar).W.e.c.r = false;
                FrameLayout frameLayout = jVar.G;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.H);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.b;
                Button button = wVar.n;
                org.telegram.ui.Components.fi0 fi0Var = wVar.f;
                if (button != fi0Var) {
                    fi0Var.setVisibility(4);
                    break;
                } else {
                    wVar.e.setVisibility(4);
                    break;
                }
            case 5:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.e0) this.b).x = null;
                break;
            case 6:
                ((org.telegram.ui.Cells.f4) this.b).D = null;
                break;
            case 7:
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) this.b;
                if (animator.equals(s5Var.n)) {
                    s5Var.n = null;
                    break;
                }
                break;
            case 8:
                m2.b bVar = (m2.b) this.b;
                if (animator.equals(((org.telegram.ui.Cells.u5) bVar.b).d)) {
                    ((org.telegram.ui.Cells.u5) bVar.b).d = null;
                    break;
                }
                break;
            case 9:
                AndroidUtilities.runOnUIThread(((org.telegram.ui.Cells.u5) this.b).e, 1000L);
                break;
            case 10:
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) this.b;
                AnimatorSet animatorSet = n7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    n7Var.h = null;
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.b;
                q7Var.n.isMediaSpoilersRevealedInSharedMedia = true;
                q7Var.invalidate();
                break;
            case 12:
                super.onAnimationEnd(animator);
                org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) this.b;
                ((org.telegram.ui.Cells.ba) aaVar.b).a.getTransitionParams().j();
                ((org.telegram.ui.Cells.ba) aaVar.b).a.getTransitionParams().g = false;
                ((org.telegram.ui.Cells.ba) aaVar.b).a.getTransitionParams().K1 = 1.0f;
                break;
            case 13:
                n3 n3Var = (n3) this.b;
                if (animator.equals(((ub) n3Var.b).S)) {
                    ((ub) n3Var.b).S = null;
                    break;
                }
                break;
            case 14:
                ub ubVar = (ub) this.b;
                if (animator.equals(ubVar.S)) {
                    ubVar.S = null;
                    break;
                }
                break;
            case 15:
                ((cc) this.b).F.setVisibility(8);
                break;
            case 16:
                dd ddVar = (dd) this.b;
                mc mcVar = ddVar.j0;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) ddVar.j0.getParent()).removeView(ddVar.j0);
                    }
                    ddVar.j0 = null;
                }
                ddVar.l0 = null;
                super.onAnimationEnd(animator);
                break;
            case 17:
                lk lkVar = (lk) this.b;
                lkVar.setAnimatedTop(0);
                View view = lkVar.C1;
                if (view != null && view.getVisibility() == 0) {
                    lkVar.C1.setTranslationY(((1.0f - lkVar.getTopViewEnterProgress()) * lkVar.C1.getLayoutParams().height) + lkVar.P1);
                }
                lkVar.n5.m9 = null;
                break;
            case 18:
                org.telegram.ui.Components.l40 l40Var = ((vi) this.b).b.b2;
                if (l40Var != null) {
                    l40Var.setVisibility(8);
                    break;
                }
                break;
            case 19:
                zl zlVar = (zl) this.b;
                if (zlVar.a) {
                    zlVar.d.setTranslationY(0.0f);
                }
                if (zlVar.b) {
                    zlVar.e.setTranslationY(0.0f);
                }
                if (zlVar.f) {
                    zlVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.p9 p9Var = zlVar.c;
                if (p9Var != null) {
                    p9Var.setTranslationY(0.0f);
                }
                zlVar.n.E2[1] = null;
                break;
            case 20:
                hh.f fVar = (hh.f) ((dg.y2) this.b).c;
                fl flVar = ((lm) fVar.c).N.Y2;
                if (flVar != null) {
                    flVar.setIsMessageTransition(false);
                    ((lm) fVar.c).N.Y2.h(true);
                    ((lm) fVar.c).N.Y2.setVisibility(4);
                    break;
                }
                break;
            case 21:
                km kmVar = (km) this.b;
                lm lmVar = kmVar.b;
                ArrayList arrayList = lmVar.N.k6;
                org.telegram.ui.Cells.s1 s1Var = kmVar.a;
                arrayList.remove(s1Var);
                View view2 = lmVar.N.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    lmVar.N.u0.invalidate();
                }
                s1Var.setAlpha(1.0f);
                s1Var.getTransitionParams().x0 = false;
                break;
            case 22:
                vp vpVar = (vp) this.b;
                vpVar.I = 0.0f;
                vpVar.H = 1.0f;
                View view3 = vpVar.X;
                if (view3 != null) {
                    view3.invalidate();
                }
                vpVar.Q.invalidate();
                bj bjVar = vpVar.V;
                if (bjVar != null) {
                    bjVar.run();
                    vpVar.V = null;
                    break;
                }
                break;
            case 24:
                xq xqVar = (xq) this.b;
                View view4 = xqVar.b;
                view4.setAlpha(1.0f);
                f2.v0.x0(view4);
                ((rr) xqVar.d).c.removeView(view4);
                break;
            case 25:
                org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) this.b;
                c6Var.d = null;
                c6Var.b.clear();
                break;
            case 26:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.b;
                animatedPhoneNumberEditText.n = null;
                animatedPhoneNumberEditText.f.clear();
                break;
            case 27:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) this.b;
                j6Var.c();
                j6Var.k = null;
                j6Var.h = 0.0f;
                j6Var.m = 0.0f;
                j6Var.invalidateSelf();
                Runnable runnable = j6Var.V;
                if (runnable != null) {
                    runnable.run();
                }
                j6Var.o = null;
                CharSequence charSequence = j6Var.p;
                if (charSequence == null) {
                    org.telegram.ui.Components.fg fgVar = j6Var.C;
                    if (fgVar != null) {
                        fgVar.run();
                        break;
                    }
                } else {
                    j6Var.q(charSequence, true, j6Var.q);
                    j6Var.p = null;
                    j6Var.q = false;
                    break;
                }
                break;
            case 28:
                org.telegram.ui.Components.p9 p9Var2 = (org.telegram.ui.Components.p9) this.b;
                p9Var2.setVisibility(8);
                p9Var2.setImageDrawable(null);
                p9Var2.setAlpha(1.0f);
                break;
            case 29:
                org.telegram.ui.Components.w8 w8Var = ((org.telegram.ui.Components.k8) this.b).b;
                w8Var.f = false;
                w8Var.e.setVisibility(8);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                l8 l8Var = (l8) this.b;
                for (int i10 = 0; i10 < l8Var.b.getChildCount(); i10++) {
                    i8.a((i8) l8Var.b.getChildAt(i10), l8Var.M, l8Var.N);
                }
                break;
            case 2:
            default:
                super.onAnimationStart(animator);
                break;
            case 3:
                ((i01) ((org.telegram.ui.Cells.j) this.b)).W.e.c.r = true;
                break;
        }
    }

    public u5(xq xqVar, f2.v0 v0Var) {
        this.a = 24;
        this.b = xqVar;
    }
}
