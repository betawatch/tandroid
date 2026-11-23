package th;

import a8.xa;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import bg.t;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.rp;
import org.telegram.ui.Components.si;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class e extends sh.c implements Drawable.Callback, te.b {
    public final String b;
    public final Drawable d;
    public final rp f;
    public si h;
    public TLRPC.WebPage n;
    public final te.a r;
    public final te.a s;
    public final xa c = new xa((char) 0, 18);
    public final Paint e = new Paint(1);

    public e(String str) {
        rp rpVar = new rp(-1);
        this.f = rpVar;
        kr krVar = kr.h;
        this.r = new te.a(0, this, krVar, 320L, false);
        this.s = new te.a(0, this, krVar, 320L, false);
        this.b = str;
        this.a.K0(g0.L(7.0f));
        this.d = i5.c.g(t0.b, R.drawable.media_link_24);
        rpVar.setCallback(this);
        rpVar.b(n6.x0(null, n6.o7, false));
        rpVar.a = g0.L(15.0f);
    }

    @Override // te.b
    public final void K(int i7, float f10, float f11, te.c cVar) {
        si siVar = this.h;
        if (siVar != null) {
            siVar.invalidate();
        }
    }

    @Override // sh.c
    public final void a(View view) {
        super.a(view);
        this.h = (si) view;
    }

    @Override // sh.c
    public final void b() {
        super.b();
        this.h = null;
    }

    @Override // sh.c
    public final void c(Canvas canvas, int i7, int i10) {
        float f10 = i7;
        float f11 = i10;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.z0(0.0f, 0.0f, f10, f11);
        imageReceiver.h(canvas, null);
        rp rpVar = this.f;
        rpVar.setBounds(0, 0, i7, i10);
        int x02 = n6.x0(null, n6.a7, false);
        te.a aVar = this.s;
        int f12 = i0.a.f(aVar.e, x02, TLObject.FLAG_30);
        Paint paint = this.e;
        paint.setColor(f12);
        canvas.drawRoundRect(0.0f, 0.0f, f10, f11, g0.L(7.0f), g0.L(7.0f), paint);
        int f13 = i0.a.f(aVar.e, n6.x0(null, n6.o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        xa xaVar = this.c;
        xaVar.getClass();
        if (((PorterDuffColorFilter) xaVar.c) == null || xaVar.b != f13 || ((PorterDuff.Mode) xaVar.d) != mode) {
            xaVar.c = new PorterDuffColorFilter(f13, mode);
            xaVar.b = f13;
            xaVar.d = mode;
        }
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) xaVar.c;
        Drawable drawable = this.d;
        drawable.setColorFilter(porterDuffColorFilter);
        t.e(this.d, f10 / 2.0f, f11 / 2.0f, g0.L(24.0f), g0.L(24.0f), 17);
        te.a aVar2 = this.r;
        t.b(canvas, drawable, 1.0f - aVar2.e);
        t.b(canvas, rpVar, aVar2.e);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        si siVar = this.h;
        if (siVar != null) {
            siVar.invalidate();
        }
    }

    @Override // te.b
    public final /* synthetic */ void G(float f10, int i7) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
    }
}
