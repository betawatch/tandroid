package vg;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;
    public final /* synthetic */ q c;

    public /* synthetic */ o(r rVar, q qVar, int i3) {
        this.a = i3;
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
