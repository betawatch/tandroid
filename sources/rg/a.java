package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.i0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a extends Drawable {
    public final TextPaint a;
    public final TextPaint b;
    public final RectF c;
    public final Drawable d;
    public float e;
    public String f;

    public a(Context context) {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.b = textPaint2;
        this.c = new RectF();
        textPaint.setColor(-1);
        textPaint.setTypeface(i0.o());
        textPaint.setTextSize(i0.L(12.0f));
        textPaint2.setColor(-6915073);
        this.d = context.getDrawable(R.drawable.mini_boost_badge);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float f7 = bounds.left;
        float f10 = bounds.top;
        float f11 = bounds.right;
        float f12 = bounds.bottom;
        RectF rectF = this.c;
        rectF.set(f7, f10, f11, f12);
        canvas.drawRoundRect(rectF, i0.L(12.0f), i0.L(12.0f), this.b);
        int L = i0.L(2.0f) + bounds.left;
        int L2 = i0.L(1.0f) + bounds.top;
        int L3 = i0.L(2.0f) + bounds.left;
        Drawable drawable = this.d;
        drawable.setBounds(L, L2, drawable.getIntrinsicWidth() + L3, drawable.getIntrinsicHeight() + i0.L(1.0f) + getBounds().top);
        drawable.draw(canvas);
        String str = this.f;
        if (str != null) {
            canvas.drawText(str, i0.L(16.5f) + bounds.left, i0.L(13.0f) + bounds.top, this.a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return i0.L(18.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) (i0.L(23.0f) + this.e);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
