package zf;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float[] d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;

    public /* synthetic */ g(n nVar, float f10, float[] fArr, float f11, float f12, int i10) {
        this.a = i10;
        this.b = nVar;
        this.c = f10;
        this.d = fArr;
        this.e = f11;
        this.f = f12;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                n nVar = this.b;
                nVar.getClass();
                float w10 = e2.c.w(this.c, 1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                float[] fArr = this.d;
                float f10 = fArr[0];
                float f11 = w10 / f10;
                fArr[0] = f10 * f11;
                l.g(nVar.I, f11, this.e, this.f);
                nVar.r(false);
                break;
            default:
                n nVar2 = this.b;
                nVar2.getClass();
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
                l lVar = nVar2.I;
                float f18 = fArr2[0];
                l.f(lVar, f14 * f18, f17 * f18);
                float f19 = ((this.f - 1.0f) * floatValue) + 1.0f;
                float f20 = fArr2[0];
                float f21 = f19 / f20;
                fArr2[0] = f20 * f21;
                l.g(nVar2.I, f21, 0.0f, 0.0f);
                nVar2.r(false);
                break;
        }
    }
}
