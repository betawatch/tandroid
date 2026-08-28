package p4;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.exoplayer2.upstream.j0;
import com.google.android.exoplayer2.upstream.k0;
import d5.f0;
import java.util.HashMap;
import java.util.List;
import n2.w;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public final boolean c(Uri uri, w wVar, boolean z10) {
        b bVar;
        c cVar = this.a;
        HashMap hashMap = cVar.d;
        if (cVar.w == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            m mVar = cVar.s;
            int i9 = f0.a;
            List list = mVar.e;
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                b bVar2 = (b) hashMap.get(((l) list.get(i11)).a);
                if (bVar2 != null && elapsedRealtime < bVar2.n) {
                    i10++;
                }
            }
            j0 j0Var = new j0(1, 0, cVar.s.e.size(), i10);
            cVar.c.getClass();
            k0 k32 = v9.d.k3(j0Var, wVar);
            if (k32 != null && k32.a == 2 && (bVar = (b) hashMap.get(uri)) != null) {
                b.a(bVar, k32.b);
            }
        }
        return false;
    }
}
