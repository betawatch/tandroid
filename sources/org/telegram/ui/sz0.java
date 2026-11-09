package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.TextureView;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class sz0 extends org.telegram.ui.Cells.q1 {
    public boolean ld;
    public final RectF md;
    public final RectF nd;
    public RadialGradient od;
    public Paint pd;
    public Matrix qd;
    public final Path rd;
    public Paint sd;
    public final Paint td;
    public org.telegram.ui.Components.d01 ud;
    public final org.telegram.ui.Components.w5 vd;
    public final /* synthetic */ int wd;
    public final /* synthetic */ int xd;
    public final /* synthetic */ uz0 yd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz0(uz0 uz0Var, Context context, int i7, org.telegram.ui.ActionBar.g6 g6Var, int i10, int i11) {
        super(context, i7, false, null, g6Var);
        this.yd = uz0Var;
        this.wd = i10;
        this.xd = i11;
        this.ld = false;
        this.md = new RectF();
        this.nd = new RectF();
        this.rd = new Path();
        this.td = new Paint(1);
        this.vd = new org.telegram.ui.Components.w5(0.0f, this, 0L, 120L, new LinearInterpolator());
    }

    @Override // org.telegram.ui.Cells.q1
    public final void N0(Canvas canvas) {
        Paint paint = this.pd;
        uz0 uz0Var = this.yd;
        if (paint != null) {
            float f10 = uz0Var.s;
            RectF rectF = uz0Var.R;
            if (f10 > 0.0f) {
                if (uz0Var.Q) {
                    if (this.Gc) {
                        Bitmap bitmap = uz0Var.P.getBitmap();
                        if (bitmap != null) {
                            canvas.save();
                            Path path = this.rd;
                            path.rewind();
                            path.addCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, Path.Direction.CW);
                            canvas.clipPath(path);
                            canvas.scale(rectF.width() / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                            canvas.translate(rectF.left, rectF.top);
                            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                            canvas.restore();
                            bitmap.recycle();
                        }
                    } else {
                        float centerX = rectF.centerX();
                        float centerY = rectF.centerY();
                        float width = rectF.width() / 2.0f;
                        if (this.sd == null) {
                            Paint paint2 = new Paint(1);
                            this.sd = paint2;
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        }
                        canvas.drawCircle(centerX, centerY, width, this.sd);
                    }
                    getPhotoImage().setAlpha(Math.max(1.0f - this.vd.d(uz0Var.Q), 1.0f - uz0Var.s));
                    getPhotoImage().h(canvas, null);
                } else {
                    getPhotoImage().h(canvas, null);
                }
            }
            this.qd.reset();
            float width2 = (rectF.width() / 76.8f) * uz0Var.w;
            this.qd.postScale(width2, width2);
            this.qd.postTranslate(rectF.centerX(), rectF.centerY());
            this.od.setLocalMatrix(this.qd);
            canvas.saveLayerAlpha(rectF, org.telegram.messenger.qs.e4, 31);
            super.N0(canvas);
            canvas.save();
            canvas.drawRect(rectF, this.pd);
            canvas.restore();
            canvas.restore();
        } else {
            super.N0(canvas);
        }
        canvas.saveLayerAlpha(uz0Var.R, (int) (uz0Var.w * 178.0f), 31);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint3 = this.td;
        paint3.setStyle(style);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(3.33f));
        paint3.setColor(-1);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(uz0Var.R);
        rectF2.inset(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        canvas.drawArc(rectF2, -90.0f, (1.0f - uz0Var.a0) * (-360.0f), false, paint3);
        if (this.ud == null) {
            org.telegram.ui.Components.d01 d01Var = new org.telegram.ui.Components.d01(120);
            this.ud = d01Var;
            d01Var.b = true;
        }
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(2.8f));
        this.ud.a((1.0f - uz0Var.a0) * (-360.0f), 1.0f, canvas, paint3, rectF2);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.q1
    public final void O0(Canvas canvas) {
        float f10 = this.yd.w;
        Typeface typeface = org.telegram.messenger.g0.a;
        super.O0(canvas);
    }

    @Override // org.telegram.ui.Cells.q1, org.telegram.ui.Cells.z
    public final int getBoundsLeft() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.q1, org.telegram.ui.Cells.z
    public final int getBoundsRight() {
        return getWidth();
    }

    @Override // org.telegram.ui.Cells.q1
    public final void o1(Canvas canvas, float f10, Integer num) {
        canvas.save();
        int i7 = -this.N.b;
        uz0 uz0Var = this.yd;
        canvas.translate(org.telegram.messenger.g0.W1(uz0Var.s, 0, i7), org.telegram.messenger.g0.W1(uz0Var.s, uz0Var.O.getBackgroundDrawableBottom() - getBackgroundDrawableBottom(), r0.n));
        super.o1(canvas, (1.0f - uz0Var.s) * f10, num);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        uz0 uz0Var = this.yd;
        boolean z9 = uz0Var.S;
        RectF rectF = uz0Var.R;
        if (z9) {
            boolean z10 = this.ld;
            RectF rectF2 = this.nd;
            RectF rectF3 = this.md;
            if (!z10) {
                rectF3.set(getPhotoImage().K0, getPhotoImage().L0, getPhotoImage().y(), getPhotoImage().A());
                float min = Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.92f;
                rectF2.set((getMeasuredWidth() - min) / 2.0f, (getMeasuredHeight() - min) / 2.0f, (getMeasuredWidth() + min) / 2.0f, (getMeasuredHeight() + min) / 2.0f);
                this.ld = true;
                this.od = new RadialGradient(0.0f, 0.0f, 48.0f, new int[]{-1, -1, 0}, new float[]{0.0f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
                Paint paint = new Paint(1);
                this.pd = paint;
                paint.setShader(this.od);
                this.pd.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.qd = new Matrix();
            }
            org.telegram.messenger.g0.Z1(rectF3, rectF2, uz0Var.s, rectF);
            u3(rectF.left, rectF.top, rectF.width(), rectF.height());
            getPhotoImage().J0((int) rectF.width());
            if (uz0Var.s <= 0.0f || !uz0Var.Q) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.qs.e4, 31);
            }
            this.Sc = 1.0f - uz0Var.s;
        } else {
            canvas2 = canvas;
        }
        d1(canvas2);
        if (uz0Var.S && uz0Var.s > 0.0f && uz0Var.Q) {
            canvas2.restore();
        }
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(this.wd, this.xd);
    }

    @Override // android.view.View
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        TextureView textureView = this.yd.P;
        if (textureView == null || i7 != 8) {
            return;
        }
        textureView.setVisibility(i7);
    }

    @Override // org.telegram.ui.Cells.q1
    public final void x1(float f10, Canvas canvas, boolean z9) {
        canvas.save();
        uz0 uz0Var = this.yd;
        if (uz0Var.S) {
            int i7 = this.z9;
            org.telegram.messenger.ij ijVar = uz0Var.M;
            int i10 = 0;
            if (ijVar != null && ijVar.P3()) {
                org.telegram.messenger.ij ijVar2 = uz0Var.M;
                if (ijVar2 != null && ijVar2.D == 19) {
                    i10 = 4;
                }
                i10 += 20;
            }
            canvas.translate(((this.nd.right - (org.telegram.messenger.g0.L(8 + i10) + i7)) - this.B9) * uz0Var.s, 0.0f);
        }
        super.x1(f10, canvas, z9);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void setPressed(boolean z9) {
    }
}
