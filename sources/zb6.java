// default package

import android.text.TextUtils;
import java.io.Serializable;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zb6 implements ncc, fd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tc6 b;

    public /* synthetic */ zb6(tc6 tc6Var, byte b) {
        this.a = b;
        this.b = tc6Var;
    }

    @Override // ncc
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        tc6 tc6Var = this.b;
        b8c b8cVar = (b8c) obj;
        int i = b8cVar.d;
        byte b = 3;
        if (i != 1 && b8cVar.c != tc6Var.f) {
            if (i == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tc6Var.getParentActivity());
                alertDialog$Builder.a.S = ob6.M0(2131752675, null);
                alertDialog$Builder.a.U = ob6.M0(2131752676, null);
                alertDialog$Builder.j(ob6.M0(2131746048, null), new zb6(tc6Var, b));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                tc6Var.showDialog(alertDialog$Builder.a);
                return;
            }
            return;
        }
        if (tc6Var.x != null && b8cVar.c != tc6Var.f) {
            tc6Var.x = null;
            tc6Var.a.g3.O(true);
            return;
        }
        uc6 uc6Var = new uc6(8);
        TLRPC.GeoPoint geoPoint = tc6Var.x;
        if (geoPoint != null) {
            TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
            tL_channelLocation.address = tc6Var.y;
            TLRPC.GeoPoint geoPoint2 = tc6Var.x;
            tL_channelLocation.geo_point = geoPoint2;
            uc6Var.I0 = tL_channelLocation;
            geoPoint = geoPoint2;
        }
        uc6Var.M0 = new u34(tc6Var, uc6Var, (byte) 21);
        if (geoPoint != null || TextUtils.isEmpty(tc6Var.y)) {
            tc6Var.presentFragment(uc6Var);
            return;
        }
        id idVar = new id(3, null, tc6Var.getParentActivity());
        idVar.j0 = false;
        idVar.q(200L);
        Utilities.g.c(new xb6(tc6Var, uc6Var, idVar));
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        tc6 tc6Var = this.b;
        switch (b) {
            case 1:
                tc6Var.a0();
                break;
            case 2:
                tc6Var.finishFragment();
                break;
            default:
                tc6Var.b.b(true);
                TLRPC.UserFull Y1 = tc6Var.getMessagesController().Y1(tc6Var.getUserConfig().e());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (Y1 != null) {
                    Y1.business_location = null;
                    Y1.flags2 &= -3;
                }
                tc6Var.getConnectionsManager().sendRequest(updatebusinesslocation, new gc6(tc6Var, (byte) 1));
                break;
        }
    }
}
