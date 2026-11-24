// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class sfb extends ReplacementSpan {
    public float a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Paint d;

    public sfb(int i, Paint paint, String str) {
        this.b = str;
        this.c = i;
        this.d = paint;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float f2 = (i3 + i5) / 2.0f;
        float L = gl.L(19.0f);
        paint.setColor(this.c);
        float f3 = L / 2.0f;
        canvas.drawRoundRect(f, f2 - f3, f + this.a + gl.L(11.33f), f2 + f3, f3, f3, this.d);
        canvas.drawText(this.b, gl.N(5.66f) + f, i5 - gl.L(6.0f), paint);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float N = gl.N(11.33f);
        float measureText = paint.measureText(this.b);
        this.a = measureText;
        return (int) (N + measureText);
    }
}
