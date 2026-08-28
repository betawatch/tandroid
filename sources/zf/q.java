package zf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;
    public final /* synthetic */ s c;

    public /* synthetic */ q(s sVar, r rVar, int i9) {
        this.a = i9;
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
