package sb;

import android.graphics.Bitmap;
import android.os.SystemClock;
import c3.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import jb.g;
import n6.j;
import n6.l;
import org.telegram.tgnet.ConnectionsManager;
import vh.e0;
import w7.s8;
import x7.d7;
import x7.e7;
import x7.ea;
import x7.f8;
import x7.g7;
import x7.g8;
import x7.ga;
import x7.h8;
import x7.i8;
import x7.m;
import x7.m7;
import x7.n7;
import x7.o;
import x7.o7;
import x7.r0;
import x7.s;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e extends jb.e {
    public boolean d = true;
    public final i8 e;
    public final a f;
    public final ga g;
    public final u9.b h;

    public e(rb.a aVar, a aVar2, ga gaVar) {
        l.h(aVar, "ImageLabelerOptions can not be null");
        this.f = aVar2;
        this.g = gaVar;
        e0 e0Var = new e0();
        e0Var.a = Float.valueOf(aVar.a);
        this.e = new i8(e0Var);
        this.h = new u9.b(g.c().b(), 6);
    }

    @Override // jb.i
    public final synchronized void b() {
        this.f.zzb();
        ga gaVar = this.g;
        j2.f fVar = new j2.f();
        fVar.c = m7.b;
        g8 g8Var = new g8(0);
        g8Var.b = this.e;
        m mVar = o.b;
        Object[] objArr = {n7.b};
        s8.a(1, objArr);
        g8Var.c = new s(1, objArr);
        fVar.d = new h8(g8Var);
        jb.m.a.execute(new com.google.android.gms.internal.cast.o(gaVar, new a5.a(fVar, 0), o7.e, gaVar.b(), 7));
    }

    @Override // jb.i
    public final synchronized void c() {
        this.f.zzc();
        this.d = true;
        ga gaVar = this.g;
        j2.f fVar = new j2.f();
        fVar.c = m7.b;
        jb.m.a.execute(new com.google.android.gms.internal.cast.o(gaVar, new a5.a(fVar, 0), o7.d, gaVar.b(), 7));
    }

    @Override // jb.e
    public final Object e(ob.a aVar) {
        ArrayList a2;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                a2 = this.f.a(aVar);
                f(n7.b, aVar, elapsedRealtime);
                this.d = false;
            } catch (fb.a e) {
                f(e.a == 14 ? n7.c : n7.d, aVar, elapsedRealtime);
                throw e;
            }
        }
        return a2;
    }

    public final void f(n7 n7Var, ob.a aVar, long j10) {
        int i10;
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        ga gaVar = this.g;
        o7 o7Var = o7.b;
        gaVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        boolean z11 = false;
        if (gaVar.c(o7Var, elapsedRealtime2)) {
            gaVar.i.put(o7Var, Long.valueOf(elapsedRealtime2));
            j2.f fVar = new j2.f();
            fVar.c = m7.b;
            q5.d dVar = new q5.d(21, z11);
            bh.d dVar2 = new bh.d();
            dVar2.a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            dVar2.b = n7Var;
            dVar2.c = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            dVar2.d = bool;
            dVar2.e = bool;
            dVar.b = new g7(dVar2);
            int i11 = aVar.e;
            if (i11 == -1) {
                Bitmap bitmap = aVar.a;
                l.g(bitmap);
                i10 = bitmap.getAllocationByteCount();
            } else {
                if (i11 == 17 || i11 == 842094169) {
                    l.g(null);
                    throw null;
                }
                if (i11 == 35) {
                    l.g(null);
                    throw null;
                }
                i10 = 0;
            }
            u9.b bVar = new u9.b(5);
            bVar.b = i11 != -1 ? i11 != 35 ? i11 != 842094169 ? i11 != 16 ? i11 != 17 ? d7.b : d7.d : d7.c : d7.e : d7.f : d7.h;
            bVar.c = Integer.valueOf(i10 & ConnectionsManager.DEFAULT_DATACENTER_ID);
            dVar.d = new e7(bVar);
            dVar.c = this.e;
            fVar.e = new f8(dVar);
            z10 = false;
            jb.m.a.execute(new com.google.android.gms.internal.cast.o(gaVar, new a5.a(fVar, 0), o7Var, gaVar.b(), 7));
        } else {
            z10 = false;
        }
        q5.d dVar3 = new q5.d(20, z10);
        dVar3.d = this.e;
        dVar3.b = n7Var;
        dVar3.c = Boolean.valueOf(this.d);
        jb.m.a.execute(new ea(this.g, new r0(dVar3), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        u9.b bVar2 = this.h;
        int i12 = n7Var.a;
        long j11 = currentTimeMillis - elapsedRealtime;
        synchronized (bVar2) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (((AtomicLong) bVar2.c).get() != -1 && elapsedRealtime3 - ((AtomicLong) bVar2.c).get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            ((p6.b) bVar2.b).f(new n6.o(0, Arrays.asList(new j(24305, i12, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new g0(bVar2, elapsedRealtime3, 10));
        }
    }
}
