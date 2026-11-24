// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class qy8 extends Drawable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ ry8 c;

    /* JADX WARN: Multi-variable type inference failed */
    public qy8(ry8 ry8Var, int i, int i2) {
        this.c = ry8Var;
        this.a = i;
        this.b = i2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = gl.Q;
        int centerX = getBounds().centerX();
        float f = this.a;
        int L = centerX - (gl.L(f) / 2);
        int centerY = getBounds().centerY();
        float f2 = this.b;
        rect.set(L, centerY - (gl.L(f2) / 2), (gl.L(f) / 2) + getBounds().centerX(), (gl.L(f2) / 2) + getBounds().centerY());
        ry8 ry8Var = this.c;
        ry8Var.c.j0(rect);
        ry8Var.c.h(canvas, null);
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
