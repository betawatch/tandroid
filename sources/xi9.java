// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xi9 extends qi9 {
    public final Paint X;

    public xi9(uj9 uj9Var, Rect rect, int i) {
        super(uj9Var, rect, i);
        this.X = new Paint(1);
    }

    @Override // qi9
    public final int H() {
        Rect rect = this.b;
        return hg9.v(6.0f, rect.top, 1) + rect.bottom;
    }

    @Override // qi9
    public final int J() {
        Rect rect = this.b;
        return gm.L(32.0f) + rect.left + rect.right;
    }

    @Override // qi9
    public final void V(Canvas canvas) {
        uj9 uj9Var = this.a;
        int v0 = cmb.v0(uj9Var.D() ? cmb.wl : cmb.vl, uj9Var.D);
        Paint paint = this.X;
        paint.setColor(v0);
        float f = -uj9Var.S;
        int i = uj9Var.C + uj9Var.T;
        Rect rect = this.b;
        float f2 = (i - rect.left) - rect.right;
        if (uj9Var.s) {
            r2 = gm.R1(this.S ? 1.0f : 0.0f, this.R ? 1.0f : 0.0f, uj9Var.t);
        } else if (this.R) {
            r2 = 1.0f;
        }
        float R1 = gm.R1((-1.0f) - (this.M != null ? r8.b.bottom : 0), gm.L(6.0f), r2);
        canvas.drawRect(f, R1, f2, R1 + 1.0f, paint);
    }
}
