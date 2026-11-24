// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wjc extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xjc b;

    public /* synthetic */ wjc(xjc xjcVar, byte b) {
        this.a = b;
        this.b = xjcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        xjc xjcVar = this.b;
        switch (b) {
            case 0:
                xjcVar.b.setVisibility(8);
                break;
            default:
                xjcVar.c.setVisibility(8);
                break;
        }
    }
}
