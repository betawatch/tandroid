package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xe implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;
    public final /* synthetic */ View c;

    public /* synthetic */ xe(tn tnVar, org.telegram.ui.Cells.v0 v0Var, int i10) {
        this.a = i10;
        this.b = tnVar;
        this.c = v0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                tn tnVar = this.b;
                tnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tnVar.w9 = AndroidUtilities.dp(30.0f) * floatValue;
                tnVar.o9();
                this.c.setAlpha(floatValue);
                break;
            default:
                tn tnVar2 = this.b;
                tnVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tnVar2.w9 = AndroidUtilities.dp(30.0f) * floatValue2;
                tnVar2.o9();
                tnVar2.r9();
                this.c.setAlpha(floatValue2);
                break;
        }
    }
}
