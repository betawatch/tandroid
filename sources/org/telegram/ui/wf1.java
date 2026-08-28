package org.telegram.ui;

import android.app.Dialog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wf1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ag1 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ wf1(ag1 ag1Var, TLRPC.TL_error tL_error, int i9) {
        this.a = i9;
        this.b = ag1Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        TLRPC.TL_error tL_error = this.c;
        ag1 ag1Var = this.b;
        switch (i9) {
            case 0:
                ag1Var.v0();
                if (tL_error != null) {
                    if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        ag1Var.F0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error.text);
                        break;
                    } else {
                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        ag1Var.F0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                        break;
                    }
                } else {
                    ag1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ag1Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new rf1(ag1Var, 3));
                    String string = LocaleController.getString(R.string.PasswordReset);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                    c2Var.P = string;
                    c2Var.N = LocaleController.getString(R.string.TwoStepVerificationTitle);
                    Dialog showDialog = ag1Var.showDialog(c2Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                }
                break;
            case 1:
                ag1Var.v0();
                if (tL_error != null) {
                    if (!tL_error.text.startsWith("CODE_INVALID")) {
                        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                            ag1Var.F0(LocaleController.getString(R.string.AppName), tL_error.text);
                            break;
                        } else {
                            int intValue2 = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                            ag1Var.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue2 < 60 ? LocaleController.formatPluralString("Seconds", intValue2, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue2 / 60, new Object[0])));
                            break;
                        }
                    } else {
                        ag1Var.x0();
                        break;
                    }
                } else if (ag1Var.getParentActivity() != null) {
                    ag1Var.t0(new sf1(ag1Var, 5));
                    break;
                }
                break;
            case 2:
                ag1.d0(ag1Var, tL_error);
                break;
            default:
                ag1.Y(ag1Var, tL_error);
                break;
        }
    }
}
