package wi;

import b8.ah;
import b8.cg;
import b8.kg;
import b8.sa;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import xg.e1;
import z7.da;
import z7.l7;
import z7.n7;
import z7.z6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i0(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k2.i0 i0Var;
        switch (this.a) {
            case 0:
                t0 t0Var = (t0) this.b;
                if (t0Var.Z == 5 && (i0Var = t0Var.V) != null && t0Var.z) {
                    long N0 = i0Var.N0();
                    long j10 = t0Var.J;
                    if (N0 < j10 || N0 >= t0Var.K) {
                        t0Var.V.Z0(5, j10);
                    }
                    t0Var.d.getClass();
                    t0Var.i.postDelayed(this, 33L);
                    break;
                }
                break;
            case 1:
                xg.w0 w0Var = (xg.w0) this.b;
                String str = w0Var.g2;
                if (str != null) {
                    w0Var.f1(w0Var.k2, str, false);
                    break;
                }
                break;
            case 2:
                e1 e1Var = (e1) this.b;
                String str2 = e1Var.h2;
                if (str2 != null) {
                    if (e1Var.q2 >= 0) {
                        ConnectionsManager.getInstance(e1Var.a).cancelRequest(e1Var.q2, true);
                        e1Var.q2 = -1;
                    }
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.q = str2;
                    e1Var.q2 = ConnectionsManager.getInstance(e1Var.a).sendRequest(tL_contacts_search, new ci.d0(e1Var, 25));
                    break;
                }
                break;
            default:
                da daVar = (da) this.b;
                HashMap hashMap = daVar.j;
                n7 n7Var = n7.f;
                z7.e eVar = (z7.e) hashMap.get(n7Var);
                if (eVar != null) {
                    z7.e eVar2 = eVar;
                    z7.a aVar = eVar2.a;
                    if (aVar == null) {
                        z7.e eVar3 = eVar2;
                        z7.a aVar2 = new z7.a(eVar3, eVar3.c);
                        eVar2.a = aVar2;
                        aVar = aVar2;
                    }
                    Iterator it = aVar.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Object obj = (Collection) eVar.c.get(next);
                        if (obj == null) {
                            obj = new ArrayList(3);
                        }
                        List list = (List) obj;
                        ArrayList arrayList = new ArrayList(list instanceof RandomAccess ? new z7.b(eVar, next, list, null) : new ah(eVar, next, list, (ah) null));
                        Collections.sort(arrayList);
                        sa saVar = new sa();
                        int size = arrayList.size();
                        long j11 = 0;
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj2 = arrayList.get(i3);
                            i3++;
                            j11 += ((Long) obj2).longValue();
                        }
                        saVar.c = Long.valueOf((j11 / arrayList.size()) & Long.MAX_VALUE);
                        saVar.a = Long.valueOf(da.a(arrayList, 100.0d) & Long.MAX_VALUE);
                        saVar.f = Long.valueOf(da.a(arrayList, 75.0d) & Long.MAX_VALUE);
                        saVar.e = Long.valueOf(da.a(arrayList, 50.0d) & Long.MAX_VALUE);
                        saVar.d = Long.valueOf(da.a(arrayList, 25.0d) & Long.MAX_VALUE);
                        saVar.b = Long.valueOf(da.a(arrayList, 0.0d) & Long.MAX_VALUE);
                        z6 z6Var = new z6(saVar);
                        int size2 = arrayList.size();
                        l2.e eVar4 = new l2.e();
                        eVar4.c = l7.b;
                        p7.d dVar = new p7.d(29, false);
                        dVar.d = Integer.valueOf(size2 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        dVar.b = (z7.r0) next;
                        dVar.c = z6Var;
                        eVar4.f = new z7.s0(dVar);
                        mb.m.a.execute(new cg(daVar, new kg(eVar4, 0), n7Var, daVar.b(), 8));
                    }
                    hashMap.remove(n7Var);
                    break;
                }
                break;
        }
    }
}
