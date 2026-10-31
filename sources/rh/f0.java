package rh;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.dc;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f0 {
    public final long a;
    public final TLRPC.Document b;
    public final long c;
    public final int d;
    public final String e;
    public s8 f;
    public int g = -1;
    public RadialGradient h;
    public Paint i;
    public org.telegram.ui.Components.f5 j;
    public org.telegram.ui.Components.t5 k;
    public final RectF l;
    public final dc m;

    public f0(g0 g0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        new Matrix();
        this.l = new RectF();
        this.m = new dc(g0Var);
        this.a = tL_starGiftUnique.id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.b = document;
        this.c = document == null ? 0L : document.id;
        this.d = ((TL_stars.starGiftAttributeBackdrop) e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.e = tL_starGiftUnique.slug;
        this.f = new s8(1, 6);
        float L = org.telegram.messenger.i0.L(36.0f);
        float f7 = (-L) / 2.0f;
        float f10 = L / 2.0f;
        this.f.c.set(f7, f7, f10, f10);
    }
}
