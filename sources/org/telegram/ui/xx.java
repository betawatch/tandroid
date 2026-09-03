package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class xx implements ValueAnimator.AnimatorUpdateListener {
    public int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ py d;

    public xx(py pyVar, float f10, boolean z4, float f11) {
        this.d = pyVar;
        this.b = f10;
        this.c = f11;
        this.a = (int) f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.b, this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.a;
        this.a = lerp;
        py pyVar = this.d;
        pyVar.b0[0].a.scrollBy(0, i10);
        View view = pyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
