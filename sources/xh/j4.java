package xh;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.jk;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.o70;
import org.telegram.ui.py0;
import yh.l5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class j4 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ org.telegram.ui.ActionBar.v0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ m4 c;

    public j4(m4 m4Var, org.telegram.ui.ActionBar.v0 v0Var, long j3) {
        this.c = m4Var;
        this.a = v0Var;
        this.b = j3;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        d6 d6Var;
        int i11;
        int i12;
        boolean canUserDoAction;
        org.telegram.ui.ActionBar.f1 f1Var;
        org.telegram.ui.ActionBar.f1 f1Var2;
        m4 m4Var = this.c;
        l5 l5Var = m4Var.Y;
        if (i10 != 1) {
            if (i10 == -1) {
                m4Var.dismiss();
                return;
            }
            return;
        }
        o70 o70Var = m4Var.d0;
        if (o70Var != null) {
            o70Var.u();
        }
        org.telegram.ui.ActionBar.d3 d3Var = m4Var.container;
        d6Var = ((org.telegram.ui.ActionBar.f3) m4Var).resourcesProvider;
        o70 F = o70.F(d3Var, d6Var, this.a);
        m4Var.d0 = F;
        i11 = ((org.telegram.ui.ActionBar.f3) m4Var).currentAccount;
        long clientUserId = UserConfig.getInstance(i11).getClientUserId();
        long j3 = this.b;
        if (j3 == clientUserId) {
            canUserDoAction = true;
        } else if (j3 >= 0) {
            canUserDoAction = false;
        } else {
            i12 = ((org.telegram.ui.ActionBar.f3) m4Var).currentAccount;
            canUserDoAction = ChatObject.canUserDoAction(MessagesController.getInstance(i12).getChat(Long.valueOf(-j3)), 5);
        }
        org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(0, F.e, F.d, false, false);
        F.d(f1Var3);
        F.k();
        org.telegram.ui.ActionBar.f1 h = F.h();
        h.setText(LocaleController.getString(R.string.Gift2FilterUnlimited));
        org.telegram.ui.ActionBar.f1 h10 = F.h();
        h10.setText(LocaleController.getString(R.string.Gift2FilterLimited));
        org.telegram.ui.ActionBar.f1 h11 = F.h();
        h11.setText(LocaleController.getString(R.string.Gift2FilterUpgradable));
        org.telegram.ui.ActionBar.f1 h12 = F.h();
        h12.setText(LocaleController.getString(R.string.Gift2FilterUnique));
        if (canUserDoAction) {
            F.k();
            org.telegram.ui.ActionBar.f1 h13 = F.h();
            h13.setText(LocaleController.getString(R.string.Gift2FilterDisplayed));
            org.telegram.ui.ActionBar.f1 h14 = F.h();
            h14.setText(LocaleController.getString(R.string.Gift2FilterHidden));
            f1Var = h13;
            f1Var2 = h14;
        } else {
            f1Var = null;
            f1Var2 = null;
        }
        jk jkVar = new jk(this, f1Var3, h, h10, h11, h12, canUserDoAction, f1Var, f1Var2, 4);
        jkVar.run();
        f1Var3.setOnClickListener(new py0(28, this, jkVar));
        s2.j(h, l5Var, jkVar, 1);
        s2.j(h10, l5Var, jkVar, 2);
        s2.j(h11, l5Var, jkVar, 4);
        s2.j(h12, l5Var, jkVar, 8);
        if (canUserDoAction) {
            s2.j(f1Var, l5Var, jkVar, 256);
            s2.j(f1Var2, l5Var, jkVar, 512);
        }
        F.Y = true;
        F.J = false;
        F.s = 0;
        F.Z();
    }
}
