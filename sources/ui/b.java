package ui;

import l2.y;
import org.telegram.messenger.g0;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
                d dVar = (d) eVar.c;
                d dVar2 = this.c;
                if (dVar == dVar2) {
                    eVar.d = null;
                    eVar.m(dVar2);
                    break;
                }
                break;
            case 1:
                e eVar2 = this.b;
                d dVar3 = (d) eVar2.c;
                d dVar4 = this.c;
                if (dVar3 == dVar4) {
                    b bVar = (b) eVar2.d;
                    if (bVar != null) {
                        g0.r(bVar);
                        eVar2.d = null;
                    }
                    int i7 = dVar4.d;
                    if (i7 != 0) {
                        b bVar2 = new b(eVar2, dVar4, 2);
                        eVar2.e = bVar2;
                        g0.i3(bVar2, 20000L);
                        y yVar = dVar4.a;
                        ((ConnectionsManager) yVar.b).checkWebProxyInternal(dVar4.b, i7, new c(eVar2, dVar4));
                        break;
                    } else {
                        eVar2.m(dVar4);
                        break;
                    }
                }
                break;
            default:
                e eVar3 = this.b;
                d dVar5 = (d) eVar3.c;
                d dVar6 = this.c;
                if (dVar5 == dVar6) {
                    eVar3.e = null;
                    eVar3.m(dVar6);
                    break;
                }
                break;
        }
    }
}
