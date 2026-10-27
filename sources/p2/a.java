package p2;

import android.net.Uri;
import android.os.SystemClock;
import d5.z;
import f9.g0;
import f9.g2;
import f9.t0;
import java.util.HashMap;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
    public final boolean d(Uri uri, z zVar, boolean z10) {
        c cVar;
        d dVar = this.a;
        HashMap hashMap = dVar.d;
        if (dVar.G == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c cVar2 = (c) hashMap.get(uri);
            cVar2.getClass();
            w wVar = cVar2.a;
            int size = wVar.b.size();
            g2 it = t0.u(wVar.b.values()).iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Uri uri2 = (Uri) it.next();
                c cVar3 = (c) hashMap.get(uri2);
                if (cVar3 != null) {
                    b bVar = (b) ic.a.h(cVar3.b, uri2, uri2);
                    bVar.getClass();
                    if (elapsedRealtime <= bVar.r) {
                        i10++;
                    }
                }
            }
            int size2 = dVar.w.size();
            g0 listIterator = dVar.w.listIterator(0);
            int i11 = 0;
            while (listIterator.hasNext()) {
                if (dVar.e((w) listIterator.next(), elapsedRealtime)) {
                    i11++;
                }
            }
            vi.z zVar2 = new vi.z(size, i10, size2, i11);
            dVar.c.getClass();
            k4.d z02 = u7.s.z0(zVar2, zVar);
            if (z02 != null && (cVar = (c) hashMap.get(uri)) != null) {
                return c.c(cVar, uri, z02.b);
            }
        }
        return false;
    }
}
