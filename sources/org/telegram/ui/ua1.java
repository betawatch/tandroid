package org.telegram.ui;

import android.app.Dialog;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ua1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ya1 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ ua1(ya1 ya1Var, TLRPC.TL_error tL_error, int i7) {
        this.a = i7;
        this.b = ya1Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.TL_error tL_error = this.c;
        ya1 ya1Var = this.b;
        switch (i7) {
            case 0:
                ya1Var.B0();
                if (tL_error != null) {
                    if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        ya1Var.L0(org.telegram.messenger.hd.M0(2131743932, null), tL_error.text);
                        break;
                    } else {
                        int intValue = Utilities.z(tL_error.text).intValue();
                        ya1Var.L0(org.telegram.messenger.hd.M0(2131743932, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0])));
                        break;
                    }
                } else {
                    ya1Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ya1Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), new qa1(ya1Var, 3));
                    String M0 = org.telegram.messenger.hd.M0(2131747435, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.T = M0;
                    u1Var.R = org.telegram.messenger.hd.M0(2131743932, null);
                    Dialog showDialog = ya1Var.showDialog(u1Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                }
                break;
            case 1:
                ya1Var.B0();
                if (tL_error != null) {
                    if (!tL_error.text.startsWith("CODE_INVALID")) {
                        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                            ya1Var.L0(org.telegram.messenger.hd.M0(R.string.AppName, null), tL_error.text);
                            break;
                        } else {
                            int intValue2 = Utilities.z(tL_error.text).intValue();
                            ya1Var.L0(org.telegram.messenger.hd.M0(R.string.AppName, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750687, intValue2 < 60 ? org.telegram.messenger.hd.G(intValue2, "Seconds", new Object[0]) : org.telegram.messenger.hd.G(intValue2 / 60, "Minutes", new Object[0])));
                            break;
                        }
                    } else {
                        ya1Var.D0();
                        break;
                    }
                } else if (ya1Var.getParentActivity() != null) {
                    ya1Var.z0(new pa1(ya1Var, 5));
                    break;
                }
                break;
            case 2:
                ya1.j0(ya1Var, tL_error);
                break;
            default:
                ya1.e0(ya1Var, tL_error);
                break;
        }
    }
}
