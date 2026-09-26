package p2;

import android.net.Uri;
import android.os.SystemClock;
import c5.b0;
import e2.d0;
import java.util.HashMap;
import java.util.List;
import ki.w;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class a implements t {
    public final /* synthetic */ c a;

    public a(c cVar) {
        this.a = cVar;
    }

    @Override // p2.t
    public final void a() {
        this.a.e.remove(this);
    }

    @Override // p2.t
    public final boolean b(Uri uri, b0 b0Var, boolean z10) {
        b bVar;
        c cVar = this.a;
        HashMap hashMap = cVar.d;
        if (cVar.w == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            o oVar = cVar.s;
            String str = d0.a;
            List list = oVar.e;
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                b bVar2 = (b) hashMap.get(((n) list.get(i11)).a);
                if (bVar2 != null && elapsedRealtime < bVar2.n) {
                    i10++;
                }
            }
            w wVar = new w(1, 0, cVar.s.e.size(), i10);
            cVar.c.getClass();
            k4.d K3 = qb.b.K3(wVar, b0Var);
            if (K3 != null && K3.a == 2 && (bVar = (b) hashMap.get(uri)) != null) {
                b.a(bVar, K3.b);
            }
        }
        return false;
    }
}
