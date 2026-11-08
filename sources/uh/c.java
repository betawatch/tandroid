package uh;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.y;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public abstract class c extends Drawable {
    public final y a;
    public int b;
    public int c = qs.e4;

    public c(f6 f6Var) {
        int w02 = k6.w0(k6.i6, f6Var);
        this.b = w02;
        this.a = k6.a0(w02, 0, 0);
    }

    public abstract void a(int i7);

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        if (this.c != i7) {
            this.c = i7;
            a(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
