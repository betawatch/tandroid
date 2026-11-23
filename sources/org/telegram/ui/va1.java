package org.telegram.ui;

import android.app.Dialog;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class va1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ za1 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ va1(za1 za1Var, TLRPC.TL_error tL_error, int i7) {
        this.a = i7;
        this.b = za1Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.TL_error tL_error = this.c;
        za1 za1Var = this.b;
        switch (i7) {
            case 0:
                za1Var.B0();
                if (tL_error != null) {
                    if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        za1Var.L0(org.telegram.messenger.gd.N0(2131743684, null), tL_error.text);
                        break;
                    } else {
                        int intValue = Utilities.z(tL_error.text).intValue();
                        za1Var.L0(org.telegram.messenger.gd.N0(2131743684, null), org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750669, intValue < 60 ? org.telegram.messenger.gd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.gd.G(intValue / 60, "Minutes", new Object[0])));
                        break;
                    }
                } else {
                    za1Var.getMessagesController().s4(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(za1Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), new ra1(za1Var, 3));
                    String N0 = org.telegram.messenger.gd.N0(2131747242, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.U = N0;
                    t1Var.S = org.telegram.messenger.gd.N0(2131743684, null);
                    Dialog showDialog = za1Var.showDialog(t1Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                }
                break;
            case 1:
                za1Var.B0();
                if (tL_error != null) {
                    if (!tL_error.text.startsWith("CODE_INVALID")) {
                        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                            za1Var.L0(org.telegram.messenger.gd.N0(R.string.AppName, null), tL_error.text);
                            break;
                        } else {
                            int intValue2 = Utilities.z(tL_error.text).intValue();
                            za1Var.L0(org.telegram.messenger.gd.N0(R.string.AppName, null), org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750669, intValue2 < 60 ? org.telegram.messenger.gd.G(intValue2, "Seconds", new Object[0]) : org.telegram.messenger.gd.G(intValue2 / 60, "Minutes", new Object[0])));
                            break;
                        }
                    } else {
                        za1Var.D0();
                        break;
                    }
                } else if (za1Var.getParentActivity() != null) {
                    za1Var.z0(new qa1(za1Var, 5));
                    break;
                }
                break;
            case 2:
                za1.j0(za1Var, tL_error);
                break;
            default:
                za1.e0(za1Var, tL_error);
                break;
        }
    }
}
