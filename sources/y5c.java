// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class y5c extends ReplacementSpan {
    public final fy3 b;
    public final Paint.FontMetricsInt a = new Paint.FontMetricsInt();
    public float c = 1.0f;

    public y5c(fy3 fy3Var) {
        nte.a(fy3Var, "metadata cannot be null");
        this.b = fy3Var;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        wx3.a().getClass();
        fy3 fy3Var = this.b;
        e7a e7aVar = fy3Var.b;
        Typeface typeface = (Typeface) e7aVar.d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText((char[]) e7aVar.b, fy3Var.a << 1, 2, f, i4, paint);
        paint.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        fy3 fy3Var = this.b;
        this.c = abs / (fy3Var.b().a(14) != 0 ? r8.b.getShort(r1 + r8.a) : (short) 0);
        qf7 b = fy3Var.b();
        int a = b.a(14);
        if (a != 0) {
            b.b.getShort(a + b.a);
        }
        short s = (short) ((fy3Var.b().a(12) != 0 ? r5.b.getShort(r7 + r5.a) : (short) 0) * this.c);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
