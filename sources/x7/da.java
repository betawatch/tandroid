package x7;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import z7.hb;
import z7.lg;
import z7.wf;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class da implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ da(fa faVar, r0 r0Var, long j3) {
        this.c = faVar;
        this.d = r0Var;
        this.b = j3;
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
                    qb.m.a.execute(new sg.a1(faVar, 4));
                    return;
                }
                return;
            default:
                wf wfVar = (wf) this.c;
                hb hbVar = hb.N1;
                z7.i1 i1Var = (z7.i1) this.d;
                HashMap hashMap2 = wfVar.j;
                if (!hashMap2.containsKey(hbVar)) {
                    z7.d dVar = new z7.d();
                    lg lgVar = new lg();
                    if (!dVar.isEmpty()) {
                        throw new IllegalArgumentException();
                    }
                    lgVar.c = dVar;
                    hashMap2.put(hbVar, lgVar);
                }
                lg lgVar2 = (lg) hashMap2.get(hbVar);
                Long valueOf2 = Long.valueOf(this.b);
                z7.d dVar2 = lgVar2.c;
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
                if (wfVar.d(hbVar, elapsedRealtime2)) {
                    wfVar.i.put(hbVar, Long.valueOf(elapsedRealtime2));
                    qb.m.a.execute(new sg.a1(wfVar));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ da(wf wfVar, z7.i1 i1Var, long j3) {
        hb hbVar = hb.b;
        this.c = wfVar;
        this.d = i1Var;
        this.b = j3;
    }
}
