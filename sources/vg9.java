// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class vg9 extends mg9 {
    public final Paint X;

    public vg9(rh9 rh9Var, Rect rect, int i) {
        super(rh9Var, rect, i);
        this.X = new Paint(1);
    }

    @Override // mg9
    public final int I() {
        Rect rect = this.b;
        return gl.L(12.0f) + rect.top + rect.bottom;
    }

    @Override // mg9
    public final int K() {
        return gl.L(32.0f);
    }

    @Override // mg9
    public final void W(Canvas canvas) {
        rh9 rh9Var = this.a;
        int i = rh9Var.C;
        int i2 = rh9Var.S;
        int i3 = i + i2 + rh9Var.T;
        Rect rect = this.b;
        int i4 = rect.left;
        int i5 = ((i3 - i4) - rect.right) / 2;
        float f = (((r1 - i5) / 2.0f) - i2) + i4;
        float L = (gl.L(12.0f) - gl.L(1.0f)) / 2.0f;
        int v0 = bkb.v0(rh9Var.D() ? bkb.ml : bkb.ll, rh9Var.D);
        Paint paint = this.X;
        paint.setColor(v0);
        RectF rectF = gl.P;
        rectF.set(f, L, i5 + f, gl.L(1.0f) + L);
        canvas.drawRoundRect(rectF, gl.L(0.5f), gl.L(0.5f), paint);
    }
}
