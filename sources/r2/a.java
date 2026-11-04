package r2;

import android.net.Uri;
import android.os.SystemClock;
import g9.g0;
import g9.g2;
import g9.t0;
import java.util.HashMap;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a implements u {
    public final /* synthetic */ d a;

    public a(d dVar) {
        this.a = dVar;
    }

    @Override // r2.u
    public final void a() {
        this.a.e.remove(this);
    }

    @Override // r2.u
    public final boolean b(Uri uri, e5.u uVar, boolean z10) {
        c cVar;
        d dVar = this.a;
        HashMap hashMap = dVar.d;
        if (dVar.H == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c cVar2 = (c) hashMap.get(uri);
            cVar2.getClass();
            w wVar = cVar2.a;
            int size = wVar.b.size();
            g2 it = t0.q(wVar.b.values()).iterator();
            int i3 = 0;
            while (it.hasNext()) {
                Uri uri2 = (Uri) it.next();
                c cVar3 = (c) hashMap.get(uri2);
                if (cVar3 != null) {
                    b bVar = (b) f1.p(cVar3.b, uri2, uri2);
                    bVar.getClass();
                    if (elapsedRealtime <= bVar.r) {
                        i3++;
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
            a3.h hVar = new a3.h(size, i3, size2, i10);
            dVar.c.getClass();
            a3.i D4 = kb.a.D4(hVar, uVar);
            if (D4 != null && (cVar = (c) hashMap.get(uri)) != null) {
                return c.c(cVar, uri, D4.b);
            }
        }
        return false;
    }
}
