package zg;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ e0 c;

    public /* synthetic */ a(b bVar, e0 e0Var, int i10) {
        this.a = i10;
        this.b = bVar;
        this.c = e0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.c.invalidate();
                break;
            default:
                this.b.f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.c.invalidate();
                break;
        }
    }
}
