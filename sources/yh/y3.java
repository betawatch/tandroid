package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.v01;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
