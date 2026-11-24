// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class ul extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;

    public /* synthetic */ ul(View view, byte b) {
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
                gm.B2(this.b);
                break;
            default:
                gm.B2(this.b);
                break;
        }
    }
}
