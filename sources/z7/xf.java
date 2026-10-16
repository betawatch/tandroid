package z7;

import android.content.Context;
import android.os.SystemClock;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class xf {
    public final Object a;
    public Object b;

    public xf(Context context) {
        this.b = new AtomicLong(-1L);
        this.a = new p6.b(context, p6.b.k, new n6.p("mlkit:vision"), com.google.android.gms.common.api.i.c);
    }

    public void a(Exception exc, boolean z10) {
        this.b = null;
        HashSet hashSet = (HashSet) this.a;
        e9.n0 u10 = e9.n0.u(hashSet);
        hashSet.clear();
        e9.l0 listIterator = u10.listIterator(0);
        while (listIterator.hasNext()) {
            n2.b bVar = (n2.b) listIterator.next();
            bVar.getClass();
            bVar.l(z10 ? 1 : 3, exc);
        }
    }

    public void b(n2.b bVar) {
        ((HashSet) this.a).add(bVar);
        if (((n2.b) this.b) != null) {
            return;
        }
        this.b = bVar;
        n2.p p5 = bVar.b.p();
        bVar.z = p5;
        android.support.v4.media.session.f fVar = bVar.s;
        String str = e2.m0.a;
        p5.getClass();
        fVar.getClass();
        fVar.obtainMessage(1, new n2.a(u2.u.g.getAndIncrement(), true, SystemClock.elapsedRealtime(), p5)).sendToTarget();
    }

    public xf() {
        this.a = new HashSet();
    }
}
