package x7;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import z7.hb;
import z7.mg;
import z7.xf;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ea implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ea(ga gaVar, r0 r0Var, long j10) {
        this.c = gaVar;
        this.d = r0Var;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ga gaVar = (ga) this.c;
                r0 r0Var = (r0) this.d;
                HashMap hashMap = gaVar.j;
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
                if (gaVar.c(o7Var, elapsedRealtime)) {
                    gaVar.i.put(o7Var, Long.valueOf(elapsedRealtime));
                    jb.m.a.execute(new u0.b(gaVar, 2));
                    return;
                }
                return;
            default:
                xf xfVar = (xf) this.c;
                hb hbVar = hb.N1;
                z7.i1 i1Var = (z7.i1) this.d;
                HashMap hashMap2 = xfVar.j;
                if (!hashMap2.containsKey(hbVar)) {
                    z7.d dVar = new z7.d();
                    mg mgVar = new mg();
                    if (!dVar.isEmpty()) {
                        throw new IllegalArgumentException();
                    }
                    mgVar.c = dVar;
                    hashMap2.put(hbVar, mgVar);
                }
                mg mgVar2 = (mg) hashMap2.get(hbVar);
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
                if (xfVar.d(hbVar, elapsedRealtime2)) {
                    xfVar.i.put(hbVar, Long.valueOf(elapsedRealtime2));
                    jb.m.a.execute(new u0.b(xfVar));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ ea(xf xfVar, z7.i1 i1Var, long j10) {
        hb hbVar = hb.b;
        this.c = xfVar;
        this.d = i1Var;
        this.b = j10;
    }
}
