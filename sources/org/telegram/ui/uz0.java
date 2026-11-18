package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class uz0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r11 b;

    public /* synthetic */ uz0(r11 r11Var, int i7) {
        this.a = i7;
        this.b = r11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                r11 r11Var = this.b;
                r11Var.getClass();
                r11Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.b.m();
                break;
            case 2:
                r11 r11Var2 = this.b;
                View view = r11Var2.u0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int w10 = org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G8, r11Var2.a1), i0.a.o(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = r11Var2.n0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(w10, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.jn jnVar = r11Var2.o0;
                if (jnVar != null) {
                    jnVar.getBackground().setColorFilter(new PorterDuffColorFilter(w10, PorterDuff.Mode.MULTIPLY));
                    break;
                }
                break;
            default:
                r11 r11Var3 = this.b;
                m01 m01Var = r11Var3.b0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r11Var3.setTranslationY((1.0f - floatValue) * org.telegram.messenger.g0.L(8.0f));
                View view3 = r11Var3.n0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.jn jnVar2 = r11Var3.o0;
                if (jnVar2 != null) {
                    jnVar2.setAlpha(floatValue * floatValue);
                }
                m01Var.setAlpha(floatValue);
                m01Var.invalidate();
                r11Var3.invalidate();
                break;
        }
    }
}
