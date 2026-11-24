// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class thb extends ReplacementSpan {
    public float a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Paint d;

    public thb(int i, Paint paint, String str) {
        this.b = str;
        this.c = i;
        this.d = paint;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float f2 = (i3 + i5) / 2.0f;
        float L = gm.L(19.0f);
        paint.setColor(this.c);
        float f3 = L / 2.0f;
        canvas.drawRoundRect(f, f2 - f3, f + this.a + gm.L(11.33f), f2 + f3, f3, f3, this.d);
        canvas.drawText(this.b, gm.N(5.66f) + f, i5 - gm.L(6.0f), paint);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float N = gm.N(11.33f);
        float measureText = paint.measureText(this.b);
        this.a = measureText;
        return (int) (N + measureText);
    }
}
