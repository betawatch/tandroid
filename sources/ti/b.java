package ti;

import jg.e1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ d c;

    public /* synthetic */ b(e eVar, d dVar, int i10) {
        this.a = i10;
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
                    eVar.e(dVar2);
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
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        eVar2.d = null;
                    }
                    int i10 = dVar4.d;
                    if (i10 != 0) {
                        b bVar2 = new b(eVar2, dVar4, 2);
                        eVar2.e = bVar2;
                        AndroidUtilities.runOnUIThread(bVar2, 20000L);
                        e1 e1Var = dVar4.a;
                        ((ConnectionsManager) e1Var.b).checkWebProxyInternal(dVar4.b, i10, new c(eVar2, dVar4));
                        break;
                    } else {
                        eVar2.e(dVar4);
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
                    eVar3.e(dVar6);
                    break;
                }
                break;
        }
    }
}
