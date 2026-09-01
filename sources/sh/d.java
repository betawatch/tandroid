package sh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                jVar.Q.f(jVar.V.end_date == 0 ? null : lg.n.f((r2 - jVar.getConnectionsManager().getCurrentTime()) * 1000), true);
                if (jVar.V.end_date != 0 && jVar.Y) {
                    AndroidUtilities.runOnUIThread(jVar.S, 1000L);
                    break;
                }
                break;
            case 1:
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                j jVar2 = this.b;
                updatestarrefprogram.bot = jVar2.getMessagesController().getInputUser(jVar2.M);
                TL_payments.starRefProgram starrefprogram = jVar2.V;
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
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(jVar2.getParentActivity(), 3, null);
                d2Var.q(150L);
                jVar2.getConnectionsManager().sendRequest(updatestarrefprogram, new b(jVar2, d2Var, 1));
                break;
            default:
                j jVar3 = this.b;
                af.g.s(jVar3.getParentActivity(), LocaleController.getString((jVar3.T || jVar3.V.end_date != 0) ? R.string.AffiliateProgramUpdateInfoLink : R.string.AffiliateProgramStartInfoLink));
                break;
        }
    }
}
