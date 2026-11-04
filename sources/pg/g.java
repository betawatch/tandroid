package pg;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float[] d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;

    public /* synthetic */ g(m mVar, float f10, float[] fArr, float f11, float f12, int i3) {
        this.a = i3;
        this.b = mVar;
        this.c = f10;
        this.d = fArr;
        this.e = f11;
        this.f = f12;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                m mVar = this.b;
                mVar.getClass();
                float y9 = com.google.android.recaptcha.internal.a.y(this.c, 1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                float[] fArr = this.d;
                float f10 = fArr[0];
                float f11 = y9 / f10;
                fArr[0] = f10 * f11;
                k.g(mVar.M, f11, this.e, this.f);
                mVar.r(false);
                break;
            default:
                m mVar2 = this.b;
                mVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = this.c * floatValue;
                float[] fArr2 = this.d;
                float f13 = fArr2[1];
                float f14 = f12 - f13;
                fArr2[1] = f13 + f14;
                float f15 = this.e * floatValue;
                float f16 = fArr2[2];
                float f17 = f15 - f16;
                fArr2[2] = f16 + f17;
                k kVar = mVar2.M;
                float f18 = fArr2[0];
                k.f(kVar, f14 * f18, f17 * f18);
                float f19 = ((this.f - 1.0f) * floatValue) + 1.0f;
                float f20 = fArr2[0];
                float f21 = f19 / f20;
                fArr2[0] = f20 * f21;
                k.g(mVar2.M, f21, 0.0f, 0.0f);
                mVar2.r(false);
                break;
        }
    }
}
