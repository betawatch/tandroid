package ug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
