// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class x43 extends Drawable {
    public final Drawable a;
    public final Drawable b;
    public float c;
    public float d = 255.0f;

    public x43(Drawable drawable, Drawable drawable2) {
        this.a = drawable;
        this.b = drawable2;
        if (drawable != null) {
            drawable.setCallback(new w43(this, (byte) 0));
        }
        if (drawable2 != null) {
            drawable2.setCallback(new w43(this, (byte) 1));
        }
    }

    public final void a(float f) {
        this.c = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i = (int) ((1.0f - this.c) * this.d);
        Drawable drawable = this.a;
        drawable.setAlpha(i);
        int i2 = (int) (this.d * this.c);
        Drawable drawable2 = this.b;
        drawable2.setAlpha(i2);
        if (i > 0) {
            drawable.draw(canvas);
        }
        if (i2 > 0) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.a.setBounds(rect);
        this.b.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
