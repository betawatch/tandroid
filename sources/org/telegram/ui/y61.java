package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y61 extends org.telegram.ui.ActionBar.f3 {
    public static final /* synthetic */ int e = 0;
    public TLRPC.TL_authorization b;
    public SessionsActivity c;
    public org.telegram.ui.Components.pi0 d;

    public static void m(y61 y61Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y61Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new v(10, y61Var, str));
        alertDialog$Builder.o();
    }

    public static void n(y61 y61Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = y61Var.b;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(y61Var.currentAccount).sendRequest(changeauthorizationsettings, new ih.q5(18));
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        this.d.d();
    }
}
