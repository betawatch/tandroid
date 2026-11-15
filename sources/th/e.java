package th;

import a8.xa;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.lp;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class e extends sh.c implements Drawable.Callback, te.b {
    public final String b;
    public final Drawable d;
    public final lp f;
    public ji h;
    public TLRPC.WebPage n;
    public final te.a r;
    public final te.a s;
    public final xa c = new xa((char) 0, 18);
    public final Paint e = new Paint(1);

    public e(String str) {
        lp lpVar = new lp(-1);
        this.f = lpVar;
        er erVar = er.h;
        this.r = new te.a(0, this, erVar, 320L, false);
        this.s = new te.a(0, this, erVar, 320L, false);
        this.b = str;
        this.a.J0(g0.L(7.0f));
        this.d = i5.c.g(t0.b, R.drawable.media_link_24);
        lpVar.setCallback(this);
        lpVar.b(j6.x0(null, j6.o7, false));
        lpVar.a = g0.L(15.0f);
    }

    @Override // te.b
    public final void G(int i7, float f10, float f11, te.c cVar) {
        ji jiVar = this.h;
        if (jiVar != null) {
            jiVar.invalidate();
        }
    }

    @Override // sh.c
    public final void a(View view) {
        super.a(view);
        this.h = (ji) view;
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
        imageReceiver.y0(0.0f, 0.0f, f10, f11);
        imageReceiver.h(canvas, null);
        lp lpVar = this.f;
        lpVar.setBounds(0, 0, i7, i10);
        int x02 = j6.x0(null, j6.a7, false);
        te.a aVar = this.s;
        int f12 = i0.a.f(aVar.e, x02, TLObject.FLAG_30);
        Paint paint = this.e;
        paint.setColor(f12);
        canvas.drawRoundRect(0.0f, 0.0f, f10, f11, g0.L(7.0f), g0.L(7.0f), paint);
        int f13 = i0.a.f(aVar.e, j6.x0(null, j6.o7, false), -1);
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
        s.e(this.d, f10 / 2.0f, f11 / 2.0f, g0.L(24.0f), g0.L(24.0f), 17);
        te.a aVar2 = this.r;
        s.b(canvas, drawable, 1.0f - aVar2.e);
        s.b(canvas, lpVar, aVar2.e);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        ji jiVar = this.h;
        if (jiVar != null) {
            jiVar.invalidate();
        }
    }

    @Override // te.b
    public final /* synthetic */ void E(float f10, int i7) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
    }
}
