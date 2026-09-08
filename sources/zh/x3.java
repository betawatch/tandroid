package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f01;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class x3 {
    public final float a;
    public final f01 b;
    public final f01 c;

    public x3(float f7, String str, CharSequence charSequence) {
        this.b = new f01(str, 12.0f, null);
        this.c = new f01(charSequence, 12.0f, AndroidUtilities.bold());
        this.a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.b.j(), this.c.j());
    }
}
