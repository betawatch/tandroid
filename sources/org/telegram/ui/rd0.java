package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class rd0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ sd0 b;

    public /* synthetic */ rd0(sd0 sd0Var, int i7) {
        this.a = i7;
        this.b = sd0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                if (org.telegram.messenger.g0.C1()) {
                    this.b.h.requestFocus();
                    break;
                }
                break;
            default:
                sd0 sd0Var = this.b;
                if (sd0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) sd0Var.getParent()).removeView(sd0Var);
                }
                sd0Var.c.setVisibility(0);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                sd0 sd0Var = this.b;
                sd0Var.c.setVisibility(8);
                int measuredWidth = (int) (sd0Var.b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (sd0Var.b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false));
                sd0Var.b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / org.telegram.messenger.qs.g2));
                sd0Var.d.setBackground(new BitmapDrawable(sd0Var.getContext().getResources(), createBitmap));
                sd0Var.d.setAlpha(0.0f);
                sd0Var.d.setVisibility(0);
                sd0Var.b.addView(sd0Var);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
