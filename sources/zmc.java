// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zmc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cnc b;

    public /* synthetic */ zmc(cnc cncVar, byte b) {
        this.a = b;
        this.b = cncVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        cnc cncVar = this.b;
        switch (b) {
            case 0:
                cncVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cncVar.invalidate();
                break;
            case 1:
                cncVar.x = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                cncVar.invalidate();
                break;
            case 2:
                cncVar.s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                cncVar.invalidate();
                break;
            default:
                cncVar.r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                cncVar.invalidate();
                break;
        }
    }
}
