// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vbb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ybb b;

    public /* synthetic */ vbb(ybb ybbVar, byte b) {
        this.a = b;
        this.b = ybbVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ybb ybbVar = this.b;
        switch (b) {
            case 0:
                lcb lcbVar = ybbVar.s0;
                lcbVar.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lcbVar.V();
                break;
            default:
                lcb lcbVar2 = ybbVar.s0;
                lcbVar2.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lcbVar2.V();
                break;
        }
    }
}
