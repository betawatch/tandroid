// default package

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qgb implements ed {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sgb b;

    public /* synthetic */ qgb(sgb sgbVar, byte b) {
        this.a = b;
        this.b = sgbVar;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        sgb sgbVar = this.b;
        switch (b) {
            case 0:
                sgbVar.a();
                break;
            case 1:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sgbVar.getContext());
                String M0 = k96.M0(2131743737, null);
                hd hdVar2 = alertDialog$Builder.a;
                hdVar2.U = M0;
                hdVar2.S = k96.M0(R.string.AppName, null);
                alertDialog$Builder.j(k96.M0(2131751640, null), new qgb(sgbVar, (byte) 2));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                alertDialog$Builder.o();
                break;
            default:
                hd hdVar3 = new hd(3, null, sgbVar.getContext());
                hdVar3.j0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(sgbVar.d).sendRequest(deleteaccount, new apa(sgbVar, hdVar3, (byte) 11));
                hdVar3.show();
                break;
        }
    }
}
