package w7;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public abstract class l {
    public static g2.m a(m2.m mVar, String str, m2.j jVar, int i10) {
        Map map = Collections.EMPTY_MAP;
        Uri m10 = e2.a.m(str, jVar.c);
        long j3 = jVar.a;
        long j10 = jVar.b;
        String a2 = mVar.a();
        if (a2 == null) {
            a2 = e2.a.m(((m2.b) mVar.b.get(0)).a, jVar.c).toString();
        }
        String str2 = a2;
        e2.d.i(m10, "The uri must be set.");
        return new g2.m(m10, 1, null, e9.f1.h, j3, j10, str2, i10);
    }
}
