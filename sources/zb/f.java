package zb;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.gms.internal.cast.p;
import com.google.firebase.messaging.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import n6.j;
import n6.l;
import n7.a1;
import org.telegram.tgnet.ConnectionsManager;
import v7.r1;
import v8.s;
import w7.j8;
import x7.d7;
import x7.da;
import x7.e7;
import x7.f8;
import x7.fa;
import x7.g7;
import x7.g8;
import x7.h8;
import x7.m;
import x7.m7;
import x7.n7;
import x7.o;
import x7.o7;
import x7.r0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class f extends qb.e {
    public boolean d = true;
    public final h8 e;
    public final b f;
    public final fa g;
    public final o0.a h;

    public f(yb.a aVar, b bVar, fa faVar) {
        l.i(aVar, "ImageLabelerOptions can not be null");
        this.f = bVar;
        this.g = faVar;
        s sVar = new s();
        sVar.a = Float.valueOf(aVar.a);
        this.e = new h8(sVar);
        this.h = new o0.a(qb.g.c().b());
    }

    @Override // qb.i
    public final synchronized void b() {
        this.f.zzb();
        fa faVar = this.g;
        n nVar = new n();
        nVar.c = m7.b;
        a1 a1Var = new a1(26);
        a1Var.b = this.e;
        m mVar = o.b;
        Object[] objArr = {n7.b};
        j8.a(1, objArr);
        a1Var.c = new x7.s(1, objArr);
        nVar.d = new g8(a1Var);
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
            } catch (mb.a e) {
                f(e.a == 14 ? n7.c : n7.d, aVar, elapsedRealtime);
                throw e;
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
            r1 r1Var = new r1(9, false);
            cf.c cVar = new cf.c();
            cVar.a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            cVar.b = n7Var;
            cVar.c = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            cVar.d = bool;
            cVar.e = bool;
            r1Var.b = new g7(cVar);
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
            o0.a aVar2 = new o0.a(25, b10);
            aVar2.b = i11 != -1 ? i11 != 35 ? i11 != 842094169 ? i11 != 16 ? i11 != 17 ? d7.b : d7.d : d7.c : d7.e : d7.f : d7.h;
            aVar2.c = Integer.valueOf(i10 & ConnectionsManager.DEFAULT_DATACENTER_ID);
            r1Var.c = new e7(aVar2);
            r1Var.d = this.e;
            nVar.e = new f8(r1Var);
            qb.m.a.execute(new p(faVar, new a5.a(nVar, 0), o7Var, faVar.b(), 7));
        }
        int i12 = 8;
        r1 r1Var2 = new r1(8, false);
        r1Var2.c = this.e;
        r1Var2.b = n7Var;
        r1Var2.d = Boolean.valueOf(this.d);
        qb.m.a.execute(new da(this.g, new r0(r1Var2), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        o0.a aVar3 = this.h;
        int i13 = n7Var.a;
        long j10 = currentTimeMillis - elapsedRealtime;
        synchronized (aVar3) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (((AtomicLong) aVar3.c).get() != -1 && elapsedRealtime3 - ((AtomicLong) aVar3.c).get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            ((p6.b) aVar3.b).f(new n6.o(0, Arrays.asList(new j(24305, i13, 0, j10, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new e6.n(aVar3, elapsedRealtime3, i12));
        }
    }
}
