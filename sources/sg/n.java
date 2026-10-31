package sg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.o5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n extends o5 {
    public final Bitmap a;

    public n(o oVar) {
        super(-1L, (Paint.FontMetricsInt) null);
        Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f), Bitmap.Config.ARGB_8888);
        this.a = createBitmap;
        Drawable mutate = oVar.getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
        mutate.setBounds(0, 0, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f));
        mutate.draw(new Canvas(createBitmap));
    }

    @Override // org.telegram.ui.Components.o5, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        super.draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
        canvas.save();
        canvas.translate(f7, ((i12 + i14) / 2.0f) - org.telegram.messenger.i0.L(12.0f));
        float f10 = this.extraScale;
        canvas.scale(f10, f10, f7 + org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
        canvas.drawBitmap(this.a, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.o5, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return org.telegram.messenger.i0.L(5.0f) + super.getSize(paint, charSequence, i10, i11, fontMetricsInt);
    }
}
