package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.rc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class m0 extends View {
    public boolean B;
    public final org.telegram.ui.Components.z5 C;
    public boolean D;
    public float E;
    public final org.telegram.ui.Components.z5 F;
    public final org.telegram.ui.Components.z5 G;
    public final RectF H;
    public final RectF I;
    public final RectF J;
    public final RectF K;
    public boolean L;
    public l0 M;
    public Runnable N;
    public final Paint a;
    public final TextPaint b;
    public final TextPaint c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final rc h;
    public gj0 n;
    public final StaticLayout r;
    public final float s;
    public final float v;
    public StaticLayout w;
    public float x;
    public float y;

    public m0(Context context) {
        this(context, LocaleController.getString(R.string.PreparingVideo));
    }

    public final void a() {
        l0 l0Var = this.M;
        if (l0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(l0Var);
            this.M = null;
        }
        this.B = false;
        invalidate();
    }

    public final void b(int i10, int i11, CharSequence charSequence) {
        gj0 gj0Var = this.n;
        if (gj0Var != null) {
            gj0Var.setCallback(null);
            this.n.A(true);
        }
        gj0 gj0Var2 = new gj0(i10, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
        this.n = gj0Var2;
        gj0Var2.setCallback(this);
        this.n.start();
        StaticLayout staticLayout = new StaticLayout(charSequence, this.c, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.w = staticLayout;
        this.x = staticLayout.getLineCount() > 0 ? this.w.getLineWidth(0) : 0.0f;
        this.y = this.w.getLineCount() > 0 ? this.w.getLineLeft(0) : 0.0f;
        this.D = false;
        invalidate();
        l0 l0Var = this.M;
        if (l0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(l0Var);
        }
        l0 l0Var2 = new l0(this, 1);
        this.M = l0Var2;
        AndroidUtilities.runOnUIThread(l0Var2, i11);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        RectF rectF;
        float f11;
        int saveCount = canvas.getSaveCount();
        float d = this.C.d(this.B ? 1.0f : 0.0f, false);
        float d10 = this.F.d(this.D ? 0.0f : 1.0f, false);
        float f12 = 1.0f - d10;
        Paint paint = this.a;
        paint.setAlpha((int) (90.0f * f12 * d));
        Canvas canvas2 = canvas;
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float max = Math.max(this.s, AndroidUtilities.dp(54.0f)) + AndroidUtilities.dp(42.0f);
        int dp = AndroidUtilities.dp(111.0f);
        StaticLayout staticLayout = this.r;
        float height = staticLayout.getHeight() + dp;
        float width = (getWidth() - max) / 2.0f;
        float height2 = (getHeight() - height) / 2.0f;
        float width2 = (getWidth() + max) / 2.0f;
        float height3 = (getHeight() + height) / 2.0f;
        RectF rectF2 = this.H;
        rectF2.set(width, height2, width2, height3);
        float dp2 = AndroidUtilities.dp(74.0f) + this.x;
        float dp3 = AndroidUtilities.dp(48.0f);
        float width3 = (getWidth() - dp2) / 2.0f;
        float height4 = (getHeight() - dp3) / 2.0f;
        float width4 = (getWidth() + dp2) / 2.0f;
        float height5 = (getHeight() + dp3) / 2.0f;
        RectF rectF3 = this.I;
        rectF3.set(width3, height4, width4, height5);
        RectF rectF4 = this.J;
        AndroidUtilities.lerp(rectF2, rectF3, d10, rectF4);
        if (d >= 1.0f || !this.D) {
            f10 = 42.0f;
        } else {
            f10 = 42.0f;
            RectF rectF5 = this.K;
            rectF5.set(getWidth() / 2.0f, getHeight() / 2.0f, getWidth() / 2.0f, getHeight() / 2.0f);
            AndroidUtilities.lerp(rectF5, rectF4, d, rectF4);
        }
        if (d < 1.0f && !this.D) {
            canvas2.scale(AndroidUtilities.lerp(0.8f, 1.0f, d), AndroidUtilities.lerp(0.8f, 1.0f, d), rectF4.centerX(), rectF4.centerY());
        }
        Paint paint2 = this.d;
        paint2.setAlpha((int) (204.0f * d));
        canvas2.drawRoundRect(rectF4, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint2);
        canvas2.save();
        canvas2.clipRect(rectF4);
        if (d10 < 1.0f) {
            float f13 = f12 * d;
            float d11 = this.G.d(this.E, false);
            float centerX = rectF2.centerX();
            float dp4 = rectF2.top + AndroidUtilities.dp(48.0f);
            float dp5 = AndroidUtilities.dp(25.0f);
            Paint paint3 = this.f;
            paint3.setAlpha((int) (51.0f * f13));
            canvas2.drawCircle(centerX, dp4, dp5, paint3);
            RectF rectF6 = AndroidUtilities.rectTmp;
            f11 = 255.0f;
            rectF6.set(centerX - dp5, dp4 - dp5, centerX + dp5, dp5 + dp4);
            int i10 = (int) (f13 * 255.0f);
            Paint paint4 = this.e;
            paint4.setAlpha(i10);
            paint4.setStrokeWidth(AndroidUtilities.dp(4.0f));
            rectF = rectF3;
            canvas.drawArc(rectF6, -90.0f, 360.0f * d11, false, paint4);
            float a2 = this.h.a(0.15f);
            canvas.save();
            canvas.scale(a2, a2, centerX, dp4);
            paint4.setStrokeWidth(AndroidUtilities.dp(3.4f));
            canvas.drawLine(centerX - AndroidUtilities.dp(7.0f), dp4 - AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f) + centerX, AndroidUtilities.dp(7.0f) + dp4, paint4);
            canvas2 = canvas;
            canvas2.drawLine(centerX - AndroidUtilities.dp(7.0f), dp4 + AndroidUtilities.dp(7.0f), centerX + AndroidUtilities.dp(7.0f), dp4 - AndroidUtilities.dp(7.0f), paint4);
            canvas2.restore();
            canvas2.save();
            canvas2.translate((rectF2.left + AndroidUtilities.dp(21.0f)) - this.v, (rectF2.bottom - AndroidUtilities.dp(18.0f)) - staticLayout.getHeight());
            this.b.setAlpha(i10);
            staticLayout.draw(canvas2);
            canvas2.restore();
        } else {
            rectF = rectF3;
            f11 = 255.0f;
        }
        if (d10 > 0.0f) {
            float f14 = d10 * d;
            gj0 gj0Var = this.n;
            if (gj0Var != null) {
                gj0Var.setAlpha((int) (f14 * f11));
                this.n.setBounds((int) (rectF.left + AndroidUtilities.dp(9.0f)), (int) (rectF.top + AndroidUtilities.dp(6.0f)), (int) (rectF.left + AndroidUtilities.dp(45.0f)), (int) (rectF.top + AndroidUtilities.dp(f10)));
                this.n.draw(canvas2);
            }
            if (this.w != null) {
                canvas2.save();
                canvas2.translate((rectF.left + AndroidUtilities.dp(52.0f)) - this.y, rectF.centerY() - (this.w.getHeight() / 2.0f));
                this.c.setAlpha((int) (f14 * f11));
                this.w.draw(canvas2);
                canvas2.restore();
            }
        }
        canvas2.restoreToCount(saveCount);
        if (d > 0.0f || this.B || this.L) {
            return;
        }
        this.L = true;
        post(new l0(this, 0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.J.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        rc rcVar = this.h;
        if (action == 0 && (this.D || contains)) {
            rcVar.c(contains);
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (rcVar.h) {
                if (contains) {
                    if (this.D) {
                        Runnable runnable = this.N;
                        if (runnable != null) {
                            runnable.run();
                        }
                    } else {
                        a();
                    }
                }
                rcVar.c(false);
                return true;
            }
        } else if (motionEvent.getAction() == 3) {
            rcVar.c(false);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnCancelListener(Runnable runnable) {
        this.N = runnable;
    }

    public void setProgress(float f10) {
        this.E = f10;
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.n || super.verifyDrawable(drawable);
    }

    public m0(Context context, String str) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.c = textPaint2;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        Paint paint4 = new Paint(1);
        this.f = paint4;
        this.h = new rc(this);
        this.B = false;
        this.C = new org.telegram.ui.Components.z5(0.0f, this, 0L, 350L, mr.h);
        this.D = true;
        this.E = 0.0f;
        this.F = new org.telegram.ui.Components.z5(this);
        this.G = new org.telegram.ui.Components.z5(this);
        this.H = new RectF();
        this.I = new RectF();
        this.J = new RectF();
        this.K = new RectF();
        paint.setColor(1509949440);
        textPaint.setColor(-1);
        textPaint2.setColor(-1);
        paint2.setColor(-869783512);
        paint3.setColor(-1);
        paint4.setColor(872415231);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        paint3.setStrokeWidth(AndroidUtilities.dp(4.0f));
        paint4.setStyle(style);
        paint4.setStrokeCap(cap);
        paint4.setStrokeWidth(AndroidUtilities.dp(4.0f));
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dpf2(14.66f));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.r = staticLayout;
        this.s = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.v = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.B = true;
        invalidate();
    }
}
