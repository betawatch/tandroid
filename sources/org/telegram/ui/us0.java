package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class us0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ View c;
    public final /* synthetic */ Object d;

    public /* synthetic */ us0(int i7, ViewGroup viewGroup, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = viewGroup;
        this.d = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                xs0 xs0Var = (xs0) this.b;
                ValueAnimator valueAnimator2 = (ValueAnimator) this.d;
                PremiumPreviewFragment premiumPreviewFragment = xs0Var.n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = valueAnimator2.getAnimatedFraction();
                for (int i7 = 0; i7 < premiumPreviewFragment.U.getChildCount(); i7++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i7);
                    if (childAt != xs0Var.e) {
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + (childAt == xs0Var.c ? 0.0f - (org.telegram.messenger.g0.L(15.0f) * animatedFraction) : 0.0f + (org.telegram.messenger.g0.L(8.0f) * animatedFraction)));
                    }
                }
                break;
            default:
                n51 n51Var = (n51) this.b;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                org.telegram.ui.Components.bi biVar = (org.telegram.ui.Components.bi) this.d;
                n51Var.getClass();
                n51Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.getEditField().setAlpha(n51Var.a);
                biVar.invalidate();
                break;
        }
    }
}
