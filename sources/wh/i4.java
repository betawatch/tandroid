package wh;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.sk;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.w70;
import org.telegram.ui.w71;
import xh.n5;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class i4 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ org.telegram.ui.ActionBar.w0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ l4 c;

    public i4(l4 l4Var, org.telegram.ui.ActionBar.w0 w0Var, long j3) {
        this.c = l4Var;
        this.a = w0Var;
        this.b = j3;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        f6 f6Var;
        int i11;
        int i12;
        boolean canUserDoAction;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        l4 l4Var = this.c;
        n5 n5Var = l4Var.Y;
        if (i10 != 1) {
            if (i10 == -1) {
                l4Var.dismiss();
                return;
            }
            return;
        }
        w70 w70Var = l4Var.d0;
        if (w70Var != null) {
            w70Var.u();
        }
        org.telegram.ui.ActionBar.f3 f3Var = l4Var.container;
        f6Var = ((org.telegram.ui.ActionBar.h3) l4Var).resourcesProvider;
        w70 F = w70.F(f3Var, f6Var, this.a);
        l4Var.d0 = F;
        i11 = ((org.telegram.ui.ActionBar.h3) l4Var).currentAccount;
        long clientUserId = UserConfig.getInstance(i11).getClientUserId();
        long j3 = this.b;
        if (j3 == clientUserId) {
            canUserDoAction = true;
        } else if (j3 >= 0) {
            canUserDoAction = false;
        } else {
            i12 = ((org.telegram.ui.ActionBar.h3) l4Var).currentAccount;
            canUserDoAction = ChatObject.canUserDoAction(MessagesController.getInstance(i12).getChat(Long.valueOf(-j3)), 5);
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
        sk skVar = new sk(this, g1Var3, h, h10, h11, h12, canUserDoAction, g1Var, g1Var2, 4);
        skVar.run();
        g1Var3.setOnClickListener(new w71(24, this, skVar));
        q2.j(h, n5Var, skVar, 1);
        q2.j(h10, n5Var, skVar, 2);
        q2.j(h11, n5Var, skVar, 4);
        q2.j(h12, n5Var, skVar, 8);
        if (canUserDoAction) {
            q2.j(g1Var, n5Var, skVar, 256);
            q2.j(g1Var2, n5Var, skVar, 512);
        }
        F.Y = true;
        F.J = false;
        F.s = 0;
        F.Z();
    }
}
