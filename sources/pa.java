// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
