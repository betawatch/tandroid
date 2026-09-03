package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import f2.m1;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ View b;
    public final /* synthetic */ m1 c;
    public final /* synthetic */ n d;

    public g(n nVar, m1 m1Var, View view) {
        this.d = nVar;
        this.c = m1Var;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                animator.removeAllListeners();
                View view = this.b;
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationY(0.0f);
                view.setTranslationY(0.0f);
                n nVar = this.d;
                ArrayList arrayList = nVar.y;
                m1 m1Var = this.c;
                if (arrayList.remove(m1Var)) {
                    nVar.u(m1Var);
                    nVar.G();
                    break;
                }
                break;
            default:
                animator.removeAllListeners();
                View view2 = this.b;
                view2.setAlpha(1.0f);
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                n nVar2 = this.d;
                ArrayList arrayList2 = nVar2.A;
                m1 m1Var2 = this.c;
                if (arrayList2.remove(m1Var2)) {
                    nVar2.d(m1Var2);
                    nVar2.G();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.d.getClass();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public g(n nVar, View view, m1 m1Var) {
        this.d = nVar;
        this.b = view;
        this.c = m1Var;
    }
}
