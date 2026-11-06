package s2;

import android.net.Uri;
import android.os.SystemClock;
import h9.g0;
import h9.h2;
import h9.t0;
import java.util.HashMap;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class a implements u {
    public final /* synthetic */ d a;

    public a(d dVar) {
        this.a = dVar;
    }

    @Override // s2.u
    public final void a() {
        this.a.e.remove(this);
    }

    @Override // s2.u
    public final boolean d(Uri uri, f5.u uVar, boolean z9) {
        c cVar;
        d dVar = this.a;
        HashMap hashMap = dVar.d;
        if (dVar.G == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c cVar2 = (c) hashMap.get(uri);
            cVar2.getClass();
            w wVar = cVar2.a;
            int size = wVar.b.size();
            h2 it = t0.q(wVar.b.values()).iterator();
            int i7 = 0;
            while (it.hasNext()) {
                Uri uri2 = (Uri) it.next();
                c cVar3 = (c) hashMap.get(uri2);
                if (cVar3 != null) {
                    b bVar = (b) f1.l(cVar3.b, uri2, uri2);
                    bVar.getClass();
                    if (elapsedRealtime <= bVar.r) {
                        i7++;
                    }
                }
            }
            int size2 = dVar.x.size();
            g0 listIterator = dVar.x.listIterator(0);
            int i10 = 0;
            while (listIterator.hasNext()) {
                if (dVar.e((w) listIterator.next(), elapsedRealtime)) {
                    i10++;
                }
            }
            b3.h hVar = new b3.h(size, i7, size2, i10);
            dVar.c.getClass();
            b3.i V0 = pb.b.V0(hVar, uVar);
            if (V0 != null && (cVar = (c) hashMap.get(uri)) != null) {
                return c.c(cVar, uri, V0.b);
            }
        }
        return false;
    }
}
