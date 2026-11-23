package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.CancellationException;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xd0 implements ts, OnSuccessListener, OnFailureListener {
    public final /* synthetic */ ce0 a;

    public /* synthetic */ xd0(ce0 ce0Var) {
        this.a = ce0Var;
    }

    @Override // org.telegram.ui.ts
    public void b(ps psVar) {
        ce0 ce0Var = this.a;
        ce0Var.L = true;
        String str = psVar.c;
        ce0Var.a.setText(str);
        ce0Var.u(str, psVar);
        ce0Var.G = psVar;
        ce0Var.F = 0;
        ce0Var.L = false;
        org.telegram.messenger.np.g1().edit().putString("phone_code_last_matched_" + psVar.c, psVar.d).apply();
        org.telegram.messenger.g0.h3(new rd0(ce0Var, 4), 300L);
        ae0 ae0Var = ce0Var.b;
        ae0Var.requestFocus();
        ae0Var.setSelection(ae0Var.length());
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i7;
        ce0 ce0Var = this.a;
        de0 de0Var = ce0Var.h0;
        if (ce0Var.a0) {
            return;
        }
        if (exc instanceof ConnectionsManager.RequestException) {
            String message = exc.getMessage();
            if (message != null && message.contains("SESSION_PASSWORD_NEEDED")) {
                TL_account.getPassword getpassword = new TL_account.getPassword();
                i7 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
                ConnectionsManager.getInstance(i7).sendRequest(getpassword, new wd0(ce0Var, 1), 10);
                return;
            } else if (message != null) {
                boolean z10 = org.telegram.messenger.s2.a;
                new org.telegram.ui.Components.lc(de0Var.a0, null).f0(message, false);
            }
        } else if (!(exc instanceof CancellationException)) {
            org.telegram.messenger.a8.g(exc, true);
        }
        if (ce0Var.o()) {
            ce0Var.t(false);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
        ce0 ce0Var = this.a;
        de0 de0Var = ce0Var.h0;
        if (ce0Var.a0) {
            return;
        }
        if (auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
            TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
            if (tL_help_termsOfService != null) {
                de0Var.s0 = tL_help_termsOfService;
            }
            de0Var.M1(5, true, a8.p0.k("fromFirebasePhoneNumberVerification", true), false);
            return;
        }
        if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
            de0Var.G1((TLRPC.TL_auth_authorization) auth_authorization, false);
        } else {
            ce0Var.t(false);
        }
    }
}
