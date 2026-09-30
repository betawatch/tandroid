package zg;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ d0 c;

    public /* synthetic */ a(b bVar, d0 d0Var, int i10) {
        this.a = i10;
        this.b = bVar;
        this.c = d0Var;
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
