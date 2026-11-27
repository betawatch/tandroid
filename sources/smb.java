// default package

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class smb extends MetricAffectingSpan {
    public final int a;
    public final rmb b;

    public smb(rmb rmbVar, int i) {
        this.b = rmbVar;
        if (i > 0) {
            this.a = i;
        }
    }

    public final void a(TextPaint textPaint) {
        rmb rmbVar = this.b;
        if (vsd.a(rmbVar.a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (vsd.a(rmbVar.a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (vsd.a(rmbVar.a, TLObject.FLAG_14)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final boolean b() {
        return (this.b.a & 256) > 0;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i = this.a;
        if (i != 0) {
            textPaint.setTextSize(i);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.b.a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        int i = this.a;
        if (i != 0) {
            textPaint.setTextSize(i);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.b.a(textPaint);
    }
}
