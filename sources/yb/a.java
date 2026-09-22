package yb;

import n6.l;
import o1.j;
import xb.c;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class a extends c {
    public static final a b;

    static {
        j jVar = new j();
        jVar.a = -1.0f;
        boolean z10 = false;
        if (Float.compare(0.5f, 0.0f) >= 0 && Float.compare(0.5f, 1.0f) <= 0) {
            z10 = true;
        }
        l.a("Confidence Threshold should be in range [0.0f, 1.0f].", z10);
        jVar.a = 0.5f;
        b = new a(jVar);
    }
}
