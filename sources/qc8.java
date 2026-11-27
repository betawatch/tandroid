// default package

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class qc8 implements LineHeightSpan {
    public final /* synthetic */ byte a;

    public /* synthetic */ qc8(byte b) {
        this.a = b;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.a) {
            case 0:
                fontMetricsInt.descent = hl.L(4.0f) + fontMetricsInt.descent;
                fontMetricsInt.ascent = fontMetricsInt.ascent;
                break;
            default:
                fontMetricsInt.ascent -= hl.L(2.0f);
                fontMetricsInt.top -= hl.L(2.0f);
                break;
        }
    }
}
