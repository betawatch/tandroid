package qf;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.n41;
import org.telegram.ui.di1;
import org.telegram.ui.tc0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements Utilities.Callback5, a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;

    public /* synthetic */ r0(w0 w0Var, int i10) {
        this.a = i10;
        this.b = w0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                this.b.W();
                break;
            case 2:
                this.b.finishFragment();
                break;
            default:
                w0 w0Var = this.b;
                w0Var.b.a(1.0f);
                TLRPC.UserFull userFull = w0Var.getMessagesController().getUserFull(w0Var.getUserConfig().getClientUserId());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (userFull != null) {
                    userFull.business_location = null;
                    userFull.flags2 &= -3;
                }
                w0Var.getConnectionsManager().sendRequest(updatebusinesslocation, new s0(w0Var, 1));
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        w0 w0Var = this.b;
        n41 n41Var = (n41) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = n41Var.d;
        if (i10 != 1 && n41Var.c != w0Var.h) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w0Var.getParentActivity());
                alertDialog$Builder.a.N = LocaleController.getString(R.string.BusinessLocationClearTitle);
                alertDialog$Builder.a.P = LocaleController.getString(R.string.BusinessLocationClearMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new r0(w0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                w0Var.showDialog(alertDialog$Builder.a);
                return;
            }
            return;
        }
        if (w0Var.x != null && n41Var.c != w0Var.h) {
            w0Var.x = null;
            w0Var.a.U2.N(true);
            return;
        }
        tc0 tc0Var = new tc0(8);
        if (w0Var.x != null) {
            TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
            tL_channelLocation.address = w0Var.y;
            tL_channelLocation.geo_point = w0Var.x;
            tc0Var.w0 = tL_channelLocation;
        }
        tc0Var.B0 = new di1(7, w0Var, tc0Var);
        if (w0Var.x != null || TextUtils.isEmpty(w0Var.y)) {
            w0Var.presentFragment(tc0Var);
            return;
        }
        b2 b2Var = new b2(w0Var.getParentActivity(), 3, null);
        b2Var.c0 = false;
        b2Var.q(200L);
        Utilities.searchQueue.postRunnable(new p0(w0Var, tc0Var, b2Var));
    }
}
