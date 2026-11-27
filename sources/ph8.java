// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ph8 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wh8 b;

    public /* synthetic */ ph8(wh8 wh8Var, byte b) {
        this.a = b;
        this.b = wh8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        wh8 wh8Var = this.b;
        switch (b) {
            case 0:
                wh8Var.S.setTranslationY(0.0f);
                break;
            case 1:
                wh8Var.S.setTranslationY(0.0f);
                break;
            default:
                wh8Var.S.setTranslationY(0.0f);
                wh8Var.m0();
                break;
        }
    }
}
