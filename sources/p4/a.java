package p4;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.exoplayer2.upstream.j0;
import com.google.android.exoplayer2.upstream.k0;
import d5.g0;
import java.util.HashMap;
import java.util.List;
import n2.v;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a implements r {
    public final /* synthetic */ c a;

    public a(c cVar) {
        this.a = cVar;
    }

    @Override // p4.r
    public final void a() {
        this.a.e.remove(this);
    }

    @Override // p4.r
    public final boolean c(Uri uri, v vVar, boolean z10) {
        b bVar;
        c cVar = this.a;
        HashMap hashMap = cVar.d;
        if (cVar.w == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            m mVar = cVar.s;
            int i10 = g0.a;
            List list = mVar.e;
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                b bVar2 = (b) hashMap.get(((l) list.get(i12)).a);
                if (bVar2 != null && elapsedRealtime < bVar2.n) {
                    i11++;
                }
            }
            j0 j0Var = new j0(1, 0, cVar.s.e.size(), i11);
            cVar.c.getClass();
            k0 x32 = ab.a.x3(j0Var, vVar);
            if (x32 != null && x32.a == 2 && (bVar = (b) hashMap.get(uri)) != null) {
                b.a(bVar, x32.b);
            }
        }
        return false;
    }
}
