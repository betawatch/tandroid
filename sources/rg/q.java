package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class q extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;
    public final /* synthetic */ s c;

    public /* synthetic */ q(s sVar, r rVar, int i10) {
        this.a = i10;
        this.c = sVar;
        this.b = rVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.f = null;
                s.a(this.c);
                break;
            default:
                this.b.f = null;
                s.a(this.c);
                break;
        }
    }
}
