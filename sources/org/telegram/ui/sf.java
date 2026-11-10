package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sf(Object obj, float f10, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                cn cnVar = (cn) this.c;
                cnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cnVar.V8 = floatValue;
                cnVar.Z8 = floatValue / this.b;
                View view = cnVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    View view2 = (View) arrayList.get(i7);
                    if (view2 != null) {
                        view2.setTranslationY(this.b * floatValue2);
                    }
                }
                break;
            case 2:
                ((org.telegram.ui.Components.an) this.c).E.setTranslationY(org.telegram.messenger.g0.T1(this.b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 3:
                ((sr0) this.c).R.setTranslationY(org.telegram.messenger.g0.T1(this.b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 4:
                sx0 sx0Var = (sx0) this.c;
                sx0Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float T1 = org.telegram.messenger.g0.T1(0.0f, this.b, floatValue3);
                sx0Var.a.setTranslationX(T1);
                sx0Var.b.setTranslationX(T1);
                ImageView imageView = sx0Var.c;
                imageView.setTranslationX(T1);
                org.telegram.ui.Components.wo woVar = sx0Var.f;
                woVar.setTranslationX((org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(32.0f) : -org.telegram.messenger.g0.L(32.0f)) + T1);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                woVar.setScaleX(f10);
                woVar.setScaleY(f10);
                woVar.setAlpha(floatValue3);
                float f11 = 1.0f - floatValue3;
                float f12 = (f11 * 0.5f) + 0.5f;
                imageView.setScaleX(f12);
                imageView.setScaleY(f12);
                imageView.setAlpha(f11);
                break;
            case 5:
                org.telegram.ui.Wallet.d4 d4Var = (org.telegram.ui.Wallet.d4) this.c;
                d4Var.getClass();
                d4Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.b) % 360.0f;
                d4Var.a.invalidate();
                break;
            default:
                org.telegram.ui.Wallet.q8 q8Var = (org.telegram.ui.Wallet.q8) this.c;
                q8Var.getClass();
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q8Var.c = q8Var.c();
                q8Var.d = this.b * floatValue4;
                q8Var.s = floatValue4 > 0.0f;
                break;
        }
    }
}
