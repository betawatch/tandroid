package xi;

import org.telegram.messenger.g0;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ d c;

    public /* synthetic */ b(e eVar, d dVar, int i7) {
        this.a = i7;
        this.b = eVar;
        this.c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e eVar = this.b;
                d dVar = (d) eVar.b;
                d dVar2 = this.c;
                if (dVar == dVar2) {
                    eVar.c = null;
                    eVar.m(dVar2);
                    break;
                }
                break;
            case 1:
                e eVar2 = this.b;
                d dVar3 = (d) eVar2.b;
                d dVar4 = this.c;
                if (dVar3 == dVar4) {
                    b bVar = (b) eVar2.c;
                    if (bVar != null) {
                        g0.r(bVar);
                        eVar2.c = null;
                    }
                    int i7 = dVar4.d;
                    if (i7 != 0) {
                        b bVar2 = new b(eVar2, dVar4, 2);
                        eVar2.d = bVar2;
                        g0.i3(bVar2, 20000L);
                        ki.e eVar3 = dVar4.a;
                        ((ConnectionsManager) eVar3.b).checkWebProxyInternal(dVar4.b, i7, new c(eVar2, dVar4));
                        break;
                    } else {
                        eVar2.m(dVar4);
                        break;
                    }
                }
                break;
            default:
                e eVar4 = this.b;
                d dVar5 = (d) eVar4.b;
                d dVar6 = this.c;
                if (dVar5 == dVar6) {
                    eVar4.d = null;
                    eVar4.m(dVar6);
                    break;
                }
                break;
        }
    }
}
