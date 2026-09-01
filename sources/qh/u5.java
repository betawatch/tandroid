package qh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;

    public /* synthetic */ u5(Object obj, float f10, float f11, float f12, float f13, int i10) {
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
                v5 v5Var = nVar.a;
                float f10 = this.b;
                float f11 = this.c;
                v5Var.setScaleX(AndroidUtilities.lerp(f10, f11, floatValue));
                v5Var.setScaleY(AndroidUtilities.lerp(f10, f11, floatValue));
                v5Var.setTranslationX(this.d * floatValue);
                v5Var.setTranslationY(this.e * floatValue);
                float f12 = 1.0f - floatValue;
                v5Var.setAlpha(f12);
                nVar.s = f12;
                nVar.invalidate();
                break;
            default:
                wf.j jVar = (wf.j) this.f;
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
