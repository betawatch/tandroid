// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class yk3 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ f89 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ sh3 e;

    public yk3(sh3 sh3Var, f89 f89Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = sh3Var;
        this.b = f89Var;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        f89 f89Var = this.b;
        sh3 sh3Var = this.e;
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        switch (b) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.c.setAlpha(1.0f);
                sh3Var.d(f89Var);
                sh3Var.x.remove(f89Var);
                sh3Var.A();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                sh3Var.u(f89Var);
                sh3Var.v.remove(f89Var);
                sh3Var.A();
                View view = f89Var.a;
                if (view instanceof of3) {
                    ((of3) view).setMoving(false);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.e.y();
                break;
        }
    }

    public yk3(sh3 sh3Var, f89 f89Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = sh3Var;
        this.b = f89Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }

    private final void a(Animator animator) {
    }
}
