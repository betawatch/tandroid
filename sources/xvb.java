// default package

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class xvb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lwb b;

    public /* synthetic */ xvb(lwb lwbVar, byte b) {
        this.a = b;
        this.b = lwbVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        lwb lwbVar = this.b;
        switch (b) {
            case 0:
                lwbVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lwbVar.a0 = floatValue;
                rkb rkbVar = lwbVar.S;
                rkbVar.setVisibility(floatValue > 0.0f ? 0 : 8);
                rkbVar.setAlpha(floatValue);
                rkbVar.setTranslationY((1.0f - floatValue) * (-gl.L(8.0f)));
                lwbVar.b(floatValue);
                int L = gl.L(100.0f) + gl.m + ((int) (gl.L(36.0f) * floatValue));
                ((FrameLayout.LayoutParams) lwbVar.r.getLayoutParams()).topMargin = L;
                View view = lwbVar.F;
                if (view != null) {
                    ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = L;
                }
                lwbVar.h.requestLayout();
                break;
            default:
                lwbVar.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
