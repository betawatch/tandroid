// default package

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class t3f implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t3f(sef sefVar, isd isdVar, long j) {
        p5f p5fVar = p5f.b;
        this.c = sefVar;
        this.d = isdVar;
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
                z3f z3fVar = (z3f) obj2;
                cpd cpdVar = (cpd) obj;
                HashMap hashMap = z3fVar.j;
                ete eteVar = ete.f;
                if (!hashMap.containsKey(eteVar)) {
                    so2 so2Var = new so2((byte) 2);
                    j7d j7dVar = new j7d();
                    if (!so2Var.isEmpty()) {
                        sc8.e();
                        throw null;
                    }
                    j7dVar.c = so2Var;
                    hashMap.put(eteVar, j7dVar);
                }
                j7d j7dVar2 = (j7d) hashMap.get(eteVar);
                Long valueOf = Long.valueOf(j);
                so2 so2Var2 = j7dVar2.c;
                Collection collection = (Collection) so2Var2.get(cpdVar);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (!arrayList.add(valueOf)) {
                        fi7.g("New Collection violated the Collection spec");
                        return;
                    } else {
                        j7dVar2.d++;
                        so2Var2.put(cpdVar, arrayList);
                    }
                } else if (collection.add(valueOf)) {
                    j7dVar2.d++;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (z3fVar.c(eteVar, elapsedRealtime)) {
                    z3fVar.i.put(eteVar, Long.valueOf(elapsedRealtime));
                    yjb.c(1, new bod(z3fVar, (byte) 3));
                    return;
                }
                return;
            default:
                sef sefVar = (sef) obj2;
                p5f p5fVar = p5f.O1;
                isd isdVar = (isd) obj;
                HashMap hashMap2 = sefVar.j;
                if (!hashMap2.containsKey(p5fVar)) {
                    so2 so2Var3 = new so2((byte) 1);
                    vhf vhfVar = new vhf();
                    if (!so2Var3.isEmpty()) {
                        sc8.e();
                        throw null;
                    }
                    vhfVar.c = so2Var3;
                    hashMap2.put(p5fVar, vhfVar);
                }
                vhf vhfVar2 = (vhf) hashMap2.get(p5fVar);
                Long valueOf2 = Long.valueOf(j);
                so2 so2Var4 = vhfVar2.c;
                Collection collection2 = (Collection) so2Var4.get(isdVar);
                if (collection2 == null) {
                    ArrayList arrayList2 = new ArrayList(3);
                    if (!arrayList2.add(valueOf2)) {
                        fi7.g("New Collection violated the Collection spec");
                        return;
                    }
                    so2Var4.put(isdVar, arrayList2);
                } else {
                    collection2.add(valueOf2);
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (sefVar.d(p5fVar, elapsedRealtime2)) {
                    sefVar.i.put(p5fVar, Long.valueOf(elapsedRealtime2));
                    yjb.c(1, new bod(sefVar));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ t3f(z3f z3fVar, cpd cpdVar, long j) {
        this.c = z3fVar;
        this.d = cpdVar;
        this.b = j;
    }
}
