// default package

import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bc b;

    public /* synthetic */ rb(bc bcVar, byte b) {
        this.a = b;
        this.b = bcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        bc bcVar = this.b;
        switch (b) {
            case 0:
                bcVar.W.g(bcVar.b0.end_date != 0 ? kz9.f((r3 - bcVar.getConnectionsManager().getCurrentTime()) * 1000) : null, true);
                if (bcVar.b0.end_date != 0 && bcVar.e0) {
                    gl.e3(bcVar.Y, 1000L);
                    break;
                }
                break;
            case 1:
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = bcVar.getMessagesController().m1(bcVar.S);
                TL_payments.starRefProgram starrefprogram = bcVar.b0;
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
                hd hdVar = new hd(3, null, bcVar.getParentActivity());
                hdVar.q(150L);
                bcVar.getConnectionsManager().sendRequest(updatestarrefprogram, new ob(bcVar, hdVar, b2));
                break;
            default:
                d01.t(bcVar.getParentActivity(), k96.M0((bcVar.Z || bcVar.b0.end_date != 0) ? 2131754311 : 2131754324, null));
                break;
        }
    }
}
