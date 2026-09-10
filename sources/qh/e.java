package qh;

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
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.zp;
import xf.p;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class e extends ph.e implements Drawable.Callback, le.d {
    public final String b;
    public final Drawable d;
    public final zp f;
    public ph.d h;
    public TLRPC.WebPage n;
    public final le.b r;
    public final le.b s;
    public final a5.a c = new a5.a((char) 0, 15);
    public final Paint e = new Paint(1);

    public e(String str) {
        zp zpVar = new zp(-1);
        this.f = zpVar;
        wr wrVar = wr.h;
        this.r = new le.b(0, this, wrVar, 320L, false);
        this.s = new le.b(0, this, wrVar, 320L, false);
        this.b = str;
        this.a.setRoundRadius(AndroidUtilities.dp(7.0f));
        this.d = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
        zpVar.setCallback(this);
        zpVar.b(j6.w0(null, j6.o7, false));
        zpVar.a = AndroidUtilities.dp(15.0f);
    }

    @Override // le.d
    public final void G(int i10, float f7, float f10, le.e eVar) {
        ph.d dVar = this.h;
        if (dVar != null) {
            dVar.invalidate();
        }
    }

    @Override // ph.e
    public final void a(View view) {
        super.a(view);
        this.h = (ph.d) view;
    }

    @Override // ph.e
    public final void b() {
        super.b();
        this.h = null;
    }

    @Override // ph.e
    public final void c(Canvas canvas, int i10, int i11) {
        float f7 = i10;
        float f10 = i11;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.setImageCoords(0.0f, 0.0f, f7, f10);
        imageReceiver.draw(canvas);
        zp zpVar = this.f;
        zpVar.setBounds(0, 0, i10, i11);
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
        p.b(canvas, zpVar, bVar2.e);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        ph.d dVar = this.h;
        if (dVar != null) {
            dVar.invalidate();
        }
    }

    @Override // le.d
    public final /* synthetic */ void B(float f7, int i10) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
    }
}
