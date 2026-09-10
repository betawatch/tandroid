package yg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.s01;
import zh.g3;
import zh.m5;
import zh.n5;
import zh.o6;
import zh.q3;
import zh.t1;
import zh.x0;
import zh.x2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class b extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((q) obj).run();
                break;
            case 1:
                v vVar = (v) obj;
                vVar.setVisibility(8);
                u uVar = vVar.b;
                if (uVar != null) {
                    vVar.removeView(uVar);
                    vVar.b = null;
                }
                vVar.e = null;
                break;
            case 2:
                ((i0) obj).x.c();
                break;
            case 3:
                zh.a aVar = (zh.a) obj;
                aVar.h = 1.0f;
                aVar.invalidate();
                break;
            case 4:
                super.onAnimationEnd(animator);
                ((zh.k) obj).O.p = false;
                break;
            case 5:
                zh.f0 f0Var = (zh.f0) obj;
                zh.k0 k0Var = f0Var.K;
                if (k0Var != null && f0Var.I == k0Var.a) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    f0Var.J = ofFloat;
                    ofFloat.addUpdateListener(new qg.o(this, 19));
                    f0Var.J.setStartDelay(3000L);
                    f0Var.J.setDuration(550L);
                    f0Var.J.setInterpolator(new LinearInterpolator());
                    f0Var.J.start();
                    break;
                }
                break;
            case 6:
                ((x0) obj).I = null;
                break;
            case 7:
                t1 t1Var = (t1) obj;
                t1Var.r5.invalidate();
                t1Var.setAnimatedTop(0);
                t1Var.r5.V2 = true;
                View view = t1Var.F1;
                if (view != null && view.getVisibility() == 0) {
                    t1Var.F1.setTranslationY(((1.0f - t1Var.getTopViewEnterProgress()) * t1Var.F1.getLayoutParams().height) + t1Var.S1);
                }
                t1Var.r5.e2 = null;
                break;
            case 8:
                x2 x2Var = (x2) obj;
                x2Var.c[1].setVisibility(8);
                x2Var.c[0].setAlpha(1.0f);
                x2Var.c[0].setTranslationY(0.0f);
                break;
            case 9:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                s01 s01Var = profileStoriesView.h;
                profileStoriesView.G = 1.0f;
                s01Var.R = 1.0f;
                s01Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 10:
                ((g3) obj).M = null;
                break;
            case 11:
                q3 q3Var = (q3) obj;
                q3Var.w = null;
                q3Var.r = 1.0f;
                q3Var.invalidate();
                break;
            case 12:
            default:
                super.onAnimationEnd(animator);
                break;
            case 13:
                o6 o6Var = (o6) obj;
                o6Var.H = false;
                o6Var.G = 0.0f;
                o6Var.invalidate();
                o6Var.requestLayout();
                o6Var.J.requestLayout();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 12:
                super.onAnimationStart(animator);
                n5 n5Var = (n5) this.b;
                hj0 hj0Var = ((m5) n5Var.a.get(n5Var.d)).c;
                hj0Var.M = 2;
                hj0Var.start();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
