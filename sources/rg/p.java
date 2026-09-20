package rg;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
