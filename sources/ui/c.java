package ui;

import org.telegram.messenger.g0;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ e c;

    public /* synthetic */ c(f fVar, e eVar, int i3) {
        this.a = i3;
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
                    fVar.h(eVar2);
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
                        g0.r(cVar);
                        fVar2.d = null;
                    }
                    int i3 = eVar4.d;
                    if (i3 != 0) {
                        c cVar2 = new c(fVar2, eVar4, 2);
                        fVar2.e = cVar2;
                        g0.i3(cVar2, 20000L);
                        l5.b bVar = eVar4.a;
                        ((ConnectionsManager) bVar.b).checkWebProxyInternal(eVar4.b, i3, new d(fVar2, eVar4));
                        break;
                    } else {
                        fVar2.h(eVar4);
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
                    fVar3.h(eVar6);
                    break;
                }
                break;
        }
    }
}
