package w7;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public abstract class l {
    public static g2.m a(m2.m mVar, String str, m2.j jVar, int i10) {
        Map map = Collections.EMPTY_MAP;
        Uri g10 = e2.e.g(str, jVar.c);
        long j10 = jVar.a;
        long j11 = jVar.b;
        String a2 = mVar.a();
        if (a2 == null) {
            a2 = e2.e.g(((m2.b) mVar.b.get(0)).a, jVar.c).toString();
        }
        String str2 = a2;
        v7.u6.l(g10, "The uri must be set.");
        return new g2.m(g10, 1, null, e9.c2.h, j10, j11, str2, i10);
    }
}
