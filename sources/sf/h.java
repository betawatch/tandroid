package sf;

import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h extends f {
    public final Paint q;
    public int r;
    public final b6 s;

    public h(rf.a aVar, b6 b6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.q = paint;
        this.r = 0;
        this.s = b6Var;
        this.c.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.c.setAntiAlias(false);
    }

    @Override // sf.f
    public final void a() {
        super.a();
        this.r = i0.a.d(0.3f, f6.v0(f6.d6, this.s), this.m);
    }
}
