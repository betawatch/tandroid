package vg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                AnimatorSet animatorSet = mVar.e0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = mVar.d0) != null && valueAnimator.isRunning())) {
                    mVar.j(mVar.M);
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
