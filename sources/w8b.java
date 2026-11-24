// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class w8b extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ v9b c;

    /* JADX WARN: Multi-variable type inference failed */
    public w8b(v9b v9bVar, int i, int i2) {
        this.c = v9bVar;
        this.a = i;
        this.b = i2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.L(this.a, this.b);
    }
}
