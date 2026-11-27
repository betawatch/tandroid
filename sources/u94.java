// default package

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class u94 implements LineHeightSpan {
    public final int a;
    public final int b;

    public u94(Paint.FontMetricsInt fontMetricsInt, int i) {
        this.a = fontMetricsInt.ascent - i;
        this.b = fontMetricsInt.top - i;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (i4 == i3) {
            return;
        }
        int i5 = this.a;
        fontMetricsInt.ascent = i5;
        fontMetricsInt.top = Math.min(this.b, i5);
    }
}
