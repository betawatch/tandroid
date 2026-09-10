package p2;

import android.net.Uri;
import android.os.SystemClock;
import c5.b0;
import e2.d0;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
            y2.g gVar = new y2.g(1, 0, cVar.s.e.size(), i10);
            cVar.c.getClass();
            k4.d n32 = rb.a.n3(gVar, b0Var);
            if (n32 != null && n32.a == 2 && (bVar = (b) hashMap.get(uri)) != null) {
                b.a(bVar, n32.b);
            }
        }
        return false;
    }
}
