package org.telegram.ui;

import android.app.Dialog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vg1 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ rg1(vg1 vg1Var, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.b = vg1Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.TL_error tL_error = this.c;
        vg1 vg1Var = this.b;
        switch (i10) {
            case 0:
                vg1Var.w0();
                if (tL_error != null) {
                    if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        vg1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error.text);
                        break;
                    } else {
                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        vg1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                        break;
                    }
                } else {
                    vg1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vg1Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new mg1(vg1Var, 3));
                    String string = LocaleController.getString(R.string.PasswordReset);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                    d2Var.Q = string;
                    d2Var.O = LocaleController.getString(R.string.TwoStepVerificationTitle);
                    Dialog showDialog = vg1Var.showDialog(d2Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                }
                break;
            case 1:
                vg1Var.w0();
                if (tL_error != null) {
                    if (!tL_error.text.startsWith("CODE_INVALID")) {
                        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                            vg1Var.G0(LocaleController.getString(R.string.AppName), tL_error.text);
                            break;
                        } else {
                            int intValue2 = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                            vg1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue2 < 60 ? LocaleController.formatPluralString("Seconds", intValue2, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue2 / 60, new Object[0])));
                            break;
                        }
                    } else {
                        vg1Var.y0();
                        break;
                    }
                } else if (vg1Var.getParentActivity() != null) {
                    vg1Var.u0(new ng1(vg1Var, 5));
                    break;
                }
                break;
            case 2:
                vg1.e0(vg1Var, tL_error);
                break;
            default:
                vg1.Z(vg1Var, tL_error);
                break;
        }
    }
}
