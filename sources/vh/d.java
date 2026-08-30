package vh;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.si0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ d(p pVar, int i10) {
        this.a = i10;
        this.b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p pVar = this.b;
                pVar.H(2147483646, true, 0, false, 0L);
                si0 si0Var = pVar.L;
                if (si0Var != null) {
                    si0Var.h(false);
                    pVar.L = null;
                    break;
                }
                break;
            case 1:
                p pVar2 = this.b;
                pVar2.H(0, false, 0, false, 0L);
                si0 si0Var2 = pVar2.L;
                if (si0Var2 != null) {
                    si0Var2.h(true);
                    pVar2.L = null;
                    break;
                }
                break;
            case 2:
                p pVar3 = this.b;
                if (!UserConfig.getInstance(pVar3.n).isPremium()) {
                    new eg.o1(pVar3.b.c0, pVar3.getContext(), pVar3.n, 43, true).show();
                    break;
                }
                break;
            case 3:
                p pVar4 = this.b;
                v3 v3Var = pVar4.s;
                if (v3Var != null) {
                    v3Var.setSendEnabled(pVar4.r.M3());
                    break;
                }
                break;
            default:
                this.b.a0();
                break;
        }
    }
}
