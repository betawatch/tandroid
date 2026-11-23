package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class j extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ j(m mVar, int i7) {
        this.a = i7;
        this.b = mVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                m mVar = this.b;
                mVar.b.d = 0.0f;
                mVar.e0 = null;
                mVar.j(mVar.M);
                break;
            case 1:
                super.onAnimationEnd(animator);
                m mVar2 = this.b;
                mVar2.b.d = 0.0f;
                mVar2.e0 = null;
                mVar2.j(mVar2.M);
                break;
            case 2:
                super.onAnimationEnd(animator);
                m mVar3 = this.b;
                mVar3.b.d = 0.0f;
                mVar3.e0 = null;
                mVar3.j(mVar3.M);
                break;
            default:
                super.onAnimationEnd(animator);
                m mVar4 = this.b;
                mVar4.b.d = 0.0f;
                mVar4.e0 = null;
                mVar4.j(mVar4.M);
                break;
        }
    }
}
