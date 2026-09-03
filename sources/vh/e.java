package vh;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.ui0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ e(q qVar, int i10) {
        this.a = i10;
        this.b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q qVar = this.b;
                qVar.H(2147483646, true, 0, false, 0L);
                ui0 ui0Var = qVar.L;
                if (ui0Var != null) {
                    ui0Var.h(false);
                    qVar.L = null;
                    break;
                }
                break;
            case 1:
                q qVar2 = this.b;
                qVar2.H(0, false, 0, false, 0L);
                ui0 ui0Var2 = qVar2.L;
                if (ui0Var2 != null) {
                    ui0Var2.h(true);
                    qVar2.L = null;
                    break;
                }
                break;
            case 2:
                q qVar3 = this.b;
                if (!UserConfig.getInstance(qVar3.n).isPremium()) {
                    new eg.o1(qVar3.b.c0, qVar3.getContext(), qVar3.n, 43, true).show();
                    break;
                }
                break;
            case 3:
                q qVar4 = this.b;
                w3 w3Var = qVar4.s;
                if (w3Var != null) {
                    w3Var.setSendEnabled(qVar4.r.L3());
                    break;
                }
                break;
            default:
                this.b.a0();
                break;
        }
    }
}
