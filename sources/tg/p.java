package tg;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
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
