package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class r extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;
    public final /* synthetic */ t c;

    public /* synthetic */ r(t tVar, s sVar, int i10) {
        this.a = i10;
        this.c = tVar;
        this.b = sVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.f = null;
                t.a(this.c);
                break;
            default:
                this.b.f = null;
                t.a(this.c);
                break;
        }
    }
}
