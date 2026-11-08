package uh;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import bg.s;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class d extends c {
    public final i6 d;
    public final dh0 e;
    public final te.a f;
    public float h;

    public d(View view, f6 f6Var) {
        super(f6Var);
        dh0 dh0Var = new dh0(view);
        this.e = dh0Var;
        dh0Var.d(null, true, false);
        dh0Var.v = 650.0f;
        dh0Var.e(false, 0.69f);
        dh0Var.p.setStrokeWidth(g0.L(1.5f));
        this.f = new te.a(view, xq.h, 260L);
        i6 i6Var = new i6(true, false, false);
        this.d = i6Var;
        i6Var.x(g0.o());
        i6Var.w(g0.L(13.0f));
        i6Var.b = 17;
        int w02 = k6.w0(k6.i6, f6Var);
        if (this.b != w02) {
            k6.H1(this.a, w02, false);
            this.b = w02;
        }
    }

    @Override // uh.c
    public final void a(int i7) {
        this.a.setAlpha(i7);
        this.d.B = i7;
    }

    public final float b() {
        return this.f.e;
    }

    public final void c(int i7) {
        this.d.u(i7);
        this.e.o = i7;
    }

    public final void d(float f10) {
        if (this.h != f10) {
            this.h = f10;
            Rect bounds = getBounds();
            int i7 = (int) this.h;
            this.d.setBounds(bounds.left, bounds.top + i7, bounds.right, bounds.bottom + i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f10 = this.f.e;
        if (f10 < 1.0f) {
            s.b(canvas, this.d, 1.0f - f10);
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

    @Override // uh.c, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect bounds = getBounds();
        int i7 = (int) this.h;
        this.d.setBounds(bounds.left, bounds.top + i7, bounds.right, bounds.bottom + i7);
        int L = g0.L(11.0f);
        int centerX = rect.centerX();
        int centerY = rect.centerY();
        this.e.f(centerX - L, centerY - L, centerX + L, centerY + L);
    }
}
