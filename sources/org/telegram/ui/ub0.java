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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ub0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ wb0 b;

    public /* synthetic */ ub0(wb0 wb0Var, int i7) {
        this.a = i7;
        this.b = wb0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final wb0 wb0Var = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.vb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10;
                        int i11 = i7;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        wb0 wb0Var2 = wb0Var;
                        int i12 = 0;
                        switch (i11) {
                            case 0:
                                wb0Var2.getClass();
                                if (tL_error2 == null) {
                                    wb0Var2.n = (TL_account.Password) tLObject2;
                                    wb0Var2.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                de0 de0Var = wb0Var2.E;
                                de0Var.C1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.z(tL_error2.text).intValue();
                                        de0Var.D1(org.telegram.messenger.gd.M0(2131742602, null), org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750670, intValue < 60 ? org.telegram.messenger.gd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.gd.G(intValue / 60, "Minutes", new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (de0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(de0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            org.telegram.ui.Components.dz0 dz0Var = new org.telegram.ui.Components.dz0();
                                            dz0Var.a |= 256;
                                            dz0Var.b = indexOf;
                                            int i13 = lastIndexOf + 1;
                                            dz0Var.c = i13;
                                            valueOf.setSpan(new org.telegram.ui.Components.ez0(dz0Var, 0), indexOf, i13, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.g0.m0(org.telegram.messenger.gd.M0(2131745885, null), valueOf);
                                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                        u1Var.U = m0;
                                        u1Var.S = org.telegram.messenger.gd.M0(2131745883, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751760, null), new at(23, wb0Var2, tL_auth_passwordRecovery));
                                        Dialog showDialog = de0Var.showDialog(u1Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                de0 de0Var2 = wb0Var2.E;
                                wb0Var2.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.h2) de0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ub0(wb0Var2, i12), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    de0Var2.C1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            de0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.z(tL_error2.text).intValue();
                                            de0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750670, intValue2 < 60 ? org.telegram.messenger.gd.G(intValue2, "Seconds", new Object[0]) : org.telegram.messenger.gd.G(intValue2 / 60, "Minutes", new Object[0])));
                                            break;
                                        }
                                    } else if (de0Var2.getParentActivity() != null) {
                                        wb0Var2.a.setText("");
                                        de0.c1(de0Var2, wb0Var2.y, true);
                                        break;
                                    }
                                } else {
                                    de0Var2.N1(false, true);
                                    wb0Var2.postDelayed(new n60(16, wb0Var2, tLObject2), 150L);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i10 = 1;
                final wb0 wb0Var2 = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.vb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102;
                        int i11 = i10;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        wb0 wb0Var22 = wb0Var2;
                        int i12 = 0;
                        switch (i11) {
                            case 0:
                                wb0Var22.getClass();
                                if (tL_error2 == null) {
                                    wb0Var22.n = (TL_account.Password) tLObject2;
                                    wb0Var22.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                de0 de0Var = wb0Var22.E;
                                de0Var.C1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.z(tL_error2.text).intValue();
                                        de0Var.D1(org.telegram.messenger.gd.M0(2131742602, null), org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750670, intValue < 60 ? org.telegram.messenger.gd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.gd.G(intValue / 60, "Minutes", new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (de0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(de0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            org.telegram.ui.Components.dz0 dz0Var = new org.telegram.ui.Components.dz0();
                                            dz0Var.a |= 256;
                                            dz0Var.b = indexOf;
                                            int i13 = lastIndexOf + 1;
                                            dz0Var.c = i13;
                                            valueOf.setSpan(new org.telegram.ui.Components.ez0(dz0Var, 0), indexOf, i13, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.g0.m0(org.telegram.messenger.gd.M0(2131745885, null), valueOf);
                                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                        u1Var.U = m0;
                                        u1Var.S = org.telegram.messenger.gd.M0(2131745883, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751760, null), new at(23, wb0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = de0Var.showDialog(u1Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                de0 de0Var2 = wb0Var22.E;
                                wb0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i102 = ((org.telegram.ui.ActionBar.h2) de0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i102).sendRequest(getpassword, new ub0(wb0Var22, i12), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    de0Var2.C1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            de0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.z(tL_error2.text).intValue();
                                            de0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750670, intValue2 < 60 ? org.telegram.messenger.gd.G(intValue2, "Seconds", new Object[0]) : org.telegram.messenger.gd.G(intValue2 / 60, "Minutes", new Object[0])));
                                            break;
                                        }
                                    } else if (de0Var2.getParentActivity() != null) {
                                        wb0Var22.a.setText("");
                                        de0.c1(de0Var2, wb0Var22.y, true);
                                        break;
                                    }
                                } else {
                                    de0Var2.N1(false, true);
                                    wb0Var22.postDelayed(new n60(16, wb0Var22, tLObject2), 150L);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 2;
                final wb0 wb0Var3 = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.vb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102;
                        int i112 = i11;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        wb0 wb0Var22 = wb0Var3;
                        int i12 = 0;
                        switch (i112) {
                            case 0:
                                wb0Var22.getClass();
                                if (tL_error2 == null) {
                                    wb0Var22.n = (TL_account.Password) tLObject2;
                                    wb0Var22.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                de0 de0Var = wb0Var22.E;
                                de0Var.C1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.z(tL_error2.text).intValue();
                                        de0Var.D1(org.telegram.messenger.gd.M0(2131742602, null), org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750670, intValue < 60 ? org.telegram.messenger.gd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.gd.G(intValue / 60, "Minutes", new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (de0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(de0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            org.telegram.ui.Components.dz0 dz0Var = new org.telegram.ui.Components.dz0();
                                            dz0Var.a |= 256;
                                            dz0Var.b = indexOf;
                                            int i13 = lastIndexOf + 1;
                                            dz0Var.c = i13;
                                            valueOf.setSpan(new org.telegram.ui.Components.ez0(dz0Var, 0), indexOf, i13, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.g0.m0(org.telegram.messenger.gd.M0(2131745885, null), valueOf);
                                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                        u1Var.U = m0;
                                        u1Var.S = org.telegram.messenger.gd.M0(2131745883, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751760, null), new at(23, wb0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = de0Var.showDialog(u1Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                de0 de0Var2 = wb0Var22.E;
                                wb0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i102 = ((org.telegram.ui.ActionBar.h2) de0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i102).sendRequest(getpassword, new ub0(wb0Var22, i12), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    de0Var2.C1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            de0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.z(tL_error2.text).intValue();
                                            de0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750670, intValue2 < 60 ? org.telegram.messenger.gd.G(intValue2, "Seconds", new Object[0]) : org.telegram.messenger.gd.G(intValue2 / 60, "Minutes", new Object[0])));
                                            break;
                                        }
                                    } else if (de0Var2.getParentActivity() != null) {
                                        wb0Var22.a.setText("");
                                        de0.c1(de0Var2, wb0Var22.y, true);
                                        break;
                                    }
                                } else {
                                    de0Var2.N1(false, true);
                                    wb0Var22.postDelayed(new n60(16, wb0Var22, tLObject2), 150L);
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
