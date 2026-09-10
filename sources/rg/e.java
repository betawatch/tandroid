package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class e extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ e(f fVar, int i10) {
        this.a = i10;
        this.b = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                f fVar = this.b;
                fVar.b.d = 0.0f;
                fVar.T = null;
                fVar.h(fVar.I);
                break;
            case 1:
                super.onAnimationEnd(animator);
                f fVar2 = this.b;
                fVar2.b.d = 0.0f;
                fVar2.T = null;
                fVar2.h(fVar2.I);
                break;
            case 2:
                super.onAnimationEnd(animator);
                f fVar3 = this.b;
                fVar3.b.d = 0.0f;
                fVar3.T = null;
                fVar3.h(fVar3.I);
                break;
            default:
                super.onAnimationEnd(animator);
                f fVar4 = this.b;
                fVar4.b.d = 0.0f;
                fVar4.T = null;
                fVar4.h(fVar4.I);
                break;
        }
    }
}
