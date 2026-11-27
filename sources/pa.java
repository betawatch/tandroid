// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
