package zb;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.gms.common.api.i;
import com.google.firebase.messaging.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import n6.j;
import n6.l;
import n6.p;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Cells.f3;
import v7.s1;
import w7.l8;
import x7.d7;
import x7.e7;
import x7.ea;
import x7.f7;
import x7.g8;
import x7.ga;
import x7.h7;
import x7.h8;
import x7.i8;
import x7.m;
import x7.n7;
import x7.o;
import x7.o7;
import x7.p7;
import x7.r0;
import x7.s;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class f extends qb.e {
    public boolean d = true;
    public final i8 e;
    public final b f;
    public final ga g;
    public final d7 h;

    public f(yb.a aVar, b bVar, ga gaVar) {
        l.i(aVar, "ImageLabelerOptions can not be null");
        this.f = bVar;
        this.g = gaVar;
        ka.c cVar = new ka.c(29, false);
        cVar.b = Float.valueOf(aVar.a);
        this.e = new i8(cVar);
        Context b10 = qb.g.c().b();
        d7 d7Var = new d7();
        d7Var.b = new AtomicLong(-1L);
        d7Var.a = new p6.b(b10, p6.b.k, new p("mlkit:vision"), i.c);
        this.h = d7Var;
    }

    @Override // qb.i
    public final synchronized void b() {
        this.f.zzb();
        ga gaVar = this.g;
        n nVar = new n();
        nVar.c = n7.b;
        f3 f3Var = new f3(23);
        f3Var.b = this.e;
        m mVar = o.b;
        Object[] objArr = {o7.b};
        l8.a(1, objArr);
        f3Var.c = new s(1, objArr);
        nVar.d = new h8(f3Var);
        qb.m.a.execute(new com.google.android.gms.internal.cast.p(gaVar, new a5.a(nVar, 0), p7.e, gaVar.b(), 7));
    }

    @Override // qb.i
    public final synchronized void c() {
        this.f.zzc();
        this.d = true;
        ga gaVar = this.g;
        n nVar = new n();
        nVar.c = n7.b;
        qb.m.a.execute(new com.google.android.gms.internal.cast.p(gaVar, new a5.a(nVar, 0), p7.d, gaVar.b(), 7));
    }

    @Override // qb.e
    public final Object e(vb.a aVar) {
        ArrayList a2;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                a2 = this.f.a(aVar);
                f(o7.b, aVar, elapsedRealtime);
                this.d = false;
            } catch (mb.a e) {
                f(e.a == 14 ? o7.c : o7.d, aVar, elapsedRealtime);
                throw e;
            }
        }
        return a2;
    }

    public final void f(o7 o7Var, vb.a aVar, long j3) {
        int i10;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j3;
        ga gaVar = this.g;
        p7 p7Var = p7.b;
        gaVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (gaVar.c(p7Var, elapsedRealtime2)) {
            gaVar.i.put(p7Var, Long.valueOf(elapsedRealtime2));
            n nVar = new n();
            nVar.c = n7.b;
            s1 s1Var = new s1(9, false);
            cf.c cVar = new cf.c();
            cVar.a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            cVar.b = o7Var;
            cVar.c = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            cVar.d = bool;
            cVar.e = bool;
            s1Var.b = new h7(cVar);
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
            d7 d7Var = new d7();
            d7Var.a = i11 != -1 ? i11 != 35 ? i11 != 842094169 ? i11 != 16 ? i11 != 17 ? e7.b : e7.d : e7.c : e7.e : e7.f : e7.h;
            d7Var.b = Integer.valueOf(i10 & ConnectionsManager.DEFAULT_DATACENTER_ID);
            s1Var.c = new f7(d7Var);
            s1Var.d = this.e;
            nVar.e = new g8(s1Var);
            qb.m.a.execute(new com.google.android.gms.internal.cast.p(gaVar, new a5.a(nVar, 0), p7Var, gaVar.b(), 7));
        }
        int i12 = 8;
        s1 s1Var2 = new s1(8, false);
        s1Var2.c = this.e;
        s1Var2.b = o7Var;
        s1Var2.d = Boolean.valueOf(this.d);
        qb.m.a.execute(new ea(this.g, new r0(s1Var2), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        d7 d7Var2 = this.h;
        int i13 = o7Var.a;
        long j10 = currentTimeMillis - elapsedRealtime;
        synchronized (d7Var2) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (((AtomicLong) d7Var2.b).get() != -1 && elapsedRealtime3 - ((AtomicLong) d7Var2.b).get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            ((p6.b) d7Var2.a).f(new n6.o(0, Arrays.asList(new j(24305, i13, 0, j10, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new e6.n(d7Var2, elapsedRealtime3, i12));
        }
    }
}
