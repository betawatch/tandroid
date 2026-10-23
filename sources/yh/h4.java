package yh;

import ai.y9;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.xj;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.j80;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class h4 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ org.telegram.ui.ActionBar.u0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ k4 c;

    public h4(k4 k4Var, org.telegram.ui.ActionBar.u0 u0Var, long j10) {
        this.c = k4Var;
        this.a = u0Var;
        this.b = j10;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        g6 g6Var;
        int i11;
        int i12;
        boolean canUserDoAction;
        org.telegram.ui.ActionBar.e1 e1Var;
        org.telegram.ui.ActionBar.e1 e1Var2;
        k4 k4Var = this.c;
        y9 y9Var = k4Var.Y;
        if (i10 != 1) {
            if (i10 == -1) {
                k4Var.dismiss();
                return;
            }
            return;
        }
        j80 j80Var = k4Var.d0;
        if (j80Var != null) {
            j80Var.u();
        }
        org.telegram.ui.ActionBar.e3 e3Var = k4Var.container;
        g6Var = ((org.telegram.ui.ActionBar.h3) k4Var).resourcesProvider;
        j80 F = j80.F(e3Var, g6Var, this.a);
        k4Var.d0 = F;
        i11 = ((org.telegram.ui.ActionBar.h3) k4Var).currentAccount;
        long clientUserId = UserConfig.getInstance(i11).getClientUserId();
        long j10 = this.b;
        if (j10 == clientUserId) {
            canUserDoAction = true;
        } else if (j10 >= 0) {
            canUserDoAction = false;
        } else {
            i12 = ((org.telegram.ui.ActionBar.h3) k4Var).currentAccount;
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
        xj xjVar = new xj(this, e1Var3, h, h10, h11, h12, canUserDoAction, e1Var, e1Var2, 4);
        xjVar.run();
        e1Var3.setOnClickListener(new org.telegram.ui.web.c(16, this, xjVar));
        p2.j(h, y9Var, xjVar, 1);
        p2.j(h10, y9Var, xjVar, 2);
        p2.j(h11, y9Var, xjVar, 4);
        p2.j(h12, y9Var, xjVar, 8);
        if (canUserDoAction) {
            p2.j(e1Var, y9Var, xjVar, 256);
            p2.j(e1Var2, y9Var, xjVar, 512);
        }
        F.Y = true;
        F.J = false;
        F.s = 0;
        F.Z();
    }
}
