package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wr extends Drawable {
    public final Drawable a;
    public final Drawable b;
    public int d;
    public int e;
    public final ArrayList c = new ArrayList();
    public boolean f = false;
    public final org.telegram.ui.Components.y5 g = new org.telegram.ui.Components.y5(new ri(this, 13), 420, org.telegram.ui.Components.gr.h);
    public int h = 255;

    public wr(Drawable drawable, Drawable drawable2) {
        this.a = drawable;
        this.b = drawable2;
    }

    public final void a(int i9, int i10) {
        this.d = i9;
        this.e = i10;
    }

    public final void b(boolean z10) {
        if (this.f == z10) {
            return;
        }
        this.f = z10;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((View) obj).invalidate();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float e10 = this.g.e(this.f);
        int i9 = this.h;
        Drawable drawable = this.a;
        drawable.setAlpha(i9);
        drawable.setBounds(getBounds());
        drawable.draw(canvas);
        if (e10 > 0.0f) {
            Drawable drawable2 = this.b;
            drawable2.setAlpha((int) (this.h * e10));
            drawable2.setBounds(getBounds().left + this.d, getBounds().top + this.e, drawable2.getIntrinsicWidth() + getBounds().left + this.d, drawable2.getIntrinsicHeight() + getBounds().top + this.e);
            float lerp = AndroidUtilities.lerp(0.5f, 1.0f, e10);
            canvas.save();
            canvas.scale(lerp, lerp, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            drawable2.draw(canvas);
            canvas.restore();
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
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.h = i9;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.b.setColorFilter(colorFilter);
    }
}
