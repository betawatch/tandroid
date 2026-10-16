package p2;

import android.net.Uri;
import android.os.SystemClock;
import c5.c0;
import e9.l0;
import e9.m2;
import e9.y0;
import java.util.HashMap;
import org.telegram.ui.Wallet.k5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
    public final boolean b(Uri uri, c0 c0Var, boolean z10) {
        c cVar;
        d dVar = this.a;
        HashMap hashMap = dVar.d;
        if (dVar.G == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c cVar2 = (c) hashMap.get(uri);
            cVar2.getClass();
            w wVar = cVar2.a;
            int size = wVar.b.size();
            m2 it = y0.u(wVar.b.values()).iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Uri uri2 = (Uri) it.next();
                c cVar3 = (c) hashMap.get(uri2);
                if (cVar3 != null) {
                    b bVar = (b) i2.d.i(cVar3.b, uri2, uri2);
                    bVar.getClass();
                    if (elapsedRealtime <= bVar.r) {
                        i10++;
                    }
                }
            }
            int size2 = dVar.w.size();
            l0 listIterator = dVar.w.listIterator(0);
            int i11 = 0;
            while (listIterator.hasNext()) {
                if (dVar.e((w) listIterator.next(), elapsedRealtime)) {
                    i11++;
                }
            }
            k5 k5Var = new k5(size, i10, size2, i11);
            dVar.c.getClass();
            k4.d x32 = oa.d.x3(k5Var, c0Var);
            if (x32 != null && (cVar = (c) hashMap.get(uri)) != null) {
                return c.c(cVar, uri, x32.b);
            }
        }
        return false;
    }
}
