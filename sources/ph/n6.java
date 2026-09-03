package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.mr;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public class n6 extends View {
    public final Path B;
    public final Path C;
    public final Path D;
    public final Path E;
    public final Path F;
    public final org.telegram.ui.Components.z5 G;
    public final org.telegram.ui.Components.z5 H;
    public float I;
    public long J;
    public float K;
    public int L;
    public int M;
    public final TextPaint N;
    public int O;
    public final int a;
    public float b;
    public float c;
    public float d;
    public boolean e;
    public final org.telegram.ui.Components.z5 f;
    public Utilities.Callback h;
    public final Paint n;
    public final Paint r;
    public final Paint s;
    public final Paint v;
    public final Paint w;
    public final org.telegram.ui.Components.j6 x;
    public final org.telegram.ui.Components.j6 y;

    public n6(Context context, int i10) {
        super(context);
        this.b = 0.0f;
        this.c = 1.0f;
        mr mrVar = mr.h;
        this.f = new org.telegram.ui.Components.z5(this, 0L, 320L, mrVar);
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        Paint paint3 = new Paint(1);
        this.s = paint3;
        Paint paint4 = new Paint(1);
        this.v = paint4;
        Paint paint5 = new Paint(1);
        this.w = paint5;
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, true, true, false);
        this.x = j6Var;
        this.B = new Path();
        this.C = new Path();
        this.D = new Path();
        this.E = new Path();
        this.F = new Path();
        this.G = new org.telegram.ui.Components.z5(this, 0L, 350L, mrVar);
        this.H = new org.telegram.ui.Components.z5(this, 0L, 350L, mrVar);
        this.N = new TextPaint(1);
        this.a = i10;
        j6Var.u(AndroidUtilities.bold());
        j6Var.k(0.3f, 40L, mrVar);
        j6Var.setCallback(this);
        j6Var.r(-1);
        j6Var.G = AndroidUtilities.displaySize.x;
        if (i10 == 0) {
            j6Var.t(AndroidUtilities.dp(15.0f));
            this.y = null;
            paint2.setColor(-1);
            paint3.setColor(-1);
            paint4.setColor(-1);
            paint5.setColor(-1);
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeCap(Paint.Cap.ROUND);
        } else {
            j6Var.t(AndroidUtilities.dp(14.0f));
            j6Var.b = 5;
            org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(false, true, true, false);
            this.y = j6Var2;
            j6Var2.G = AndroidUtilities.displaySize.x;
            j6Var2.t(AndroidUtilities.dp(14.0f));
            j6Var2.u(AndroidUtilities.bold());
            j6Var2.k(0.3f, 40L, mrVar);
            j6Var2.setCallback(this);
            j6Var2.r(-1);
            if (i10 == 1) {
                j6Var2.q(LocaleController.getString(R.string.FlashWarmth), true, true);
            } else if (i10 == 2) {
                j6Var2.q(LocaleController.getString(R.string.FlashIntensity), true, true);
            } else if (i10 == 3) {
                j6Var2.q(LocaleController.getString(R.string.WallpaperDimming), true, true);
            }
        }
        j6Var.q("", true, true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
    }

    public final void a(float f10) {
        this.e = true;
        float f11 = this.b;
        this.d = (f10 - f11) / (this.c - f11);
        e(f10);
    }

    public final void b() {
        this.b = 0.0f;
        this.c = 0.9f;
    }

    public final void c(org.telegram.ui.y3 y3Var) {
        this.h = y3Var;
    }

    public final void d(float f10) {
        float f11 = this.b;
        float f12 = (f10 - f11) / (this.c - f11);
        this.d = f12;
        this.f.d(f12, true);
        e(f10);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.save();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.L, this.M);
        Path path = this.B;
        path.rewind();
        float f10 = this.K;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        float d = this.e ? this.f.d(this.d, false) : this.d;
        canvas.saveLayerAlpha(0.0f, 0.0f, this.L, this.M, 255, 31);
        int i10 = this.a;
        org.telegram.ui.Components.j6 j6Var = this.x;
        if (i10 == 0) {
            j6Var.setBounds(AndroidUtilities.dp(42.0f), -AndroidUtilities.dp(1.0f), this.L, this.M - AndroidUtilities.dp(1.0f));
            j6Var.draw(canvas);
        } else {
            int dp = AndroidUtilities.dp(12.33f);
            int i11 = -AndroidUtilities.dp(1.0f);
            int d10 = (this.L - ((int) j6Var.d())) - AndroidUtilities.dp(6.0f);
            int dp2 = this.M - AndroidUtilities.dp(1.0f);
            org.telegram.ui.Components.j6 j6Var2 = this.y;
            j6Var2.setBounds(dp, i11, d10, dp2);
            j6Var2.draw(canvas);
            j6Var.setBounds(this.L - AndroidUtilities.dp(111.0f), -AndroidUtilities.dp(1.0f), this.L - AndroidUtilities.dp(11.0f), this.M - AndroidUtilities.dp(1.0f));
            j6Var.draw(canvas);
        }
        if (i10 == 0) {
            canvas.drawPath(this.C, this.r);
            canvas.drawPath(this.D, this.s);
            float f11 = this.c;
            float f12 = this.b;
            float f13 = f11 - f12;
            double d11 = f13 != 0.0f ? (f13 * this.d) + f12 : 0.0f;
            float e = this.G.e(d11 > 0.25d);
            canvas.save();
            canvas.translate((1.0f - e) * (-AndroidUtilities.dpf2(0.33f)), 0.0f);
            Paint paint = this.v;
            paint.setAlpha((int) (e * 255.0f));
            canvas.drawPath(this.E, paint);
            canvas.restore();
            float e6 = this.H.e(d11 > 0.5d);
            canvas.save();
            canvas.translate((1.0f - e6) * (-AndroidUtilities.dpf2(0.66f)), 0.0f);
            Paint paint2 = this.w;
            paint2.setAlpha((int) (e6 * 255.0f));
            canvas.drawPath(this.F, paint2);
            canvas.restore();
        }
        canvas.save();
        canvas.drawRect(0.0f, 0.0f, this.L * d, this.M, this.n);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z4 = false;
        if (this.L <= 0) {
            return false;
        }
        float x10 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.J = System.currentTimeMillis();
            this.e = false;
        } else if (motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float f10 = this.c;
            float f11 = this.b;
            float w10 = f10 - f11 != 0.0f ? e2.c.w(f10, f11, this.d, f11) : 0.0f;
            if (motionEvent.getAction() != 1 || System.currentTimeMillis() - this.J >= ViewConfiguration.getTapTimeout()) {
                this.d = Utilities.clamp(((x10 - this.I) / this.L) + this.d, 1.0f, 0.0f);
                this.e = false;
                z4 = true;
            } else {
                this.f.d(this.d, true);
                this.d = x10 / this.L;
                this.e = true;
            }
            float f12 = this.c;
            float f13 = this.b;
            float w11 = f12 - f13 != 0.0f ? e2.c.w(f12, f13, this.d, f13) : 0.0f;
            if (z4) {
                if ((w11 <= f13 && w10 > w11) || (w11 >= f12 && w10 < w11)) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                } else if (Math.floor(w10 * 5.0f) != Math.floor(5.0f * w11)) {
                    AndroidUtilities.vibrateCursor(this);
                }
            }
            e(w11);
            Utilities.Callback callback = this.h;
            if (callback != null) {
                callback.run(Float.valueOf(w11));
            }
        }
        this.I = x10;
        return true;
    }

    public final void e(float f10) {
        String str = Math.round(100.0f * f10) + "%";
        org.telegram.ui.Components.j6 j6Var = this.x;
        if (!TextUtils.equals(j6Var.g, str)) {
            j6Var.b();
            j6Var.k(0.3f, this.e ? 320L : 40L, mr.h);
            j6Var.q(str, true, true);
        }
        if (this.a == 1) {
            this.n.setColor(d2.f(f10));
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        this.K = AndroidUtilities.dp(12.0f);
        float dp = AndroidUtilities.dp(16.0f);
        TextPaint textPaint = this.N;
        textPaint.setTextSize(dp);
        this.x.t(AndroidUtilities.dp(15.0f));
        int i12 = this.O;
        int i13 = this.a;
        if (i12 > 0) {
            this.L = i12;
            this.M = AndroidUtilities.dp(48.0f);
        } else if (i13 == 0) {
            this.L = (int) Math.min(textPaint.measureText(LocaleController.getString(R.string.StoryAudioRemove)) + AndroidUtilities.dp(88.0f), View.MeasureSpec.getSize(i10));
            this.M = AndroidUtilities.dp(48.0f);
        } else {
            this.L = AndroidUtilities.dp(190.0f);
            this.M = AndroidUtilities.dp(44.0f);
        }
        setMeasuredDimension(this.L, this.M);
        if (i13 == 0) {
            float dp2 = AndroidUtilities.dp(25.0f);
            float f10 = this.M / 2.0f;
            this.r.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(1.33f)));
            Path path = this.C;
            path.rewind();
            path.moveTo(dp2 - AndroidUtilities.dpf2(8.66f), f10 - AndroidUtilities.dpf2(2.9f));
            path.lineTo(dp2 - AndroidUtilities.dpf2(3.0f), f10 - AndroidUtilities.dpf2(2.9f));
            path.lineTo(dp2 - AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(2.9f) + f10);
            path.lineTo(dp2 - AndroidUtilities.dpf2(8.66f), AndroidUtilities.dpf2(2.9f) + f10);
            path.close();
            this.s.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(2.66f)));
            Path path2 = this.D;
            path2.rewind();
            path2.moveTo(dp2 - AndroidUtilities.dpf2(7.5f), f10);
            path2.lineTo(dp2, f10 - AndroidUtilities.dpf2(7.33f));
            path2.lineTo(dp2, AndroidUtilities.dpf2(7.33f) + f10);
            path2.close();
            Path path3 = this.E;
            path3.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((dp2 - AndroidUtilities.dpf2(0.33f)) - AndroidUtilities.dp(4.33f), f10 - AndroidUtilities.dp(4.33f), (dp2 - AndroidUtilities.dpf2(0.33f)) + AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f) + f10);
            path3.arcTo(rectF, -60.0f, 120.0f);
            path3.close();
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = this.w;
            paint.setStyle(style);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            Path path4 = this.F;
            path4.rewind();
            rectF.set((dp2 - AndroidUtilities.dpf2(0.33f)) - AndroidUtilities.dp(8.0f), f10 - AndroidUtilities.dp(8.0f), (dp2 - AndroidUtilities.dpf2(0.33f)) + AndroidUtilities.dp(8.0f), f10 + AndroidUtilities.dp(8.0f));
            path4.arcTo(rectF, -70.0f, 140.0f);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.x || drawable == this.y || super.verifyDrawable(drawable);
    }
}
