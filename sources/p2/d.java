package p2;

import android.net.Uri;
import android.os.SystemClock;
import e9.m2;
import e9.n0;
import e9.y0;
import java.util.HashMap;
import v7.u6;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class d {
    public final x a;
    public final HashMap b;
    public final /* synthetic */ e c;

    public d(e eVar, x xVar) {
        this.c = eVar;
        this.a = xVar;
        HashMap hashMap = new HashMap();
        m2 it = y0.u(xVar.b.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Uri uri = (Uri) xVar.b.get(str);
            uri.getClass();
            hashMap.put(uri, new c(this.c, uri, str));
        }
        this.b = hashMap;
    }

    public static n a(d dVar, Uri uri) {
        c cVar = (c) i2.e.i(dVar.b, uri, uri);
        cVar.getClass();
        return cVar.e;
    }

    public static void b(d dVar, Uri uri, boolean z10) {
        c cVar = (c) i2.e.i(dVar.b, uri, uri);
        cVar.getClass();
        cVar.c(z10 ? cVar.a() : cVar.a);
    }

    public static boolean c(d dVar, Uri uri, long j10) {
        HashMap hashMap = dVar.b;
        c cVar = (c) i2.e.i(hashMap, uri, uri);
        cVar.getClass();
        cVar.r = SystemClock.elapsedRealtime() + j10;
        e eVar = dVar.c;
        x xVar = dVar.a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (c cVar2 : hashMap.values()) {
            if (!cVar2.b.equals(xVar.d) && elapsedRealtime > cVar2.r) {
                Uri c10 = xVar.c();
                String str = cVar2.b;
                u6.p(xVar.b.containsKey(str));
                xVar.d = str;
                if (c10.equals(eVar.F)) {
                    eVar.i(cVar2.a);
                }
                c cVar3 = (c) hashMap.get(c10);
                cVar3.getClass();
                cVar2.w = cVar3.w;
                cVar3.w = false;
                return true;
            }
        }
        Uri uri2 = eVar.F;
        if (uri2 == null || uri.equals(uri2)) {
            n0 n0Var = eVar.w;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= n0Var.size()) {
                    break;
                }
                Uri c11 = ((x) n0Var.get(i10)).c();
                d dVar2 = (d) eVar.d.get(c11);
                dVar2.getClass();
                HashMap hashMap2 = dVar2.b;
                c cVar4 = (c) i2.e.i(hashMap2, c11, c11);
                cVar4.getClass();
                if (elapsedRealtime2 > cVar4.r) {
                    eVar.F = c11;
                    Uri d = eVar.d(c11);
                    c cVar5 = (c) i2.e.i(hashMap2, c11, c11);
                    cVar5.getClass();
                    cVar5.c(d);
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
