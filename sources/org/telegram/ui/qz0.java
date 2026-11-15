package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class qz0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n11 b;

    public /* synthetic */ qz0(n11 n11Var, int i7) {
        this.a = i7;
        this.b = n11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                n11 n11Var = this.b;
                n11Var.getClass();
                n11Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.b.m();
                break;
            case 2:
                n11 n11Var2 = this.b;
                View view = n11Var2.u0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int w10 = org.telegram.ui.ActionBar.j6.w(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G8, n11Var2.a1), i0.a.o(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = n11Var2.n0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(w10, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.bn bnVar = n11Var2.o0;
                if (bnVar != null) {
                    bnVar.getBackground().setColorFilter(new PorterDuffColorFilter(w10, PorterDuff.Mode.MULTIPLY));
                    break;
                }
                break;
            default:
                n11 n11Var3 = this.b;
                i01 i01Var = n11Var3.b0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n11Var3.setTranslationY((1.0f - floatValue) * org.telegram.messenger.g0.L(8.0f));
                View view3 = n11Var3.n0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.bn bnVar2 = n11Var3.o0;
                if (bnVar2 != null) {
                    bnVar2.setAlpha(floatValue * floatValue);
                }
                i01Var.setAlpha(floatValue);
                i01Var.invalidate();
                n11Var3.invalidate();
                break;
        }
    }
}
