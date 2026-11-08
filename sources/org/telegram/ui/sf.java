package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
                an anVar = (an) this.c;
                anVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar.V8 = floatValue;
                anVar.Z8 = floatValue / this.b;
                View view = anVar.fragmentView;
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
                ((org.telegram.ui.Components.bn) this.c).E.setTranslationY(org.telegram.messenger.g0.T1(this.b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 3:
                ((pr0) this.c).R.setTranslationY(org.telegram.messenger.g0.T1(this.b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 4:
                nx0 nx0Var = (nx0) this.c;
                nx0Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float T1 = org.telegram.messenger.g0.T1(0.0f, this.b, floatValue3);
                nx0Var.a.setTranslationX(T1);
                nx0Var.b.setTranslationX(T1);
                ImageView imageView = nx0Var.c;
                imageView.setTranslationX(T1);
                org.telegram.ui.Components.wo woVar = nx0Var.f;
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
                org.telegram.ui.Wallet.c4 c4Var = (org.telegram.ui.Wallet.c4) this.c;
                c4Var.getClass();
                c4Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.b) % 360.0f;
                c4Var.a.invalidate();
                break;
            default:
                org.telegram.ui.Wallet.o8 o8Var = (org.telegram.ui.Wallet.o8) this.c;
                o8Var.getClass();
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o8Var.c = o8Var.c();
                o8Var.d = this.b * floatValue4;
                o8Var.s = floatValue4 > 0.0f;
                break;
        }
    }
}
