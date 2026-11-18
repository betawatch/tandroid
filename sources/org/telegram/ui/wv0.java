package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class wv0 extends org.telegram.ui.Components.q9 implements org.telegram.ui.Components.xt0 {
    public static final q0 h0 = new q0("crossfadeProgress", 4);
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
    public org.telegram.messenger.hc a0;
    public boolean b0;
    public float c0;
    public org.telegram.ui.Components.fg0 d0;
    public boolean e0;
    public float f0;
    public Runnable g0;

    public wv0(Context context) {
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

    @Override // org.telegram.ui.Components.xt0
    public final void e(Runnable runnable) {
        this.g0 = runnable;
    }

    public float getForegroundAlpha() {
        return this.W;
    }

    public org.telegram.ui.Components.zg getPrevFragment() {
        return null;
    }

    public int getRoundRadiusForExpand() {
        return !this.N ? getRoundRadius()[0] : this.L;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.fg0 fg0Var = this.d0;
        if (fg0Var != null) {
            fg0Var.invalidate();
        }
        Runnable runnable = this.g0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.telegram.ui.Components.q9, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.V.P();
    }

    @Override // org.telegram.ui.Components.q9, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.V.R();
        org.telegram.messenger.hc hcVar = this.a0;
        if (hcVar != null) {
            hcVar.a();
            this.a0 = null;
        }
    }

    @Override // org.telegram.ui.Components.q9, android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.xf0 xf0Var;
        float f10;
        boolean z10;
        float f11;
        int i7;
        float f12;
        float f13;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Components.fg0 fg0Var = this.d0;
        boolean z11 = fg0Var != null && fg0Var.getVisibility() == 0 && this.N && this.I > 0.0f;
        if (z11) {
            org.telegram.ui.Components.xf0 blurDrawer = this.d0.getBlurDrawer();
            xf0Var = blurDrawer;
            z11 = blurDrawer != null;
        } else {
            xf0Var = null;
        }
        float A = org.telegram.messenger.f3.A(1.0f, this.W, this.f0, (1.0f - this.c0) * (this.e0 ? (int) org.telegram.messenger.g0.N(3.5f) : 0.0f));
        org.telegram.ui.Components.o5 o5Var = this.e;
        ImageReceiver imageReceiver = o5Var != null ? o5Var.k : this.a;
        int i10 = this.L;
        if (i10 > 0) {
            Path path = this.O;
            path.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            f10 = 1.0f;
            rectF.set(A, A, measuredWidth - A, measuredHeight - A);
            float f14 = i10;
            path.addRoundRect(rectF, f14, f14, Path.Direction.CW);
            canvas.clipPath(path);
        } else {
            f10 = 1.0f;
        }
        canvas.save();
        float f15 = this.S;
        float f16 = measuredWidth;
        float f17 = measuredHeight;
        canvas.scale(f15, f15, f16 / 2.0f, f17 / 2.0f);
        if (z11) {
            measuredHeight = this.H ? Math.min(measuredHeight, measuredWidth) : (int) (f17 - org.telegram.messenger.g0.T1(0.0f, this.M / this.J, this.I));
        }
        ImageReceiver imageReceiver2 = this.U;
        if (imageReceiver2 != null) {
            float f18 = this.T;
            float f19 = (f10 - f18) * f10;
            if (f18 > 0.0f) {
                float f20 = imageReceiver2.L0;
                float f21 = imageReceiver2.M0;
                f11 = 0.0f;
                float f22 = imageReceiver2.N0;
                i7 = 0;
                float f23 = imageReceiver2.O0;
                float alpha = imageReceiver2.getAlpha();
                float f24 = A * 2.0f;
                z10 = z11;
                f13 = f19;
                this.U.y0(A, A, f16 - f24, measuredHeight - f24);
                this.U.setAlpha(f18);
                this.U.h(canvas, null);
                this.U.y0(f20, f21, f22, f23);
                this.U.setAlpha(alpha);
            } else {
                z10 = z11;
                f11 = 0.0f;
                f13 = f19;
                i7 = 0;
            }
            f12 = f13;
        } else {
            z10 = z11;
            f11 = 0.0f;
            i7 = 0;
            f12 = f10;
        }
        if (imageReceiver != null && f12 > f11 && (this.W < f10 || !this.b0)) {
            float f25 = A * 2.0f;
            imageReceiver.y0(A, A, f16 - f25, measuredHeight - f25);
            float alpha2 = imageReceiver.getAlpha();
            imageReceiver.setAlpha(alpha2 * f12);
            if (this.R) {
                int i11 = imageReceiver.X0[i7];
                if (z10) {
                    imageReceiver.J0(i7);
                }
                imageReceiver.h(canvas, null);
                if (z10) {
                    imageReceiver.J0(i11);
                }
            }
            imageReceiver.setAlpha(alpha2);
        }
        if (this.W > f11 && this.b0 && f12 > f11) {
            ImageReceiver imageReceiver3 = this.V;
            if (imageReceiver3.t() != null) {
                float f26 = A * 2.0f;
                imageReceiver3.y0(A, A, f16 - f26, measuredHeight - f26);
                imageReceiver3.setAlpha(this.W * f12);
                imageReceiver3.h(canvas, null);
            } else {
                RectF rectF2 = this.P;
                float f27 = f11;
                rectF2.set(f27, f27, f16, measuredHeight);
                int i12 = (int) (this.W * f12 * 255.0f);
                Paint paint = this.Q;
                paint.setAlpha(i12);
                float f28 = imageReceiver3.X0[0];
                canvas.drawRoundRect(rectF2, f28, f28, paint);
            }
        }
        if (z10) {
            float f29 = measuredHeight;
            canvas.translate(A, A + f29);
            float f30 = A * 2.0f;
            xf0Var.e(canvas, this, f16 - f30, f29 - f30, true, (this.H || xf0Var.a || this.d0.getRealPosition() == 0) ? f10 - this.I : f10, f12);
        }
        canvas.restore();
    }

    public void setAnimateFromImageReceiver(ImageReceiver imageReceiver) {
        this.U = imageReceiver;
    }

    public void setAvatarsViewPager(org.telegram.ui.Components.fg0 fg0Var) {
        this.d0 = fg0Var;
    }

    public void setCrossfadeProgress(float f10) {
        this.T = f10;
        invalidate();
    }

    public void setForegroundAlpha(float f10) {
        this.W = f10;
        invalidate();
    }

    public void setForegroundImageDrawable(org.telegram.messenger.hc hcVar) {
        if (hcVar != null) {
            this.V.w0(hcVar.d);
        }
        org.telegram.messenger.hc hcVar2 = this.a0;
        if (hcVar2 != null) {
            hcVar2.a();
            this.a0 = null;
        }
        this.a0 = hcVar;
    }

    public void setHasStories(boolean z10) {
        if (this.e0 == z10) {
            return;
        }
        this.e0 = z10;
        invalidate();
    }

    public void setProgressToExpand(float f10) {
        if (this.c0 == f10) {
            return;
        }
        this.c0 = f10;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f10) {
        if (f10 == this.f0) {
            return;
        }
        this.f0 = f10;
        invalidate();
    }

    @Override // org.telegram.ui.Components.q9
    public void setRoundRadius(int i7) {
        super.setRoundRadius(i7);
        this.V.J0(i7);
    }

    public void setRoundRadiusCollapse(int i7) {
        int i10 = this.K;
        this.K = i7;
        if (i10 != i7) {
            super.invalidate();
        }
    }

    public void setRoundRadiusForExpand(int i7) {
        if (!this.N) {
            setRoundRadius(i7);
        } else {
            this.L = i7;
            setRoundRadius(i7);
        }
    }

    public final void v(int i7) {
        this.M = i7;
        this.N = true;
    }

    public final void w(org.telegram.messenger.fc fcVar, String str, Drawable drawable) {
        this.V.p0(fcVar, str, drawable, 0L, null, null, 0);
        org.telegram.messenger.hc hcVar = this.a0;
        if (hcVar != null) {
            hcVar.a();
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
    public final void invalidate(int i7, int i10, int i11, int i12) {
        super.invalidate(i7, i10, i11, i12);
        Runnable runnable = this.g0;
        if (runnable != null) {
            runnable.run();
        }
    }
}
