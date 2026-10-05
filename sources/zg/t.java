package zg;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z b;

    public /* synthetic */ t(z zVar, int i10) {
        this.a = i10;
        this.b = zVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                z zVar = this.b;
                zVar.getClass();
                zVar.a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                this.b.a.invalidate();
                break;
        }
    }
}
