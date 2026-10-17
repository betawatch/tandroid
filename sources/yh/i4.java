package yh;

import ai.x9;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.vj;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.i80;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class i4 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ org.telegram.ui.ActionBar.u0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ l4 c;

    public i4(l4 l4Var, org.telegram.ui.ActionBar.u0 u0Var, long j10) {
        this.c = l4Var;
        this.a = u0Var;
        this.b = j10;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        d6 d6Var;
        int i11;
        int i12;
        boolean canUserDoAction;
        org.telegram.ui.ActionBar.e1 e1Var;
        org.telegram.ui.ActionBar.e1 e1Var2;
        l4 l4Var = this.c;
        x9 x9Var = l4Var.Y;
        if (i10 != 1) {
            if (i10 == -1) {
                l4Var.dismiss();
                return;
            }
            return;
        }
        i80 i80Var = l4Var.d0;
        if (i80Var != null) {
            i80Var.u();
        }
        org.telegram.ui.ActionBar.d3 d3Var = l4Var.container;
        d6Var = ((org.telegram.ui.ActionBar.f3) l4Var).resourcesProvider;
        i80 F = i80.F(d3Var, d6Var, this.a);
        l4Var.d0 = F;
        i11 = ((org.telegram.ui.ActionBar.f3) l4Var).currentAccount;
        long clientUserId = UserConfig.getInstance(i11).getClientUserId();
        long j10 = this.b;
        if (j10 == clientUserId) {
            canUserDoAction = true;
        } else if (j10 >= 0) {
            canUserDoAction = false;
        } else {
            i12 = ((org.telegram.ui.ActionBar.f3) l4Var).currentAccount;
            canUserDoAction = ChatObject.canUserDoAction(MessagesController.getInstance(i12).getChat(Long.valueOf(-j10)), 5);
        }
        org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(0, F.e, F.d, false, false);
        F.d(e1Var3);
        F.k();
        org.telegram.ui.ActionBar.e1 h = F.h();
        h.setText(LocaleController.getString(R.string.Gift2FilterUnlimited));
        org.telegram.ui.ActionBar.e1 h10 = F.h();
        h10.setText(LocaleController.getString(R.string.Gift2FilterLimited));
        org.telegram.ui.ActionBar.e1 h11 = F.h();
        h11.setText(LocaleController.getString(R.string.Gift2FilterUpgradable));
        org.telegram.ui.ActionBar.e1 h12 = F.h();
        h12.setText(LocaleController.getString(R.string.Gift2FilterUnique));
        if (canUserDoAction) {
            F.k();
            org.telegram.ui.ActionBar.e1 h13 = F.h();
            h13.setText(LocaleController.getString(R.string.Gift2FilterDisplayed));
            org.telegram.ui.ActionBar.e1 h14 = F.h();
            h14.setText(LocaleController.getString(R.string.Gift2FilterHidden));
            e1Var = h13;
            e1Var2 = h14;
        } else {
            e1Var = null;
            e1Var2 = null;
        }
        vj vjVar = new vj(this, e1Var3, h, h10, h11, h12, canUserDoAction, e1Var, e1Var2, 4);
        vjVar.run();
        e1Var3.setOnClickListener(new qg.n(15, this, vjVar));
        q2.j(h, x9Var, vjVar, 1);
        q2.j(h10, x9Var, vjVar, 2);
        q2.j(h11, x9Var, vjVar, 4);
        q2.j(h12, x9Var, vjVar, 8);
        if (canUserDoAction) {
            q2.j(e1Var, x9Var, vjVar, 256);
            q2.j(e1Var2, x9Var, vjVar, 512);
        }
        F.Y = true;
        F.J = false;
        F.s = 0;
        F.Z();
    }
}
