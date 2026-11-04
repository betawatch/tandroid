package uh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import b8.kg;
import cg.r;
import k2.p1;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e extends th.c implements Drawable.Callback, qe.b {
    public final String b;
    public final Drawable d;
    public final cp f;
    public ai h;
    public TLRPC.WebPage n;
    public final qe.a r;
    public final qe.a s;
    public final kg c = new kg((char) 0, 19);
    public final Paint e = new Paint(1);

    public e(String str) {
        cp cpVar = new cp(-1);
        this.f = cpVar;
        xq xqVar = xq.h;
        this.r = new qe.a(0, this, xqVar, 320L, false);
        this.s = new qe.a(0, this, xqVar, 320L, false);
        this.b = str;
        this.a.J0(g0.L(7.0f));
        this.d = p1.g(t0.b, R.drawable.media_link_24);
        cpVar.setCallback(this);
        cpVar.b(k6.x0(null, k6.o7, false));
        cpVar.a = g0.L(15.0f);
    }

    @Override // qe.b
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        ai aiVar = this.h;
        if (aiVar != null) {
            aiVar.invalidate();
        }
    }

    @Override // th.c
    public final void a(View view) {
        super.a(view);
        this.h = (ai) view;
    }

    @Override // th.c
    public final void b() {
        super.b();
        this.h = null;
    }

    @Override // th.c
    public final void c(Canvas canvas, int i3, int i10) {
        float f10 = i3;
        float f11 = i10;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.y0(0.0f, 0.0f, f10, f11);
        imageReceiver.h(canvas, null);
        cp cpVar = this.f;
        cpVar.setBounds(0, 0, i3, i10);
        int x02 = k6.x0(null, k6.a7, false);
        qe.a aVar = this.s;
        int f12 = i0.a.f(aVar.e, x02, TLObject.FLAG_30);
        Paint paint = this.e;
        paint.setColor(f12);
        canvas.drawRoundRect(0.0f, 0.0f, f10, f11, g0.L(7.0f), g0.L(7.0f), paint);
        int f13 = i0.a.f(aVar.e, k6.x0(null, k6.o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        kg kgVar = this.c;
        kgVar.getClass();
        if (((PorterDuffColorFilter) kgVar.c) == null || kgVar.b != f13 || ((PorterDuff.Mode) kgVar.d) != mode) {
            kgVar.c = new PorterDuffColorFilter(f13, mode);
            kgVar.b = f13;
            kgVar.d = mode;
        }
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) kgVar.c;
        Drawable drawable = this.d;
        drawable.setColorFilter(porterDuffColorFilter);
        r.e(this.d, f10 / 2.0f, f11 / 2.0f, g0.L(24.0f), g0.L(24.0f), 17);
        qe.a aVar2 = this.r;
        r.b(canvas, drawable, 1.0f - aVar2.e);
        r.b(canvas, cpVar, aVar2.e);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        ai aiVar = this.h;
        if (aiVar != null) {
            aiVar.invalidate();
        }
    }

    @Override // qe.b
    public final /* synthetic */ void F(float f10, int i3) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
    }
}
