package th;

import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pr;
import yf.p;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class d extends c {
    public final p6 d;
    public final bj0 e;
    public final le.b f;
    public float h;

    public d(t1 t1Var, f6 f6Var) {
        super(f6Var);
        bj0 bj0Var = new bj0(t1Var);
        this.e = bj0Var;
        bj0Var.d(null, true, false);
        bj0Var.v = 650.0f;
        bj0Var.e(0.69f, false);
        bj0Var.p.setStrokeWidth(AndroidUtilities.dp(1.5f));
        this.f = new le.b(t1Var, pr.h, 260L);
        p6 p6Var = new p6(true, false, false, false);
        this.d = p6Var;
        p6Var.u(AndroidUtilities.bold());
        p6Var.t(AndroidUtilities.dp(13.0f));
        p6Var.b = 17;
        int v02 = j6.v0(j6.i6, f6Var);
        if (this.b != v02) {
            j6.B1(this.a, v02, false);
            this.b = v02;
        }
    }

    @Override // th.c
    public final void a(int i10) {
        this.a.setAlpha(i10);
        this.d.w = i10;
    }

    public final float b() {
        return this.f.e;
    }

    public final void c(int i10) {
        this.d.r(i10);
        this.e.o = i10;
    }

    public final void d(float f7) {
        if (this.h != f7) {
            this.h = f7;
            Rect bounds = getBounds();
            int i10 = (int) this.h;
            this.d.setBounds(bounds.left, bounds.top + i10, bounds.right, bounds.bottom + i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f7 = this.f.e;
        if (f7 < 1.0f) {
            p.b(canvas, this.d, 1.0f - f7);
        }
        if (f7 > 0.0f) {
            float exactCenterX = getBounds().exactCenterX();
            float exactCenterY = getBounds().exactCenterY();
            canvas.save();
            canvas.scale(f7, f7, exactCenterX, exactCenterY);
            this.e.a(canvas);
            canvas.restore();
        }
    }

    @Override // th.c, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect bounds = getBounds();
        int i10 = (int) this.h;
        this.d.setBounds(bounds.left, bounds.top + i10, bounds.right, bounds.bottom + i10);
        int dp = AndroidUtilities.dp(11.0f);
        int centerX = rect.centerX();
        int centerY = rect.centerY();
        this.e.f(centerX - dp, centerY - dp, centerX + dp, centerY + dp);
    }
}
