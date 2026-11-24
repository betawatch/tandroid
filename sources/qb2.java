// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qb2 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ View b;
    public final /* synthetic */ u69 c;
    public final /* synthetic */ wb2 d;

    public qb2(wb2 wb2Var, u69 u69Var, View view) {
        this.d = wb2Var;
        this.c = u69Var;
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
        u69 u69Var = this.c;
        wb2 wb2Var = this.d;
        View view = this.b;
        switch (b) {
            case 0:
                animator.removeAllListeners();
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationY(0.0f);
                view.setTranslationY(0.0f);
                if (wb2Var.y.remove(u69Var)) {
                    wb2Var.u(u69Var);
                    wb2Var.G();
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
                if (wb2Var.A.remove(u69Var)) {
                    wb2Var.d(u69Var);
                    wb2Var.G();
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

    public qb2(wb2 wb2Var, View view, u69 u69Var) {
        this.d = wb2Var;
        this.b = view;
        this.c = u69Var;
    }

    private final void a(Animator animator) {
    }
}
