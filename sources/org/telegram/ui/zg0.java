package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class zg0 {
    public final /* synthetic */ ah0 a;

    public zg0(ah0 ah0Var) {
        this.a = ah0Var;
    }

    public final void a(pg0 pg0Var) {
        boolean z10;
        int i10;
        ah0 ah0Var = this.a;
        ah0Var.L = true;
        bh0 bh0Var = ah0Var.V;
        bh0Var.J = 0;
        bh0Var.n1(0, false);
        int i11 = Build.VERSION.SDK_INT;
        if (AndroidUtilities.isSimAvailable()) {
            boolean z11 = bh0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            boolean z12 = bh0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
            boolean z13 = i11 < 28 || bh0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
            boolean z14 = i11 < 26 || bh0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
            gk0 gk0Var = ah0Var.a;
            if (gk0Var != null && "888".equals(gk0Var.getText())) {
                z11 = true;
                z12 = true;
                z13 = true;
                z14 = true;
            }
            if (bh0Var.v) {
                bh0Var.r.clear();
                if (!z11) {
                    bh0Var.r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z12) {
                    bh0Var.r.add("android.permission.CALL_PHONE");
                }
                if (!z13) {
                    bh0Var.r.add("android.permission.READ_CALL_LOG");
                }
                if (!z14 && i11 >= 26) {
                    bh0Var.r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!bh0Var.r.isEmpty()) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!globalMainSettings.getBoolean("firstlogin", true) && !bh0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !bh0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            bh0Var.getParentActivity().requestPermissions((String[]) bh0Var.r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bh0Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
                    if (!z11 && (!z12 || !z13)) {
                        alertDialog$Builder.a.T = LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog);
                        i10 = R.raw.calls_log;
                    } else if (z12 && z13) {
                        alertDialog$Builder.a.T = LocaleController.getString("AllowReadCall", R.string.AllowReadCall);
                        i10 = R.raw.incoming_calls;
                    } else {
                        alertDialog$Builder.a.T = LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog);
                        i10 = R.raw.calls_log;
                    }
                    alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
                    bh0Var.h = bh0Var.showDialog(alertDialog$Builder.a);
                    ah0Var.L = true;
                    return;
                }
            }
            z10 = true;
        } else {
            z10 = true;
        }
        yg0 yg0Var = new yg0(0, pg0Var, this);
        pg0Var.h.f(z10, z10);
        AndroidUtilities.runOnUIThread(yg0Var, 400L);
    }
}
