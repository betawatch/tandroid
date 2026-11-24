// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yg6 extends ReplacementSpan {
    public final String a;
    public final boolean b;
    public final TextPaint c;
    public final Paint d;
    public final float e;
    public final /* synthetic */ ah6 f;

    public yg6(ah6 ah6Var, int i, boolean z) {
        this.f = ah6Var;
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        this.d = new Paint(1);
        String valueOf = String.valueOf(i);
        this.a = valueOf;
        this.b = z;
        textPaint.setTextSize(gl.N(11.0f));
        textPaint.setTypeface(gl.o());
        this.e = Math.max(gl.L(7.333f), textPaint.measureText(valueOf)) + gl.L(10.0f);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float L = f + gl.L(5.0f);
        float L2 = ((i3 + i5) / 2.0f) + gl.L(1.0f);
        float L3 = gl.L(17.333f) / 2.0f;
        int i6 = this.b ? bkb.Ei : bkb.T9;
        ah6 ah6Var = this.f;
        int themedColor = ah6Var.getThemedColor(i6);
        Paint paint2 = this.d;
        paint2.setColor(themedColor);
        int themedColor2 = ah6Var.getThemedColor(bkb.r8);
        TextPaint textPaint = this.c;
        textPaint.setColor(themedColor2);
        RectF rectF = gl.P;
        float f2 = this.e;
        rectF.set(L, L2 - L3, L + f2, L2 + L3);
        canvas.drawRoundRect(rectF, L3, L3, paint2);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f3 = L2 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
        String str = this.a;
        canvas.drawText(str, ((f2 - textPaint.measureText(str)) / 2.0f) + L, f3, textPaint);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) Math.ceil(gl.L(5.0f) + this.e);
    }
}
