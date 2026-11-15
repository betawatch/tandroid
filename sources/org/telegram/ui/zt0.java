package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class zt0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ zt0(ProfileActivity profileActivity, int i7) {
        this.a = i7;
        this.b = profileActivity;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.a;
        ProfileActivity profileActivity = this.b;
        switch (i7) {
            case 0:
                profileActivity.y0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                break;
            case 1:
                RectF rectF = ProfileActivity.X6;
                profileActivity.getClass();
                profileActivity.Z4(valueAnimator.getAnimatedFraction());
                break;
            case 2:
                RectF rectF2 = ProfileActivity.X6;
                View view = profileActivity.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity.O5(true);
                break;
            default:
                RectF rectF3 = ProfileActivity.X6;
                profileActivity.O5(true);
                break;
        }
    }
}
