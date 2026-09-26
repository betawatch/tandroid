package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.t01;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
