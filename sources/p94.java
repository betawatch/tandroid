// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class p94 extends AnimatorListenerAdapter {
    public final /* synthetic */ r94 a;

    public p94(r94 r94Var) {
        this.a = r94Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        r94 r94Var = this.a;
        cj8 cj8Var = r94Var.n;
        TextView textView = r94Var.h;
        mu8 mu8Var = r94Var.f;
        if (r94Var.x) {
            mu8Var.setVisibility(4);
            textView.setVisibility(4);
            cj8Var.setVisibility(0);
        } else {
            if (r94Var.w) {
                mu8Var.setVisibility(4);
            } else {
                textView.setVisibility(4);
            }
            cj8Var.setVisibility(8);
        }
    }
}
