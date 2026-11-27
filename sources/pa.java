// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class pa implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qa b;
    public final /* synthetic */ m53 c;

    public /* synthetic */ pa(qa qaVar, m53 m53Var, byte b) {
        this.a = b;
        this.b = qaVar;
        this.c = m53Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        m53 m53Var = this.c;
        qa qaVar = this.b;
        switch (b) {
            case 0:
                qaVar.f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                m53Var.invalidate();
                break;
            default:
                qaVar.f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                m53Var.invalidate();
                break;
        }
    }
}
