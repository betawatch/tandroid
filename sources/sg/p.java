package sg;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;
    public final /* synthetic */ r c;

    public /* synthetic */ p(s sVar, r rVar, int i10) {
        this.a = i10;
        this.b = sVar;
        this.c = rVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                s sVar = this.b;
                sVar.getClass();
                this.c.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                break;
            default:
                s sVar2 = this.b;
                sVar2.getClass();
                this.c.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                break;
        }
    }
}
