package ug;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;
    public final /* synthetic */ q c;

    public /* synthetic */ o(r rVar, q qVar, int i7) {
        this.a = i7;
        this.b = rVar;
        this.c = qVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                r rVar = this.b;
                rVar.getClass();
                this.c.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.invalidate();
                break;
            default:
                r rVar2 = this.b;
                rVar2.getClass();
                this.c.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar2.invalidate();
                break;
        }
    }
}
