package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f01;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class z3 {
    public final float a;
    public final f01 b;
    public final f01 c;

    public z3(float f7, String str, CharSequence charSequence) {
        this.b = new f01(str, 12.0f, null);
        this.c = new f01(charSequence, 12.0f, AndroidUtilities.bold());
        this.a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.b.j(), this.c.j());
    }
}
