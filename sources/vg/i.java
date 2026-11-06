package vg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
