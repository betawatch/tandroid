package xh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.t01;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
