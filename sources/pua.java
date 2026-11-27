// default package

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class pua implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sua b;

    public /* synthetic */ pua(sua suaVar, byte b) {
        this.a = b;
        this.b = suaVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        sua suaVar = this.b;
        switch (b) {
            case 0:
                suaVar.z0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                suaVar.d(suaVar.b0);
                break;
            case 1:
                float x = c00.x((float) Math.pow((r5 * 2.0f) - 2.0f, 2.0d), 0.075f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                suaVar.A0 = x;
                FrameLayout frameLayout = suaVar.b;
                frameLayout.setScaleX(x);
                frameLayout.setScaleY(suaVar.A0);
                suaVar.invalidate();
                break;
            default:
                suaVar.z0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                suaVar.d(suaVar.b0);
                break;
        }
    }
}
