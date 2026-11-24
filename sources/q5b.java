// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q5b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r5b b;

    public /* synthetic */ q5b(r5b r5bVar, byte b) {
        this.a = b;
        this.b = r5bVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        r5b r5bVar = this.b;
        switch (b) {
            case 0:
                r5bVar.b(valueAnimator);
                break;
            default:
                r5bVar.getClass();
                r5bVar.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
