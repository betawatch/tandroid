package qg;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;
    public final /* synthetic */ s c;

    public /* synthetic */ q(t tVar, s sVar, int i10) {
        this.a = i10;
        this.b = tVar;
        this.c = sVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                t tVar = this.b;
                tVar.getClass();
                this.c.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tVar.invalidate();
                break;
            default:
                t tVar2 = this.b;
                tVar2.getClass();
                this.c.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tVar2.invalidate();
                break;
        }
    }
}
