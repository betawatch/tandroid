// default package

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class we6 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ df6 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ String e;

    public /* synthetic */ we6(df6 df6Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.b = df6Var;
        this.c = tL_error;
        this.e = str;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        byte b = this.a;
        String str = this.e;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.c;
        final df6 df6Var = this.b;
        final byte b2 = 0;
        final byte b3 = 1;
        switch (b) {
            case 0:
                bf6 bf6Var = df6Var.a;
                qh6 qh6Var = df6Var.a0;
                qh6Var.y1(false, true);
                if (tL_error == null) {
                    df6Var.F = false;
                    qh6Var.K1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", df6Var.J);
                    bundle.putString("ephone", df6Var.K);
                    bundle.putString("phoneFormated", df6Var.M);
                    bundle.putString("phoneHash", df6Var.N);
                    bundle.putString("code", str);
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            qh6Var.s0 = tL_help_termsOfService;
                        }
                        df6Var.n(new Runnable() { // from class: ze6
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b4 = b2;
                                Bundle bundle2 = bundle;
                                df6 df6Var2 = df6Var;
                                switch (b4) {
                                    case 0:
                                        df6Var2.a0.J1(5, true, bundle2, false);
                                        break;
                                    default:
                                        df6Var2.a0.J1(6, true, bundle2, false);
                                        break;
                                }
                            }
                        });
                    } else {
                        df6Var.n(new ls5(df6Var, tLObject, bundle, (byte) 24));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i = ((e) qh6Var).currentAccount;
                    ConnectionsManager.getInstance(i).sendRequest(getpassword, new ue6(df6Var, str, b3), 10);
                } else {
                    df6Var.F = false;
                    qh6Var.K1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131751169, null));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131748933, "InvalidPhoneNumber"));
                    } else if (tL_error.text.contains("CODE_EMPTY") || tL_error.text.contains("CODE_INVALID") || tL_error.text.contains("EMAIL_CODE_INVALID") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                        xe6 xe6Var = df6Var.T;
                        cf6 cf6Var = df6Var.R;
                        byte b4 = 3;
                        try {
                            bf6Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i2 = 0;
                        while (true) {
                            ok2[] ok2VarArr = bf6Var.f;
                            if (i2 < ok2VarArr.length) {
                                ok2VarArr[i2].setText("");
                                bf6Var.f[i2].A(1.0f);
                                i2++;
                            } else {
                                if (cf6Var.getCurrentView() == df6Var.e) {
                                    cf6Var.showNext();
                                    hl.T3(df6Var.h, false, 1.0f, true, true);
                                }
                                bf6Var.f[0].requestFocus();
                                hl.A3(10.0f, bf6Var, new xe6(df6Var, b4));
                                df6Var.removeCallbacks(xe6Var);
                                df6Var.postDelayed(xe6Var, 5000L);
                                df6Var.S = true;
                            }
                        }
                    } else if (tL_error.text.contains("EMAIL_NOT_ALLOWED")) {
                        qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131751165, null));
                    } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                        qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131751162, null));
                    } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                        qh6Var.J1(0, true, null, true);
                        qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131751986, "CodeExpired"));
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131750647, "FloodWait"));
                    } else {
                        qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131751070, "ErrorOccurred") + "\n" + tL_error.text);
                    }
                    if (bf6Var.f != null) {
                        int i3 = 0;
                        while (true) {
                            ok2[] ok2VarArr2 = bf6Var.f;
                            if (i3 < ok2VarArr2.length) {
                                ok2VarArr2[i3].setText("");
                                i3++;
                            } else {
                                ok2VarArr2[0].requestFocus();
                            }
                        }
                    }
                    bf6Var.e = false;
                }
                df6Var.G = null;
                break;
            default:
                df6Var.F = false;
                qh6 qh6Var2 = df6Var.a0;
                qh6Var2.K1(false, true);
                if (tL_error != null) {
                    qh6Var2.z1(ob6.M0(2131745798, null), tL_error.text);
                    break;
                } else {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    if (!TwoStepVerificationActivity.a0(password, true)) {
                        jj.u0(qh6Var2.getParentActivity(), ob6.M0(2131743475, "UpdateAppAlert"), true);
                        break;
                    } else {
                        final Bundle bundle2 = new Bundle();
                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                        password.serializeToStream(serializedData);
                        bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                        bundle2.putString("phoneFormated", df6Var.M);
                        bundle2.putString("phoneHash", df6Var.N);
                        bundle2.putString("code", str);
                        df6Var.n(new Runnable() { // from class: ze6
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b42 = b3;
                                Bundle bundle22 = bundle2;
                                df6 df6Var2 = df6Var;
                                switch (b42) {
                                    case 0:
                                        df6Var2.a0.J1(5, true, bundle22, false);
                                        break;
                                    default:
                                        df6Var2.a0.J1(6, true, bundle22, false);
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
        }
    }

    public /* synthetic */ we6(df6 df6Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.b = df6Var;
        this.c = tL_error;
        this.d = tLObject;
        this.e = str;
    }
}
