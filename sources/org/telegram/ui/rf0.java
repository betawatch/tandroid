package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class rf0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ sf0 b;

    public /* synthetic */ rf0(sf0 sf0Var, int i10) {
        this.a = i10;
        this.b = sf0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    this.b.h.requestFocus();
                    break;
                }
                break;
            default:
                sf0 sf0Var = this.b;
                if (sf0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) sf0Var.getParent()).removeView(sf0Var);
                }
                sf0Var.c.setVisibility(0);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                sf0 sf0Var = this.b;
                sf0Var.c.setVisibility(8);
                int measuredWidth = (int) (sf0Var.b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (sf0Var.b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                sf0Var.b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / ImageReceiver.DEFAULT_CROSSFADE_DURATION));
                sf0Var.d.setBackground(new BitmapDrawable(sf0Var.getContext().getResources(), createBitmap));
                sf0Var.d.setAlpha(0.0f);
                sf0Var.d.setVisibility(0);
                sf0Var.b.addView(sf0Var);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
