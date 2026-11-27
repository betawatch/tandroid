// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class z5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TransitionValues b;

    public /* synthetic */ z5(TransitionValues transitionValues, byte b) {
        this.a = b;
        this.b = transitionValues;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        TransitionValues transitionValues = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                transitionValues.view.setLayerType(0, null);
                break;
            default:
                super.onAnimationEnd(animator);
                transitionValues.view.setEnabled(true);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        TransitionValues transitionValues = this.b;
        switch (b) {
            case 0:
                super.onAnimationStart(animator);
                transitionValues.view.setLayerType(2, null);
                break;
            default:
                super.onAnimationStart(animator);
                transitionValues.view.setEnabled(false);
                break;
        }
    }
}
