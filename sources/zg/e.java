package zg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import ff.s;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jp;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e extends yg.e implements Drawable.Callback, td.b {
    public final String b;
    public final Drawable d;
    public final jp f;
    public yg.d h;
    public TLRPC.WebPage n;
    public final td.a r;
    public final td.a s;
    public final a6.a c = new a6.a((char) 0, 19);
    public final Paint e = new Paint(1);

    public e(String str) {
        jp jpVar = new jp(-1);
        this.f = jpVar;
        gr grVar = gr.h;
        this.r = new td.a(0, this, grVar, 320L, false);
        this.s = new td.a(0, this, grVar, 320L, false);
        this.b = str;
        this.a.setRoundRadius(AndroidUtilities.dp(7.0f));
        this.d = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
        jpVar.setCallback(this);
        jpVar.b(f6.w0(null, f6.o7, false));
        jpVar.a = AndroidUtilities.dp(15.0f);
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        yg.d dVar = this.h;
        if (dVar != null) {
            dVar.invalidate();
        }
    }

    @Override // yg.e
    public final void a(View view) {
        super.a(view);
        this.h = (yg.d) view;
    }

    @Override // yg.e
    public final void b() {
        super.b();
        this.h = null;
    }

    @Override // yg.e
    public final void c(Canvas canvas, int i9, int i10) {
        float f10 = i9;
        float f11 = i10;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.setImageCoords(0.0f, 0.0f, f10, f11);
        imageReceiver.draw(canvas);
        jp jpVar = this.f;
        jpVar.setBounds(0, 0, i9, i10);
        int w02 = f6.w0(null, f6.a7, false);
        td.a aVar = this.s;
        int d = i0.a.d(aVar.e, w02, TLObject.FLAG_30);
        Paint paint = this.e;
        paint.setColor(d);
        canvas.drawRoundRect(0.0f, 0.0f, f10, f11, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), paint);
        int d9 = i0.a.d(aVar.e, f6.w0(null, f6.o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        a6.a aVar2 = this.c;
        aVar2.getClass();
        if (((PorterDuffColorFilter) aVar2.b) == null || aVar2.c != d9 || ((PorterDuff.Mode) aVar2.d) != mode) {
            aVar2.b = new PorterDuffColorFilter(d9, mode);
            aVar2.c = d9;
            aVar2.d = mode;
        }
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) aVar2.b;
        Drawable drawable = this.d;
        drawable.setColorFilter(porterDuffColorFilter);
        s.e(this.d, f10 / 2.0f, f11 / 2.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 17);
        td.a aVar3 = this.r;
        s.b(canvas, drawable, 1.0f - aVar3.e);
        s.b(canvas, jpVar, aVar3.e);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        yg.d dVar = this.h;
        if (dVar != null) {
            dVar.invalidate();
        }
    }

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
    }
}
