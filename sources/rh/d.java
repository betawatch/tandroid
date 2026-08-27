package rh;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.ni0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                pVar.I(2147483646, true, 0, false, 0L);
                ni0 ni0Var = pVar.K;
                if (ni0Var != null) {
                    ni0Var.h(false);
                    pVar.K = null;
                    break;
                }
                break;
            case 1:
                p pVar2 = this.b;
                pVar2.I(0, false, 0, false, 0L);
                ni0 ni0Var2 = pVar2.K;
                if (ni0Var2 != null) {
                    ni0Var2.h(true);
                    pVar2.K = null;
                    break;
                }
                break;
            case 2:
                p pVar3 = this.b;
                if (!UserConfig.getInstance(pVar3.n).isPremium()) {
                    new ag.g2(pVar3.b.b0, pVar3.getContext(), pVar3.n, 43, true).show();
                    break;
                }
                break;
            case 3:
                p pVar4 = this.b;
                t3 t3Var = pVar4.s;
                if (t3Var != null) {
                    t3Var.setSendEnabled(pVar4.r.M3());
                    break;
                }
                break;
            default:
                this.b.a0();
                break;
        }
    }
}
