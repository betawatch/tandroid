// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pc3 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qc3 b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ sc3 e;

    public /* synthetic */ pc3(sc3 sc3Var, qc3 qc3Var, ViewPropertyAnimator viewPropertyAnimator, View view, byte b) {
        this.a = b;
        this.e = sc3Var;
        this.b = qc3Var;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        sc3 sc3Var = this.e;
        View view = this.d;
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        qc3 qc3Var = this.b;
        switch (b) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                if (sc3Var.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                u69 u69Var = qc3Var.a;
                sc3Var.O();
                sc3Var.d(qc3Var.a);
                sc3Var.B.remove(qc3Var.a);
                sc3Var.G();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                if (sc3Var.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                u69 u69Var2 = qc3Var.b;
                sc3Var.O();
                sc3Var.d(qc3Var.b);
                sc3Var.B.remove(qc3Var.b);
                sc3Var.G();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                u69 u69Var = this.b.a;
                break;
            default:
                u69 u69Var2 = this.b.b;
                break;
        }
    }
}
