package yb;

import a8.a0;
import a8.a8;
import a8.b8;
import a8.e1;
import a8.o7;
import a8.p7;
import a8.pa;
import a8.qa;
import a8.r7;
import a8.r8;
import a8.s;
import a8.s7;
import a8.s8;
import a8.t8;
import a8.ta;
import a8.u;
import a8.u0;
import a8.ua;
import a8.va;
import a8.wa;
import a8.y7;
import a8.z7;
import android.graphics.Bitmap;
import android.os.SystemClock;
import d6.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.telegram.tgnet.ConnectionsManager;
import pb.g;
import q4.q;
import q6.k;
import q6.m;
import q6.p;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class e extends pb.e {
    public boolean d = true;
    public final t8 e;
    public final a f;
    public final ta g;
    public final va h;

    public e(xb.a aVar, a aVar2, ta taVar) {
        m.h(aVar, "ImageLabelerOptions can not be null");
        this.f = aVar2;
        this.g = taVar;
        i iVar = new i(1, false);
        iVar.b = Float.valueOf(aVar.a);
        this.e = new t8(iVar);
        this.h = new va(g.c().b(), 0);
    }

    @Override // pb.i
    public final synchronized void b() {
        this.f.zzb();
        ta taVar = this.g;
        b8 b8Var = new b8();
        b8Var.c = y7.b;
        q qVar = new q(2, false);
        qVar.b = this.e;
        s sVar = u.b;
        Object[] objArr = {z7.b};
        u0.a(1, objArr);
        qVar.c = new a0(1, objArr);
        b8Var.d = new s8(qVar);
        pb.m.a.execute(new pa(taVar, new wa(b8Var, 0), a8.e, taVar.b(), 0));
    }

    @Override // pb.i
    public final synchronized void c() {
        this.f.zzc();
        this.d = true;
        ta taVar = this.g;
        b8 b8Var = new b8();
        b8Var.c = y7.b;
        pb.m.a.execute(new pa(taVar, new wa(b8Var, 0), a8.d, taVar.b(), 0));
    }

    @Override // pb.e
    public final Object e(ub.a aVar) {
        ArrayList c10;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                c10 = this.f.c(aVar);
                f(z7.b, aVar, elapsedRealtime);
                this.d = false;
            } catch (lb.a e10) {
                f(e10.a == 14 ? z7.c : z7.d, aVar, elapsedRealtime);
                throw e10;
            }
        }
        return c10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(z7 z7Var, ub.a aVar, long j3) {
        int i7;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j3;
        ta taVar = this.g;
        a8 a8Var = a8.b;
        taVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        int i10 = 1;
        boolean z9 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (taVar.c(a8Var, elapsedRealtime2)) {
            taVar.i.put(a8Var, Long.valueOf(elapsedRealtime2));
            b8 b8Var = new b8();
            b8Var.c = y7.b;
            android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(4, z9);
            r7 r7Var = new r7((int) (objArr4 == true ? 1 : 0), (byte) (objArr3 == true ? 1 : 0));
            r7Var.b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            r7Var.c = z7Var;
            r7Var.d = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            r7Var.e = bool;
            r7Var.f = bool;
            a0Var.b = new s7(r7Var);
            int i11 = aVar.e;
            if (i11 == -1) {
                Bitmap bitmap = aVar.a;
                m.g(bitmap);
                i7 = bitmap.getAllocationByteCount();
            } else {
                if (i11 == 17 || i11 == 842094169) {
                    m.g(null);
                    throw null;
                }
                if (i11 == 35) {
                    m.g(null);
                    throw null;
                }
                i7 = 0;
            }
            wf.b bVar = new wf.b(i10, (boolean) (objArr2 == true ? 1 : 0));
            bVar.b = i11 != -1 ? i11 != 35 ? i11 != 842094169 ? i11 != 16 ? i11 != 17 ? o7.b : o7.d : o7.c : o7.e : o7.f : o7.h;
            bVar.c = Integer.valueOf(i7 & ConnectionsManager.DEFAULT_DATACENTER_ID);
            a0Var.d = new p7(bVar);
            a0Var.c = this.e;
            b8Var.e = new r8(a0Var);
            pb.m.a.execute(new pa(taVar, new wa(b8Var, 0), a8Var, taVar.b(), 0));
        }
        android.support.v4.media.session.a0 a0Var2 = new android.support.v4.media.session.a0(3, (boolean) (objArr == true ? 1 : 0));
        a0Var2.d = this.e;
        a0Var2.b = z7Var;
        a0Var2.c = Boolean.valueOf(this.d);
        pb.m.a.execute(new qa(this.g, new e1(a0Var2), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        va vaVar = this.h;
        int i12 = z7Var.a;
        long j10 = currentTimeMillis - elapsedRealtime;
        synchronized (vaVar) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (vaVar.b.get() != -1 && elapsedRealtime3 - vaVar.b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            vaVar.a.f(new p(0, Arrays.asList(new k(24305, i12, 0, j10, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new ua(vaVar, elapsedRealtime3, 0));
        }
    }
}
