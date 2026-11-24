// default package

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class z3c extends MetricAffectingSpan {
    public Typeface a;
    public int b;
    public int c;

    public z3c() {
        Typeface typeface = Typeface.DEFAULT;
        this.c = -1;
        this.a = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i = this.c;
        if (i >= 0) {
            this.b = bkb.w0(null, i, false);
        }
        Typeface typeface = this.a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i2 = this.b;
        if (i2 != 0) {
            textPaint.setColor(i2);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public z3c(Typeface typeface) {
        this.c = -1;
        this.a = typeface;
    }

    public z3c(Typeface typeface, int i) {
        this.c = -1;
        this.a = typeface;
        this.b = i;
    }
}
