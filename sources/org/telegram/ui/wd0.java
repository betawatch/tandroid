package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.CancellationException;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class wd0 implements ss, OnSuccessListener, OnFailureListener {
    public final /* synthetic */ be0 a;

    public /* synthetic */ wd0(be0 be0Var) {
        this.a = be0Var;
    }

    @Override // org.telegram.ui.ss
    public void e(ps psVar) {
        be0 be0Var = this.a;
        be0Var.L = true;
        String str = psVar.c;
        be0Var.a.setText(str);
        be0Var.u(str, psVar);
        be0Var.G = psVar;
        be0Var.F = 0;
        be0Var.L = false;
        org.telegram.messenger.np.e1().edit().putString("phone_code_last_matched_" + psVar.c, psVar.d).apply();
        org.telegram.messenger.g0.i3(new qd0(be0Var, 4), 300L);
        zd0 zd0Var = be0Var.b;
        zd0Var.requestFocus();
        zd0Var.setSelection(zd0Var.length());
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i7;
        be0 be0Var = this.a;
        ce0 ce0Var = be0Var.h0;
        if (be0Var.a0) {
            return;
        }
        if (exc instanceof ConnectionsManager.RequestException) {
            String message = exc.getMessage();
            if (message != null && message.contains("SESSION_PASSWORD_NEEDED")) {
                TL_account.getPassword getpassword = new TL_account.getPassword();
                i7 = ((org.telegram.ui.ActionBar.e2) ce0Var).currentAccount;
                ConnectionsManager.getInstance(i7).sendRequest(getpassword, new vd0(be0Var, 1), 10);
                return;
            } else if (message != null) {
                boolean z10 = org.telegram.messenger.r2.a;
                new org.telegram.ui.Components.cc(ce0Var.a0, null).e0(message, false);
            }
        } else if (!(exc instanceof CancellationException)) {
            org.telegram.messenger.a8.g(exc, true);
        }
        if (be0Var.o()) {
            be0Var.t(false);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
        be0 be0Var = this.a;
        ce0 ce0Var = be0Var.h0;
        if (be0Var.a0) {
            return;
        }
        if (auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
            TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
            if (tL_help_termsOfService != null) {
                ce0Var.s0 = tL_help_termsOfService;
            }
            ce0Var.M1(5, true, a8.p0.k("fromFirebasePhoneNumberVerification", true), false);
            return;
        }
        if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
            ce0Var.G1((TLRPC.TL_auth_authorization) auth_authorization, false);
        } else {
            be0Var.t(false);
        }
    }
}
