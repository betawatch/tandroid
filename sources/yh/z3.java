package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.v01;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class z3 {
    public final float a;
    public final v01 b;
    public final v01 c;

    public z3(float f7, String str, CharSequence charSequence) {
        this.b = new v01(str, 12.0f, null);
        this.c = new v01(charSequence, 12.0f, AndroidUtilities.bold());
        this.a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.b.j(), this.c.j());
    }
}
