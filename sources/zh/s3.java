package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h11;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class s3 {
    public final float a;
    public final h11 b;
    public final h11 c;

    public s3(float f7, String str, CharSequence charSequence) {
        this.b = new h11(str, 12.0f, null);
        this.c = new h11(charSequence, 12.0f, AndroidUtilities.bold());
        this.a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.b.j(), this.c.j());
    }
}
