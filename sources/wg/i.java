package wg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ i(m mVar, int i3) {
        this.a = i3;
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
