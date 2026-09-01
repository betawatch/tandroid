package vf;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.j51;
import org.telegram.ui.bd0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements Utilities.Callback5, c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ q0(v0 v0Var, int i10) {
        this.a = i10;
        this.b = v0Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(d2 d2Var, int i10) {
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
        j51 j51Var = (j51) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = j51Var.d;
        if (i10 != 1 && j51Var.c != v0Var.h) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v0Var.getParentActivity());
                alertDialog$Builder.a.O = LocaleController.getString(R.string.BusinessLocationClearTitle);
                alertDialog$Builder.a.Q = LocaleController.getString(R.string.BusinessLocationClearMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new q0(v0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                v0Var.showDialog(alertDialog$Builder.a);
                return;
            }
            return;
        }
        if (v0Var.x != null && j51Var.c != v0Var.h) {
            v0Var.x = null;
            v0Var.a.V2.N(true);
            return;
        }
        bd0 bd0Var = new bd0(8);
        if (v0Var.x != null) {
            TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
            tL_channelLocation.address = v0Var.y;
            tL_channelLocation.geo_point = v0Var.x;
            bd0Var.x0 = tL_channelLocation;
        }
        bd0Var.C0 = new org.telegram.ui.web.m(10, v0Var, bd0Var);
        if (v0Var.x != null || TextUtils.isEmpty(v0Var.y)) {
            v0Var.presentFragment(bd0Var);
            return;
        }
        d2 d2Var = new d2(v0Var.getParentActivity(), 3, null);
        d2Var.d0 = false;
        d2Var.q(200L);
        Utilities.searchQueue.postRunnable(new o0(v0Var, bd0Var, d2Var));
    }
}
