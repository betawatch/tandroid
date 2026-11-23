package xi;

import kg.x1;
import org.telegram.messenger.g0;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
                        g0.h3(bVar2, 20000L);
                        x1 x1Var = dVar4.a;
                        ((ConnectionsManager) x1Var.b).checkWebProxyInternal(dVar4.b, i7, new c(eVar2, dVar4));
                        break;
                    } else {
                        eVar2.m(dVar4);
                        break;
                    }
                }
                break;
            default:
                e eVar3 = this.b;
                d dVar5 = (d) eVar3.b;
                d dVar6 = this.c;
                if (dVar5 == dVar6) {
                    eVar3.d = null;
                    eVar3.m(dVar6);
                    break;
                }
                break;
        }
    }
}
