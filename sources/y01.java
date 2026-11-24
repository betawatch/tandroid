// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class y01 implements LeadingMarginSpan {
    public final int a;
    public final int b;

    public y01(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint.Style style = paint.getStyle();
            int color = paint.getColor();
            paint.setColor(-11491093);
            paint.setStyle(Paint.Style.FILL);
            if (layout != null) {
                i5 -= layout.getLineForOffset(i6) != layout.getLineCount() + (-1) ? (int) layout.getSpacingAdd() : 0;
            }
            canvas.drawCircle((i2 * r0) + i, (i3 + i5) / 2.0f, this.b, paint);
            paint.setColor(color);
            paint.setStyle(style);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return (this.b << 1) + this.a;
    }
}
