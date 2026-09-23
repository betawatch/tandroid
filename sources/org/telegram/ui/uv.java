package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class uv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ry b;
    public final /* synthetic */ float c;

    public /* synthetic */ uv(ry ryVar, float f7, int i10) {
        this.a = i10;
        this.b = ryVar;
        this.c = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ry.V(this.b, this.c, valueAnimator);
                break;
            default:
                ry.E0(this.b, this.c, valueAnimator);
                break;
        }
    }
}
