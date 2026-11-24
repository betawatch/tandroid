// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tb2 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qc3 b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ wb2 e;

    public /* synthetic */ tb2(wb2 wb2Var, qc3 qc3Var, ViewPropertyAnimator viewPropertyAnimator, View view, byte b) {
        this.a = b;
        this.e = wb2Var;
        this.b = qc3Var;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        View view = this.d;
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        wb2 wb2Var = this.e;
        qc3 qc3Var = this.b;
        switch (b) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleX(1.0f);
                if (view instanceof rc2) {
                    ((rc2) view).setAnimationOffsetX(0.0f);
                } else {
                    view.setTranslationX(0.0f);
                }
                view.setTranslationY(0.0f);
                if (wb2Var.B.remove(qc3Var.a)) {
                    wb2Var.d(qc3Var.a);
                    wb2Var.G();
                    break;
                }
                break;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleX(1.0f);
                if (view instanceof rc2) {
                    ((rc2) view).setAnimationOffsetX(0.0f);
                } else {
                    view.setTranslationX(0.0f);
                }
                view.setTranslationY(0.0f);
                if (wb2Var.B.remove(qc3Var.b)) {
                    wb2Var.d(qc3Var.b);
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
                u69 u69Var = this.b.a;
                break;
            default:
                u69 u69Var2 = this.b.b;
                break;
        }
    }
}
