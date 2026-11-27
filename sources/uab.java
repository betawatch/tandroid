// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class uab implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rbb b;

    public /* synthetic */ uab(rbb rbbVar, byte b) {
        this.a = b;
        this.b = rbbVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        rbb rbbVar = this.b;
        switch (b) {
            case 0:
                rbbVar.d1.m();
                break;
            default:
                rbbVar.m0();
                break;
        }
    }
}
