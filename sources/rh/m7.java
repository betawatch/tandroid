package rh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.ui.Components.qz0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m7 extends ReplacementSpan {
    public final Paint a;
    public final qz0 b;
    public final /* synthetic */ int c;

    public m7(int i10, String str) {
        this.c = i10;
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.1f, i10));
        this.b = new qz0(str, 13.0f, org.telegram.messenger.i0.o());
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(f7, (r12 - org.telegram.messenger.i0.L(20.0f)) / 2.0f, org.telegram.messenger.i0.L(12.0f) + f7 + this.b.c, (org.telegram.messenger.i0.L(20.0f) + r12) / 2.0f);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), this.a);
        int i15 = this.c;
        this.b.c(f7 + org.telegram.messenger.i0.L(6.0f), (i12 + i14) / 2.0f, 1.0f, i15, canvas);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (org.telegram.messenger.i0.L(12.0f) + this.b.c);
    }
}
