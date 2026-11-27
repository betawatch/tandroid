// default package

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class yt9 extends Drawable {
    public final RectF a = new RectF();
    public final Paint b;
    public final TextPaint c;
    public int d;
    public String e;
    public final int f;
    public int g;
    public final short h;

    public yt9(int i) {
        Paint paint = new Paint(1);
        this.b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        this.g = jn7.d4;
        this.h = (short) 255;
        this.f = i;
        uh9.p(textPaint, hl.L(11.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.L(1.0f));
        this.e = i != 0 ? i != 2 ? ob6.M0(2131750808, null) : ob6.M0(2131745000, null) : ob6.M0(2131745590, null);
        this.d = (int) Math.ceil(textPaint.measureText(r4));
    }

    public final void a() {
        int i = this.f;
        String M0 = i != 0 ? i != 2 ? ob6.M0(2131750808, null) : ob6.M0(2131745000, null) : ob6.M0(2131745590, null);
        if (M0.equals(this.e)) {
            return;
        }
        this.e = M0;
        this.d = (int) Math.ceil(this.c.measureText(M0));
    }

    public final void b(int i) {
        this.c.setColor(i);
        this.b.setColor(i);
        this.g = Color.alpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.a;
        rectF.set(bounds);
        canvas.drawRoundRect(rectF, hl.L(2.0f), hl.L(2.0f), this.b);
        canvas.drawText(this.e, rectF.left + hl.L(5.0f), rectF.top + hl.L(12.0f), this.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return hl.L(16.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return hl.L(10.0f) + this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.h != i) {
            int i2 = (int) ((i / 255.0f) * this.g);
            this.b.setAlpha(i2);
            this.c.setAlpha(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
