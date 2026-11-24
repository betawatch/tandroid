// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class u6b extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ t7b c;

    /* JADX WARN: Multi-variable type inference failed */
    public u6b(t7b t7bVar, int i, int i2) {
        this.c = t7bVar;
        this.a = i;
        this.b = i2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.L(this.a, this.b);
    }
}
