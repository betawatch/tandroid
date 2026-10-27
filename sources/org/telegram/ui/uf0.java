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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class uf0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ vf0 b;

    public /* synthetic */ uf0(vf0 vf0Var, int i10) {
        this.a = i10;
        this.b = vf0Var;
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
                vf0 vf0Var = this.b;
                if (vf0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) vf0Var.getParent()).removeView(vf0Var);
                }
                vf0Var.c.setVisibility(0);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                vf0 vf0Var = this.b;
                vf0Var.c.setVisibility(8);
                int measuredWidth = (int) (vf0Var.b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (vf0Var.b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false));
                vf0Var.b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / ImageReceiver.DEFAULT_CROSSFADE_DURATION));
                vf0Var.d.setBackground(new BitmapDrawable(vf0Var.getContext().getResources(), createBitmap));
                vf0Var.d.setAlpha(0.0f);
                vf0Var.d.setVisibility(0);
                vf0Var.b.addView(vf0Var);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
