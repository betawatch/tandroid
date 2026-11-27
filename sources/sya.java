// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class sya extends ReplacementSpan {
    public final Paint a;
    public final pkb b;
    public final /* synthetic */ int c;

    public sya(int i, String str) {
        this.c = i;
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(aob.p1(0.1f, i));
        this.b = new pkb(str, 13.0f, hl.o());
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        RectF rectF = hl.P;
        rectF.set(f, (r12 - hl.L(20.0f)) / 2.0f, hl.L(12.0f) + f + this.b.c, (hl.L(20.0f) + r12) / 2.0f);
        canvas.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), this.a);
        int i6 = this.c;
        this.b.c(f + hl.L(6.0f), (i3 + i5) / 2.0f, 1.0f, i6, canvas);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (hl.L(12.0f) + this.b.c);
    }
}
