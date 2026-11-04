package vh;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import cg.r;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d extends c {
    public final g6 d;
    public final gh0 e;
    public final qe.a f;
    public float h;

    public d(View view, e6 e6Var) {
        super(e6Var);
        gh0 gh0Var = new gh0(view);
        this.e = gh0Var;
        gh0Var.d(null, true, false);
        gh0Var.v = 650.0f;
        gh0Var.e(false, 0.69f);
        gh0Var.p.setStrokeWidth(g0.L(1.5f));
        this.f = new qe.a(view, xq.h, 260L);
        g6 g6Var = new g6(true, false, false);
        this.d = g6Var;
        g6Var.x(g0.o());
        g6Var.w(g0.L(13.0f));
        g6Var.b = 17;
        int w02 = k6.w0(k6.i6, e6Var);
        if (this.b != w02) {
            k6.H1(this.a, w02, false);
            this.b = w02;
        }
    }

    @Override // vh.c
    public final void a(int i3) {
        this.a.setAlpha(i3);
        this.d.B = i3;
    }

    public final float b() {
        return this.f.e;
    }

    public final void c(int i3) {
        this.d.u(i3);
        this.e.o = i3;
    }

    public final void d(float f10) {
        if (this.h != f10) {
            this.h = f10;
            Rect bounds = getBounds();
            int i3 = (int) this.h;
            this.d.setBounds(bounds.left, bounds.top + i3, bounds.right, bounds.bottom + i3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f10 = this.f.e;
        if (f10 < 1.0f) {
            r.b(canvas, this.d, 1.0f - f10);
        }
        if (f10 > 0.0f) {
            float exactCenterX = getBounds().exactCenterX();
            float exactCenterY = getBounds().exactCenterY();
            canvas.save();
            canvas.scale(f10, f10, exactCenterX, exactCenterY);
            this.e.a(canvas);
            canvas.restore();
        }
    }

    @Override // vh.c, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect bounds = getBounds();
        int i3 = (int) this.h;
        this.d.setBounds(bounds.left, bounds.top + i3, bounds.right, bounds.bottom + i3);
        int L = g0.L(11.0f);
        int centerX = rect.centerX();
        int centerY = rect.centerY();
        this.e.f(centerX - L, centerY - L, centerX + L, centerY + L);
    }
}
