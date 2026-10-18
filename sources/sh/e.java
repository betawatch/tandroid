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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.dq;
import zf.p;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class e extends rh.e implements Drawable.Callback, ne.d {
    public final String b;
    public final Drawable d;
    public final dq f;
    public rh.d h;
    public TLRPC.WebPage n;
    public final ne.b r;
    public final ne.b s;
    public final a5.a c = new a5.a((char) 0, 15);
    public final Paint e = new Paint(1);

    public e(String str) {
        dq dqVar = new dq(-1);
        this.f = dqVar;
        bs bsVar = bs.h;
        this.r = new ne.b(0, this, bsVar, 320L, false);
        this.s = new ne.b(0, this, bsVar, 320L, false);
        this.b = str;
        this.a.setRoundRadius(AndroidUtilities.dp(7.0f));
        this.d = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
        dqVar.setCallback(this);
        dqVar.b(h6.x0(null, h6.o7, false));
        dqVar.a = AndroidUtilities.dp(15.0f);
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
        dq dqVar = this.f;
        dqVar.setBounds(0, 0, i10, i11);
        int x02 = h6.x0(null, h6.a7, false);
        ne.b bVar = this.s;
        int f11 = i0.a.f(bVar.e, x02, TLObject.FLAG_30);
        Paint paint = this.e;
        paint.setColor(f11);
        canvas.drawRoundRect(0.0f, 0.0f, f7, f10, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), paint);
        int f12 = i0.a.f(bVar.e, h6.x0(null, h6.o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        a5.a aVar = this.c;
        aVar.getClass();
        if (((PorterDuffColorFilter) aVar.c) == null || aVar.b != f12 || ((PorterDuff.Mode) aVar.d) != mode) {
            aVar.c = new PorterDuffColorFilter(f12, mode);
            aVar.b = f12;
            aVar.d = mode;
        }
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) aVar.c;
        Drawable drawable = this.d;
        drawable.setColorFilter(porterDuffColorFilter);
        p.e(this.d, f7 / 2.0f, f10 / 2.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 17);
        ne.b bVar2 = this.r;
        p.b(canvas, drawable, 1.0f - bVar2.e);
        p.b(canvas, dqVar, bVar2.e);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        rh.d dVar = this.h;
        if (dVar != null) {
            dVar.invalidate();
        }
    }

    @Override // ne.d
    public final void u(int i10, float f7, float f10, ne.e eVar) {
        rh.d dVar = this.h;
        if (dVar != null) {
            dVar.invalidate();
        }
    }

    @Override // ne.d
    public final /* synthetic */ void E(float f7, int i10) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
    }
}
