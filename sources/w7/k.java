package w7;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class k {
    public static g2.n a(m2.m mVar, String str, m2.j jVar, int i10) {
        Map map = Collections.EMPTY_MAP;
        Uri g10 = e2.e.g(str, jVar.c);
        long j10 = jVar.a;
        long j11 = jVar.b;
        String b10 = mVar.b();
        if (b10 == null) {
            b10 = e2.e.g(((m2.b) mVar.b.get(0)).a, jVar.c).toString();
        }
        String str2 = b10;
        v7.t6.l(g10, "The uri must be set.");
        return new g2.n(g10, 1, null, e9.c2.h, j10, j11, str2, i10);
    }
}
