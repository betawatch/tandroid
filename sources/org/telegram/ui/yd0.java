package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.CancellationException;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class yd0 implements ss, OnSuccessListener, OnFailureListener {
    public final /* synthetic */ de0 a;

    public /* synthetic */ yd0(de0 de0Var) {
        this.a = de0Var;
    }

    @Override // org.telegram.ui.ss
    public void b(ps psVar) {
        de0 de0Var = this.a;
        de0Var.L = true;
        String str = psVar.c;
        de0Var.a.setText(str);
        de0Var.u(str, psVar);
        de0Var.G = psVar;
        de0Var.F = 0;
        de0Var.L = false;
        org.telegram.messenger.mp.g1().edit().putString("phone_code_last_matched_" + psVar.c, psVar.d).apply();
        org.telegram.messenger.g0.h3(new sd0(de0Var, 4), 300L);
        be0 be0Var = de0Var.b;
        be0Var.requestFocus();
        be0Var.setSelection(be0Var.length());
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i7;
        de0 de0Var = this.a;
        ee0 ee0Var = de0Var.h0;
        if (de0Var.a0) {
            return;
        }
        if (exc instanceof ConnectionsManager.RequestException) {
            String message = exc.getMessage();
            if (message != null && message.contains("SESSION_PASSWORD_NEEDED")) {
                TL_account.getPassword getpassword = new TL_account.getPassword();
                i7 = ((org.telegram.ui.ActionBar.h2) ee0Var).currentAccount;
                ConnectionsManager.getInstance(i7).sendRequest(getpassword, new xd0(de0Var, 1), 10);
                return;
            } else if (message != null) {
                boolean z10 = org.telegram.messenger.s2.a;
                new org.telegram.ui.Components.lc(ee0Var.a0, null).f0(message, false);
            }
        } else if (!(exc instanceof CancellationException)) {
            org.telegram.messenger.a8.g(exc, true);
        }
        if (de0Var.o()) {
            de0Var.t(false);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
        de0 de0Var = this.a;
        ee0 ee0Var = de0Var.h0;
        if (de0Var.a0) {
            return;
        }
        if (auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
            TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
            if (tL_help_termsOfService != null) {
                ee0Var.s0 = tL_help_termsOfService;
            }
            ee0Var.M1(5, true, a8.p0.k("fromFirebasePhoneNumberVerification", true), false);
            return;
        }
        if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
            ee0Var.G1((TLRPC.TL_auth_authorization) auth_authorization, false);
        } else {
            de0Var.t(false);
        }
    }
}
