package wh;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.ti0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                ti0 ti0Var = qVar.L;
                if (ti0Var != null) {
                    ti0Var.h(false);
                    qVar.L = null;
                    break;
                }
                break;
            case 1:
                q qVar2 = this.b;
                qVar2.H(0, false, 0, false, 0L);
                ti0 ti0Var2 = qVar2.L;
                if (ti0Var2 != null) {
                    ti0Var2.h(true);
                    qVar2.L = null;
                    break;
                }
                break;
            case 2:
                q qVar3 = this.b;
                if (!UserConfig.getInstance(qVar3.n).isPremium()) {
                    new fg.n1(qVar3.b.c0, qVar3.getContext(), qVar3.n, 43, true).show();
                    break;
                }
                break;
            case 3:
                q qVar4 = this.b;
                v3 v3Var = qVar4.s;
                if (v3Var != null) {
                    v3Var.setSendEnabled(qVar4.r.L3());
                    break;
                }
                break;
            default:
                this.b.a0();
                break;
        }
    }
}
