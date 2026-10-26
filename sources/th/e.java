package th;

import a8.ng;
import ag.v;
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
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gq;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class e extends sh.e implements Drawable.Callback, oe.d {
    public final String b;
    public final Drawable d;
    public final gq f;
    public sh.d h;
    public TLRPC.WebPage n;
    public final oe.b r;
    public final oe.b s;
    public final ng c = new ng((char) 0, 17);
    public final Paint e = new Paint(1);

    public e(String str) {
        gq gqVar = new gq(-1);
        this.f = gqVar;
        ds dsVar = ds.h;
        this.r = new oe.b(0, this, dsVar, 320L, false);
        this.s = new oe.b(0, this, dsVar, 320L, false);
        this.b = str;
        this.a.setRoundRadius(AndroidUtilities.dp(7.0f));
        this.d = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
        gqVar.setCallback(this);
        gqVar.b(y6.x0(null, y6.o7, false));
        gqVar.a = AndroidUtilities.dp(15.0f);
    }

    @Override // oe.d
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        sh.d dVar = this.h;
        if (dVar != null) {
            dVar.invalidate();
        }
    }

    @Override // sh.e
    public final void a(View view) {
        super.a(view);
        this.h = (sh.d) view;
    }

    @Override // sh.e
    public final void b() {
        super.b();
        this.h = null;
    }

    @Override // sh.e
    public final void c(Canvas canvas, int i10, int i11) {
        float f7 = i10;
        float f10 = i11;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.setImageCoords(0.0f, 0.0f, f7, f10);
        imageReceiver.draw(canvas);
        gq gqVar = this.f;
        gqVar.setBounds(0, 0, i10, i11);
        int x02 = y6.x0(null, y6.a7, false);
        oe.b bVar = this.s;
        int f11 = i0.a.f(bVar.e, x02, TLObject.FLAG_30);
        Paint paint = this.e;
        paint.setColor(f11);
        canvas.drawRoundRect(0.0f, 0.0f, f7, f10, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), paint);
        int f12 = i0.a.f(bVar.e, y6.x0(null, y6.o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ng ngVar = this.c;
        ngVar.getClass();
        if (((PorterDuffColorFilter) ngVar.c) == null || ngVar.b != f12 || ((PorterDuff.Mode) ngVar.d) != mode) {
            ngVar.c = new PorterDuffColorFilter(f12, mode);
            ngVar.b = f12;
            ngVar.d = mode;
        }
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) ngVar.c;
        Drawable drawable = this.d;
        drawable.setColorFilter(porterDuffColorFilter);
        v.e(this.d, f7 / 2.0f, f10 / 2.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 17);
        oe.b bVar2 = this.r;
        v.b(canvas, drawable, 1.0f - bVar2.e);
        v.b(canvas, gqVar, bVar2.e);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        sh.d dVar = this.h;
        if (dVar != null) {
            dVar.invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // oe.d
    public final /* synthetic */ void z(float f7, int i10) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
    }
}
