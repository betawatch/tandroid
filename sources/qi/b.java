package qi;

import ji.m5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                d dVar = (d) eVar.b;
                d dVar2 = this.c;
                if (dVar == dVar2) {
                    eVar.c = null;
                    eVar.h(dVar2);
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
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        eVar2.c = null;
                    }
                    int i10 = dVar4.d;
                    if (i10 != 0) {
                        b bVar2 = new b(eVar2, dVar4, 2);
                        eVar2.d = bVar2;
                        AndroidUtilities.runOnUIThread(bVar2, 20000L);
                        m5 m5Var = dVar4.a;
                        ((ConnectionsManager) m5Var.b).checkWebProxyInternal(dVar4.b, i10, new c(eVar2, dVar4));
                        break;
                    } else {
                        eVar2.h(dVar4);
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
                    eVar3.h(dVar6);
                    break;
                }
                break;
        }
    }
}
