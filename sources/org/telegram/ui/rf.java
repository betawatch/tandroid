package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                org.telegram.ui.Components.ge geVar = chatActivityEnterView.R0;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.hf hfVar = chatActivityEnterView.F0;
                if (hfVar != null) {
                    hfVar.setAlpha(1.0f - floatValue3);
                }
                chatActivityEnterView.P4.set(geVar, Float.valueOf(org.telegram.messenger.g0.T1(1.0f, 0.6f, floatValue3)));
                chatActivityEnterView.R4.set(geVar, Float.valueOf((1.0f - floatValue3) * this.b));
                break;
            case 3:
                org.telegram.ui.ActionBar.s0 s0Var = (org.telegram.ui.ActionBar.s0) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) s0Var.c;
                org.telegram.ui.Components.de deVar = chatActivityEnterView2.P4;
                org.telegram.ui.Components.ge geVar2 = chatActivityEnterView2.R0;
                deVar.set(geVar2, Float.valueOf(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue4)));
                chatActivityEnterView2.R4.set(geVar2, Float.valueOf(this.b * floatValue4));
                break;
            case 4:
                ((org.telegram.ui.Components.qn) this.c).F.setTranslationY(org.telegram.messenger.g0.T1(this.b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 5:
                ((pr0) this.c).S.setTranslationY(org.telegram.messenger.g0.T1(this.b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 6:
                px0 px0Var = (px0) this.c;
                px0Var.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float T1 = org.telegram.messenger.g0.T1(0.0f, this.b, floatValue5);
                px0Var.a.setTranslationX(T1);
                px0Var.b.setTranslationX(T1);
                ImageView imageView = px0Var.c;
                imageView.setTranslationX(T1);
                org.telegram.ui.Components.lp lpVar = px0Var.f;
                lpVar.setTranslationX((org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(32.0f) : -org.telegram.messenger.g0.L(32.0f)) + T1);
                float f10 = (floatValue5 * 0.5f) + 0.5f;
                lpVar.setScaleX(f10);
                lpVar.setScaleY(f10);
                lpVar.setAlpha(floatValue5);
                float f11 = 1.0f - floatValue5;
                float f12 = (f11 * 0.5f) + 0.5f;
                imageView.setScaleX(f12);
                imageView.setScaleY(f12);
                imageView.setAlpha(f11);
                break;
            case 7:
                org.telegram.ui.Wallet.n4 n4Var = (org.telegram.ui.Wallet.n4) this.c;
                n4Var.getClass();
                n4Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.b) % 360.0f;
                n4Var.a.invalidate();
                break;
            default:
                org.telegram.ui.Wallet.f9 f9Var = (org.telegram.ui.Wallet.f9) this.c;
                f9Var.getClass();
                float floatValue6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f9Var.c = f9Var.c();
                f9Var.d = this.b * floatValue6;
                f9Var.s = floatValue6 > 0.0f;
                break;
        }
    }
}
