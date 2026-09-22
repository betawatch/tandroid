package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g01;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class a4 {
    public final float a;
    public final g01 b;
    public final g01 c;

    public a4(float f7, String str, CharSequence charSequence) {
        this.b = new g01(str, 12.0f, null);
        this.c = new g01(charSequence, 12.0f, AndroidUtilities.bold());
        this.a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.b.j(), this.c.j());
    }
}
