package vg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ i(m mVar, int i7) {
        this.a = i7;
        this.b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.a) {
            case 0:
                m mVar = this.b;
                AnimatorSet animatorSet = mVar.d0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = mVar.c0) != null && valueAnimator.isRunning())) {
                    mVar.j(mVar.L);
                    break;
                } else {
                    mVar.n();
                    break;
                }
            default:
                this.b.l();
                break;
        }
    }
}
