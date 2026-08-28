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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class sf0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ tf0 b;

    public /* synthetic */ sf0(tf0 tf0Var, int i9) {
        this.a = i9;
        this.b = tf0Var;
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
                tf0 tf0Var = this.b;
                if (tf0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) tf0Var.getParent()).removeView(tf0Var);
                }
                tf0Var.c.setVisibility(0);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                tf0 tf0Var = this.b;
                tf0Var.c.setVisibility(8);
                int measuredWidth = (int) (tf0Var.b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (tf0Var.b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                tf0Var.b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / ImageReceiver.DEFAULT_CROSSFADE_DURATION));
                tf0Var.d.setBackground(new BitmapDrawable(tf0Var.getContext().getResources(), createBitmap));
                tf0Var.d.setAlpha(0.0f);
                tf0Var.d.setVisibility(0);
                tf0Var.b.addView(tf0Var);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
