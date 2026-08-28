package sf;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a extends f {
    public final b6 q;
    public final Paint r;
    public int s;

    public a(rf.a aVar, b6 b6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.r = paint;
        this.s = 0;
        this.q = b6Var;
        Paint paint2 = this.c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.c.setAntiAlias(false);
    }

    @Override // sf.f
    public final void a() {
        super.a();
        this.s = i0.a.d(0.3f, f6.v0(f6.d6, this.q), this.m);
    }
}
