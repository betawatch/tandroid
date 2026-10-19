package x7;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import z7.ib;
import z7.mg;
import z7.xf;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class da implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ da(fa faVar, r0 r0Var, long j10) {
        this.c = faVar;
        this.d = r0Var;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fa faVar = (fa) this.c;
                r0 r0Var = (r0) this.d;
                HashMap hashMap = faVar.j;
                o7 o7Var = o7.f;
                if (!hashMap.containsKey(o7Var)) {
                    j jVar = new j();
                    f fVar = new f();
                    if (!jVar.isEmpty()) {
                        throw new IllegalArgumentException();
                    }
                    fVar.c = jVar;
                    hashMap.put(o7Var, fVar);
                }
                f fVar2 = (f) hashMap.get(o7Var);
                Long valueOf = Long.valueOf(this.b);
                j jVar2 = fVar2.c;
                Collection collection = (Collection) jVar2.get(r0Var);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (!arrayList.add(valueOf)) {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                    fVar2.d++;
                    jVar2.put(r0Var, arrayList);
                } else if (collection.add(valueOf)) {
                    fVar2.d++;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (faVar.c(o7Var, elapsedRealtime)) {
                    faVar.i.put(o7Var, Long.valueOf(elapsedRealtime));
                    rb.m.a.execute(new p8.b(faVar, 9));
                    return;
                }
                return;
            default:
                xf xfVar = (xf) this.c;
                ib ibVar = ib.N1;
                z7.i1 i1Var = (z7.i1) this.d;
                HashMap hashMap2 = xfVar.j;
                if (!hashMap2.containsKey(ibVar)) {
                    z7.d dVar = new z7.d();
                    mg mgVar = new mg();
                    if (!dVar.isEmpty()) {
                        throw new IllegalArgumentException();
                    }
                    mgVar.c = dVar;
                    hashMap2.put(ibVar, mgVar);
                }
                mg mgVar2 = (mg) hashMap2.get(ibVar);
                Long valueOf2 = Long.valueOf(this.b);
                z7.d dVar2 = mgVar2.c;
                Collection collection2 = (Collection) dVar2.get(i1Var);
                if (collection2 == null) {
                    ArrayList arrayList2 = new ArrayList(3);
                    if (!arrayList2.add(valueOf2)) {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                    dVar2.put(i1Var, arrayList2);
                } else {
                    collection2.add(valueOf2);
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (xfVar.d(ibVar, elapsedRealtime2)) {
                    xfVar.i.put(ibVar, Long.valueOf(elapsedRealtime2));
                    rb.m.a.execute(new p8.b(xfVar));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ da(xf xfVar, z7.i1 i1Var, long j10) {
        ib ibVar = ib.b;
        this.c = xfVar;
        this.d = i1Var;
        this.b = j10;
    }
}
