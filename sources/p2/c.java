package p2;

import android.net.Uri;
import android.os.SystemClock;
import e9.m2;
import e9.n0;
import e9.y0;
import java.util.HashMap;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c {
    public final w a;
    public final HashMap b;
    public final /* synthetic */ d c;

    public c(d dVar, w wVar) {
        this.c = dVar;
        this.a = wVar;
        HashMap hashMap = new HashMap();
        m2 it = y0.u(wVar.b.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Uri uri = (Uri) wVar.b.get(str);
            uri.getClass();
            hashMap.put(uri, new b(this.c, uri, str));
        }
        this.b = hashMap;
    }

    public static m a(c cVar, Uri uri) {
        b bVar = (b) i0.a.h(cVar.b, uri, uri);
        bVar.getClass();
        return bVar.e;
    }

    public static void b(c cVar, Uri uri, boolean z10) {
        b bVar = (b) i0.a.h(cVar.b, uri, uri);
        bVar.getClass();
        bVar.c(z10 ? bVar.a() : bVar.a);
    }

    public static boolean c(c cVar, Uri uri, long j10) {
        HashMap hashMap = cVar.b;
        b bVar = (b) i0.a.h(hashMap, uri, uri);
        bVar.getClass();
        bVar.r = SystemClock.elapsedRealtime() + j10;
        d dVar = cVar.c;
        w wVar = cVar.a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (b bVar2 : hashMap.values()) {
            if (!bVar2.b.equals(wVar.d) && elapsedRealtime > bVar2.r) {
                Uri c10 = wVar.c();
                String str = bVar2.b;
                t6.p(wVar.b.containsKey(str));
                wVar.d = str;
                if (c10.equals(dVar.F)) {
                    dVar.g(bVar2.a);
                }
                b bVar3 = (b) hashMap.get(c10);
                bVar3.getClass();
                bVar2.x = bVar3.x;
                bVar3.x = false;
                return true;
            }
        }
        Uri uri2 = dVar.F;
        if (uri2 == null || uri.equals(uri2)) {
            n0 n0Var = dVar.x;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= n0Var.size()) {
                    break;
                }
                Uri c11 = ((w) n0Var.get(i10)).c();
                c cVar2 = (c) dVar.d.get(c11);
                cVar2.getClass();
                HashMap hashMap2 = cVar2.b;
                b bVar4 = (b) i0.a.h(hashMap2, c11, c11);
                bVar4.getClass();
                if (elapsedRealtime2 > bVar4.r) {
                    dVar.F = c11;
                    Uri d = dVar.d(c11);
                    b bVar5 = (b) i0.a.h(hashMap2, c11, c11);
                    bVar5.getClass();
                    bVar5.c(d);
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }
}
