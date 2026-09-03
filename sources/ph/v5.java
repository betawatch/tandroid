package ph;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;

    public /* synthetic */ v5(Object obj, float f10, float f11, float f12, float f13, int i10) {
        this.a = i10;
        this.f = obj;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = f13;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                n nVar = (n) this.f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w5 w5Var = nVar.a;
                float f10 = this.b;
                float f11 = this.c;
                w5Var.setScaleX(AndroidUtilities.lerp(f10, f11, floatValue));
                w5Var.setScaleY(AndroidUtilities.lerp(f10, f11, floatValue));
                w5Var.setTranslationX(this.d * floatValue);
                w5Var.setTranslationY(this.e * floatValue);
                float f12 = 1.0f - floatValue;
                w5Var.setAlpha(f12);
                nVar.s = f12;
                nVar.invalidate();
                break;
            default:
                vf.j jVar = (vf.j) this.f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = this.c;
                float f14 = this.b;
                jVar.k = e2.c.w(f13, f14, floatValue2, f14);
                float f15 = this.e;
                float f16 = this.d;
                jVar.l = e2.c.w(f15, f16, floatValue2, f16);
                jVar.a.a(f13, f15, false);
                break;
        }
    }
}
