// default package

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ve6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ df6 b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ TLRPC.TL_auth_resetLoginEmail d;

    public /* synthetic */ ve6(df6 df6Var, Bundle bundle, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, byte b) {
        this.a = b;
        this.b = df6Var;
        this.c = bundle;
        this.d = tL_auth_resetLoginEmail;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final byte b = 0;
                final df6 df6Var = this.b;
                final Bundle bundle = this.c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = this.d;
                hl.c3(new Runnable() { // from class: ye6
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        int i;
                        String str2;
                        int i2;
                        byte b2 = b;
                        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = tL_auth_resetLoginEmail;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Bundle bundle2 = bundle;
                        TLObject tLObject2 = tLObject;
                        df6 df6Var2 = df6Var;
                        switch (b2) {
                            case 0:
                                qh6 qh6Var = df6Var2.a0;
                                if (qh6Var.getParentActivity() != null) {
                                    df6Var2.W = false;
                                    if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                        if (tL_error2 != null && (str = tL_error2.text) != null) {
                                            if (!str.contains("TASK_ALREADY_EXISTS")) {
                                                if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    i = ((e) qh6Var).currentAccount;
                                                    jj.c0(i, tL_error2, qh6Var, tL_auth_resetLoginEmail2, new Object[0]);
                                                    break;
                                                } else {
                                                    qh6Var.J1(0, true, null, true);
                                                    qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131751986, "CodeExpired"));
                                                    break;
                                                }
                                            } else {
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(df6Var2.getContext());
                                                String M0 = ob6.M0(2131748483, null);
                                                id idVar = alertDialog$Builder.a;
                                                idVar.S = M0;
                                                idVar.U = hl.S2(ob6.a0(null, null, 2131748484, ob6.a(f78.f().e("+" + df6Var2.M))));
                                                c00.u(null, 2131747558, alertDialog$Builder, null);
                                                break;
                                            }
                                        }
                                    } else {
                                        qh6Var.q1(bundle2, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                qh6 qh6Var2 = df6Var2.a0;
                                if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                    if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                        if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                            i2 = ((e) qh6Var2).currentAccount;
                                            jj.c0(i2, tL_error2, qh6Var2, tL_auth_resetLoginEmail2, new Object[0]);
                                            break;
                                        } else {
                                            qh6Var2.J1(0, true, null, true);
                                            qh6Var2.z1(ob6.M0(2131745798, null), ob6.M0(2131751986, "CodeExpired"));
                                            break;
                                        }
                                    }
                                } else {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = df6Var2.E.getString("emailPattern");
                                        df6Var2.y = true;
                                    }
                                    qh6Var2.q1(bundle2, tL_auth_sentCode, true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b2 = 1;
                final df6 df6Var2 = this.b;
                final Bundle bundle2 = this.c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = this.d;
                hl.c3(new Runnable() { // from class: ye6
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        int i;
                        String str2;
                        int i2;
                        byte b22 = b2;
                        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail22 = tL_auth_resetLoginEmail2;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Bundle bundle22 = bundle2;
                        TLObject tLObject2 = tLObject;
                        df6 df6Var22 = df6Var2;
                        switch (b22) {
                            case 0:
                                qh6 qh6Var = df6Var22.a0;
                                if (qh6Var.getParentActivity() != null) {
                                    df6Var22.W = false;
                                    if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                        if (tL_error2 != null && (str = tL_error2.text) != null) {
                                            if (!str.contains("TASK_ALREADY_EXISTS")) {
                                                if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    i = ((e) qh6Var).currentAccount;
                                                    jj.c0(i, tL_error2, qh6Var, tL_auth_resetLoginEmail22, new Object[0]);
                                                    break;
                                                } else {
                                                    qh6Var.J1(0, true, null, true);
                                                    qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131751986, "CodeExpired"));
                                                    break;
                                                }
                                            } else {
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(df6Var22.getContext());
                                                String M0 = ob6.M0(2131748483, null);
                                                id idVar = alertDialog$Builder.a;
                                                idVar.S = M0;
                                                idVar.U = hl.S2(ob6.a0(null, null, 2131748484, ob6.a(f78.f().e("+" + df6Var22.M))));
                                                c00.u(null, 2131747558, alertDialog$Builder, null);
                                                break;
                                            }
                                        }
                                    } else {
                                        qh6Var.q1(bundle22, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                qh6 qh6Var2 = df6Var22.a0;
                                if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                    if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                        if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                            i2 = ((e) qh6Var2).currentAccount;
                                            jj.c0(i2, tL_error2, qh6Var2, tL_auth_resetLoginEmail22, new Object[0]);
                                            break;
                                        } else {
                                            qh6Var2.J1(0, true, null, true);
                                            qh6Var2.z1(ob6.M0(2131745798, null), ob6.M0(2131751986, "CodeExpired"));
                                            break;
                                        }
                                    }
                                } else {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = df6Var22.E.getString("emailPattern");
                                        df6Var22.y = true;
                                    }
                                    qh6Var2.q1(bundle22, tL_auth_sentCode, true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
