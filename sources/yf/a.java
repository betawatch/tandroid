package yf;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class a extends f {
    public final g6 q;
    public final Paint r;
    public int s;

    public a(xf.a aVar, g6 g6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.r = paint;
        this.s = 0;
        this.q = g6Var;
        Paint paint2 = this.c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.c.setAntiAlias(false);
    }

    @Override // yf.f
    public final void a() {
        super.a();
        this.s = i0.a.d(0.3f, k6.v0(k6.d6, this.q), this.m);
    }
}
