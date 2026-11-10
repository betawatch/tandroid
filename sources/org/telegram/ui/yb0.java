package org.telegram.ui;

import android.app.Dialog;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yb0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ac0 b;

    public /* synthetic */ yb0(ac0 ac0Var, int i7) {
        this.a = i7;
        this.b = ac0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final ac0 ac0Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.zb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10;
                        int i11 = i7;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ac0 ac0Var2 = ac0Var;
                        int i12 = 0;
                        switch (i11) {
                            case 0:
                                ac0Var2.getClass();
                                if (tL_error2 == null) {
                                    ac0Var2.n = (TL_account.Password) tLObject2;
                                    ac0Var2.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                fe0 fe0Var = ac0Var2.D;
                                fe0Var.C1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        fe0Var.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.z(tL_error2.text).intValue();
                                        fe0Var.D1(org.telegram.messenger.id.M0(2131742860, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750686, intValue < 60 ? org.telegram.messenger.id.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.id.G(intValue / 60, "Minutes", new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (fe0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fe0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            org.telegram.ui.Components.uy0 uy0Var = new org.telegram.ui.Components.uy0();
                                            uy0Var.a |= 256;
                                            uy0Var.b = indexOf;
                                            int i13 = lastIndexOf + 1;
                                            uy0Var.c = i13;
                                            valueOf.setSpan(new org.telegram.ui.Components.vy0(uy0Var, 0), indexOf, i13, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.g0.m0(org.telegram.messenger.id.M0(2131746080, null), valueOf);
                                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                        u1Var.T = m0;
                                        u1Var.R = org.telegram.messenger.id.M0(2131746078, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751771, null), new su(20, ac0Var2, tL_auth_passwordRecovery));
                                        Dialog showDialog = fe0Var.showDialog(u1Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                fe0 fe0Var2 = ac0Var2.D;
                                ac0Var2.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.f2) fe0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new yb0(ac0Var2, i12), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    fe0Var2.C1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.z(tL_error2.text).intValue();
                                            fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750686, intValue2 < 60 ? org.telegram.messenger.id.G(intValue2, "Seconds", new Object[0]) : org.telegram.messenger.id.G(intValue2 / 60, "Minutes", new Object[0])));
                                            break;
                                        }
                                    } else if (fe0Var2.getParentActivity() != null) {
                                        ac0Var2.a.setText("");
                                        fe0.c1(fe0Var2, ac0Var2.y, true);
                                        break;
                                    }
                                } else {
                                    fe0Var2.N1(false, true);
                                    ac0Var2.postDelayed(new f10(26, ac0Var2, tLObject2), 150L);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i10 = 1;
                final ac0 ac0Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.zb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102;
                        int i11 = i10;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ac0 ac0Var22 = ac0Var2;
                        int i12 = 0;
                        switch (i11) {
                            case 0:
                                ac0Var22.getClass();
                                if (tL_error2 == null) {
                                    ac0Var22.n = (TL_account.Password) tLObject2;
                                    ac0Var22.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                fe0 fe0Var = ac0Var22.D;
                                fe0Var.C1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        fe0Var.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.z(tL_error2.text).intValue();
                                        fe0Var.D1(org.telegram.messenger.id.M0(2131742860, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750686, intValue < 60 ? org.telegram.messenger.id.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.id.G(intValue / 60, "Minutes", new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (fe0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fe0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            org.telegram.ui.Components.uy0 uy0Var = new org.telegram.ui.Components.uy0();
                                            uy0Var.a |= 256;
                                            uy0Var.b = indexOf;
                                            int i13 = lastIndexOf + 1;
                                            uy0Var.c = i13;
                                            valueOf.setSpan(new org.telegram.ui.Components.vy0(uy0Var, 0), indexOf, i13, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.g0.m0(org.telegram.messenger.id.M0(2131746080, null), valueOf);
                                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                        u1Var.T = m0;
                                        u1Var.R = org.telegram.messenger.id.M0(2131746078, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751771, null), new su(20, ac0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = fe0Var.showDialog(u1Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                fe0 fe0Var2 = ac0Var22.D;
                                ac0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i102 = ((org.telegram.ui.ActionBar.f2) fe0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i102).sendRequest(getpassword, new yb0(ac0Var22, i12), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    fe0Var2.C1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.z(tL_error2.text).intValue();
                                            fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750686, intValue2 < 60 ? org.telegram.messenger.id.G(intValue2, "Seconds", new Object[0]) : org.telegram.messenger.id.G(intValue2 / 60, "Minutes", new Object[0])));
                                            break;
                                        }
                                    } else if (fe0Var2.getParentActivity() != null) {
                                        ac0Var22.a.setText("");
                                        fe0.c1(fe0Var2, ac0Var22.y, true);
                                        break;
                                    }
                                } else {
                                    fe0Var2.N1(false, true);
                                    ac0Var22.postDelayed(new f10(26, ac0Var22, tLObject2), 150L);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 2;
                final ac0 ac0Var3 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.zb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102;
                        int i112 = i11;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ac0 ac0Var22 = ac0Var3;
                        int i12 = 0;
                        switch (i112) {
                            case 0:
                                ac0Var22.getClass();
                                if (tL_error2 == null) {
                                    ac0Var22.n = (TL_account.Password) tLObject2;
                                    ac0Var22.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                fe0 fe0Var = ac0Var22.D;
                                fe0Var.C1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        fe0Var.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.z(tL_error2.text).intValue();
                                        fe0Var.D1(org.telegram.messenger.id.M0(2131742860, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750686, intValue < 60 ? org.telegram.messenger.id.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.id.G(intValue / 60, "Minutes", new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (fe0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fe0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            org.telegram.ui.Components.uy0 uy0Var = new org.telegram.ui.Components.uy0();
                                            uy0Var.a |= 256;
                                            uy0Var.b = indexOf;
                                            int i13 = lastIndexOf + 1;
                                            uy0Var.c = i13;
                                            valueOf.setSpan(new org.telegram.ui.Components.vy0(uy0Var, 0), indexOf, i13, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.g0.m0(org.telegram.messenger.id.M0(2131746080, null), valueOf);
                                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                        u1Var.T = m0;
                                        u1Var.R = org.telegram.messenger.id.M0(2131746078, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751771, null), new su(20, ac0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = fe0Var.showDialog(u1Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                fe0 fe0Var2 = ac0Var22.D;
                                ac0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i102 = ((org.telegram.ui.ActionBar.f2) fe0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i102).sendRequest(getpassword, new yb0(ac0Var22, i12), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    fe0Var2.C1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.z(tL_error2.text).intValue();
                                            fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750686, intValue2 < 60 ? org.telegram.messenger.id.G(intValue2, "Seconds", new Object[0]) : org.telegram.messenger.id.G(intValue2 / 60, "Minutes", new Object[0])));
                                            break;
                                        }
                                    } else if (fe0Var2.getParentActivity() != null) {
                                        ac0Var22.a.setText("");
                                        fe0.c1(fe0Var2, ac0Var22.y, true);
                                        break;
                                    }
                                } else {
                                    fe0Var2.N1(false, true);
                                    ac0Var22.postDelayed(new f10(26, ac0Var22, tLObject2), 150L);
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
