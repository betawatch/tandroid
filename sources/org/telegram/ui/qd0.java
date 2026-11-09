package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class qd0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ rd0 b;

    public /* synthetic */ qd0(rd0 rd0Var, int i7) {
        this.a = i7;
        this.b = rd0Var;
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
                rd0 rd0Var = this.b;
                if (rd0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) rd0Var.getParent()).removeView(rd0Var);
                }
                rd0Var.c.setVisibility(0);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                rd0 rd0Var = this.b;
                rd0Var.c.setVisibility(8);
                int measuredWidth = (int) (rd0Var.b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (rd0Var.b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.d6, false));
                rd0Var.b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / org.telegram.messenger.qs.g2));
                rd0Var.d.setBackground(new BitmapDrawable(rd0Var.getContext().getResources(), createBitmap));
                rd0Var.d.setAlpha(0.0f);
                rd0Var.d.setVisibility(0);
                rd0Var.b.addView(rd0Var);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
