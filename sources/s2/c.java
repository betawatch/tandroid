package s2;

import a8.ia;
import android.net.Uri;
import android.os.SystemClock;
import h9.h2;
import h9.i0;
import h9.t0;
import java.util.HashMap;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class c {
    public final w a;
    public final HashMap b;
    public final /* synthetic */ d c;

    public c(d dVar, w wVar) {
        this.c = dVar;
        this.a = wVar;
        HashMap hashMap = new HashMap();
        h2 it = t0.q(wVar.b.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Uri uri = (Uri) wVar.b.get(str);
            uri.getClass();
            hashMap.put(uri, new b(this.c, uri, str));
        }
        this.b = hashMap;
    }

    public static m a(c cVar, Uri uri) {
        b bVar = (b) f1.l(cVar.b, uri, uri);
        bVar.getClass();
        return bVar.e;
    }

    public static void b(c cVar, Uri uri, boolean z9) {
        b bVar = (b) f1.l(cVar.b, uri, uri);
        bVar.getClass();
        bVar.c(z9 ? bVar.a() : bVar.a);
    }

    public static boolean c(c cVar, Uri uri, long j3) {
        HashMap hashMap = cVar.b;
        b bVar = (b) f1.l(hashMap, uri, uri);
        bVar.getClass();
        bVar.r = SystemClock.elapsedRealtime() + j3;
        d dVar = cVar.c;
        w wVar = cVar.a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (b bVar2 : hashMap.values()) {
            if (!bVar2.b.equals(wVar.d) && elapsedRealtime > bVar2.r) {
                Uri c10 = wVar.c();
                String str = bVar2.b;
                ia.p(wVar.b.containsKey(str));
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
            i0 i0Var = dVar.x;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            boolean z9 = false;
            int i7 = 0;
            while (true) {
                if (i7 >= i0Var.size()) {
                    break;
                }
                Uri c11 = ((w) i0Var.get(i7)).c();
                c cVar2 = (c) dVar.d.get(c11);
                cVar2.getClass();
                HashMap hashMap2 = cVar2.b;
                b bVar4 = (b) f1.l(hashMap2, c11, c11);
                bVar4.getClass();
                if (elapsedRealtime2 > bVar4.r) {
                    dVar.F = c11;
                    Uri d = dVar.d(c11);
                    b bVar5 = (b) f1.l(hashMap2, c11, c11);
                    bVar5.getClass();
                    bVar5.c(d);
                    z9 = true;
                    break;
                }
                i7++;
            }
            if (!z9) {
                return false;
            }
        }
        return true;
    }
}
