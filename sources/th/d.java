package th;

import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.p6;
import zf.p;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class d extends c {
    public final p6 d;
    public final ck0 e;
    public final ne.b f;
    public float h;

    public d(t1 t1Var, g6 g6Var) {
        super(g6Var);
        ck0 ck0Var = new ck0(t1Var);
        this.e = ck0Var;
        ck0Var.d(null, true, false);
        ck0Var.v = 650.0f;
        ck0Var.e(0.69f, false);
        ck0Var.p.setStrokeWidth(AndroidUtilities.dp(1.5f));
        this.f = new ne.b(t1Var, bs.h, 260L);
        p6 p6Var = new p6(true, false, false);
        this.d = p6Var;
        p6Var.x(AndroidUtilities.bold());
        p6Var.w(AndroidUtilities.dp(13.0f));
        p6Var.b = 17;
        int w02 = k6.w0(k6.i6, g6Var);
        if (this.b != w02) {
            k6.E1(this.a, w02, false);
            this.b = w02;
        }
    }

    @Override // th.c
    public final void a(int i10) {
        this.a.setAlpha(i10);
        this.d.B = i10;
    }

    public final float b() {
        return this.f.e;
    }

    public final void c(int i10) {
        this.d.u(i10);
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
