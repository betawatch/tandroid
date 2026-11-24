// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class z0b extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a1b b;

    public /* synthetic */ z0b(a1b a1bVar, byte b) {
        this.a = b;
        this.b = a1bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        a1b a1bVar = this.b;
        switch (b) {
            case 0:
                a1bVar.s.setVisibility(8);
                break;
            case 1:
                a1bVar.s.setVisibility(8);
                break;
            default:
                a1bVar.s.setVisibility(8);
                break;
        }
    }
}
