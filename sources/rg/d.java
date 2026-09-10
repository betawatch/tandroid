package rg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ d(f fVar, int i10) {
        this.a = i10;
        this.b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.a) {
            case 0:
                f fVar = this.b;
                AnimatorSet animatorSet = fVar.T;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = fVar.S) != null && valueAnimator.isRunning())) {
                    fVar.h(fVar.I);
                    break;
                } else {
                    fVar.k();
                    break;
                }
            default:
                this.b.i();
                break;
        }
    }
}
