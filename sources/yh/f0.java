package yh;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class f0 {
    public final long a;
    public final TLRPC.Document b;
    public final long c;
    public final int d;
    public final String e;
    public j8 f;
    public int g = -1;
    public RadialGradient h;
    public Paint i;
    public org.telegram.ui.Components.o5 j;
    public org.telegram.ui.Components.c6 k;
    public final RectF l;
    public final wc m;

    public f0(g0 g0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        new Matrix();
        this.l = new RectF();
        this.m = new wc(g0Var);
        this.a = tL_starGiftUnique.id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.b = document;
        this.c = document == null ? 0L : document.id;
        this.d = ((TL_stars.starGiftAttributeBackdrop) u5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.e = tL_starGiftUnique.slug;
        this.f = new j8(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f.c.set(f7, f7, f10, f10);
    }
}
