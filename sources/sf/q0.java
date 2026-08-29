package sf;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.w41;
import org.telegram.ui.fi1;
import org.telegram.ui.rc0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements Utilities.Callback5, b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ q0(v0 v0Var, int i10) {
        this.a = i10;
        this.b = v0Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(c2 c2Var, int i10) {
        switch (this.a) {
            case 1:
                this.b.W();
                break;
            case 2:
                this.b.finishFragment();
                break;
            default:
                v0 v0Var = this.b;
                v0Var.b.a(1.0f);
                TLRPC.UserFull userFull = v0Var.getMessagesController().getUserFull(v0Var.getUserConfig().getClientUserId());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (userFull != null) {
                    userFull.business_location = null;
                    userFull.flags2 &= -3;
                }
                v0Var.getConnectionsManager().sendRequest(updatebusinesslocation, new r0(v0Var, 1));
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        v0 v0Var = this.b;
        w41 w41Var = (w41) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = w41Var.d;
        if (i10 != 1 && w41Var.c != v0Var.h) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v0Var.getParentActivity());
                alertDialog$Builder.a.N = LocaleController.getString(R.string.BusinessLocationClearTitle);
                alertDialog$Builder.a.P = LocaleController.getString(R.string.BusinessLocationClearMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new q0(v0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                v0Var.showDialog(alertDialog$Builder.a);
                return;
            }
            return;
        }
        if (v0Var.x != null && w41Var.c != v0Var.h) {
            v0Var.x = null;
            v0Var.a.U2.N(true);
            return;
        }
        rc0 rc0Var = new rc0(8);
        if (v0Var.x != null) {
            TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
            tL_channelLocation.address = v0Var.y;
            tL_channelLocation.geo_point = v0Var.x;
            rc0Var.w0 = tL_channelLocation;
        }
        rc0Var.B0 = new fi1(9, v0Var, rc0Var);
        if (v0Var.x != null || TextUtils.isEmpty(v0Var.y)) {
            v0Var.presentFragment(rc0Var);
            return;
        }
        c2 c2Var = new c2(v0Var.getParentActivity(), 3, null);
        c2Var.c0 = false;
        c2Var.q(200L);
        Utilities.searchQueue.postRunnable(new o0(v0Var, rc0Var, c2Var));
    }
}
