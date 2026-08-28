package vf;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b extends Drawable {
    public Drawable a;
    public float b;
    public int c;

    public final void a(int i9) {
        if (this.c != i9) {
            this.c = i9;
            setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.a;
        Rect bounds = getBounds();
        float f10 = this.b;
        if (f10 == 1.0f) {
            drawable.setBounds(bounds);
        } else {
            drawable.setBounds((int) (bounds.centerX() - ((bounds.width() / 2.0f) * f10)), (int) (bounds.centerY() - ((bounds.height() / 2.0f) * f10)), (int) (((bounds.width() / 2.0f) * f10) + bounds.centerX()), (int) (((bounds.height() / 2.0f) * f10) + bounds.centerY()));
        }
        drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.a.setAlpha(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
