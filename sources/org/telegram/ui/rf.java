package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class rf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rf(Object obj, float f10, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                bn bnVar = (bn) this.c;
                bnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar.X8 = floatValue;
                bnVar.b9 = floatValue / this.b;
                View view = bnVar.fragmentView;
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
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                org.telegram.ui.Components.fe feVar = chatActivityEnterView.R0;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.gf gfVar = chatActivityEnterView.F0;
                if (gfVar != null) {
                    gfVar.setAlpha(1.0f - floatValue3);
                }
                chatActivityEnterView.N4.set(feVar, Float.valueOf(org.telegram.messenger.g0.T1(1.0f, 0.6f, floatValue3)));
                chatActivityEnterView.P4.set(feVar, Float.valueOf((1.0f - floatValue3) * this.b));
                break;
            case 3:
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) t0Var.c;
                org.telegram.ui.Components.ce ceVar = chatActivityEnterView2.N4;
                org.telegram.ui.Components.fe feVar2 = chatActivityEnterView2.R0;
                ceVar.set(feVar2, Float.valueOf(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue4)));
                chatActivityEnterView2.P4.set(feVar2, Float.valueOf(this.b * floatValue4));
                break;
            case 4:
                ((org.telegram.ui.Components.rn) this.c).F.setTranslationY(org.telegram.messenger.g0.T1(this.b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 5:
                ((pr0) this.c).S.setTranslationY(org.telegram.messenger.g0.T1(this.b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 6:
                rx0 rx0Var = (rx0) this.c;
                rx0Var.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float T1 = org.telegram.messenger.g0.T1(0.0f, this.b, floatValue5);
                rx0Var.a.setTranslationX(T1);
                rx0Var.b.setTranslationX(T1);
                ImageView imageView = rx0Var.c;
                imageView.setTranslationX(T1);
                org.telegram.ui.Components.mp mpVar = rx0Var.f;
                mpVar.setTranslationX((org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(32.0f) : -org.telegram.messenger.g0.L(32.0f)) + T1);
                float f10 = (floatValue5 * 0.5f) + 0.5f;
                mpVar.setScaleX(f10);
                mpVar.setScaleY(f10);
                mpVar.setAlpha(floatValue5);
                float f11 = 1.0f - floatValue5;
                float f12 = (f11 * 0.5f) + 0.5f;
                imageView.setScaleX(f12);
                imageView.setScaleY(f12);
                imageView.setAlpha(f11);
                break;
            case 7:
                org.telegram.ui.Wallet.m4 m4Var = (org.telegram.ui.Wallet.m4) this.c;
                m4Var.getClass();
                m4Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.b) % 360.0f;
                m4Var.a.invalidate();
                break;
            default:
                org.telegram.ui.Wallet.e9 e9Var = (org.telegram.ui.Wallet.e9) this.c;
                e9Var.getClass();
                float floatValue6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e9Var.c = e9Var.c();
                e9Var.d = this.b * floatValue6;
                e9Var.s = floatValue6 > 0.0f;
                break;
        }
    }
}
