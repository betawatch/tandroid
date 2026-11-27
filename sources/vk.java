// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class vk extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;

    public /* synthetic */ vk(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.setTranslationX(0.0f);
                break;
            case 1:
                hl.B2(this.b);
                break;
            default:
                hl.B2(this.b);
                break;
        }
    }
}
