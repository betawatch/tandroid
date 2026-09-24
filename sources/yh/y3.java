package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.t01;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class y3 {
    public final float a;
    public final t01 b;
    public final t01 c;

    public y3(float f7, String str, CharSequence charSequence) {
        this.b = new t01(str, 12.0f, null);
        this.c = new t01(charSequence, 12.0f, AndroidUtilities.bold());
        this.a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.b.j(), this.c.j());
    }
}
