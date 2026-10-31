package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ve0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ we0 b;

    public /* synthetic */ ve0(we0 we0Var, int i10) {
        this.a = i10;
        this.b = we0Var;
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
                we0 we0Var = this.b;
                if (we0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) we0Var.getParent()).removeView(we0Var);
                }
                we0Var.c.setVisibility(0);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                we0 we0Var = this.b;
                we0Var.c.setVisibility(8);
                int measuredWidth = (int) (we0Var.b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (we0Var.b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false));
                we0Var.b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / org.telegram.messenger.zs.g2));
                we0Var.d.setBackground(new BitmapDrawable(we0Var.getContext().getResources(), createBitmap));
                we0Var.d.setAlpha(0.0f);
                we0Var.d.setVisibility(0);
                we0Var.b.addView(we0Var);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
