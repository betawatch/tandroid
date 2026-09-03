package yf;

import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class h extends f {
    public final Paint q;
    public int r;
    public final g6 s;

    public h(xf.a aVar, g6 g6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.q = paint;
        this.r = 0;
        this.s = g6Var;
        this.c.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.c.setAntiAlias(false);
    }

    @Override // yf.f
    public final void a() {
        super.a();
        this.r = i0.a.d(0.3f, k6.v0(k6.d6, this.s), this.m);
    }
}
