package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class v71 extends org.telegram.ui.ActionBar.g3 {
    public static final /* synthetic */ int e = 0;
    public TLRPC.TL_authorization b;
    public SessionsActivity c;
    public org.telegram.ui.Components.jj0 d;

    public static void m(v71 v71Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v71Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new cg.u1(11, v71Var, str));
        alertDialog$Builder.o();
    }

    public static void n(v71 v71Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = v71Var.b;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(v71Var.currentAccount).sendRequest(changeauthorizationsettings, new nh.p5(17));
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void show() {
        super.show();
        this.d.d();
    }
}
