package uh;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import bg.t;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.qh0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class d extends c {
    public final m6 d;
    public final qh0 e;
    public final te.a f;
    public float h;

    public d(View view, i6 i6Var) {
        super(i6Var);
        qh0 qh0Var = new qh0(view);
        this.e = qh0Var;
        qh0Var.d(null, true, false);
        qh0Var.v = 650.0f;
        qh0Var.e(false, 0.69f);
        qh0Var.p.setStrokeWidth(g0.L(1.5f));
        this.f = new te.a(view, lr.h, 260L);
        m6 m6Var = new m6(true, false, false);
        this.d = m6Var;
        m6Var.x(g0.o());
        m6Var.w(g0.L(13.0f));
        m6Var.b = 17;
        int w02 = n6.w0(n6.i6, i6Var);
        if (this.b != w02) {
            n6.H1(this.a, w02, false);
            this.b = w02;
        }
    }

    @Override // uh.c
    public final void a(int i7) {
        this.a.setAlpha(i7);
        this.d.C = i7;
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
            t.b(canvas, this.d, 1.0f - f10);
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
