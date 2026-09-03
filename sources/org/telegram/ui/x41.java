package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x41 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w61 b;

    public /* synthetic */ x41(w61 w61Var, int i10) {
        this.a = i10;
        this.b = w61Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                w61 w61Var = this.b;
                w61Var.getClass();
                w61Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.b.m();
                break;
            case 2:
                w61 w61Var2 = this.b;
                View view = w61Var2.q0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int v = org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G8, w61Var2.W0), i0.a.k(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = w61Var2.j0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.in inVar = w61Var2.k0;
                if (inVar != null) {
                    inVar.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                    break;
                }
                break;
            default:
                w61 w61Var3 = this.b;
                q51 q51Var = w61Var3.U;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w61Var3.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(8.0f));
                View view3 = w61Var3.j0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.in inVar2 = w61Var3.k0;
                if (inVar2 != null) {
                    inVar2.setAlpha(floatValue * floatValue);
                }
                q51Var.setAlpha(floatValue);
                q51Var.invalidate();
                w61Var3.invalidate();
                break;
        }
    }
}
