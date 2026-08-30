package ph;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class g9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ da b;

    public /* synthetic */ g9(da daVar, int i10) {
        this.a = i10;
        this.b = daVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.Z0.m();
                break;
            default:
                this.b.n0();
                break;
        }
    }
}
