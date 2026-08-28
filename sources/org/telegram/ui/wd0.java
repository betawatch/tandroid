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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wd0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ yd0 b;

    public /* synthetic */ wd0(yd0 yd0Var, int i9) {
        this.a = i9;
        this.b = yd0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i9 = 0;
                final yd0 yd0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xd0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10;
                        int i11 = i9;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        yd0 yd0Var2 = yd0Var;
                        int i12 = 0;
                        switch (i11) {
                            case 0:
                                yd0Var2.getClass();
                                if (tL_error2 == null) {
                                    yd0Var2.n = (TL_account.Password) tLObject2;
                                    yd0Var2.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                fg0 fg0Var = yd0Var2.y;
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
                                            org.telegram.ui.Components.vz0 vz0Var = new org.telegram.ui.Components.vz0();
                                            vz0Var.a |= 256;
                                            vz0Var.b = indexOf;
                                            int i13 = lastIndexOf + 1;
                                            vz0Var.c = i13;
                                            valueOf.setSpan(new org.telegram.ui.Components.wz0(vz0Var, 0), indexOf, i13, 0);
                                        }
                                        SpannableStringBuilder formatSpannable = AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf);
                                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                        c2Var.P = formatSpannable;
                                        c2Var.N = LocaleController.getString("RestoreEmailSentTitle", R.string.RestoreEmailSentTitle);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new yr(26, yd0Var2, tL_auth_passwordRecovery));
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
                                fg0 fg0Var2 = yd0Var2.y;
                                yd0Var2.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.o2) fg0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new wd0(yd0Var2, i12), 8);
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
                                        yd0Var2.a.setText("");
                                        fg0.U0(fg0Var2, yd0Var2.x, true);
                                        break;
                                    }
                                } else {
                                    fg0Var2.v1(false, true);
                                    yd0Var2.postDelayed(new x20(24, yd0Var2, tLObject2), 150L);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i10 = 1;
                final yd0 yd0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xd0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102;
                        int i11 = i10;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        yd0 yd0Var22 = yd0Var2;
                        int i12 = 0;
                        switch (i11) {
                            case 0:
                                yd0Var22.getClass();
                                if (tL_error2 == null) {
                                    yd0Var22.n = (TL_account.Password) tLObject2;
                                    yd0Var22.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                fg0 fg0Var = yd0Var22.y;
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
                                            org.telegram.ui.Components.vz0 vz0Var = new org.telegram.ui.Components.vz0();
                                            vz0Var.a |= 256;
                                            vz0Var.b = indexOf;
                                            int i13 = lastIndexOf + 1;
                                            vz0Var.c = i13;
                                            valueOf.setSpan(new org.telegram.ui.Components.wz0(vz0Var, 0), indexOf, i13, 0);
                                        }
                                        SpannableStringBuilder formatSpannable = AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf);
                                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                        c2Var.P = formatSpannable;
                                        c2Var.N = LocaleController.getString("RestoreEmailSentTitle", R.string.RestoreEmailSentTitle);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new yr(26, yd0Var22, tL_auth_passwordRecovery));
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
                                fg0 fg0Var2 = yd0Var22.y;
                                yd0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i102 = ((org.telegram.ui.ActionBar.o2) fg0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i102).sendRequest(getpassword, new wd0(yd0Var22, i12), 8);
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
                                        yd0Var22.a.setText("");
                                        fg0.U0(fg0Var2, yd0Var22.x, true);
                                        break;
                                    }
                                } else {
                                    fg0Var2.v1(false, true);
                                    yd0Var22.postDelayed(new x20(24, yd0Var22, tLObject2), 150L);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 2;
                final yd0 yd0Var3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xd0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102;
                        int i112 = i11;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        yd0 yd0Var22 = yd0Var3;
                        int i12 = 0;
                        switch (i112) {
                            case 0:
                                yd0Var22.getClass();
                                if (tL_error2 == null) {
                                    yd0Var22.n = (TL_account.Password) tLObject2;
                                    yd0Var22.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                fg0 fg0Var = yd0Var22.y;
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
                                            org.telegram.ui.Components.vz0 vz0Var = new org.telegram.ui.Components.vz0();
                                            vz0Var.a |= 256;
                                            vz0Var.b = indexOf;
                                            int i13 = lastIndexOf + 1;
                                            vz0Var.c = i13;
                                            valueOf.setSpan(new org.telegram.ui.Components.wz0(vz0Var, 0), indexOf, i13, 0);
                                        }
                                        SpannableStringBuilder formatSpannable = AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf);
                                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                        c2Var.P = formatSpannable;
                                        c2Var.N = LocaleController.getString("RestoreEmailSentTitle", R.string.RestoreEmailSentTitle);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new yr(26, yd0Var22, tL_auth_passwordRecovery));
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
                                fg0 fg0Var2 = yd0Var22.y;
                                yd0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i102 = ((org.telegram.ui.ActionBar.o2) fg0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i102).sendRequest(getpassword, new wd0(yd0Var22, i12), 8);
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
                                        yd0Var22.a.setText("");
                                        fg0.U0(fg0Var2, yd0Var22.x, true);
                                        break;
                                    }
                                } else {
                                    fg0Var2.v1(false, true);
                                    yd0Var22.postDelayed(new x20(24, yd0Var22, tLObject2), 150L);
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
