// default package

import android.animation.ValueAnimator;
import android.view.WindowManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vic implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yic b;

    public /* synthetic */ vic(yic yicVar, byte b) {
        this.a = b;
        this.b = yicVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        yic yicVar = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                WindowManager.LayoutParams layoutParams = yicVar.d;
                layoutParams.x = (int) floatValue;
                gm.N3(yicVar.c, yicVar.a, layoutParams);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                WindowManager.LayoutParams layoutParams2 = yicVar.d;
                layoutParams2.y = (int) floatValue2;
                gm.N3(yicVar.c, yicVar.a, layoutParams2);
                break;
        }
    }
}
