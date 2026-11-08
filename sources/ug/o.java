package ug;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;
    public final /* synthetic */ q c;

    public /* synthetic */ o(r rVar, q qVar, int i7) {
        this.a = i7;
        this.b = rVar;
        this.c = qVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                r rVar = this.b;
                rVar.getClass();
                this.c.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.invalidate();
                break;
            default:
                r rVar2 = this.b;
                rVar2.getClass();
                this.c.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar2.invalidate();
                break;
        }
    }
}
