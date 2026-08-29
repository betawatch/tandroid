package wf;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float[] d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;

    public /* synthetic */ g(n nVar, float f9, float[] fArr, float f10, float f11, int i10) {
        this.a = i10;
        this.b = nVar;
        this.c = f9;
        this.d = fArr;
        this.e = f10;
        this.f = f11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                n nVar = this.b;
                nVar.getClass();
                float z10 = com.google.android.recaptcha.internal.a.z(this.c, 1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                float[] fArr = this.d;
                float f9 = fArr[0];
                float f10 = z10 / f9;
                fArr[0] = f9 * f10;
                l.g(nVar.H, f10, this.e, this.f);
                nVar.r(false);
                break;
            default:
                n nVar2 = this.b;
                nVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f11 = this.c * floatValue;
                float[] fArr2 = this.d;
                float f12 = fArr2[1];
                float f13 = f11 - f12;
                fArr2[1] = f12 + f13;
                float f14 = this.e * floatValue;
                float f15 = fArr2[2];
                float f16 = f14 - f15;
                fArr2[2] = f15 + f16;
                l lVar = nVar2.H;
                float f17 = fArr2[0];
                l.f(lVar, f13 * f17, f16 * f17);
                float f18 = ((this.f - 1.0f) * floatValue) + 1.0f;
                float f19 = fArr2[0];
                float f20 = f18 / f19;
                fArr2[0] = f19 * f20;
                l.g(nVar2.H, f20, 0.0f, 0.0f);
                nVar2.r(false);
                break;
        }
    }
}
