// default package

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class thb extends MetricAffectingSpan {
    public final TextPaint a;
    public final String b;

    public thb(TextPaint textPaint, String str) {
        this.a = textPaint;
        this.b = str;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        TextPaint textPaint2 = this.a;
        if (textPaint2 != null) {
            textPaint.setColor(textPaint2.getColor());
            textPaint.setTypeface(textPaint2.getTypeface());
            textPaint.setFlags(textPaint2.getFlags());
            textPaint.setTextSize(textPaint2.getTextSize());
            textPaint.baselineShift = textPaint2.baselineShift;
            textPaint.bgColor = textPaint2.bgColor;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        TextPaint textPaint2 = this.a;
        if (textPaint2 != null) {
            textPaint.setColor(textPaint2.getColor());
            textPaint.setTypeface(textPaint2.getTypeface());
            textPaint.setFlags(textPaint2.getFlags());
            textPaint.setTextSize(textPaint2.getTextSize());
            textPaint.baselineShift = textPaint2.baselineShift;
            textPaint.bgColor = textPaint2.bgColor;
        }
    }
}
