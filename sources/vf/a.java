package vf;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a extends f {
    public final c6 q;
    public final Paint r;
    public int s;

    public a(uf.a aVar, c6 c6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.r = paint;
        this.s = 0;
        this.q = c6Var;
        Paint paint2 = this.c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.c.setAntiAlias(false);
    }

    @Override // vf.f
    public final void a() {
        super.a();
        this.s = i0.a.d(0.3f, g6.v0(g6.d6, this.q), this.m);
    }
}
