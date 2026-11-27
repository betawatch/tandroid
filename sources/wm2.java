// default package

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class wm2 extends ReplacementSpan {
    public int E;
    public int F;
    public final byte G;
    public float H;
    public float I;
    public float J;
    public boolean K;
    public Paint.FontMetricsInt L;
    public boolean a;
    public int b;
    public Drawable c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int h;
    public int n;
    public float r;
    public float s;
    public float w;
    public float x;
    public int y;

    /* JADX WARN: Multi-variable type inference failed */
    public wm2(int i, Drawable drawable) {
        this.a = true;
        this.d = true;
        this.e = true;
        this.f = false;
        this.n = 0;
        this.x = 1.0f;
        this.H = 1.0f;
        this.I = 1.0f;
        this.J = 1.0f;
        this.c = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        this.G = i;
    }

    public final void a(int i) {
        this.h = i;
        this.e = i < 0;
    }

    public final void b(Paint.FontMetricsInt fontMetricsInt) {
        this.K = true;
        this.L = fontMetricsInt;
        if (fontMetricsInt != null) {
            c(Math.abs(this.L.ascent) + Math.abs(fontMetricsInt.descent));
            if (this.E == 0) {
                c(hl.L(20.0f));
            }
        }
    }

    public final void c(int i) {
        this.E = i;
        this.c.setBounds(0, 0, i, i);
    }

    public final void d(float f) {
        this.r = 0.0f;
        this.s = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        boolean z;
        if (this.a) {
            if (this.d) {
                int i6 = this.y;
                if (i6 == 0) {
                    if (this.f && (paint instanceof TextPaint)) {
                        i6 = ((TextPaint) paint).linkColor;
                    } else if (this.e) {
                        i6 = paint.getColor();
                        z = true;
                        if (this.b != i6) {
                            this.b = i6;
                            this.c.setColorFilter(new PorterDuffColorFilter(this.b, PorterDuff.Mode.SRC_IN));
                        }
                    } else {
                        i6 = aob.w0(null, this.h, false);
                    }
                }
                z = false;
                if (this.b != i6) {
                }
            } else {
                z = false;
            }
            canvas.save();
            Drawable drawable = this.c;
            int i7 = i5 - (drawable != null ? drawable.getBounds().bottom : i5);
            byte b = this.G;
            if (b != 1) {
                if (b == 2) {
                    int g = ik8.g(i5, i3, 2, i3);
                    Drawable drawable2 = this.c;
                    i7 = g - (drawable2 != null ? drawable2.getBounds().height() / 2 : 0);
                } else if (b == 0) {
                    int i8 = i5 - i3;
                    int i9 = this.E;
                    if (i9 == 0) {
                        i9 = this.c.getIntrinsicHeight();
                    }
                    i7 = ik8.g(i8, i9, 2, i3) + hl.L(this.n);
                }
            }
            canvas.translate(f + this.r, i7 + this.s);
            if (this.c != null) {
                float f2 = this.I;
                if (f2 != 1.0f || this.J != 1.0f) {
                    canvas.scale(f2, this.J, 0.0f, r5.getBounds().centerY());
                }
                float f3 = this.w;
                if (f3 != 1.0f) {
                    canvas.rotate(f3, this.c.getBounds().centerX(), this.c.getBounds().centerY());
                }
                Drawable drawable3 = this.c;
                if (z) {
                    drawable3.setAlpha((int) ((paint.getAlpha() / Color.alpha(this.b)) * this.x * 255.0f));
                } else {
                    drawable3.setAlpha((int) (paint.getAlpha() * this.x));
                }
                this.c.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (this.K && this.L != null) {
            if (fontMetricsInt == null) {
                fontMetricsInt = new Paint.FontMetricsInt();
            }
            Paint.FontMetricsInt fontMetricsInt2 = this.L;
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
            return (int) (Math.abs(this.H) * Math.abs(this.I) * this.E);
        }
        int i3 = this.F;
        float f = this.I;
        if (i3 != 0) {
            return (int) (Math.abs(f) * this.F);
        }
        float abs = Math.abs(this.H) * Math.abs(f);
        int i4 = this.E;
        if (i4 == 0) {
            i4 = this.c.getIntrinsicWidth();
        }
        return (int) (abs * i4);
    }

    public wm2(Drawable drawable) {
        this(0, drawable);
    }

    public wm2(int i, int i2) {
        this(i2, a.b.getDrawable(i).mutate());
    }

    public wm2(int i) {
        this(i, 0);
    }
}
