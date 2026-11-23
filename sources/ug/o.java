package ug;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
