// default package

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sb2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ wb2 c;
    public final /* synthetic */ View d;

    public /* synthetic */ sb2(wb2 wb2Var, View view, float f, byte b) {
        this.a = b;
        this.c = wb2Var;
        this.d = view;
        this.b = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        float f = this.b;
        View view = this.d;
        wb2 wb2Var = this.c;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float measuredHeight = wb2Var.G.getMeasuredHeight();
                yv1 yv1Var = wb2Var.F;
                er0 er0Var = (er0) view;
                float measuredHeight2 = ((((measuredHeight - yv1Var.P9) - yv1Var.Ya) / 2.0f) - (er0Var.getMeasuredHeight() / 2.0f)) + yv1Var.P9;
                er0Var.setTranslationY(((((float) er0Var.getTop()) > measuredHeight2 ? measuredHeight2 - er0Var.getTop() : 0.0f) * floatValue) + ((1.0f - floatValue) * f));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float measuredHeight3 = wb2Var.G.getMeasuredHeight();
                yv1 yv1Var2 = wb2Var.F;
                h9c h9cVar = (h9c) view;
                float measuredHeight4 = ((((measuredHeight3 - yv1Var2.P9) - yv1Var2.Ya) / 2.0f) - (h9cVar.getMeasuredHeight() / 2.0f)) + yv1Var2.P9;
                h9cVar.setTranslationY(((((float) h9cVar.getTop()) > measuredHeight4 ? measuredHeight4 - h9cVar.getTop() : 0.0f) * floatValue2) + ((1.0f - floatValue2) * f));
                break;
        }
    }
}
