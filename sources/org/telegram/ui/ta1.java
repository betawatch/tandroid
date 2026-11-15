package org.telegram.ui;

import android.app.Dialog;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ta1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xa1 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ ta1(xa1 xa1Var, TLRPC.TL_error tL_error, int i7) {
        this.a = i7;
        this.b = xa1Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.TL_error tL_error = this.c;
        xa1 xa1Var = this.b;
        switch (i7) {
            case 0:
                xa1Var.B0();
                if (tL_error != null) {
                    if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        xa1Var.L0(org.telegram.messenger.hd.M0(2131743931, null), tL_error.text);
                        break;
                    } else {
                        int intValue = Utilities.z(tL_error.text).intValue();
                        xa1Var.L0(org.telegram.messenger.hd.M0(2131743931, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750686, intValue < 60 ? org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0])));
                        break;
                    }
                } else {
                    xa1Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xa1Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), new pa1(xa1Var, 3));
                    String M0 = org.telegram.messenger.hd.M0(2131747436, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.U = M0;
                    t1Var.S = org.telegram.messenger.hd.M0(2131743931, null);
                    Dialog showDialog = xa1Var.showDialog(t1Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                }
                break;
            case 1:
                xa1Var.B0();
                if (tL_error != null) {
                    if (!tL_error.text.startsWith("CODE_INVALID")) {
                        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                            xa1Var.L0(org.telegram.messenger.hd.M0(R.string.AppName, null), tL_error.text);
                            break;
                        } else {
                            int intValue2 = Utilities.z(tL_error.text).intValue();
                            xa1Var.L0(org.telegram.messenger.hd.M0(R.string.AppName, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750686, intValue2 < 60 ? org.telegram.messenger.hd.G(intValue2, "Seconds", new Object[0]) : org.telegram.messenger.hd.G(intValue2 / 60, "Minutes", new Object[0])));
                            break;
                        }
                    } else {
                        xa1Var.D0();
                        break;
                    }
                } else if (xa1Var.getParentActivity() != null) {
                    xa1Var.z0(new oa1(xa1Var, 5));
                    break;
                }
                break;
            case 2:
                xa1.j0(xa1Var, tL_error);
                break;
            default:
                xa1.e0(xa1Var, tL_error);
                break;
        }
    }
}
