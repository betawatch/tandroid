// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class t0a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w0a b;

    public /* synthetic */ t0a(w0a w0aVar, byte b) {
        this.a = b;
        this.b = w0aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        w0a w0aVar = this.b;
        switch (b) {
            case 0:
                w0aVar.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w0aVar.W.i0.invalidate();
                break;
            case 1:
                w0aVar.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w0aVar.W.i0.invalidate();
                break;
            default:
                w0aVar.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w0aVar.W.i0.invalidate();
                break;
        }
    }
}
