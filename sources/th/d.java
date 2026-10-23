package th;

import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.zj0;
import zf.p;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class d extends c {
    public final p6 d;
    public final zj0 e;
    public final ne.b f;
    public float h;

    public d(u1 u1Var, d6 d6Var) {
        super(d6Var);
        zj0 zj0Var = new zj0(u1Var);
        this.e = zj0Var;
        zj0Var.d(null, true, false);
        zj0Var.v = 650.0f;
        zj0Var.e(0.69f, false);
        zj0Var.p.setStrokeWidth(AndroidUtilities.dp(1.5f));
        this.f = new ne.b(u1Var, bs.h, 260L);
        p6 p6Var = new p6(true, false, false);
        this.d = p6Var;
        p6Var.x(AndroidUtilities.bold());
        p6Var.w(AndroidUtilities.dp(13.0f));
        p6Var.b = 17;
        int w02 = h6.w0(h6.i6, d6Var);
        if (this.b != w02) {
            h6.C1(this.a, w02, false);
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
