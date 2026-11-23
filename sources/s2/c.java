package s2;

import a8.ma;
import android.net.Uri;
import android.os.SystemClock;
import h9.g2;
import h9.i0;
import h9.t0;
import java.util.HashMap;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class c {
    public final x a;
    public final HashMap b;
    public final /* synthetic */ d c;

    public c(d dVar, x xVar) {
        this.c = dVar;
        this.a = xVar;
        HashMap hashMap = new HashMap();
        g2 it = t0.q(xVar.b.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Uri uri = (Uri) xVar.b.get(str);
            uri.getClass();
            hashMap.put(uri, new b(this.c, uri, str));
        }
        this.b = hashMap;
    }

    public static n a(c cVar, Uri uri) {
        b bVar = (b) p5.c.i(cVar.b, uri, uri);
        bVar.getClass();
        return bVar.e;
    }

    public static void b(c cVar, Uri uri, boolean z10) {
        b bVar = (b) p5.c.i(cVar.b, uri, uri);
        bVar.getClass();
        bVar.c(z10 ? bVar.a() : bVar.a);
    }

    public static boolean c(c cVar, Uri uri, long j3) {
        HashMap hashMap = cVar.b;
        b bVar = (b) p5.c.i(hashMap, uri, uri);
        bVar.getClass();
        bVar.r = SystemClock.elapsedRealtime() + j3;
        d dVar = cVar.c;
        x xVar = cVar.a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (b bVar2 : hashMap.values()) {
            if (!bVar2.b.equals(xVar.d) && elapsedRealtime > bVar2.r) {
                Uri c10 = xVar.c();
                String str = bVar2.b;
                ma.p(xVar.b.containsKey(str));
                xVar.d = str;
                if (c10.equals(dVar.G)) {
                    dVar.g(bVar2.a);
                }
                b bVar3 = (b) hashMap.get(c10);
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
            int i7 = 0;
            while (true) {
                if (i7 >= i0Var.size()) {
                    break;
                }
                Uri c11 = ((x) i0Var.get(i7)).c();
                c cVar2 = (c) dVar.d.get(c11);
                cVar2.getClass();
                HashMap hashMap2 = cVar2.b;
                b bVar4 = (b) p5.c.i(hashMap2, c11, c11);
                bVar4.getClass();
                if (elapsedRealtime2 > bVar4.r) {
                    dVar.G = c11;
                    Uri d = dVar.d(c11);
                    b bVar5 = (b) p5.c.i(hashMap2, c11, c11);
                    bVar5.getClass();
                    bVar5.c(d);
                    z10 = true;
                    break;
                }
                i7++;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }
}
