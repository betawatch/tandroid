// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z6b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g7b b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ z6b(g7b g7bVar, float f, float f2, byte b) {
        this.a = b;
        this.b = g7bVar;
        this.c = f;
        this.d = f2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        float f = this.d;
        float f2 = this.c;
        g7b g7bVar = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g7bVar.setScrollY((int) hl.R1(f2, 0.0f, floatValue));
                f7b f7bVar = g7bVar.b0;
                f7bVar.x = hl.R1(f, 0.0f, floatValue);
                f7bVar.invalidate();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g7bVar.setScrollY((int) hl.R1(f2, Math.min((g7bVar.getMeasuredHeight() - g7bVar.u0) - hl.L(64.0f), g7bVar.r0.getBottom() - g7bVar.getMeasuredHeight()), floatValue2));
                f7b f7bVar2 = g7bVar.b0;
                f7bVar2.x = hl.R1(f, 1.0f, floatValue2);
                f7bVar2.invalidate();
                break;
        }
    }
}
