package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ug0 {
    public final /* synthetic */ vg0 a;

    public ug0(vg0 vg0Var) {
        this.a = vg0Var;
    }

    public final void a(kg0 kg0Var) {
        int i10;
        vg0 vg0Var = this.a;
        vg0Var.L = true;
        wg0 wg0Var = vg0Var.V;
        wg0Var.J = 0;
        wg0Var.n1(0, false);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23 && AndroidUtilities.isSimAvailable()) {
            boolean z10 = wg0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            boolean z11 = wg0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
            boolean z12 = i11 < 28 || wg0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
            boolean z13 = i11 < 26 || wg0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
            ck0 ck0Var = vg0Var.a;
            if (ck0Var != null && "888".equals(ck0Var.getText())) {
                z10 = true;
                z11 = true;
                z12 = true;
                z13 = true;
            }
            if (wg0Var.v) {
                wg0Var.r.clear();
                if (!z10) {
                    wg0Var.r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z11) {
                    wg0Var.r.add("android.permission.CALL_PHONE");
                }
                if (!z12) {
                    wg0Var.r.add("android.permission.READ_CALL_LOG");
                }
                if (!z13 && i11 >= 26) {
                    wg0Var.r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!wg0Var.r.isEmpty()) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!globalMainSettings.getBoolean("firstlogin", true) && !wg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !wg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            wg0Var.getParentActivity().requestPermissions((String[]) wg0Var.r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                    }
                    globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg0Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
                    if (!z10 && (!z11 || !z12)) {
                        alertDialog$Builder.a.T = LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog);
                        i10 = R.raw.calls_log;
                    } else if (z11 && z12) {
                        alertDialog$Builder.a.T = LocaleController.getString("AllowReadCall", R.string.AllowReadCall);
                        i10 = R.raw.incoming_calls;
                    } else {
                        alertDialog$Builder.a.T = LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog);
                        i10 = R.raw.calls_log;
                    }
                    alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
                    wg0Var.h = wg0Var.showDialog(alertDialog$Builder.a);
                    vg0Var.L = true;
                    return;
                }
            }
        }
        tg0 tg0Var = new tg0(0, kg0Var, this);
        kg0Var.h.f(true, true);
        AndroidUtilities.runOnUIThread(tg0Var, 400L);
    }
}
