package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h01;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class b4 {
    public final float a;
    public final h01 b;
    public final h01 c;

    public b4(float f7, String str, CharSequence charSequence) {
        this.b = new h01(str, 12.0f, null);
        this.c = new h01(charSequence, 12.0f, AndroidUtilities.bold());
        this.a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.b.j(), this.c.j());
    }
}
