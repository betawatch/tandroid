package v4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ e1 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ k e;

    public g(k kVar, e1 e1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = kVar;
        this.b = e1Var;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                View view = this.c;
                view.setAlpha(1.0f);
                if (this.e.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                    break;
                }
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
                this.d.setListener(null);
                View view = this.c;
                view.setAlpha(1.0f);
                k kVar = this.e;
                if (kVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                kVar.Q();
                e1 e1Var = this.b;
                kVar.d(e1Var);
                kVar.A.remove(e1Var);
                kVar.G();
                break;
            default:
                this.d.setListener(null);
                k kVar2 = this.e;
                kVar2.M();
                e1 e1Var2 = this.b;
                kVar2.u(e1Var2);
                kVar2.y.remove(e1Var2);
                kVar2.G();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                break;
            default:
                this.e.getClass();
                break;
        }
    }

    public g(k kVar, e1 e1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = kVar;
        this.b = e1Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }

    private final void a(Animator animator) {
    }
}
