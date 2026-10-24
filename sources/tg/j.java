package tg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ j(n nVar, int i10) {
        this.a = i10;
        this.b = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.a) {
            case 0:
                n nVar = this.b;
                AnimatorSet animatorSet = nVar.d0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = nVar.c0) != null && valueAnimator.isRunning())) {
                    nVar.j(nVar.L);
                    break;
                } else {
                    nVar.n();
                    break;
                }
            default:
                this.b.l();
                break;
        }
    }
}
