// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class x7c extends ReplacementSpan {
    public final px3 b;
    public final Paint.FontMetricsInt a = new Paint.FontMetricsInt();
    public float c = 1.0f;

    public x7c(px3 px3Var) {
        ewe.a(px3Var, "metadata cannot be null");
        this.b = px3Var;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        gx3.a().getClass();
        px3 px3Var = this.b;
        u8a u8aVar = px3Var.b;
        Typeface typeface = (Typeface) u8aVar.d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText((char[]) u8aVar.b, px3Var.a << 1, 2, f, i4, paint);
        paint.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        px3 px3Var = this.b;
        this.c = abs / (px3Var.b().a(14) != 0 ? r8.b.getShort(r1 + r8.a) : (short) 0);
        xf7 b = px3Var.b();
        int a = b.a(14);
        if (a != 0) {
            b.b.getShort(a + b.a);
        }
        short s = (short) ((px3Var.b().a(12) != 0 ? r5.b.getShort(r7 + r5.a) : (short) 0) * this.c);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
