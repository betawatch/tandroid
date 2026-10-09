package zb;

import android.graphics.Bitmap;
import android.os.SystemClock;
import ci.u5;
import com.google.android.gms.internal.cast.p;
import com.google.firebase.messaging.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import n6.j;
import n6.l;
import n6.t;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.b5;
import v7.k;
import w7.j8;
import x7.d7;
import x7.da;
import x7.e7;
import x7.f8;
import x7.fa;
import x7.g7;
import x7.g8;
import x7.ga;
import x7.h8;
import x7.m;
import x7.m7;
import x7.n7;
import x7.o;
import x7.o7;
import x7.r0;
import x7.s;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class f extends qb.e {
    public boolean d = true;
    public final h8 e;
    public final b f;
    public final fa g;
    public final ga h;

    public f(yb.a aVar, b bVar, fa faVar) {
        l.i(aVar, "ImageLabelerOptions can not be null");
        this.f = bVar;
        this.g = faVar;
        w3.b bVar2 = new w3.b();
        bVar2.a = Float.valueOf(aVar.a);
        this.e = new h8(bVar2);
        this.h = new ga(qb.g.c().b(), 0);
    }

    @Override // qb.i
    public final synchronized void b() {
        this.f.zzb();
        fa faVar = this.g;
        n nVar = new n();
        nVar.c = m7.b;
        t tVar = new t(27);
        tVar.b = this.e;
        m mVar = o.b;
        Object[] objArr = {n7.b};
        j8.a(1, objArr);
        tVar.c = new s(1, objArr);
        nVar.d = new g8(tVar);
        qb.m.a.execute(new p(faVar, new a5.a(nVar, 0), o7.e, faVar.b(), 7));
    }

    @Override // qb.i
    public final synchronized void c() {
        this.f.zzc();
        this.d = true;
        fa faVar = this.g;
        n nVar = new n();
        nVar.c = m7.b;
        qb.m.a.execute(new p(faVar, new a5.a(nVar, 0), o7.d, faVar.b(), 7));
    }

    @Override // qb.e
    public final Object e(vb.a aVar) {
        ArrayList a2;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                a2 = this.f.a(aVar);
                f(n7.b, aVar, elapsedRealtime);
                this.d = false;
            } catch (mb.a e7) {
                f(e7.a == 14 ? n7.c : n7.d, aVar, elapsedRealtime);
                throw e7;
            }
        }
        return a2;
    }

    public final void f(n7 n7Var, vb.a aVar, long j3) {
        int i10;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j3;
        fa faVar = this.g;
        o7 o7Var = o7.b;
        faVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        byte b10 = 0;
        if (faVar.c(o7Var, elapsedRealtime2)) {
            faVar.i.put(o7Var, Long.valueOf(elapsedRealtime2));
            n nVar = new n();
            nVar.c = m7.b;
            k kVar = new k(11, false);
            u5 u5Var = new u5();
            u5Var.a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            u5Var.b = n7Var;
            u5Var.c = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            u5Var.d = bool;
            u5Var.e = bool;
            kVar.b = new g7(u5Var);
            int i11 = aVar.e;
            if (i11 == -1) {
                Bitmap bitmap = aVar.a;
                l.h(bitmap);
                i10 = bitmap.getAllocationByteCount();
            } else {
                if (i11 == 17 || i11 == 842094169) {
                    l.h(null);
                    throw null;
                }
                if (i11 == 35) {
                    l.h(null);
                    throw null;
                }
                i10 = 0;
            }
            b5 b5Var = new b5(24, b10);
            b5Var.b = i11 != -1 ? i11 != 35 ? i11 != 842094169 ? i11 != 16 ? i11 != 17 ? d7.b : d7.d : d7.c : d7.e : d7.f : d7.h;
            b5Var.c = Integer.valueOf(i10 & ConnectionsManager.DEFAULT_DATACENTER_ID);
            kVar.d = new e7(b5Var);
            kVar.c = this.e;
            nVar.e = new f8(kVar);
            qb.m.a.execute(new p(faVar, new a5.a(nVar, 0), o7Var, faVar.b(), 7));
        }
        k kVar2 = new k(10, false);
        kVar2.d = this.e;
        kVar2.b = n7Var;
        kVar2.c = Boolean.valueOf(this.d);
        qb.m.a.execute(new da(this.g, new r0(kVar2), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        ga gaVar = this.h;
        int i12 = n7Var.a;
        long j10 = currentTimeMillis - elapsedRealtime;
        synchronized (gaVar) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (gaVar.b.get() != -1 && elapsedRealtime3 - gaVar.b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            gaVar.a.f(new n6.o(0, Arrays.asList(new j(24305, i12, 0, j10, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new e6.n(gaVar, elapsedRealtime3, 8));
        }
    }
}
