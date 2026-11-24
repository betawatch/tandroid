// default package

import android.animation.ValueAnimator;
import android.graphics.Paint;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class tw0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wx0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ tw0(wx0 wx0Var, int i, int i2, byte b) {
        this.a = b;
        this.b = wx0Var;
        this.c = i;
        this.d = i2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        int i = this.d;
        int i2 = this.c;
        wx0 wx0Var = this.b;
        switch (b) {
            case 0:
                Paint paint = wx0Var.R;
                paint.setColor(on2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i2, i));
                wx0Var.F();
                wx0Var.f.invalidate();
                cx cxVar = wx0Var.Z0;
                if (cxVar != null) {
                    cxVar.b(gm.B(paint.getColor()) <= 0.721f, false);
                    wx0Var.Z0.setBackgroundColor(paint.getColor());
                }
                wx0Var.K();
                break;
            default:
                wx0Var.T = on2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i2, i);
                wx0Var.h();
                break;
        }
    }
}
