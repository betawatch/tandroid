// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qw implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tw b;

    public /* synthetic */ qw(tw twVar, byte b) {
        this.a = b;
        this.b = twVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        tw twVar = this.b;
        switch (b) {
            case 0:
                twVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                twVar.c.invalidate();
                twVar.t();
                twVar.r();
                break;
            case 1:
                twVar.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                twVar.A();
                twVar.t();
                twVar.r();
                break;
            default:
                twVar.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!twVar.n) {
                    twVar.A();
                }
                twVar.t();
                twVar.r();
                break;
        }
    }
}
