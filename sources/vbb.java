// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
