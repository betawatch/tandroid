package rg;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
