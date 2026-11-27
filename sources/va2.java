// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class va2 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ View b;
    public final /* synthetic */ f89 c;
    public final /* synthetic */ bb2 d;

    public va2(bb2 bb2Var, f89 f89Var, View view) {
        this.d = bb2Var;
        this.c = f89Var;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
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
        byte b = this.a;
        f89 f89Var = this.c;
        bb2 bb2Var = this.d;
        View view = this.b;
        switch (b) {
            case 0:
                animator.removeAllListeners();
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationY(0.0f);
                view.setTranslationY(0.0f);
                if (bb2Var.y.remove(f89Var)) {
                    bb2Var.u(f89Var);
                    bb2Var.G();
                    break;
                }
                break;
            default:
                animator.removeAllListeners();
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                if (bb2Var.A.remove(f89Var)) {
                    bb2Var.d(f89Var);
                    bb2Var.G();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public va2(bb2 bb2Var, View view, f89 f89Var) {
        this.d = bb2Var;
        this.b = view;
        this.c = f89Var;
    }

    private final void a(Animator animator) {
    }
}
