// default package

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class rqc extends View {
    public ObjectAnimator E;
    public final View F;
    public int[] G;
    public final v10 H;
    public final Paint I;
    public float J;
    public final wjb a;
    public final Paint b;
    public final Paint c;
    public final TextPaint d;
    public final Paint e;
    public String f;
    public int h;
    public int n;
    public final RectF r;
    public boolean s;
    public final Canvas w;
    public final Bitmap x;
    public float y;

    public rqc(Context context, boolean z, View view, wjb wjbVar) {
        super(context);
        this.G = new int[4];
        this.H = new v10(this);
        this.I = new Paint(1);
        this.a = wjbVar;
        this.r = new RectF();
        if (z) {
            Bitmap createBitmap = Bitmap.createBitmap(gl.L(18.0f), gl.L(18.0f), Bitmap.Config.ARGB_4444);
            this.x = createBitmap;
            this.w = new Canvas(createBitmap);
        }
        this.F = view;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        textPaint.setTextSize(gl.L(14.0f));
        textPaint.setTypeface(gl.o());
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gl.L(2.0f));
        paint.setColor(0);
        paint.setStrokeCap(Paint.Cap.ROUND);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        paint.setXfermode(new PorterDuffXfermode(mode));
        Paint paint2 = new Paint(1);
        this.b = paint2;
        paint2.setColor(0);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.e = new Paint(1);
    }

    private void setProgress(float f) {
        if (this.y == f) {
            return;
        }
        this.y = f;
        invalidate();
    }

    public final void a(boolean z, boolean z2) {
        if (z == this.s) {
            return;
        }
        this.s = z;
        if (z2) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, this.H, z ? 1.0f : 0.0f);
            this.E = ofFloat;
            ofFloat.setDuration(300L);
            this.E.start();
            return;
        }
        ObjectAnimator objectAnimator = this.E;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.y = z ? 1.0f : 0.0f;
        invalidate();
    }

    public final void b(int i, int i2) {
        int[] iArr = this.G;
        if (iArr == null) {
            iArr = new int[4];
            this.G = iArr;
        }
        iArr[i] = i2;
        invalidate();
    }

    public TextPaint getTextPaint() {
        return this.d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        Canvas canvas2 = canvas;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.r;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        View view = this.F;
        wjb wjbVar = this.a;
        bkb.s(this, view, wjbVar);
        float measuredHeight2 = getMeasuredHeight() / 2;
        float measuredHeight3 = getMeasuredHeight() / 2;
        Paint d = wjbVar != null ? wjbVar.d("paintChatActionBackground") : null;
        if (d == null) {
            d = bkb.T0("paintChatActionBackground");
        }
        canvas2.drawRoundRect(rectF, measuredHeight2, measuredHeight3, d);
        if (wjbVar == null ? bkb.b1() : wjbVar.g()) {
            float measuredHeight4 = getMeasuredHeight() / 2;
            float measuredHeight5 = getMeasuredHeight() / 2;
            Paint d2 = wjbVar != null ? wjbVar.d("paintChatActionBackgroundDarken") : null;
            if (d2 == null) {
                d2 = bkb.T0("paintChatActionBackgroundDarken");
            }
            canvas2.drawRoundRect(rectF, measuredHeight4, measuredHeight5, d2);
        }
        if (this.J > 0.0f) {
            canvas2.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, this.I);
        }
        int i = bkb.Yc;
        int v0 = bkb.v0(i, wjbVar);
        TextPaint textPaint = this.d;
        textPaint.setColor(v0);
        int D = ug8.D(28.0f, getMeasuredWidth() - this.h, 2);
        canvas2.drawText(this.f, gl.L(28.0f) + D, gl.L(21.0f), textPaint);
        canvas2.save();
        canvas2.translate(D, gl.L(7.0f));
        Bitmap bitmap = this.x;
        int i2 = 0;
        Paint paint = this.e;
        if (bitmap != null) {
            float f2 = this.y;
            float f3 = f2 / 0.5f;
            if (f2 <= 0.5f) {
                f = f3;
            } else {
                f3 = 2.0f - f3;
                f = 1.0f;
            }
            float L = gl.L(1.0f) * f3;
            rectF.set(L, L, gl.L(18.0f) - L, gl.L(18.0f) - L);
            bitmap.eraseColor(0);
            paint.setColor(bkb.v0(i, wjbVar));
            float width = rectF.width() / 2.0f;
            float height = rectF.height() / 2.0f;
            Canvas canvas3 = this.w;
            canvas3.drawRoundRect(rectF, width, height, paint);
            if (f != 1.0f) {
                float min = Math.min(gl.L(7.0f), (gl.L(7.0f) * f) + L);
                rectF.set(gl.L(2.0f) + min, gl.L(2.0f) + min, gl.L(16.0f) - min, gl.L(16.0f) - min);
                canvas3.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, this.b);
            }
            if (this.y > 0.5f) {
                float f4 = 1.0f - f3;
                Paint paint2 = this.c;
                canvas3.drawLine(gl.L(7.3f), gl.L(13.0f), (int) (gl.L(7.3f) - (gl.L(2.5f) * f4)), (int) (gl.L(13.0f) - (gl.L(2.5f) * f4)), paint2);
                canvas3.drawLine(gl.L(7.3f), gl.L(13.0f), (int) ((gl.L(6.0f) * f4) + gl.L(7.3f)), (int) (gl.L(13.0f) - (gl.L(6.0f) * f4)), paint2);
            }
            canvas2.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        } else {
            rectF.set(0.0f, 0.0f, gl.L(18.0f), gl.L(18.0f));
            int[] iArr = this.G;
            if (iArr[3] != 0) {
                while (i2 < 4) {
                    paint.setColor(this.G[i2]);
                    RectF rectF2 = rectF;
                    canvas2.drawArc(rectF2, (i2 * 90) - 90, 90.0f, true, paint);
                    i2++;
                    rectF = rectF2;
                    canvas2 = canvas;
                }
            } else {
                RectF rectF3 = rectF;
                if (iArr[2] != 0) {
                    while (i2 < 3) {
                        paint.setColor(this.G[i2]);
                        RectF rectF4 = rectF3;
                        canvas.drawArc(rectF4, (i2 * 120) - 90, 120.0f, true, paint);
                        rectF3 = rectF4;
                        i2++;
                    }
                } else if (iArr[1] != 0) {
                    while (i2 < 2) {
                        paint.setColor(this.G[i2]);
                        RectF rectF5 = rectF3;
                        canvas.drawArc(rectF5, (i2 * kk7.J2) - 90, 180.0f, true, paint);
                        i2++;
                        rectF3 = rectF5;
                    }
                } else {
                    canvas2 = canvas;
                    paint.setColor(iArr[0]);
                    canvas2.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.height() / 2.0f, paint);
                }
            }
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(ug8.E(56.0f, this.n, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(32.0f), TLObject.FLAG_30));
    }

    public void setDimAmount(float f) {
        this.J = f;
        this.I.setColor(bm2.o(-16777216, (int) (f * 255.0f)));
        invalidate();
    }
}
