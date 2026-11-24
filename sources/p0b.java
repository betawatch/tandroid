// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class p0b extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q0b b;

    public /* synthetic */ p0b(q0b q0bVar, byte b) {
        this.a = b;
        this.b = q0bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        q0b q0bVar = this.b;
        switch (b) {
            case 0:
                q0bVar.E = 1.0f;
                q0bVar.invalidate();
                q0bVar.H = null;
                break;
            case 1:
                q0bVar.m(((Float) q0bVar.w.getAnimatedValue()).floatValue());
                q0bVar.w = null;
                break;
            default:
                super.onAnimationEnd(animator);
                q0bVar.G = null;
                break;
        }
    }
}
