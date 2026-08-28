package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ze implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;
    public final /* synthetic */ View c;

    public /* synthetic */ ze(qn qnVar, org.telegram.ui.Cells.w0 w0Var, int i9) {
        this.a = i9;
        this.b = qnVar;
        this.c = w0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                qn qnVar = this.b;
                qnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar.w9 = AndroidUtilities.dp(30.0f) * floatValue;
                qnVar.o9();
                this.c.setAlpha(floatValue);
                break;
            default:
                qn qnVar2 = this.b;
                qnVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar2.w9 = AndroidUtilities.dp(30.0f) * floatValue2;
                qnVar2.o9();
                qnVar2.r9();
                this.c.setAlpha(floatValue2);
                break;
        }
    }
}
