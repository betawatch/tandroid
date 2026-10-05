package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f11;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class z3 {
    public final float a;
    public final f11 b;
    public final f11 c;

    public z3(float f7, String str, CharSequence charSequence) {
        this.b = new f11(str, 12.0f, null);
        this.c = new f11(charSequence, 12.0f, AndroidUtilities.bold());
        this.a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.b.j(), this.c.j());
    }
}
