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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class vf0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ wf0 b;

    public /* synthetic */ vf0(wf0 wf0Var, int i10) {
        this.a = i10;
        this.b = wf0Var;
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
                wf0 wf0Var = this.b;
                if (wf0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) wf0Var.getParent()).removeView(wf0Var);
                }
                wf0Var.c.setVisibility(0);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                wf0 wf0Var = this.b;
                wf0Var.c.setVisibility(8);
                int measuredWidth = (int) (wf0Var.b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (wf0Var.b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                wf0Var.b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / ImageReceiver.DEFAULT_CROSSFADE_DURATION));
                wf0Var.d.setBackground(new BitmapDrawable(wf0Var.getContext().getResources(), createBitmap));
                wf0Var.d.setAlpha(0.0f);
                wf0Var.d.setVisibility(0);
                wf0Var.b.addView(wf0Var);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
