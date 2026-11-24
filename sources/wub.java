// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wub extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ avb b;

    public /* synthetic */ wub(avb avbVar, byte b) {
        this.a = b;
        this.b = avbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        avb avbVar = this.b;
        switch (b) {
            case 0:
                avbVar.w = 0;
                avbVar.n.setVisibility(8);
                break;
            case 1:
                avbVar.w = 0;
                break;
            default:
                avbVar.G.setVisibility(8);
                break;
        }
    }
}
