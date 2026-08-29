package org.telegram.ui;

import android.app.Dialog;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vd0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ xd0 b;

    public /* synthetic */ vd0(xd0 xd0Var, int i10) {
        this.a = i10;
        this.b = xd0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final xd0 xd0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wd0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        int i12 = i10;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        xd0 xd0Var2 = xd0Var;
                        int i13 = 0;
                        switch (i12) {
                            case 0:
                                xd0Var2.getClass();
                                if (tL_error2 == null) {
                                    xd0Var2.n = (TL_account.Password) tLObject2;
                                    xd0Var2.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                fg0 fg0Var = xd0Var2.y;
                                fg0Var.k1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                        fg0Var.l1(LocaleController.getString(R.string.WrongCodeTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (fg0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            org.telegram.ui.Components.h01 h01Var = new org.telegram.ui.Components.h01();
                                            h01Var.a |= 256;
                                            h01Var.b = indexOf;
                                            int i14 = lastIndexOf + 1;
                                            h01Var.c = i14;
                                            valueOf.setSpan(new org.telegram.ui.Components.i01(h01Var, 0), indexOf, i14, 0);
                                        }
                                        SpannableStringBuilder formatSpannable = AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf);
                                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                        c2Var.P = formatSpannable;
                                        c2Var.N = LocaleController.getString("RestoreEmailSentTitle", R.string.RestoreEmailSentTitle);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new xr(26, xd0Var2, tL_auth_passwordRecovery));
                                        Dialog showDialog = fg0Var.showDialog(c2Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                fg0 fg0Var2 = xd0Var2.y;
                                xd0Var2.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.o2) fg0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword, new vd0(xd0Var2, i13), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    fg0Var2.k1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue2 < 60 ? LocaleController.formatPluralString("Seconds", intValue2, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue2 / 60, new Object[0])));
                                            break;
                                        }
                                    } else if (fg0Var2.getParentActivity() != null) {
                                        xd0Var2.a.setText("");
                                        fg0.U0(fg0Var2, xd0Var2.x, true);
                                        break;
                                    }
                                } else {
                                    fg0Var2.v1(false, true);
                                    xd0Var2.postDelayed(new x60(21, xd0Var2, tLObject2), 150L);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final xd0 xd0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wd0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        int i12 = i11;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        xd0 xd0Var22 = xd0Var2;
                        int i13 = 0;
                        switch (i12) {
                            case 0:
                                xd0Var22.getClass();
                                if (tL_error2 == null) {
                                    xd0Var22.n = (TL_account.Password) tLObject2;
                                    xd0Var22.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                fg0 fg0Var = xd0Var22.y;
                                fg0Var.k1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                        fg0Var.l1(LocaleController.getString(R.string.WrongCodeTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (fg0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            org.telegram.ui.Components.h01 h01Var = new org.telegram.ui.Components.h01();
                                            h01Var.a |= 256;
                                            h01Var.b = indexOf;
                                            int i14 = lastIndexOf + 1;
                                            h01Var.c = i14;
                                            valueOf.setSpan(new org.telegram.ui.Components.i01(h01Var, 0), indexOf, i14, 0);
                                        }
                                        SpannableStringBuilder formatSpannable = AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf);
                                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                        c2Var.P = formatSpannable;
                                        c2Var.N = LocaleController.getString("RestoreEmailSentTitle", R.string.RestoreEmailSentTitle);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new xr(26, xd0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = fg0Var.showDialog(c2Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                fg0 fg0Var2 = xd0Var22.y;
                                xd0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i112 = ((org.telegram.ui.ActionBar.o2) fg0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i112).sendRequest(getpassword, new vd0(xd0Var22, i13), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    fg0Var2.k1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue2 < 60 ? LocaleController.formatPluralString("Seconds", intValue2, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue2 / 60, new Object[0])));
                                            break;
                                        }
                                    } else if (fg0Var2.getParentActivity() != null) {
                                        xd0Var22.a.setText("");
                                        fg0.U0(fg0Var2, xd0Var22.x, true);
                                        break;
                                    }
                                } else {
                                    fg0Var2.v1(false, true);
                                    xd0Var22.postDelayed(new x60(21, xd0Var22, tLObject2), 150L);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i12 = 2;
                final xd0 xd0Var3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wd0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        int i122 = i12;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        xd0 xd0Var22 = xd0Var3;
                        int i13 = 0;
                        switch (i122) {
                            case 0:
                                xd0Var22.getClass();
                                if (tL_error2 == null) {
                                    xd0Var22.n = (TL_account.Password) tLObject2;
                                    xd0Var22.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                fg0 fg0Var = xd0Var22.y;
                                fg0Var.k1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                        fg0Var.l1(LocaleController.getString(R.string.WrongCodeTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (fg0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            org.telegram.ui.Components.h01 h01Var = new org.telegram.ui.Components.h01();
                                            h01Var.a |= 256;
                                            h01Var.b = indexOf;
                                            int i14 = lastIndexOf + 1;
                                            h01Var.c = i14;
                                            valueOf.setSpan(new org.telegram.ui.Components.i01(h01Var, 0), indexOf, i14, 0);
                                        }
                                        SpannableStringBuilder formatSpannable = AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf);
                                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                        c2Var.P = formatSpannable;
                                        c2Var.N = LocaleController.getString("RestoreEmailSentTitle", R.string.RestoreEmailSentTitle);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new xr(26, xd0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = fg0Var.showDialog(c2Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                fg0 fg0Var2 = xd0Var22.y;
                                xd0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i112 = ((org.telegram.ui.ActionBar.o2) fg0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i112).sendRequest(getpassword, new vd0(xd0Var22, i13), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    fg0Var2.k1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue2 < 60 ? LocaleController.formatPluralString("Seconds", intValue2, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue2 / 60, new Object[0])));
                                            break;
                                        }
                                    } else if (fg0Var2.getParentActivity() != null) {
                                        xd0Var22.a.setText("");
                                        fg0.U0(fg0Var2, xd0Var22.x, true);
                                        break;
                                    }
                                } else {
                                    fg0Var2.v1(false, true);
                                    xd0Var22.postDelayed(new x60(21, xd0Var22, tLObject2), 150L);
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
