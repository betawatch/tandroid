package xh;

import org.telegram.messenger.cd;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ d(i iVar, int i10) {
        this.a = i10;
        this.b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = 1;
        i iVar = this.b;
        switch (i10) {
            case 0:
                iVar.V.g(iVar.a0.end_date != 0 ? qg.k.f((r4 - iVar.getConnectionsManager().getCurrentTime()) * 1000) : null, true);
                if (iVar.a0.end_date != 0 && iVar.d0) {
                    org.telegram.messenger.i0.h3(iVar.X, 1000L);
                    break;
                }
                break;
            case 1:
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = iVar.getMessagesController().n1(iVar.R);
                TL_payments.starRefProgram starrefprogram = iVar.a0;
                updatestarrefprogram.commission_permille = starrefprogram.commission_permille;
                int i12 = starrefprogram.duration_months;
                updatestarrefprogram.duration_months = i12;
                if (i12 > 0) {
                    updatestarrefprogram.flags |= 1;
                    starrefprogram.duration_months = i12 | 1;
                } else {
                    updatestarrefprogram.flags &= -2;
                    starrefprogram.duration_months = i12 & (-2);
                }
                org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, iVar.getParentActivity(), null);
                x1Var.r(150L);
                iVar.getConnectionsManager().sendRequest(updatestarrefprogram, new b(iVar, x1Var, i11));
                break;
            default:
                gf.f.r(iVar.getParentActivity(), cd.L0((iVar.Y || iVar.a0.end_date != 0) ? 2131754314 : 2131754327, null));
                break;
        }
    }
}
