// default package

import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ws8 {
    public final long a;
    public final TLRPC.Document b;
    public final long c;
    public final int d;
    public final String e;
    public yxa f;
    public RadialGradient h;
    public Paint i;
    public vm j;
    public ln k;
    public final u51 m;
    public int g = -1;
    public final RectF l = new RectF();

    public ws8(xs8 xs8Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.m = new u51(xs8Var);
        this.a = tL_starGiftUnique.id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.b = document;
        this.c = document == null ? 0L : document.id;
        this.d = ((TL_stars.starGiftAttributeBackdrop) jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.e = tL_starGiftUnique.slug;
        this.f = new yxa(1, 6);
        float L = gm.L(36.0f);
        float f = (-L) / 2.0f;
        float f2 = L / 2.0f;
        this.f.c.set(f, f, f2, f2);
    }
}
