package r4;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.exoplayer2.upstream.j0;
import com.google.android.exoplayer2.upstream.k0;
import f5.d0;
import f7.v;
import java.util.HashMap;
import java.util.List;
import p2.u;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a implements r {
    public final /* synthetic */ c a;

    public a(c cVar) {
        this.a = cVar;
    }

    @Override // r4.r
    public final void a() {
        this.a.e.remove(this);
    }

    @Override // r4.r
    public final boolean c(Uri uri, u uVar, boolean z10) {
        b bVar;
        c cVar = this.a;
        HashMap hashMap = cVar.d;
        if (cVar.w == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            m mVar = cVar.s;
            int i10 = d0.a;
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
            k0 z11 = v.z(j0Var, uVar);
            if (z11 != null && z11.a == 2 && (bVar = (b) hashMap.get(uri)) != null) {
                b.a(bVar, z11.b);
            }
        }
        return false;
    }
}
