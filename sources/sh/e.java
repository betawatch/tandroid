package sh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sp;
import yf.p;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class e extends rh.e implements Drawable.Callback, le.d {
    public final String b;
    public final Drawable d;
    public final sp f;
    public rh.d h;
    public TLRPC.WebPage n;
    public final le.b r;
    public final le.b s;
    public final a5.a c = new a5.a((char) 0, 14);
    public final Paint e = new Paint(1);

    public e(String str) {
        sp spVar = new sp(-1);
        this.f = spVar;
        pr prVar = pr.h;
        this.r = new le.b(0, this, prVar, 320L, false);
        this.s = new le.b(0, this, prVar, 320L, false);
        this.b = str;
        this.a.setRoundRadius(AndroidUtilities.dp(7.0f));
        this.d = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
        spVar.setCallback(this);
        spVar.b(j6.w0(null, j6.o7, false));
        spVar.a = AndroidUtilities.dp(15.0f);
    }

    @Override // le.d
    public final void E(int i10, float f7, float f10, le.e eVar) {
        rh.d dVar = this.h;
        if (dVar != null) {
            dVar.invalidate();
        }
    }

    @Override // rh.e
    public final void a(View view) {
        super.a(view);
        this.h = (rh.d) view;
    }

    @Override // rh.e
    public final void b() {
        super.b();
        this.h = null;
    }

    @Override // rh.e
    public final void c(Canvas canvas, int i10, int i11) {
        float f7 = i10;
        float f10 = i11;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.setImageCoords(0.0f, 0.0f, f7, f10);
        imageReceiver.draw(canvas);
        sp spVar = this.f;
        spVar.setBounds(0, 0, i10, i11);
        int w02 = j6.w0(null, j6.a7, false);
        le.b bVar = this.s;
        int d = i0.a.d(bVar.e, w02, TLObject.FLAG_30);
        Paint paint = this.e;
        paint.setColor(d);
        canvas.drawRoundRect(0.0f, 0.0f, f7, f10, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), paint);
        int d10 = i0.a.d(bVar.e, j6.w0(null, j6.o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        a5.a aVar = this.c;
        aVar.getClass();
        if (((PorterDuffColorFilter) aVar.c) == null || aVar.b != d10 || ((PorterDuff.Mode) aVar.d) != mode) {
            aVar.c = new PorterDuffColorFilter(d10, mode);
            aVar.b = d10;
            aVar.d = mode;
        }
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) aVar.c;
        Drawable drawable = this.d;
        drawable.setColorFilter(porterDuffColorFilter);
        p.e(this.d, f7 / 2.0f, f10 / 2.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 17);
        le.b bVar2 = this.r;
        p.b(canvas, drawable, 1.0f - bVar2.e);
        p.b(canvas, spVar, bVar2.e);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        rh.d dVar = this.h;
        if (dVar != null) {
            dVar.invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // le.d
    public final /* synthetic */ void z(float f7, int i10) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
    }
}
