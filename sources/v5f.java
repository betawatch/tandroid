// default package

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class v5f implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v5f(tgf tgfVar, lud ludVar, long j) {
        r7f r7fVar = r7f.b;
        this.c = tgfVar;
        this.d = ludVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                b6f b6fVar = (b6f) obj2;
                frd frdVar = (frd) obj;
                HashMap hashMap = b6fVar.j;
                hve hveVar = hve.f;
                if (!hashMap.containsKey(hveVar)) {
                    dq2 dq2Var = new dq2((byte) 2);
                    l9d l9dVar = new l9d();
                    if (!dq2Var.isEmpty()) {
                        i98.g();
                        throw null;
                    }
                    l9dVar.c = dq2Var;
                    hashMap.put(hveVar, l9dVar);
                }
                l9d l9dVar2 = (l9d) hashMap.get(hveVar);
                Long valueOf = Long.valueOf(j);
                dq2 dq2Var2 = l9dVar2.c;
                Collection collection = (Collection) dq2Var2.get(frdVar);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (!arrayList.add(valueOf)) {
                        bh7.j("New Collection violated the Collection spec");
                        return;
                    } else {
                        l9dVar2.d++;
                        dq2Var2.put(frdVar, arrayList);
                    }
                } else if (collection.add(valueOf)) {
                    l9dVar2.d++;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (b6fVar.c(hveVar, elapsedRealtime)) {
                    b6fVar.i.put(hveVar, Long.valueOf(elapsedRealtime));
                    mlb.c(1, new eqd(b6fVar, (byte) 3));
                    return;
                }
                return;
            default:
                tgf tgfVar = (tgf) obj2;
                r7f r7fVar = r7f.O1;
                lud ludVar = (lud) obj;
                HashMap hashMap2 = tgfVar.j;
                if (!hashMap2.containsKey(r7fVar)) {
                    dq2 dq2Var3 = new dq2((byte) 1);
                    wjf wjfVar = new wjf();
                    if (!dq2Var3.isEmpty()) {
                        i98.g();
                        throw null;
                    }
                    wjfVar.c = dq2Var3;
                    hashMap2.put(r7fVar, wjfVar);
                }
                wjf wjfVar2 = (wjf) hashMap2.get(r7fVar);
                Long valueOf2 = Long.valueOf(j);
                dq2 dq2Var4 = wjfVar2.c;
                Collection collection2 = (Collection) dq2Var4.get(ludVar);
                if (collection2 == null) {
                    ArrayList arrayList2 = new ArrayList(3);
                    if (!arrayList2.add(valueOf2)) {
                        bh7.j("New Collection violated the Collection spec");
                        return;
                    }
                    dq2Var4.put(ludVar, arrayList2);
                } else {
                    collection2.add(valueOf2);
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (tgfVar.d(r7fVar, elapsedRealtime2)) {
                    tgfVar.i.put(r7fVar, Long.valueOf(elapsedRealtime2));
                    mlb.c(1, new eqd(tgfVar));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ v5f(b6f b6fVar, frd frdVar, long j) {
        this.c = b6fVar;
        this.d = frdVar;
        this.b = j;
    }
}
