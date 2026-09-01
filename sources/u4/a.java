package u4;

import android.net.Uri;
import android.os.SystemClock;
import g5.g0;
import h5.d0;
import java.util.HashMap;
import java.util.List;
import p2.v;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class a implements q {
    public final /* synthetic */ c a;

    public a(c cVar) {
        this.a = cVar;
    }

    @Override // u4.q
    public final void a() {
        this.a.e.remove(this);
    }

    @Override // u4.q
    public final boolean c(Uri uri, v vVar, boolean z4) {
        b bVar;
        c cVar = this.a;
        HashMap hashMap = cVar.d;
        if (cVar.w == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            l lVar = cVar.s;
            int i10 = d0.a;
            List list = lVar.e;
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                b bVar2 = (b) hashMap.get(((k) list.get(i12)).a);
                if (bVar2 != null && elapsedRealtime < bVar2.n) {
                    i11++;
                }
            }
            g0 g0Var = new g0(1, 0, cVar.s.e.size(), i11);
            cVar.c.getClass();
            c4.e m32 = ab.a.m3(g0Var, vVar);
            if (m32 != null && m32.a == 2 && (bVar = (b) hashMap.get(uri)) != null) {
                b.a(bVar, m32.b);
            }
        }
        return false;
    }
}
