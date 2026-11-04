package r2;

import android.net.Uri;
import android.os.SystemClock;
import b8.zb;
import g9.g2;
import g9.i0;
import g9.t0;
import java.util.HashMap;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c {
    public final w a;
    public final HashMap b;
    public final /* synthetic */ d c;

    public c(d dVar, w wVar) {
        this.c = dVar;
        this.a = wVar;
        HashMap hashMap = new HashMap();
        g2 it = t0.q(wVar.b.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Uri uri = (Uri) wVar.b.get(str);
            uri.getClass();
            hashMap.put(uri, new b(this.c, uri, str));
        }
        this.b = hashMap;
    }

    public static m a(c cVar, Uri uri) {
        b bVar = (b) f1.p(cVar.b, uri, uri);
        bVar.getClass();
        return bVar.e;
    }

    public static void b(c cVar, Uri uri, boolean z10) {
        b bVar = (b) f1.p(cVar.b, uri, uri);
        bVar.getClass();
        bVar.c(z10 ? bVar.a() : bVar.a);
    }

    public static boolean c(c cVar, Uri uri, long j10) {
        HashMap hashMap = cVar.b;
        b bVar = (b) f1.p(hashMap, uri, uri);
        bVar.getClass();
        bVar.r = SystemClock.elapsedRealtime() + j10;
        d dVar = cVar.c;
        w wVar = cVar.a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (b bVar2 : hashMap.values()) {
            if (!bVar2.b.equals(wVar.d) && elapsedRealtime > bVar2.r) {
                Uri c2 = wVar.c();
                String str = bVar2.b;
                zb.p(wVar.b.containsKey(str));
                wVar.d = str;
                if (c2.equals(dVar.G)) {
                    dVar.g(bVar2.a);
                }
                b bVar3 = (b) hashMap.get(c2);
                bVar3.getClass();
                bVar2.x = bVar3.x;
                bVar3.x = false;
                return true;
            }
        }
        Uri uri2 = dVar.G;
        if (uri2 == null || uri.equals(uri2)) {
            i0 i0Var = dVar.x;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            boolean z10 = false;
            int i3 = 0;
            while (true) {
                if (i3 >= i0Var.size()) {
                    break;
                }
                Uri c10 = ((w) i0Var.get(i3)).c();
                c cVar2 = (c) dVar.d.get(c10);
                cVar2.getClass();
                HashMap hashMap2 = cVar2.b;
                b bVar4 = (b) f1.p(hashMap2, c10, c10);
                bVar4.getClass();
                if (elapsedRealtime2 > bVar4.r) {
                    dVar.G = c10;
                    Uri d = dVar.d(c10);
                    b bVar5 = (b) f1.p(hashMap2, c10, c10);
                    bVar5.getClass();
                    bVar5.c(d);
                    z10 = true;
                    break;
                }
                i3++;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }
}
