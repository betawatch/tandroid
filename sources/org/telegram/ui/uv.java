package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ py b;
    public final /* synthetic */ float c;

    public /* synthetic */ uv(py pyVar, float f10, int i10) {
        this.a = i10;
        this.b = pyVar;
        this.c = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                py.V(this.b, this.c, valueAnimator);
                break;
            default:
                py.E0(this.b, this.c, valueAnimator);
                break;
        }
    }
}
