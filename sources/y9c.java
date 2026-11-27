// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class y9c extends View {
    public final TextPaint E;
    public hf0 F;
    public ValueAnimator G;
    public float H;
    public boolean I;
    public int J;
    public int K;
    public int L;
    public String M;
    public int N;
    public int a;
    public String b;
    public int c;
    public final TextPaint d;
    public final Paint e;
    public final RectF f;
    public int h;
    public int n;
    public Drawable r;
    public StaticLayout s;
    public Drawable w;
    public StaticLayout x;
    public int y;

    public y9c(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.e = new Paint(1);
        this.f = new RectF();
        TextPaint textPaint2 = new TextPaint(1);
        this.E = textPaint2;
        this.H = 1.0f;
        this.N = aob.sf;
        textPaint.setTextSize(hl.L(13.0f));
        textPaint.setTypeface(hl.o());
        uh9.p(textPaint2, hl.L(15.0f));
    }

    public final void a(String str, boolean z) {
        if (this.M != str) {
            this.M = str;
            this.I = z;
            this.x = this.s;
            this.w = this.r;
            Typeface o = hl.o();
            TextPaint textPaint = this.E;
            textPaint.setTypeface(o);
            this.y = (int) Math.ceil(Layout.getDesiredWidth(str, textPaint));
            this.r = null;
            this.s = new StaticLayout(str, textPaint, this.y, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            setContentDescription(str);
            invalidate();
            if (this.x == null && this.w == null) {
                return;
            }
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.H = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new pzb(this, (byte) 5));
            this.G.setDuration(150L);
            this.G.start();
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        hf0 hf0Var = this.F;
        if (hf0Var != null) {
            hf0Var.setState(getDrawableState());
        }
    }

    public vnb getResourceProvider() {
        return null;
    }

    public float getTopOffset() {
        return 0.0f;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        hf0 hf0Var = this.F;
        if (hf0Var != null) {
            hf0Var.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        StaticLayout staticLayout = this.s;
        int v0 = aob.v0(isEnabled() ? this.N : aob.y6, getResourceProvider());
        int i = this.J;
        TextPaint textPaint = this.E;
        if (i != v0) {
            this.J = v0;
            textPaint.setColor(v0);
        }
        int v02 = aob.v0(aob.Je, getResourceProvider());
        int i2 = this.K;
        TextPaint textPaint2 = this.d;
        if (i2 != v02) {
            this.K = v02;
            textPaint2.setColor(v02);
        }
        int v03 = aob.v0(aob.kg, getResourceProvider());
        int i3 = this.L;
        Paint paint = this.e;
        if (i3 != v03) {
            this.L = v03;
            paint.setColor(v03);
        }
        if (getParent() != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() - measuredWidth) / 2;
            if (this.n != aob.v0(this.N, getResourceProvider()) || this.F == null) {
                int L = hl.L(60.0f);
                int v04 = aob.v0(this.N, getResourceProvider());
                this.n = v04;
                hf0 h0 = aob.h0(L, 0, vm2.o(v04, 26));
                this.F = h0;
                h0.setCallback(this);
            }
            int L2 = getLeft() + measuredWidth2 <= 0 ? measuredWidth2 - hl.L(20.0f) : measuredWidth2;
            int i4 = measuredWidth2 + measuredWidth;
            if (i4 > ((View) getParent()).getMeasuredWidth()) {
                i4 += hl.L(20.0f);
            }
            int i5 = measuredWidth / 2;
            this.F.setBounds(L2, (getMeasuredHeight() / 2) - i5, i4, (getMeasuredHeight() / 2) + i5);
            this.F.draw(canvas);
        }
        if (this.s != null) {
            canvas.save();
            if (this.H == 1.0f || this.x == null) {
                f = 6.0f;
                int measuredWidth3 = ((getMeasuredWidth() - this.y) / 2) - (this.h / 2);
                canvas.translate(measuredWidth3 + (this.r != null ? hl.L(3.0f) + (r5.getIntrinsicWidth() / 2) : 0), getTopOffset() + ((getMeasuredHeight() - this.s.getHeight()) / 2));
                Drawable drawable = this.r;
                if (drawable != null) {
                    drawable.setBounds((-drawable.getIntrinsicWidth()) - hl.L(6.0f), hl.L(1.0f) + ((this.s.getHeight() - this.r.getIntrinsicHeight()) / 2), -hl.L(6.0f), hl.L(1.0f) + ((this.r.getIntrinsicHeight() + this.s.getHeight()) / 2));
                    this.r.setAlpha(jn7.d4);
                    this.r.draw(canvas);
                }
                this.s.draw(canvas);
            } else {
                int alpha = textPaint.getAlpha();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.x.getWidth()) / 2) - (this.h / 2), getTopOffset() + ((getMeasuredHeight() - this.s.getHeight()) / 2));
                canvas.translate(this.w != null ? hl.L(3.0f) + (r11.getIntrinsicWidth() / 2) : 0, (this.I ? -1.0f : 1.0f) * hl.L(18.0f) * this.H);
                Drawable drawable2 = this.w;
                if (drawable2 != null) {
                    f = 6.0f;
                    f2 = 1.0f;
                    f3 = 3.0f;
                    drawable2.setBounds((-drawable2.getIntrinsicWidth()) - hl.L(6.0f), hl.L(1.0f) + ((this.s.getHeight() - this.w.getIntrinsicHeight()) / 2), -hl.L(6.0f), hl.L(1.0f) + ((this.w.getIntrinsicHeight() + this.s.getHeight()) / 2));
                    this.w.setAlpha((int) ((1.0f - this.H) * alpha));
                    this.w.draw(canvas);
                } else {
                    f = 6.0f;
                    f2 = 1.0f;
                    f3 = 3.0f;
                }
                float f4 = alpha;
                textPaint.setAlpha((int) ((f2 - this.H) * f4));
                this.x.draw(canvas);
                canvas.restore();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.y) / 2) - (this.h / 2), getTopOffset() + ((getMeasuredHeight() - this.s.getHeight()) / 2));
                canvas.translate(this.r != null ? hl.L(f3) + (r9.getIntrinsicWidth() / 2) : 0, (f2 - this.H) * (this.I ? f2 : -1.0f) * hl.L(18.0f));
                Drawable drawable3 = this.r;
                if (drawable3 != null) {
                    drawable3.setBounds((-drawable3.getIntrinsicWidth()) - hl.L(f), hl.L(f2) + ((this.s.getHeight() - this.r.getIntrinsicHeight()) / 2), -hl.L(f), hl.L(f2) + ((this.r.getIntrinsicHeight() + this.s.getHeight()) / 2));
                    this.r.setAlpha((int) (this.H * f4));
                    this.r.draw(canvas);
                }
                textPaint.setAlpha((int) (f4 * this.H));
                this.s.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        } else {
            f = 6.0f;
        }
        if (this.b == null || staticLayout == null) {
            return;
        }
        int ceil = (int) Math.ceil(staticLayout.getLineWidth(0));
        int L3 = hl.L(f) + ((((getMeasuredWidth() - ceil) / 2) + ceil) - (this.h / 2));
        float f5 = L3;
        float measuredHeight = (getMeasuredHeight() / 2) - hl.L(10.0f);
        float f6 = L3 + this.h;
        float L4 = hl.L(10.0f) + (getMeasuredHeight() / 2);
        RectF rectF = this.f;
        rectF.set(f5, measuredHeight, f6, L4);
        canvas.drawRoundRect(rectF, hl.L(10.0f), hl.L(10.0f), paint);
        canvas.drawText(this.b, rectF.centerX() - (this.c / 2.0f), rectF.top + hl.L(14.5f), textPaint2);
    }

    public void setCounter(int i) {
        if (this.a != i) {
            this.a = i;
            if (i == 0) {
                this.b = null;
                this.h = 0;
            } else {
                this.b = hl.o0(i, 0);
                this.c = (int) Math.ceil(this.d.measureText(r3));
                int max = Math.max(hl.L(20.0f), hl.L(12.0f) + this.c);
                if (this.h != max) {
                    this.h = max;
                }
            }
            invalidate();
        }
    }

    public void setText(CharSequence charSequence) {
        Typeface o = hl.o();
        TextPaint textPaint = this.E;
        textPaint.setTypeface(o);
        this.y = (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
        this.r = null;
        this.s = new StaticLayout(charSequence, textPaint, this.y, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(charSequence);
        invalidate();
    }

    public void setTextColorKey(int i) {
        this.N = i;
        invalidate();
    }

    public void setTextInfo(CharSequence charSequence) {
        TextPaint textPaint = this.E;
        textPaint.setTypeface(null);
        this.y = (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
        this.r = null;
        this.s = new StaticLayout(charSequence, textPaint, this.y + 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(charSequence);
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        hf0 hf0Var = this.F;
        return hf0Var != null ? hf0Var == drawable || super.verifyDrawable(drawable) : super.verifyDrawable(drawable);
    }
}
