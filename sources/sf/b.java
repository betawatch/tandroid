package sf;

import mh.m5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
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
                    eVar.p(dVar2);
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
                        m5 m5Var = dVar4.a;
                        ((ConnectionsManager) m5Var.b).checkWebProxyInternal(dVar4.b, i10, new c(eVar2, dVar4));
                        break;
                    } else {
                        eVar2.p(dVar4);
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
                    eVar3.p(dVar6);
                    break;
                }
                break;
        }
    }
}
