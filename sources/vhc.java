// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class vhc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vhc(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                View view = (View) obj2;
                View view2 = (View) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f = 1.0f - floatValue;
                view.setTranslationY(gl.L(8.0f) * f);
                view.setAlpha(floatValue);
                view2.setTranslationY((-gl.L(6.0f)) * floatValue);
                view2.setAlpha(f);
                break;
            case 1:
                kic kicVar = (kic) obj2;
                lfc lfcVar = (lfc) obj;
                lfcVar.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                lfcVar.c();
                int i = lfcVar.h;
                if (((i >= 0 && i <= 2) || (i >= 180 && i <= 182)) && kicVar.S) {
                    kicVar.R.pause();
                    AnimatorSet animatorSet = kicVar.Q;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        break;
                    }
                }
                break;
            case 2:
                ((mjc) obj2).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((w02) obj).invalidate();
                break;
            default:
                sjc sjcVar = (sjc) obj2;
                sjcVar.g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (sjcVar.c - r0)) + sjcVar.e);
                sjcVar.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (sjcVar.d - r0)) + sjcVar.f);
                ((hic) obj).invalidate();
                break;
        }
    }
}
