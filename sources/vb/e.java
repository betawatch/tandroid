package vb;

import android.graphics.Bitmap;
import android.os.SystemClock;
import b8.cg;
import b8.fg;
import b8.ig;
import b8.jg;
import b8.ke;
import b8.kg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import mb.g;
import org.telegram.tgnet.ConnectionsManager;
import p6.k;
import p6.m;
import p6.p;
import x7.f6;
import x7.u6;
import z7.c7;
import z7.d7;
import z7.da;
import z7.e8;
import z7.f7;
import z7.f8;
import z7.g8;
import z7.l;
import z7.l7;
import z7.m7;
import z7.n;
import z7.n7;
import z7.q0;
import z7.r;
import z7.r0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e extends mb.e {
    public boolean d = true;
    public final g8 e;
    public final a f;
    public final da g;
    public final jg h;

    public e(ub.a aVar, a aVar2, da daVar) {
        m.h(aVar, "ImageLabelerOptions can not be null");
        this.f = aVar2;
        this.g = daVar;
        f6 f6Var = new f6();
        f6Var.a = Float.valueOf(aVar.a);
        this.e = new g8(f6Var);
        this.h = new jg(g.c().b(), 2);
    }

    @Override // mb.i
    public final synchronized void b() {
        this.f.zzb();
        da daVar = this.g;
        l2.e eVar = new l2.e();
        eVar.c = l7.b;
        ua.b bVar = new ua.b(8);
        bVar.b = this.e;
        l lVar = n.b;
        Object[] objArr = {m7.b};
        u6.a(1, objArr);
        bVar.c = new r(1, objArr);
        eVar.d = new f8(bVar);
        mb.m.a.execute(new cg(daVar, new kg(eVar, 0), n7.e, daVar.b(), 8));
    }

    @Override // mb.i
    public final synchronized void c() {
        this.f.zzc();
        this.d = true;
        da daVar = this.g;
        l2.e eVar = new l2.e();
        eVar.c = l7.b;
        mb.m.a.execute(new cg(daVar, new kg(eVar, 0), n7.d, daVar.b(), 8));
    }

    @Override // mb.e
    public final Object e(rb.a aVar) {
        ArrayList a10;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                a10 = this.f.a(aVar);
                f(m7.b, aVar, elapsedRealtime);
                this.d = false;
            } catch (ib.a e10) {
                f(e10.a == 14 ? m7.c : m7.d, aVar, elapsedRealtime);
                throw e10;
            }
        }
        return a10;
    }

    public final void f(m7 m7Var, rb.a aVar, long j10) {
        int i3;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        da daVar = this.g;
        n7 n7Var = n7.b;
        daVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (daVar.c(n7Var, elapsedRealtime2)) {
            daVar.i.put(n7Var, Long.valueOf(elapsedRealtime2));
            l2.e eVar = new l2.e();
            eVar.c = l7.b;
            q0 q0Var = new q0();
            ke keVar = new ke(21);
            keVar.b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            keVar.c = m7Var;
            keVar.d = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            keVar.e = bool;
            keVar.f = bool;
            q0Var.b = new f7(keVar);
            int i10 = aVar.e;
            if (i10 == -1) {
                Bitmap bitmap = aVar.a;
                m.g(bitmap);
                i3 = bitmap.getAllocationByteCount();
            } else {
                if (i10 == 17 || i10 == 842094169) {
                    m.g(null);
                    throw null;
                }
                if (i10 == 35) {
                    m.g(null);
                    throw null;
                }
                i3 = 0;
            }
            w9.b bVar = new w9.b();
            bVar.b = i10 != -1 ? i10 != 35 ? i10 != 842094169 ? i10 != 16 ? i10 != 17 ? c7.b : c7.d : c7.c : c7.e : c7.f : c7.h;
            bVar.c = Integer.valueOf(i3 & ConnectionsManager.DEFAULT_DATACENTER_ID);
            q0Var.c = new d7(bVar);
            q0Var.a = this.e;
            eVar.e = new e8(q0Var);
            mb.m.a.execute(new cg(daVar, new kg(eVar, 0), n7Var, daVar.b(), 8));
        }
        q0 q0Var2 = new q0();
        q0Var2.a = this.e;
        q0Var2.b = m7Var;
        q0Var2.c = Boolean.valueOf(this.d);
        mb.m.a.execute(new fg(this.g, new r0(q0Var2), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        jg jgVar = this.h;
        int i11 = m7Var.a;
        long j11 = currentTimeMillis - elapsedRealtime;
        synchronized (jgVar) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (jgVar.b.get() != -1 && elapsedRealtime3 - jgVar.b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            jgVar.a.f(new p(0, Arrays.asList(new k(24305, i11, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new ig(jgVar, elapsedRealtime3, 11));
        }
    }
}
