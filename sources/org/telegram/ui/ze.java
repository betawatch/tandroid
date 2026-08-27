package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ze implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;
    public final /* synthetic */ View c;

    public /* synthetic */ ze(rn rnVar, org.telegram.ui.Cells.v0 v0Var, int i10) {
        this.a = i10;
        this.b = rnVar;
        this.c = v0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                rn rnVar = this.b;
                rnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rnVar.w9 = AndroidUtilities.dp(30.0f) * floatValue;
                rnVar.o9();
                this.c.setAlpha(floatValue);
                break;
            default:
                rn rnVar2 = this.b;
                rnVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rnVar2.w9 = AndroidUtilities.dp(30.0f) * floatValue2;
                rnVar2.o9();
                rnVar2.r9();
                this.c.setAlpha(floatValue2);
                break;
        }
    }
}
