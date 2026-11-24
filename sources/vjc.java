// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class vjc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vjc(Object obj, Object obj2, byte b) {
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
                view.setTranslationY(gm.L(8.0f) * f);
                view.setAlpha(floatValue);
                view2.setTranslationY((-gm.L(6.0f)) * floatValue);
                view2.setAlpha(f);
                break;
            case 1:
                kkc kkcVar = (kkc) obj2;
                lhc lhcVar = (lhc) obj;
                lhcVar.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                lhcVar.c();
                int i = lhcVar.h;
                if (((i >= 0 && i <= 2) || (i >= 180 && i <= 182)) && kkcVar.S) {
                    kkcVar.R.pause();
                    AnimatorSet animatorSet = kkcVar.Q;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        break;
                    }
                }
                break;
            case 2:
                ((mlc) obj2).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((h22) obj).invalidate();
                break;
            default:
                slc slcVar = (slc) obj2;
                slcVar.g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (slcVar.c - r0)) + slcVar.e);
                slcVar.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (slcVar.d - r0)) + slcVar.f);
                ((hkc) obj).invalidate();
                break;
        }
    }
}
