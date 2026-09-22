package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.w01;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class z3 {
    public final float a;
    public final w01 b;
    public final w01 c;

    public z3(float f7, String str, CharSequence charSequence) {
        this.b = new w01(str, 12.0f, null);
        this.c = new w01(charSequence, 12.0f, AndroidUtilities.bold());
        this.a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.b.j(), this.c.j());
    }
}
