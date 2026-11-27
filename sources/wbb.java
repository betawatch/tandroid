// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wbb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zbb b;

    public /* synthetic */ wbb(zbb zbbVar, byte b) {
        this.a = b;
        this.b = zbbVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        zbb zbbVar = this.b;
        switch (b) {
            case 0:
                lcb lcbVar = zbbVar.s0;
                lcbVar.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lcbVar.V();
                break;
            default:
                lcb lcbVar2 = zbbVar.s0;
                lcbVar2.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lcbVar2.V();
                break;
        }
    }
}
