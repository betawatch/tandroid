// default package

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class q19 extends MetricAffectingSpan implements LineHeightSpan {
    public r19 a;

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        r19 r19Var = this.a;
        if (r19Var.b) {
            int i5 = r19Var.f ? 7 : 2;
            if (i <= r19Var.c) {
                fontMetricsInt.ascent -= hl.L((r19Var.n ? 2 : 0) + i5);
                fontMetricsInt.top -= hl.L((this.a.n ? 2 : 0) + i5);
            }
            if (i2 >= this.a.d) {
                float f = i5;
                fontMetricsInt.descent = hl.L(f) + fontMetricsInt.descent;
                fontMetricsInt.bottom = hl.L(f) + fontMetricsInt.bottom;
            }
        }
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint == null) {
            return;
        }
        textPaint.setTextSize(hl.L(this.a.a ? 16.0f : xea.S0 - 2));
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(hl.L(this.a.a ? 16.0f : xea.S0 - 2));
        textPaint.setTextScaleX(this.a.a ? 1.1f : 1.0f);
    }
}
