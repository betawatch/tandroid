package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ oy b;
    public final /* synthetic */ float c;

    public /* synthetic */ tv(oy oyVar, float f10, int i10) {
        this.a = i10;
        this.b = oyVar;
        this.c = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                oy.V(this.b, this.c, valueAnimator);
                break;
            default:
                oy.E0(this.b, this.c, valueAnimator);
                break;
        }
    }
}
