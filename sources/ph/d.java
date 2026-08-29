package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ d(j jVar, int i10) {
        this.a = i10;
        this.b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j jVar = this.b;
                jVar.P.f(jVar.U.end_date == 0 ? null : ig.n.f((r2 - jVar.getConnectionsManager().getCurrentTime()) * 1000), true);
                if (jVar.U.end_date != 0 && jVar.X) {
                    AndroidUtilities.runOnUIThread(jVar.R, 1000L);
                    break;
                }
                break;
            case 1:
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                j jVar2 = this.b;
                updatestarrefprogram.bot = jVar2.getMessagesController().getInputUser(jVar2.L);
                TL_payments.starRefProgram starrefprogram = jVar2.U;
                updatestarrefprogram.commission_permille = starrefprogram.commission_permille;
                int i10 = starrefprogram.duration_months;
                updatestarrefprogram.duration_months = i10;
                if (i10 > 0) {
                    updatestarrefprogram.flags |= 1;
                    starrefprogram.duration_months = i10 | 1;
                } else {
                    updatestarrefprogram.flags &= -2;
                    starrefprogram.duration_months = i10 & (-2);
                }
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(jVar2.getParentActivity(), 3, null);
                c2Var.q(150L);
                jVar2.getConnectionsManager().sendRequest(updatestarrefprogram, new b(jVar2, c2Var, 1));
                break;
            default:
                j jVar3 = this.b;
                ye.d.s(jVar3.getParentActivity(), LocaleController.getString((jVar3.S || jVar3.U.end_date != 0) ? R.string.AffiliateProgramUpdateInfoLink : R.string.AffiliateProgramStartInfoLink));
                break;
        }
    }
}
