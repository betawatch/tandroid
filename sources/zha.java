// default package

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class zha extends FrameLayout {
    public hw6 E;
    public int F;
    public ir8 G;
    public kba H;
    public boolean I;
    public int J;
    public boolean K;
    public float L;
    public boolean M;
    public final Paint N;
    public vnb O;
    public Drawable P;
    public long a;
    public boolean b;
    public ObjectAnimator c;
    public zb3 d;
    public x79 e;
    public x79 f;
    public jga h;
    public yha n;
    public kga r;
    public tga s;
    public vga w;
    public hga x;
    public sga y;

    public zha(Context context) {
        super(context);
        this.N = new Paint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDrawPageBackground(boolean z) {
        if (this.M != z) {
            this.M = z;
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWallpaper(Drawable drawable) {
        Drawable drawable2 = this.P;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.P = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
            }
            invalidate();
        }
    }

    public final void c(Canvas canvas) {
        int min = Math.min(0, this.h.getTop());
        int max = Math.max(getHeight(), this.h.getBottom());
        int L = hl.L(2.0f);
        if (this.P != null) {
            canvas.save();
            int i = -L;
            canvas.clipRect(i, min, getWidth() + L, max);
            this.P.setBounds(i, min, getWidth() + L, max);
            this.P.draw(canvas);
            canvas.restore();
            return;
        }
        if (this.M) {
            int v0 = aob.v0(aob.a7, this.O);
            Paint paint = this.N;
            paint.setColor(v0);
            canvas.drawRect(-L, min, getWidth() + L, max, paint);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
        ir8 ir8Var = this.G;
        if (ir8Var == null || ir8Var.getVisibility() != 0) {
            return;
        }
        k69 fastScroll = this.h.getFastScroll();
        if (fastScroll != null) {
            float L = hl.L(36.0f) + fastScroll.getScrollBarY();
            if (this.F == 9) {
                L += hl.L(64.0f);
            }
            int i = this.F;
            if (i == 8 || eja.t0(i)) {
                L += hl.L(42.0f);
            }
            float measuredWidth = (getMeasuredWidth() - this.G.getMeasuredWidth()) - hl.L(16.0f);
            this.G.setPivotX(r2.getMeasuredWidth());
            this.G.setPivotY(0.0f);
            this.G.setTranslationX(measuredWidth);
            this.G.setTranslationY(L);
        }
        if (fastScroll.getProgress() > 0.85f) {
            eja.m1(this, null, false);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.n) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.P || super.verifyDrawable(drawable);
    }
}
