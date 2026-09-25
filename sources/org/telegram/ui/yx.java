package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class yx implements ValueAnimator.AnimatorUpdateListener {
    public int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ qy d;

    public yx(qy qyVar, float f7, boolean z10, float f10) {
        this.d = qyVar;
        this.b = f7;
        this.c = f10;
        this.a = (int) f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.b, this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.a;
        this.a = lerp;
        qy qyVar = this.d;
        qyVar.e0[0].a.scrollBy(0, i10);
        View view = qyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
