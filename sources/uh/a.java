package uh;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import bg.s;
import jg.g;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class a extends c implements te.b {
    public final te.a d;
    public final int[] e;
    public final Drawable f;
    public final TextPaint h;
    public StaticLayout n;
    public int r;
    public int s;

    public a(Context context, h6 h6Var) {
        super(h6Var);
        this.d = new te.a(0, this, wq.h, 320L, false);
        this.e = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        this.f = g.h(context, org.telegram.messenger.beta.R.drawable.outline_poll_add_24);
        this.h = new TextPaint(m6.P2);
        int w02 = m6.w0(m6.i6, h6Var);
        if (this.b != w02) {
            m6.H1(this.a, w02, false);
            this.b = w02;
        }
        b();
        c();
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        b();
        c();
        invalidateSelf();
    }

    @Override // uh.c
    public final void a(int i7) {
        this.a.setAlpha(i7);
        b();
        c();
    }

    public final void b() {
        this.f.setAlpha((int) ((1.0f - this.d.e) * this.c));
    }

    public final void c() {
        this.h.setAlpha((int) ((1.0f - this.d.e) * this.c));
    }

    public final void d(boolean z9, boolean z10) {
        this.d.a(z9, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.a.draw(canvas);
        s.b(canvas, this.f, 1.0f - this.d.e);
        if (this.n != null) {
            canvas.save();
            canvas.translate(g0.L(44.0f) + bounds.left, g0.L(13.66f) + bounds.top);
            this.n.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(int i7) {
        if (this.s != i7) {
            this.s = i7;
            this.h.setColor(i7);
            this.f.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
            c();
        }
    }

    @Override // uh.c, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float exactCenterY = rect.exactCenterY();
        float L = g0.L(22.33f) + rect.left;
        g0.L(27.0f);
        g0.L(44.0f);
        s.d(this.f, L, exactCenterY, 17);
        int width = rect.width() - g0.L(56.0f);
        if (this.n == null || this.r != width) {
            this.r = width;
            this.n = new StaticLayout(id.M0(2131747184, null), this.h, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}
