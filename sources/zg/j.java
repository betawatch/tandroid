package zg;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ j(q qVar, int i10) {
        this.a = i10;
        this.b = qVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * r0.c.getMeasuredHeight());
                break;
            default:
                this.b.w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * r0.c.getMeasuredHeight());
                break;
        }
    }
}
