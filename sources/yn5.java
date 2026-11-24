// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yn5 extends FrameLayout {
    public final xn5 a;
    public final bf0 b;
    public AnimatorSet c;
    public boolean d;
    public boolean e;
    public final boolean f;

    public yn5(Activity activity) {
        super(activity);
        xn5 xn5Var = new xn5(gm.L(104.0f), gm.L(111.0f), gm.L(12.0f), 8);
        this.a = xn5Var;
        xn5Var.b(3.0d);
        if (!xn5Var.e) {
            invalidate();
        }
        xn5Var.e = true;
        bf0 bf0Var = new bf0(activity);
        this.b = bf0Var;
        addView(bf0Var, qoe.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<yn5, Float>) View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, (Property<yn5, Float>) View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.c.setInterpolator(d53.g);
        this.c.setDuration(3000L);
        boolean e = e86.e(512);
        this.f = e;
        if (e) {
            this.c.start();
        }
        setClipChildren(false);
    }

    public final void a() {
        if (this.d) {
            return;
        }
        AnimatorSet animatorSet = this.c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.c = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<yn5, Float>) View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, (Property<yn5, Float>) View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.c.setInterpolator(d53.g);
        this.c.setDuration(400L);
        this.c.start();
    }

    public final void b(boolean z, boolean z2) {
        ValueAnimator ofFloat;
        if (this.e != z) {
            this.e = z;
            xn5 xn5Var = this.a;
            if (z) {
                xn5Var.b(3.0d);
            }
            if (xn5Var.h != z) {
                xn5Var.h = z;
                ValueAnimator valueAnimator = xn5Var.j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    xn5Var.j.cancel();
                }
                if (z) {
                    ofFloat = ValueAnimator.ofFloat(xn5Var.i, 0.0f);
                    xn5Var.j = ofFloat;
                    xn5Var.k = (int) (2000.0f / gm.t);
                } else {
                    xn5Var.k = 0;
                    ofFloat = ValueAnimator.ofFloat(xn5Var.i, 1.0f);
                    xn5Var.j = ofFloat;
                }
                ofFloat.addUpdateListener(new fh4(xn5Var, (byte) 12));
                ValueAnimator valueAnimator2 = xn5Var.j;
                if (z2) {
                    valueAnimator2.setDuration(150L);
                } else {
                    valueAnimator2.setDuration(1000L);
                }
                xn5Var.j.start();
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f) {
            xn5 xn5Var = this.a;
            xn5Var.c();
            xn5Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.e) {
            return;
        }
        xn5 xn5Var = this.a;
        if (d > 1.5d) {
            xn5Var.b(d);
        } else {
            xn5Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i) {
        this.b.setRoundRadius(i);
    }

    public void setShowWaves(boolean z) {
        xn5 xn5Var = this.a;
        if (xn5Var.e != z) {
            invalidate();
        }
        xn5Var.e = z;
    }
}
