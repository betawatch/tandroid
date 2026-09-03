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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class s5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 10:
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) this.b;
                AnimatorSet animatorSet = o7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    o7Var.h = null;
                    break;
                }
                break;
            case 23:
                kq kqVar = (kq) this.b;
                kqVar.h.b(kqVar.E ? 1.0f : 0.0f);
                kqVar.h.invalidateSelf();
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
                ((y5) this.b).c0.setVisibility(8);
                break;
            case 1:
            case 23:
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                ((v9) this.b).s = null;
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
                org.telegram.ui.Components.gi0 gi0Var = wVar.f;
                if (button != gi0Var) {
                    gi0Var.setVisibility(4);
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
                ((org.telegram.ui.Cells.g4) this.b).D = null;
                break;
            case 7:
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) this.b;
                if (animator.equals(t5Var.n)) {
                    t5Var.n = null;
                    break;
                }
                break;
            case 8:
                m2.b bVar = (m2.b) this.b;
                if (animator.equals(((org.telegram.ui.Cells.v5) bVar.b).d)) {
                    ((org.telegram.ui.Cells.v5) bVar.b).d = null;
                    break;
                }
                break;
            case 9:
                AndroidUtilities.runOnUIThread(((org.telegram.ui.Cells.v5) this.b).e, 1000L);
                break;
            case 10:
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) this.b;
                AnimatorSet animatorSet = o7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    o7Var.h = null;
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) this.b;
                r7Var.n.isMediaSpoilersRevealedInSharedMedia = true;
                r7Var.invalidate();
                break;
            case 12:
                super.onAnimationEnd(animator);
                org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) this.b;
                ((org.telegram.ui.Cells.ca) baVar.b).a.getTransitionParams().j();
                ((org.telegram.ui.Cells.ca) baVar.b).a.getTransitionParams().g = false;
                ((org.telegram.ui.Cells.ca) baVar.b).a.getTransitionParams().K1 = 1.0f;
                break;
            case 13:
                l3 l3Var = (l3) this.b;
                if (animator.equals(((sb) l3Var.b).S)) {
                    ((sb) l3Var.b).S = null;
                    break;
                }
                break;
            case 14:
                sb sbVar = (sb) this.b;
                if (animator.equals(sbVar.S)) {
                    sbVar.S = null;
                    break;
                }
                break;
            case 15:
                ((ac) this.b).F.setVisibility(8);
                break;
            case 16:
                bd bdVar = (bd) this.b;
                jc jcVar = bdVar.j0;
                if (jcVar != null) {
                    if (jcVar.getParent() != null) {
                        ((ViewGroup) bdVar.j0.getParent()).removeView(bdVar.j0);
                    }
                    bdVar.j0 = null;
                }
                bdVar.l0 = null;
                super.onAnimationEnd(animator);
                break;
            case 17:
                jk jkVar = (jk) this.b;
                jkVar.setAnimatedTop(0);
                View view = jkVar.C1;
                if (view != null && view.getVisibility() == 0) {
                    jkVar.C1.setTranslationY(((1.0f - jkVar.getTopViewEnterProgress()) * jkVar.C1.getLayoutParams().height) + jkVar.P1);
                }
                jkVar.n5.m9 = null;
                break;
            case 18:
                org.telegram.ui.Components.m40 m40Var = ((ti) this.b).b.b2;
                if (m40Var != null) {
                    m40Var.setVisibility(8);
                    break;
                }
                break;
            case 19:
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
                org.telegram.ui.Components.p9 p9Var = xlVar.c;
                if (p9Var != null) {
                    p9Var.setTranslationY(0.0f);
                }
                xlVar.n.E2[1] = null;
                break;
            case 20:
                ih.f fVar = (ih.f) ((eg.w2) this.b).c;
                dl dlVar = ((jm) fVar.c).N.Y2;
                if (dlVar != null) {
                    dlVar.setIsMessageTransition(false);
                    ((jm) fVar.c).N.Y2.h(true);
                    ((jm) fVar.c).N.Y2.setVisibility(4);
                    break;
                }
                break;
            case 21:
                im imVar = (im) this.b;
                jm jmVar = imVar.b;
                ArrayList arrayList = jmVar.N.k6;
                org.telegram.ui.Cells.t1 t1Var = imVar.a;
                arrayList.remove(t1Var);
                View view2 = jmVar.N.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    jmVar.N.u0.invalidate();
                }
                t1Var.setAlpha(1.0f);
                t1Var.getTransitionParams().x0 = false;
                break;
            case 22:
                up upVar = (up) this.b;
                upVar.I = 0.0f;
                upVar.H = 1.0f;
                View view3 = upVar.X;
                if (view3 != null) {
                    view3.invalidate();
                }
                upVar.Q.invalidate();
                zi ziVar = upVar.V;
                if (ziVar != null) {
                    ziVar.run();
                    upVar.V = null;
                    break;
                }
                break;
            case 24:
                wq wqVar = (wq) this.b;
                View view4 = wqVar.b;
                view4.setAlpha(1.0f);
                f2.w0.x0(view4);
                ((qr) wqVar.d).c.removeView(view4);
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
                j8 j8Var = (j8) this.b;
                for (int i10 = 0; i10 < j8Var.b.getChildCount(); i10++) {
                    g8.a((g8) j8Var.b.getChildAt(i10), j8Var.M, j8Var.N);
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

    public s5(wq wqVar, f2.w0 w0Var) {
        this.a = 24;
        this.b = wqVar;
    }
}
