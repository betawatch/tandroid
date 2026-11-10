package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class zv0 extends org.telegram.ui.Components.k9 implements org.telegram.ui.Components.pt0 {
    public static final q0 g0 = new q0("crossfadeProgress", 4);
    public boolean G;
    public float H;
    public float I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final Path N;
    public final RectF O;
    public final Paint P;
    public boolean Q;
    public float R;
    public float S;
    public ImageReceiver T;
    public final ImageReceiver U;
    public float V;
    public org.telegram.messenger.jc W;
    public boolean a0;
    public float b0;
    public org.telegram.ui.Components.sf0 c0;
    public boolean d0;
    public float e0;
    public Runnable f0;

    public zv0(Context context) {
        super(context);
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.N = new Path();
        this.O = new RectF();
        this.Q = true;
        this.R = 1.0f;
        this.a0 = true;
        this.e0 = 1.0f;
        this.f0 = null;
        setLayerType(2, null);
        this.U = new ImageReceiver(this);
        Paint paint = new Paint(1);
        this.P = paint;
        paint.setColor(-16777216);
    }

    @Override // org.telegram.ui.Components.pt0
    public final void f(Runnable runnable) {
        this.f0 = runnable;
    }

    public float getForegroundAlpha() {
        return this.V;
    }

    public org.telegram.ui.Components.jg getPrevFragment() {
        return null;
    }

    public int getRoundRadiusForExpand() {
        return !this.M ? getRoundRadius()[0] : this.K;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.sf0 sf0Var = this.c0;
        if (sf0Var != null) {
            sf0Var.invalidate();
        }
        Runnable runnable = this.f0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U.P();
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.U.R();
        org.telegram.messenger.jc jcVar = this.W;
        if (jcVar != null) {
            jcVar.a();
            this.W = null;
        }
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.kf0 kf0Var;
        float f10;
        boolean z9;
        float f11;
        int i7;
        float f12;
        float f13;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Components.sf0 sf0Var = this.c0;
        boolean z10 = sf0Var != null && sf0Var.getVisibility() == 0 && this.M && this.H > 0.0f;
        if (z10) {
            org.telegram.ui.Components.kf0 blurDrawer = this.c0.getBlurDrawer();
            kf0Var = blurDrawer;
            z10 = blurDrawer != null;
        } else {
            kf0Var = null;
        }
        float A = org.telegram.messenger.k5.A(1.0f, this.V, this.e0, (1.0f - this.b0) * (this.d0 ? (int) org.telegram.messenger.g0.N(3.5f) : 0.0f));
        org.telegram.ui.Components.h5 h5Var = this.e;
        ImageReceiver imageReceiver = h5Var != null ? h5Var.k : this.a;
        int i10 = this.K;
        if (i10 > 0) {
            Path path = this.N;
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
        float f15 = this.R;
        float f16 = measuredWidth;
        float f17 = measuredHeight;
        canvas.scale(f15, f15, f16 / 2.0f, f17 / 2.0f);
        if (z10) {
            measuredHeight = this.G ? Math.min(measuredHeight, measuredWidth) : (int) (f17 - org.telegram.messenger.g0.T1(0.0f, this.L / this.I, this.H));
        }
        ImageReceiver imageReceiver2 = this.T;
        if (imageReceiver2 != null) {
            float f18 = this.S;
            float f19 = (f10 - f18) * f10;
            if (f18 > 0.0f) {
                float f20 = imageReceiver2.K0;
                float f21 = imageReceiver2.L0;
                f11 = 0.0f;
                float f22 = imageReceiver2.M0;
                i7 = 0;
                float f23 = imageReceiver2.N0;
                float alpha = imageReceiver2.getAlpha();
                float f24 = A * 2.0f;
                z9 = z10;
                f13 = f19;
                this.T.y0(A, A, f16 - f24, measuredHeight - f24);
                this.T.setAlpha(f18);
                this.T.h(canvas, null);
                this.T.y0(f20, f21, f22, f23);
                this.T.setAlpha(alpha);
            } else {
                z9 = z10;
                f11 = 0.0f;
                f13 = f19;
                i7 = 0;
            }
            f12 = f13;
        } else {
            z9 = z10;
            f11 = 0.0f;
            i7 = 0;
            f12 = f10;
        }
        if (imageReceiver != null && f12 > f11 && (this.V < f10 || !this.a0)) {
            float f25 = A * 2.0f;
            imageReceiver.y0(A, A, f16 - f25, measuredHeight - f25);
            float alpha2 = imageReceiver.getAlpha();
            imageReceiver.setAlpha(alpha2 * f12);
            if (this.Q) {
                int i11 = imageReceiver.W0[i7];
                if (z9) {
                    imageReceiver.J0(i7);
                }
                imageReceiver.h(canvas, null);
                if (z9) {
                    imageReceiver.J0(i11);
                }
            }
            imageReceiver.setAlpha(alpha2);
        }
        if (this.V > f11 && this.a0 && f12 > f11) {
            ImageReceiver imageReceiver3 = this.U;
            if (imageReceiver3.t() != null) {
                float f26 = A * 2.0f;
                imageReceiver3.y0(A, A, f16 - f26, measuredHeight - f26);
                imageReceiver3.setAlpha(this.V * f12);
                imageReceiver3.h(canvas, null);
            } else {
                RectF rectF2 = this.O;
                float f27 = f11;
                rectF2.set(f27, f27, f16, measuredHeight);
                int i12 = (int) (this.V * f12 * 255.0f);
                Paint paint = this.P;
                paint.setAlpha(i12);
                float f28 = imageReceiver3.W0[0];
                canvas.drawRoundRect(rectF2, f28, f28, paint);
            }
        }
        if (z9) {
            float f29 = measuredHeight;
            canvas.translate(A, A + f29);
            float f30 = A * 2.0f;
            kf0Var.e(canvas, this, f16 - f30, f29 - f30, true, (this.G || kf0Var.a || this.c0.getRealPosition() == 0) ? f10 - this.H : f10, f12);
        }
        canvas.restore();
    }

    public void setAnimateFromImageReceiver(ImageReceiver imageReceiver) {
        this.T = imageReceiver;
    }

    public void setAvatarsViewPager(org.telegram.ui.Components.sf0 sf0Var) {
        this.c0 = sf0Var;
    }

    public void setCrossfadeProgress(float f10) {
        this.S = f10;
        invalidate();
    }

    public void setForegroundAlpha(float f10) {
        this.V = f10;
        invalidate();
    }

    public void setForegroundImageDrawable(org.telegram.messenger.jc jcVar) {
        if (jcVar != null) {
            this.U.w0(jcVar.d);
        }
        org.telegram.messenger.jc jcVar2 = this.W;
        if (jcVar2 != null) {
            jcVar2.a();
            this.W = null;
        }
        this.W = jcVar;
    }

    public void setHasStories(boolean z9) {
        if (this.d0 == z9) {
            return;
        }
        this.d0 = z9;
        invalidate();
    }

    public void setProgressToExpand(float f10) {
        if (this.b0 == f10) {
            return;
        }
        this.b0 = f10;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f10) {
        if (f10 == this.e0) {
            return;
        }
        this.e0 = f10;
        invalidate();
    }

    @Override // org.telegram.ui.Components.k9
    public void setRoundRadius(int i7) {
        super.setRoundRadius(i7);
        this.U.J0(i7);
    }

    public void setRoundRadiusCollapse(int i7) {
        int i10 = this.J;
        this.J = i7;
        if (i10 != i7) {
            super.invalidate();
        }
    }

    public void setRoundRadiusForExpand(int i7) {
        if (!this.M) {
            setRoundRadius(i7);
        } else {
            this.K = i7;
            setRoundRadius(i7);
        }
    }

    public final void v(int i7) {
        this.L = i7;
        this.M = true;
    }

    public final void w(org.telegram.messenger.hc hcVar, String str, Drawable drawable) {
        this.U.p0(hcVar, str, drawable, 0L, null, null, 0);
        org.telegram.messenger.jc jcVar = this.W;
        if (jcVar != null) {
            jcVar.a();
            this.W = null;
        }
    }

    @Override // android.view.View
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        Runnable runnable = this.f0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i7, int i10, int i11, int i12) {
        super.invalidate(i7, i10, i11, i12);
        Runnable runnable = this.f0;
        if (runnable != null) {
            runnable.run();
        }
    }
}
