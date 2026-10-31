package vh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x7 extends ImageSpan {
    public final /* synthetic */ Drawable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(Drawable drawable, Drawable drawable2) {
        super(drawable);
        this.a = drawable2;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        canvas.save();
        canvas.translate(0.0f, org.telegram.messenger.i0.L(1.0f) + ((i14 - i12) / 2));
        this.a.setAlpha(paint.getAlpha());
        super.draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (super.getSize(paint, charSequence, i10, i11, fontMetricsInt) / 3) * 2;
    }
}
