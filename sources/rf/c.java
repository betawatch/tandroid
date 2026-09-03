package rf;

import lh.m5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ e c;

    public /* synthetic */ c(f fVar, e eVar, int i10) {
        this.a = i10;
        this.b = fVar;
        this.c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f fVar = this.b;
                e eVar = (e) fVar.c;
                e eVar2 = this.c;
                if (eVar == eVar2) {
                    fVar.d = null;
                    fVar.p(eVar2);
                    break;
                }
                break;
            case 1:
                f fVar2 = this.b;
                e eVar3 = (e) fVar2.c;
                e eVar4 = this.c;
                if (eVar3 == eVar4) {
                    c cVar = (c) fVar2.d;
                    if (cVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(cVar);
                        fVar2.d = null;
                    }
                    int i10 = eVar4.d;
                    if (i10 != 0) {
                        c cVar2 = new c(fVar2, eVar4, 2);
                        fVar2.e = cVar2;
                        AndroidUtilities.runOnUIThread(cVar2, 20000L);
                        m5 m5Var = eVar4.a;
                        ((ConnectionsManager) m5Var.b).checkWebProxyInternal(eVar4.b, i10, new d(fVar2, eVar4));
                        break;
                    } else {
                        fVar2.p(eVar4);
                        break;
                    }
                }
                break;
            default:
                f fVar3 = this.b;
                e eVar5 = (e) fVar3.c;
                e eVar6 = this.c;
                if (eVar5 == eVar6) {
                    fVar3.e = null;
                    fVar3.p(eVar6);
                    break;
                }
                break;
        }
    }
}
