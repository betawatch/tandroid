package p2;

import android.net.Uri;
import android.os.SystemClock;
import c5.b0;
import e2.d0;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class a implements u {
    public final /* synthetic */ d a;

    public a(d dVar) {
        this.a = dVar;
    }

    @Override // p2.u
    public final void a() {
        this.a.e.remove(this);
    }

    @Override // p2.u
    public final boolean b(Uri uri, b0 b0Var, boolean z10) {
        c cVar;
        d dVar = this.a;
        HashMap hashMap = dVar.d;
        if (dVar.w == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            p pVar = dVar.s;
            String str = d0.a;
            List list = pVar.e;
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                c cVar2 = (c) hashMap.get(((o) list.get(i11)).a);
                if (cVar2 != null && elapsedRealtime < cVar2.n) {
                    i10++;
                }
            }
            y2.g gVar = new y2.g(1, 0, dVar.s.e.size(), i10);
            dVar.c.getClass();
            k4.d K3 = qb.b.K3(gVar, b0Var);
            if (K3 != null && K3.a == 2 && (cVar = (c) hashMap.get(uri)) != null) {
                c.a(cVar, K3.b);
            }
        }
        return false;
    }
}
