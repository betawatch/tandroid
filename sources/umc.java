// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class umc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wmc b;

    public /* synthetic */ umc(wmc wmcVar, byte b) {
        this.a = b;
        this.b = wmcVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        wmc wmcVar = this.b;
        switch (b) {
            case 0:
                wmcVar.getClass();
                wmcVar.I = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                wmcVar.invalidate();
                wmcVar.U.c();
                break;
            case 1:
                wmcVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wmcVar.invalidate();
                wmcVar.U.c();
                break;
            case 2:
                wmcVar.getClass();
                wmcVar.I = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                wmcVar.invalidate();
                wmcVar.U.c();
                break;
            case 3:
                wmcVar.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                wmcVar.invalidate();
                break;
            case 4:
                wmcVar.G = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                wmcVar.invalidate();
                break;
            default:
                wmcVar.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                wmcVar.invalidate();
                break;
        }
    }
}
