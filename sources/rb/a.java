package rb;

import n6.l;
import o1.i;
import qb.c;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class a extends c {
    public static final a b;

    static {
        i iVar = new i();
        iVar.a = -1.0f;
        boolean z10 = false;
        if (Float.compare(0.5f, 0.0f) >= 0 && Float.compare(0.5f, 1.0f) <= 0) {
            z10 = true;
        }
        l.a("Confidence Threshold should be in range [0.0f, 1.0f].", z10);
        iVar.a = 0.5f;
        b = new a(iVar);
    }
}
