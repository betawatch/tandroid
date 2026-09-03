package qh;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class d9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ba b;

    public /* synthetic */ d9(ba baVar, int i10) {
        this.a = i10;
        this.b = baVar;
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
