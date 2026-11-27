// default package

import android.animation.ValueAnimator;
import android.graphics.Paint;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uv0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xw0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ uv0(xw0 xw0Var, int i, int i2, byte b) {
        this.a = b;
        this.b = xw0Var;
        this.c = i;
        this.d = i2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        int i = this.d;
        int i2 = this.c;
        xw0 xw0Var = this.b;
        switch (b) {
            case 0:
                Paint paint = xw0Var.R;
                paint.setColor(vm2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i2, i));
                xw0Var.F();
                xw0Var.f.invalidate();
                dw dwVar = xw0Var.Z0;
                if (dwVar != null) {
                    dwVar.b(hl.B(paint.getColor()) <= 0.721f, false);
                    xw0Var.Z0.setBackgroundColor(paint.getColor());
                }
                xw0Var.K();
                break;
            default:
                xw0Var.T = vm2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i2, i);
                xw0Var.h();
                break;
        }
    }
}
