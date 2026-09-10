package zb;

import android.graphics.Bitmap;
import android.os.SystemClock;
import bi.u6;
import com.google.android.gms.internal.cast.p;
import com.google.firebase.messaging.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import m.g3;
import n6.j;
import n6.l;
import n7.a1;
import og.u0;
import org.telegram.tgnet.ConnectionsManager;
import v7.a6;
import v7.z8;
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
import x7.s;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class f extends qb.e {
    public boolean d = true;
    public final h8 e;
    public final b f;
    public final fa g;
    public final z8 h;

    public f(yb.a aVar, b bVar, fa faVar) {
        l.i(aVar, "ImageLabelerOptions can not be null");
        this.f = bVar;
        this.g = faVar;
        g3 g3Var = new g3(26, false);
        g3Var.b = Float.valueOf(aVar.a);
        this.e = new h8(g3Var);
        this.h = new z8(qb.g.c().b(), 1);
    }

    @Override // qb.i
    public final synchronized void b() {
        this.f.zzb();
        fa faVar = this.g;
        n nVar = new n();
        nVar.c = m7.b;
        a1 a1Var = new a1(26, (byte) 0);
        a1Var.b = this.e;
        m mVar = o.b;
        Object[] objArr = {n7.b};
        j8.a(1, objArr);
        a1Var.c = new s(1, objArr);
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
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j3;
        fa faVar = this.g;
        o7 o7Var = o7.b;
        faVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (faVar.c(o7Var, elapsedRealtime2)) {
            faVar.i.put(o7Var, Long.valueOf(elapsedRealtime2));
            n nVar = new n();
            nVar.c = m7.b;
            a6 a6Var = new a6(7, false);
            u6 u6Var = new u6();
            u6Var.a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            u6Var.b = n7Var;
            u6Var.c = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            u6Var.d = bool;
            u6Var.e = bool;
            a6Var.b = new g7(u6Var);
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
            u0 u0Var = new u0(24);
            u0Var.b = i11 != -1 ? i11 != 35 ? i11 != 842094169 ? i11 != 16 ? i11 != 17 ? d7.b : d7.d : d7.c : d7.e : d7.f : d7.h;
            u0Var.c = Integer.valueOf(i10 & ConnectionsManager.DEFAULT_DATACENTER_ID);
            a6Var.d = new e7(u0Var);
            a6Var.c = this.e;
            nVar.e = new f8(a6Var);
            z10 = false;
            qb.m.a.execute(new p(faVar, new a5.a(nVar, 0), o7Var, faVar.b(), 7));
        } else {
            z10 = false;
        }
        a6 a6Var2 = new a6(6, z10);
        a6Var2.c = this.e;
        a6Var2.b = n7Var;
        a6Var2.d = Boolean.valueOf(this.d);
        qb.m.a.execute(new da(this.g, new r0(a6Var2), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        z8 z8Var = this.h;
        int i12 = n7Var.a;
        long j10 = currentTimeMillis - elapsedRealtime;
        synchronized (z8Var) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (z8Var.b.get() != -1 && elapsedRealtime3 - z8Var.b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            z8Var.a.f(new n6.o(0, Arrays.asList(new j(24305, i12, 0, j10, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new e6.n(z8Var, elapsedRealtime3, 8));
        }
    }
}
