package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;
    public final /* synthetic */ View c;

    public /* synthetic */ rf(fo foVar, org.telegram.ui.Cells.w0 w0Var, int i10) {
        this.a = i10;
        this.b = foVar;
        this.c = w0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                fo foVar = this.b;
                foVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                foVar.A9 = AndroidUtilities.dp(30.0f) * floatValue;
                foVar.t9();
                this.c.setAlpha(floatValue);
                break;
            default:
                fo foVar2 = this.b;
                foVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                foVar2.A9 = AndroidUtilities.dp(30.0f) * floatValue2;
                foVar2.t9();
                foVar2.w9();
                this.c.setAlpha(floatValue2);
                break;
        }
    }
}
