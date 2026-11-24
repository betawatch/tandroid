// default package

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class psa implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ssa b;

    public /* synthetic */ psa(ssa ssaVar, byte b) {
        this.a = b;
        this.b = ssaVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ssa ssaVar = this.b;
        switch (b) {
            case 0:
                ssaVar.z0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ssaVar.d(ssaVar.b0);
                break;
            case 1:
                float w = b10.w((float) Math.pow((r5 * 2.0f) - 2.0f, 2.0d), 0.075f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                ssaVar.A0 = w;
                FrameLayout frameLayout = ssaVar.b;
                frameLayout.setScaleX(w);
                frameLayout.setScaleY(ssaVar.A0);
                ssaVar.invalidate();
                break;
            default:
                ssaVar.z0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ssaVar.d(ssaVar.b0);
                break;
        }
    }
}
