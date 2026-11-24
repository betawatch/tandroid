// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class wn8 extends be0 implements zia {
    public static final pm h0 = new pm("crossfadeProgress", (byte) 10);
    public boolean H;
    public float I;
    public float J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public final Path O;
    public final RectF P;
    public final Paint Q;
    public boolean R;
    public float S;
    public float T;
    public ImageReceiver U;
    public final ImageReceiver V;
    public float W;
    public jl5 a0;
    public boolean b0;
    public float c0;
    public sp8 d0;
    public boolean e0;
    public float f0;
    public Runnable g0;

    public wn8(Context context) {
        super(context);
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.O = new Path();
        this.P = new RectF();
        this.R = true;
        this.S = 1.0f;
        this.b0 = true;
        this.f0 = 1.0f;
        this.g0 = null;
        setLayerType(2, null);
        this.V = new ImageReceiver(this);
        Paint paint = new Paint(1);
        this.Q = paint;
        paint.setColor(-16777216);
    }

    @Override // zia
    public final void d(Runnable runnable) {
        this.g0 = runnable;
    }

    public float getForegroundAlpha() {
        return this.W;
    }

    public sy1 getPrevFragment() {
        return null;
    }

    public int getRoundRadiusForExpand() {
        return !this.N ? getRoundRadius()[0] : this.L;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        sp8 sp8Var = this.d0;
        if (sp8Var != null) {
            sp8Var.invalidate();
        }
        Runnable runnable = this.g0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // be0, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.V.I();
    }

    @Override // be0, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.V.K();
        jl5 jl5Var = this.a0;
        if (jl5Var != null) {
            jl5Var.a();
            this.a0 = null;
        }
    }

    @Override // be0, android.view.View
    public final void onDraw(Canvas canvas) {
        kp8 kp8Var;
        float f;
        boolean z;
        float f2;
        int i;
        float f3;
        float f4;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        sp8 sp8Var = this.d0;
        boolean z2 = sp8Var != null && sp8Var.getVisibility() == 0 && this.N && this.I > 0.0f;
        if (z2) {
            kp8 blurDrawer = this.d0.getBlurDrawer();
            kp8Var = blurDrawer;
            z2 = blurDrawer != null;
        } else {
            kp8Var = null;
        }
        float z3 = tb4.z(1.0f, this.W, this.f0, (1.0f - this.c0) * (this.e0 ? (int) gl.N(3.5f) : 0.0f));
        vl vlVar = this.e;
        ImageReceiver imageReceiver = vlVar != null ? vlVar.k : this.a;
        int i2 = this.L;
        if (i2 > 0) {
            Path path = this.O;
            path.rewind();
            RectF rectF = gl.P;
            f = 1.0f;
            rectF.set(z3, z3, measuredWidth - z3, measuredHeight - z3);
            float f5 = i2;
            path.addRoundRect(rectF, f5, f5, Path.Direction.CW);
            canvas.clipPath(path);
        } else {
            f = 1.0f;
        }
        canvas.save();
        float f6 = this.S;
        float f7 = measuredWidth;
        float f8 = measuredHeight;
        canvas.scale(f6, f6, f7 / 2.0f, f8 / 2.0f);
        if (z2) {
            measuredHeight = this.H ? Math.min(measuredHeight, measuredWidth) : (int) (f8 - gl.R1(0.0f, this.M / this.J, this.I));
        }
        ImageReceiver imageReceiver2 = this.U;
        if (imageReceiver2 != null) {
            float f9 = this.T;
            float f10 = (f - f9) * f;
            if (f9 > 0.0f) {
                float f11 = imageReceiver2.L0;
                float f12 = imageReceiver2.M0;
                f2 = 0.0f;
                float f13 = imageReceiver2.N0;
                i = 0;
                float f14 = imageReceiver2.O0;
                float alpha = imageReceiver2.getAlpha();
                float f15 = z3 * 2.0f;
                z = z2;
                f4 = f10;
                this.U.i0(z3, z3, f7 - f15, measuredHeight - f15);
                this.U.setAlpha(f9);
                this.U.h(canvas, null);
                this.U.i0(f11, f12, f13, f14);
                this.U.setAlpha(alpha);
            } else {
                z = z2;
                f2 = 0.0f;
                f4 = f10;
                i = 0;
            }
            f3 = f4;
        } else {
            z = z2;
            f2 = 0.0f;
            i = 0;
            f3 = f;
        }
        if (imageReceiver != null && f3 > f2 && (this.W < f || !this.b0)) {
            float f16 = z3 * 2.0f;
            imageReceiver.i0(z3, z3, f7 - f16, measuredHeight - f16);
            float alpha2 = imageReceiver.getAlpha();
            imageReceiver.setAlpha(alpha2 * f3);
            if (this.R) {
                int i3 = imageReceiver.X0[i];
                if (z) {
                    imageReceiver.q0(i);
                }
                imageReceiver.h(canvas, null);
                if (z) {
                    imageReceiver.q0(i3);
                }
            }
            imageReceiver.setAlpha(alpha2);
        }
        if (this.W > f2 && this.b0 && f3 > f2) {
            ImageReceiver imageReceiver3 = this.V;
            if (imageReceiver3.t() != null) {
                float f17 = z3 * 2.0f;
                imageReceiver3.i0(z3, z3, f7 - f17, measuredHeight - f17);
                imageReceiver3.setAlpha(this.W * f3);
                imageReceiver3.h(canvas, null);
            } else {
                RectF rectF2 = this.P;
                float f18 = f2;
                rectF2.set(f18, f18, f7, measuredHeight);
                int i4 = (int) (this.W * f3 * 255.0f);
                Paint paint = this.Q;
                paint.setAlpha(i4);
                float f19 = imageReceiver3.X0[0];
                canvas.drawRoundRect(rectF2, f19, f19, paint);
            }
        }
        if (z) {
            float f20 = measuredHeight;
            canvas.translate(z3, z3 + f20);
            float f21 = z3 * 2.0f;
            kp8Var.d(canvas, this, f7 - f21, f20 - f21, true, (this.H || kp8Var.a || this.d0.getRealPosition() == 0) ? f - this.I : f, f3);
        }
        canvas.restore();
    }

    public void setAnimateFromImageReceiver(ImageReceiver imageReceiver) {
        this.U = imageReceiver;
    }

    public void setAvatarsViewPager(sp8 sp8Var) {
        this.d0 = sp8Var;
    }

    public void setCrossfadeProgress(float f) {
        this.T = f;
        invalidate();
    }

    public void setForegroundAlpha(float f) {
        this.W = f;
        invalidate();
    }

    public void setForegroundImageDrawable(jl5 jl5Var) {
        if (jl5Var != null) {
            this.V.g0(jl5Var.d);
        }
        jl5 jl5Var2 = this.a0;
        if (jl5Var2 != null) {
            jl5Var2.a();
            this.a0 = null;
        }
        this.a0 = jl5Var;
    }

    public void setHasStories(boolean z) {
        if (this.e0 == z) {
            return;
        }
        this.e0 = z;
        invalidate();
    }

    public void setProgressToExpand(float f) {
        if (this.c0 == f) {
            return;
        }
        this.c0 = f;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f) {
        if (f == this.f0) {
            return;
        }
        this.f0 = f;
        invalidate();
    }

    @Override // be0
    public void setRoundRadius(int i) {
        super.setRoundRadius(i);
        this.V.q0(i);
    }

    public void setRoundRadiusCollapse(int i) {
        int i2 = this.K;
        this.K = i;
        if (i2 != i) {
            super.invalidate();
        }
    }

    public void setRoundRadiusForExpand(int i) {
        if (!this.N) {
            setRoundRadius(i);
        } else {
            this.L = i;
            setRoundRadius(i);
        }
    }

    public final void u(int i) {
        this.M = i;
        this.N = true;
    }

    public final void v(gl5 gl5Var, String str, Drawable drawable) {
        this.V.c0(gl5Var, str, drawable, 0L, null, null, 0);
        jl5 jl5Var = this.a0;
        if (jl5Var != null) {
            jl5Var.a();
            this.a0 = null;
        }
    }

    @Override // android.view.View
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        Runnable runnable = this.g0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        super.invalidate(i, i2, i3, i4);
        Runnable runnable = this.g0;
        if (runnable != null) {
            runnable.run();
        }
    }
}
