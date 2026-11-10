package th;

import a8.wa;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import bg.s;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class e extends sh.d implements Drawable.Callback, te.b {
    public final String b;
    public final Drawable d;
    public final cp f;
    public bi h;
    public TLRPC.WebPage n;
    public final te.a r;
    public final te.a s;
    public final wa c = new wa((char) 0, 18);
    public final Paint e = new Paint(1);

    public e(String str) {
        cp cpVar = new cp(-1);
        this.f = cpVar;
        wq wqVar = wq.h;
        this.r = new te.a(0, this, wqVar, 320L, false);
        this.s = new te.a(0, this, wqVar, 320L, false);
        this.b = str;
        this.a.J0(g0.L(7.0f));
        this.d = jg.g.h(t0.b, R.drawable.media_link_24);
        cpVar.setCallback(this);
        cpVar.b(m6.x0(null, m6.o7, false));
        cpVar.a = g0.L(15.0f);
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        bi biVar = this.h;
        if (biVar != null) {
            biVar.invalidate();
        }
    }

    @Override // sh.d
    public final void a(View view) {
        super.a(view);
        this.h = (bi) view;
    }

    @Override // sh.d
    public final void b() {
        super.b();
        this.h = null;
    }

    @Override // sh.d
    public final void c(Canvas canvas, int i7, int i10) {
        float f10 = i7;
        float f11 = i10;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.y0(0.0f, 0.0f, f10, f11);
        imageReceiver.h(canvas, null);
        cp cpVar = this.f;
        cpVar.setBounds(0, 0, i7, i10);
        int x02 = m6.x0(null, m6.a7, false);
        te.a aVar = this.s;
        int f12 = i0.a.f(aVar.e, x02, TLObject.FLAG_30);
        Paint paint = this.e;
        paint.setColor(f12);
        canvas.drawRoundRect(0.0f, 0.0f, f10, f11, g0.L(7.0f), g0.L(7.0f), paint);
        int f13 = i0.a.f(aVar.e, m6.x0(null, m6.o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        wa waVar = this.c;
        waVar.getClass();
        if (((PorterDuffColorFilter) waVar.c) == null || waVar.b != f13 || ((PorterDuff.Mode) waVar.d) != mode) {
            waVar.c = new PorterDuffColorFilter(f13, mode);
            waVar.b = f13;
            waVar.d = mode;
        }
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) waVar.c;
        Drawable drawable = this.d;
        drawable.setColorFilter(porterDuffColorFilter);
        s.e(this.d, f10 / 2.0f, f11 / 2.0f, g0.L(24.0f), g0.L(24.0f), 17);
        te.a aVar2 = this.r;
        s.b(canvas, drawable, 1.0f - aVar2.e);
        s.b(canvas, cpVar, aVar2.e);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        bi biVar = this.h;
        if (biVar != null) {
            biVar.invalidate();
        }
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
    }
}
