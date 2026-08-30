package uf;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.i51;
import org.telegram.ui.ad0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements Utilities.Callback5, c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;

    public /* synthetic */ p0(u0 u0Var, int i10) {
        this.a = i10;
        this.b = u0Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(d2 d2Var, int i10) {
        switch (this.a) {
            case 1:
                this.b.W();
                break;
            case 2:
                this.b.finishFragment();
                break;
            default:
                u0 u0Var = this.b;
                u0Var.b.a(1.0f);
                TLRPC.UserFull userFull = u0Var.getMessagesController().getUserFull(u0Var.getUserConfig().getClientUserId());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (userFull != null) {
                    userFull.business_location = null;
                    userFull.flags2 &= -3;
                }
                u0Var.getConnectionsManager().sendRequest(updatebusinesslocation, new q0(u0Var, 1));
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        u0 u0Var = this.b;
        i51 i51Var = (i51) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = i51Var.d;
        if (i10 != 1 && i51Var.c != u0Var.h) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u0Var.getParentActivity());
                alertDialog$Builder.a.O = LocaleController.getString(R.string.BusinessLocationClearTitle);
                alertDialog$Builder.a.Q = LocaleController.getString(R.string.BusinessLocationClearMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new p0(u0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                u0Var.showDialog(alertDialog$Builder.a);
                return;
            }
            return;
        }
        if (u0Var.x != null && i51Var.c != u0Var.h) {
            u0Var.x = null;
            u0Var.a.V2.N(true);
            return;
        }
        ad0 ad0Var = new ad0(8);
        if (u0Var.x != null) {
            TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
            tL_channelLocation.address = u0Var.y;
            tL_channelLocation.geo_point = u0Var.x;
            ad0Var.x0 = tL_channelLocation;
        }
        ad0Var.C0 = new org.telegram.ui.web.m(9, u0Var, ad0Var);
        if (u0Var.x != null || TextUtils.isEmpty(u0Var.y)) {
            u0Var.presentFragment(ad0Var);
            return;
        }
        d2 d2Var = new d2(u0Var.getParentActivity(), 3, null);
        d2Var.d0 = false;
        d2Var.q(200L);
        Utilities.searchQueue.postRunnable(new n0(u0Var, ad0Var, d2Var));
    }
}
