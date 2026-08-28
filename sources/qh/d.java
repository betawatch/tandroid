package qh;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.li0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ d(p pVar, int i9) {
        this.a = i9;
        this.b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p pVar = this.b;
                pVar.H(2147483646, true, 0, false, 0L);
                li0 li0Var = pVar.K;
                if (li0Var != null) {
                    li0Var.h(false);
                    pVar.K = null;
                    break;
                }
                break;
            case 1:
                p pVar2 = this.b;
                pVar2.H(0, false, 0, false, 0L);
                li0 li0Var2 = pVar2.K;
                if (li0Var2 != null) {
                    li0Var2.h(true);
                    pVar2.K = null;
                    break;
                }
                break;
            case 2:
                p pVar3 = this.b;
                if (!UserConfig.getInstance(pVar3.n).isPremium()) {
                    new zf.x0(pVar3.b.b0, pVar3.getContext(), pVar3.n, 43, true).show();
                    break;
                }
                break;
            case 3:
                p pVar4 = this.b;
                s3 s3Var = pVar4.s;
                if (s3Var != null) {
                    s3Var.setSendEnabled(pVar4.r.M3());
                    break;
                }
                break;
            default:
                this.b.Z();
                break;
        }
    }
}
