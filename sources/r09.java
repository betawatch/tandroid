// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class r09 extends Drawable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ s09 c;

    /* JADX WARN: Multi-variable type inference failed */
    public r09(s09 s09Var, int i, int i2) {
        this.c = s09Var;
        this.a = i;
        this.b = i2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = gm.Q;
        int centerX = getBounds().centerX();
        float f = this.a;
        int L = centerX - (gm.L(f) / 2);
        int centerY = getBounds().centerY();
        float f2 = this.b;
        rect.set(L, centerY - (gm.L(f2) / 2), (gm.L(f) / 2) + getBounds().centerX(), (gm.L(f2) / 2) + getBounds().centerY());
        s09 s09Var = this.c;
        s09Var.c.j0(rect);
        s09Var.c.h(canvas, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.c.c.setAlpha(i / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.c.p1 = colorFilter;
    }
}
