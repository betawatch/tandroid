package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ue0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ve0 b;

    public /* synthetic */ ue0(ve0 ve0Var, int i10) {
        this.a = i10;
        this.b = ve0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                if (org.telegram.messenger.i0.C1()) {
                    this.b.h.requestFocus();
                    break;
                }
                break;
            default:
                ve0 ve0Var = this.b;
                if (ve0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) ve0Var.getParent()).removeView(ve0Var);
                }
                ve0Var.c.setVisibility(0);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ve0 ve0Var = this.b;
                ve0Var.c.setVisibility(8);
                int measuredWidth = (int) (ve0Var.b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (ve0Var.b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false));
                ve0Var.b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / org.telegram.messenger.at.g2));
                ve0Var.d.setBackground(new BitmapDrawable(ve0Var.getContext().getResources(), createBitmap));
                ve0Var.d.setAlpha(0.0f);
                ve0Var.d.setVisibility(0);
                ve0Var.b.addView(ve0Var);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
