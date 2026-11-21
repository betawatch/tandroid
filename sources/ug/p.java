package ug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class p extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;
    public final /* synthetic */ r c;

    public /* synthetic */ p(r rVar, q qVar, int i7) {
        this.a = i7;
        this.c = rVar;
        this.b = qVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.f = null;
                r.a(this.c);
                break;
            default:
                this.b.f = null;
                r.a(this.c);
                break;
        }
    }
}
