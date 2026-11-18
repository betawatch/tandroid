package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ss0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ View c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ss0(Object obj, ViewGroup viewGroup, Object obj2, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = viewGroup;
        this.d = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                vs0 vs0Var = (vs0) this.b;
                ValueAnimator valueAnimator2 = (ValueAnimator) this.d;
                PremiumPreviewFragment premiumPreviewFragment = vs0Var.n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = valueAnimator2.getAnimatedFraction();
                for (int i7 = 0; i7 < premiumPreviewFragment.V.getChildCount(); i7++) {
                    View childAt = premiumPreviewFragment.V.getChildAt(i7);
                    if (childAt != vs0Var.e) {
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + (childAt == vs0Var.c ? 0.0f - (org.telegram.messenger.g0.L(15.0f) * animatedFraction) : 0.0f + (org.telegram.messenger.g0.L(8.0f) * animatedFraction)));
                    }
                }
                break;
            default:
                l51 l51Var = (l51) this.b;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                org.telegram.ui.Components.ri riVar = (org.telegram.ui.Components.ri) this.d;
                l51Var.getClass();
                l51Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.getEditField().setAlpha(l51Var.a);
                riVar.invalidate();
                break;
        }
    }
}
