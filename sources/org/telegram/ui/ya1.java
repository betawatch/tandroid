package org.telegram.ui;

import android.app.Dialog;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ya1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cb1 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ ya1(cb1 cb1Var, TLRPC.TL_error tL_error, int i7) {
        this.a = i7;
        this.b = cb1Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.TL_error tL_error = this.c;
        cb1 cb1Var = this.b;
        switch (i7) {
            case 0:
                cb1Var.B0();
                if (tL_error != null) {
                    if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        cb1Var.L0(org.telegram.messenger.id.M0(2131743931, null), tL_error.text);
                        break;
                    } else {
                        int intValue = Utilities.z(tL_error.text).intValue();
                        cb1Var.L0(org.telegram.messenger.id.M0(2131743931, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750686, intValue < 60 ? org.telegram.messenger.id.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.id.G(intValue / 60, "Minutes", new Object[0])));
                        break;
                    }
                } else {
                    cb1Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cb1Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), new ua1(cb1Var, 3));
                    String M0 = org.telegram.messenger.id.M0(2131747436, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.T = M0;
                    u1Var.R = org.telegram.messenger.id.M0(2131743931, null);
                    Dialog showDialog = cb1Var.showDialog(u1Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                }
                break;
            case 1:
                cb1Var.B0();
                if (tL_error != null) {
                    if (!tL_error.text.startsWith("CODE_INVALID")) {
                        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                            cb1Var.L0(org.telegram.messenger.id.M0(R.string.AppName, null), tL_error.text);
                            break;
                        } else {
                            int intValue2 = Utilities.z(tL_error.text).intValue();
                            cb1Var.L0(org.telegram.messenger.id.M0(R.string.AppName, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750686, intValue2 < 60 ? org.telegram.messenger.id.G(intValue2, "Seconds", new Object[0]) : org.telegram.messenger.id.G(intValue2 / 60, "Minutes", new Object[0])));
                            break;
                        }
                    } else {
                        cb1Var.D0();
                        break;
                    }
                } else if (cb1Var.getParentActivity() != null) {
                    cb1Var.z0(new ta1(cb1Var, 5));
                    break;
                }
                break;
            case 2:
                cb1.j0(cb1Var, tL_error);
                break;
            default:
                cb1.e0(cb1Var, tL_error);
                break;
        }
    }
}
