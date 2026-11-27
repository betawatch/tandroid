// default package

import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class pb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cc b;

    public /* synthetic */ pb(cc ccVar, byte b) {
        this.a = b;
        this.b = ccVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        cc ccVar = this.b;
        switch (b) {
            case 0:
                m01.u(ccVar.getParentActivity(), ob6.M0((ccVar.Z || ccVar.b0.end_date != 0) ? 2131754307 : 2131754320, null));
                break;
            case 1:
                ccVar.W.g(ccVar.b0.end_date != 0 ? e3a.f((r3 - ccVar.getConnectionsManager().getCurrentTime()) * 1000) : null, true);
                if (ccVar.b0.end_date != 0 && ccVar.e0) {
                    hl.d3(ccVar.Y, 1000L);
                    break;
                }
                break;
            default:
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = ccVar.getMessagesController().o1(ccVar.S);
                TL_payments.starRefProgram starrefprogram = ccVar.b0;
                updatestarrefprogram.commission_permille = starrefprogram.commission_permille;
                int i = starrefprogram.duration_months;
                updatestarrefprogram.duration_months = i;
                int i2 = updatestarrefprogram.flags;
                if (i > 0) {
                    updatestarrefprogram.flags = i2 | 1;
                    starrefprogram.duration_months = i | 1;
                } else {
                    updatestarrefprogram.flags = i2 & (-2);
                    starrefprogram.duration_months = i & (-2);
                }
                id idVar = new id(3, null, ccVar.getParentActivity());
                idVar.q(150L);
                ccVar.getConnectionsManager().sendRequest(updatestarrefprogram, new qb(ccVar, idVar, b2));
                break;
        }
    }
}
