// default package

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class zf8 extends Drawable {
    public final fg0 a;
    public int b;
    public int c = nm7.d4;

    public zf8(ylb ylbVar) {
        int v0 = cmb.v0(cmb.h6, ylbVar);
        this.b = v0;
        this.a = cmb.Y(v0, 0, 0);
    }

    public abstract void a(int i);

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
    public final void setAlpha(int i) {
        if (this.c != i) {
            this.c = i;
            a(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
