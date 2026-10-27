package zh;

import bi.t9;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.bk;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.l80;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class i4 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ org.telegram.ui.ActionBar.w0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ l4 c;

    public i4(l4 l4Var, org.telegram.ui.ActionBar.w0 w0Var, long j10) {
        this.c = l4Var;
        this.a = w0Var;
        this.b = j10;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        u6 u6Var;
        int i11;
        int i12;
        boolean canUserDoAction;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        l4 l4Var = this.c;
        t9 t9Var = l4Var.Y;
        if (i10 != 1) {
            if (i10 == -1) {
                l4Var.dismiss();
                return;
            }
            return;
        }
        l80 l80Var = l4Var.d0;
        if (l80Var != null) {
            l80Var.u();
        }
        org.telegram.ui.ActionBar.h3 h3Var = l4Var.container;
        u6Var = ((org.telegram.ui.ActionBar.k3) l4Var).resourcesProvider;
        l80 F = l80.F(h3Var, u6Var, this.a);
        l4Var.d0 = F;
        i11 = ((org.telegram.ui.ActionBar.k3) l4Var).currentAccount;
        long clientUserId = UserConfig.getInstance(i11).getClientUserId();
        long j10 = this.b;
        if (j10 == clientUserId) {
            canUserDoAction = true;
        } else if (j10 >= 0) {
            canUserDoAction = false;
        } else {
            i12 = ((org.telegram.ui.ActionBar.k3) l4Var).currentAccount;
            canUserDoAction = ChatObject.canUserDoAction(MessagesController.getInstance(i12).getChat(Long.valueOf(-j10)), 5);
        }
        org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(0, F.e, F.d, false, false);
        F.d(g1Var3);
        F.k();
        org.telegram.ui.ActionBar.g1 h = F.h();
        h.setText(LocaleController.getString(R.string.Gift2FilterUnlimited));
        org.telegram.ui.ActionBar.g1 h10 = F.h();
        h10.setText(LocaleController.getString(R.string.Gift2FilterLimited));
        org.telegram.ui.ActionBar.g1 h11 = F.h();
        h11.setText(LocaleController.getString(R.string.Gift2FilterUpgradable));
        org.telegram.ui.ActionBar.g1 h12 = F.h();
        h12.setText(LocaleController.getString(R.string.Gift2FilterUnique));
        if (canUserDoAction) {
            F.k();
            org.telegram.ui.ActionBar.g1 h13 = F.h();
            h13.setText(LocaleController.getString(R.string.Gift2FilterDisplayed));
            org.telegram.ui.ActionBar.g1 h14 = F.h();
            h14.setText(LocaleController.getString(R.string.Gift2FilterHidden));
            g1Var = h13;
            g1Var2 = h14;
        } else {
            g1Var = null;
            g1Var2 = null;
        }
        bk bkVar = new bk(this, g1Var3, h, h10, h11, h12, canUserDoAction, g1Var, g1Var2, 4);
        bkVar.run();
        g1Var3.setOnClickListener(new org.telegram.ui.web.c(16, this, bkVar));
        r2.j(h, t9Var, bkVar, 1);
        r2.j(h10, t9Var, bkVar, 2);
        r2.j(h11, t9Var, bkVar, 4);
        r2.j(h12, t9Var, bkVar, 8);
        if (canUserDoAction) {
            r2.j(g1Var, t9Var, bkVar, 256);
            r2.j(g1Var2, t9Var, bkVar, 512);
        }
        F.Y = true;
        F.J = false;
        F.s = 0;
        F.Z();
    }
}
