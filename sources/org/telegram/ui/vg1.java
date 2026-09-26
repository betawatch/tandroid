package org.telegram.ui;

import android.app.Dialog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zg1 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ vg1(zg1 zg1Var, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.b = zg1Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.TL_error tL_error = this.c;
        zg1 zg1Var = this.b;
        switch (i10) {
            case 0:
                zg1Var.w0();
                if (tL_error != null) {
                    if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        zg1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error.text);
                        break;
                    } else {
                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        zg1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                        break;
                    }
                } else {
                    zg1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zg1Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new qg1(zg1Var, 3));
                    String string = LocaleController.getString(R.string.PasswordReset);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                    a2Var.T = string;
                    a2Var.R = LocaleController.getString(R.string.TwoStepVerificationTitle);
                    Dialog showDialog = zg1Var.showDialog(a2Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                }
                break;
            case 1:
                zg1Var.w0();
                if (tL_error != null) {
                    if (!tL_error.text.startsWith("CODE_INVALID")) {
                        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                            zg1Var.G0(LocaleController.getString(R.string.AppName), tL_error.text);
                            break;
                        } else {
                            int intValue2 = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                            zg1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue2 < 60 ? LocaleController.formatPluralString("Seconds", intValue2, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue2 / 60, new Object[0])));
                            break;
                        }
                    } else {
                        zg1Var.y0();
                        break;
                    }
                } else if (zg1Var.getParentActivity() != null) {
                    zg1Var.u0(new rg1(zg1Var, 5));
                    break;
                }
                break;
            case 2:
                zg1.e0(zg1Var, tL_error);
                break;
            default:
                zg1.Z(zg1Var, tL_error);
                break;
        }
    }
}
