package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.v01;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final class y3 {
    public final float a;
    public final v01 b;
    public final v01 c;

    public y3(float f7, String str, CharSequence charSequence) {
        this.b = new v01(str, 12.0f, null);
        this.c = new v01(charSequence, 12.0f, AndroidUtilities.bold());
        this.a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.b.j(), this.c.j());
    }
}
