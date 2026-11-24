// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class y3c extends ReplacementSpan {
    public final uw3 b;
    public final Paint.FontMetricsInt a = new Paint.FontMetricsInt();
    public float c = 1.0f;

    public y3c(uw3 uw3Var) {
        kre.a(uw3Var, "metadata cannot be null");
        this.b = uw3Var;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        lw3.a().getClass();
        uw3 uw3Var = this.b;
        wtc wtcVar = uw3Var.b;
        Typeface typeface = (Typeface) wtcVar.d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText((char[]) wtcVar.b, uw3Var.a << 1, 2, f, i4, paint);
        paint.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        uw3 uw3Var = this.b;
        this.c = abs / (uw3Var.b().a(14) != 0 ? r8.b.getShort(r1 + r8.a) : (short) 0);
        od7 b = uw3Var.b();
        int a = b.a(14);
        if (a != 0) {
            b.b.getShort(a + b.a);
        }
        short s = (short) ((uw3Var.b().a(12) != 0 ? r5.b.getShort(r7 + r5.a) : (short) 0) * this.c);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
