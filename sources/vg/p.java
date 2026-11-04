package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;
    public final /* synthetic */ r c;

    public /* synthetic */ p(r rVar, q qVar, int i3) {
        this.a = i3;
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
