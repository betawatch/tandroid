package sh;

import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.q6;
import yf.p;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class d extends c {
    public final q6 d;
    public final gk0 e;
    public final me.b f;
    public float h;

    public d(u1 u1Var, e6 e6Var) {
        super(e6Var);
        gk0 gk0Var = new gk0(u1Var);
        this.e = gk0Var;
        gk0Var.d(null, true, false);
        gk0Var.v = 650.0f;
        gk0Var.e(0.69f, false);
        gk0Var.p.setStrokeWidth(AndroidUtilities.dp(1.5f));
        this.f = new me.b(u1Var, hs.h, 260L);
        q6 q6Var = new q6(true, false, false);
        this.d = q6Var;
        q6Var.x(AndroidUtilities.bold());
        q6Var.w(AndroidUtilities.dp(13.0f));
        q6Var.b = 17;
        int w02 = i6.w0(i6.i6, e6Var);
        if (this.b != w02) {
            i6.C1(this.a, w02, false);
            this.b = w02;
        }
    }

    @Override // sh.c
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

    @Override // sh.c, android.graphics.drawable.Drawable
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
