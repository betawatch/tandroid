package w7;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class k {
    public static g2.m a(m2.m mVar, String str, m2.j jVar, int i10) {
        Map map = Collections.EMPTY_MAP;
        Uri m10 = e2.a.m(str, jVar.c);
        long j3 = jVar.a;
        long j10 = jVar.b;
        String b10 = mVar.b();
        if (b10 == null) {
            b10 = e2.a.m(((m2.b) mVar.b.get(0)).a, jVar.c).toString();
        }
        String str2 = b10;
        e2.d.i(m10, "The uri must be set.");
        return new g2.m(m10, 1, null, e9.f1.h, j3, j10, str2, i10);
    }
}
