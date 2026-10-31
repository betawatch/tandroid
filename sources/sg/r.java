package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import kg.j2;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.go0;
import org.telegram.ui.jx0;
import th.f3;
import th.h5;
import th.i5;
import th.i6;
import th.p3;
import th.t1;
import th.w0;
import th.w2;
import vh.e4;
import vh.k2;
import vh.p2;
import vh.p6;
import vh.r6;
import vh.v4;
import vh.z3;
import xh.i3;
import xh.m2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                s sVar = (s) obj;
                sVar.setVisibility(8);
                q qVar = sVar.b;
                if (qVar != null) {
                    sVar.removeView(qVar);
                    sVar.b = null;
                }
                sVar.e = null;
                break;
            case 1:
                ((h0) obj).y.c();
                break;
            case 2:
                th.a aVar = (th.a) obj;
                aVar.h = 1.0f;
                aVar.invalidate();
                break;
            case 3:
                super.onAnimationEnd(animator);
                ((th.l) obj).O.p = false;
                break;
            case 4:
                th.c0 c0Var = (th.c0) obj;
                th.h0 h0Var = c0Var.K;
                if (h0Var != null && c0Var.I == h0Var.a) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    c0Var.J = ofFloat;
                    ofFloat.addUpdateListener(new qh.e0(this, 14));
                    c0Var.J.setStartDelay(3000L);
                    c0Var.J.setDuration(550L);
                    c0Var.J.setInterpolator(new LinearInterpolator());
                    c0Var.J.start();
                    break;
                }
                break;
            case 5:
                ((w0) obj).I = null;
                break;
            case 6:
                t1 t1Var = (t1) obj;
                t1Var.x5.invalidate();
                t1Var.setAnimatedTop(0);
                t1Var.x5.E2 = true;
                View view = t1Var.G1;
                if (view != null && view.getVisibility() == 0) {
                    t1Var.G1.setTranslationY(((1.0f - t1Var.getTopViewEnterProgress()) * t1Var.G1.getLayoutParams().height) + t1Var.T1);
                }
                t1Var.x5.N1 = null;
                break;
            case 7:
                w2 w2Var = (w2) obj;
                w2Var.c[1].setVisibility(8);
                w2Var.c[0].setAlpha(1.0f);
                w2Var.c[0].setTranslationY(0.0f);
                break;
            case 8:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                jx0 jx0Var = profileStoriesView.h;
                profileStoriesView.G = 1.0f;
                jx0Var.R = 1.0f;
                jx0Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 9:
                ((f3) obj).M = null;
                break;
            case 10:
                p3 p3Var = (p3) obj;
                p3Var.x = null;
                p3Var.r = 1.0f;
                p3Var.invalidate();
                break;
            case 11:
            default:
                super.onAnimationEnd(animator);
                break;
            case 12:
                i6 i6Var = (i6) obj;
                i6Var.H = false;
                i6Var.G = 0.0f;
                i6Var.invalidate();
                i6Var.requestLayout();
                i6Var.J.requestLayout();
                break;
            case 13:
                vh.k kVar = ((vh.f) obj).c0;
                if (kVar.f0 == animator) {
                    kVar.f0 = null;
                    kVar.f.getEditText().setScrollY(kVar.b0);
                    break;
                }
                break;
            case 14:
                vh.w wVar = (vh.w) obj;
                wVar.l = 1.0f;
                vh.x xVar = wVar.p;
                if (xVar.n.contains(wVar)) {
                    wVar.c.R();
                    j2 j2Var = wVar.d;
                    if (j2Var != null) {
                        j2Var.pause();
                        wVar.d.release(null);
                        wVar.d = null;
                    }
                    TextureView textureView = wVar.e;
                    if (textureView != null) {
                        org.telegram.messenger.i0.E2(textureView);
                        wVar.e = null;
                    }
                    wVar.f = false;
                    xVar.n.remove(wVar);
                }
                xVar.invalidate();
                break;
            case 15:
                k2 k2Var = (k2) ((go0) obj).c;
                k2Var.F.setVisibility(8);
                k2Var.d.setVisibility(8);
                break;
            case 16:
                p2 p2Var = (p2) obj;
                p2Var.o0 = 1.0f;
                p2Var.invalidate();
                break;
            case 17:
                org.telegram.messenger.i0.E2((mj0) obj);
                break;
            case 18:
                super.onAnimationEnd(animator);
                z3 z3Var = (z3) obj;
                ImageView imageView = z3Var.c;
                z3Var.c = z3Var.d;
                z3Var.d = imageView;
                imageView.bringToFront();
                z3Var.d.setVisibility(8);
                z3Var.h = null;
                break;
            case 19:
                super.onAnimationEnd(animator);
                ((e4) obj).x = null;
                break;
            case 20:
                v4 v4Var = (v4) obj;
                if (v4Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) v4Var.getParent()).removeView(v4Var);
                    break;
                }
                break;
            case 21:
                ((r6) obj).N = false;
                break;
            case 22:
                p6 p6Var = (p6) obj;
                p6Var.setTranslationY(0.0f);
                p6Var.d = null;
                break;
            case 23:
                xh.s sVar2 = (xh.s) obj;
                sVar2.setVisibility(8);
                sVar2.a = null;
                break;
            case 24:
                ((m2) obj).E.setVisibility(8);
                break;
            case 25:
                ((i3) obj).I.setVisibility(8);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 11:
                super.onAnimationStart(animator);
                i5 i5Var = (i5) this.b;
                bi0 bi0Var = ((h5) i5Var.a.get(i5Var.d)).c;
                bi0Var.L = 2;
                bi0Var.start();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
