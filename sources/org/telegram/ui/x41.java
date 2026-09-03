package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x41 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x61 b;

    public /* synthetic */ x41(x61 x61Var, int i10) {
        this.a = i10;
        this.b = x61Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                x61 x61Var = this.b;
                x61Var.getClass();
                x61Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.b.m();
                break;
            case 2:
                x61 x61Var2 = this.b;
                View view = x61Var2.q0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int v = org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, x61Var2.W0), i0.a.k(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = x61Var2.j0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.gn gnVar = x61Var2.k0;
                if (gnVar != null) {
                    gnVar.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                    break;
                }
                break;
            default:
                x61 x61Var3 = this.b;
                q51 q51Var = x61Var3.U;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x61Var3.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(8.0f));
                View view3 = x61Var3.j0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.gn gnVar2 = x61Var3.k0;
                if (gnVar2 != null) {
                    gnVar2.setAlpha(floatValue * floatValue);
                }
                q51Var.setAlpha(floatValue);
                q51Var.invalidate();
                x61Var3.invalidate();
                break;
        }
    }
}
