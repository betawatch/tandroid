// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ug9 extends mg9 {
    public final Paint X;

    public ug9(rh9 rh9Var, Rect rect, int i) {
        super(rh9Var, rect, i);
        this.X = new Paint(1);
    }

    @Override // mg9
    public final int I() {
        Rect rect = this.b;
        return de9.w(6.0f, rect.top, 1) + rect.bottom;
    }

    @Override // mg9
    public final int K() {
        Rect rect = this.b;
        return gl.L(32.0f) + rect.left + rect.right;
    }

    @Override // mg9
    public final void W(Canvas canvas) {
        rh9 rh9Var = this.a;
        int v0 = bkb.v0(rh9Var.D() ? bkb.wl : bkb.vl, rh9Var.D);
        Paint paint = this.X;
        paint.setColor(v0);
        float f = -rh9Var.S;
        int i = rh9Var.C + rh9Var.T;
        Rect rect = this.b;
        float f2 = (i - rect.left) - rect.right;
        if (rh9Var.s) {
            r2 = gl.R1(this.S ? 1.0f : 0.0f, this.R ? 1.0f : 0.0f, rh9Var.t);
        } else if (this.R) {
            r2 = 1.0f;
        }
        float R1 = gl.R1((-1.0f) - (this.M != null ? r8.b.bottom : 0), gl.L(6.0f), r2);
        canvas.drawRect(f, R1, f2, R1 + 1.0f, paint);
    }
}
