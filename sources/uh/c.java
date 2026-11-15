package uh;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ns;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.y;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class c extends Drawable {
    public final y a;
    public int b;
    public int c = ns.e4;

    public c(e6 e6Var) {
        int w02 = j6.w0(j6.i6, e6Var);
        this.b = w02;
        this.a = j6.a0(w02, 0, 0);
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
