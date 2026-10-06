package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class sg0 {
    public final /* synthetic */ tg0 a;

    public sg0(tg0 tg0Var) {
        this.a = tg0Var;
    }

    public final void a(ig0 ig0Var) {
        int i10;
        tg0 tg0Var = this.a;
        tg0Var.L = true;
        ug0 ug0Var = tg0Var.V;
        ug0Var.J = 0;
        ug0Var.n1(0, false);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23 && AndroidUtilities.isSimAvailable()) {
            boolean z10 = ug0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            boolean z11 = ug0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
            boolean z12 = i11 < 28 || ug0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
            boolean z13 = i11 < 26 || ug0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
            yj0 yj0Var = tg0Var.a;
            if (yj0Var != null && "888".equals(yj0Var.getText())) {
                z10 = true;
                z11 = true;
                z12 = true;
                z13 = true;
            }
            if (ug0Var.v) {
                ug0Var.r.clear();
                if (!z10) {
                    ug0Var.r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z11) {
                    ug0Var.r.add("android.permission.CALL_PHONE");
                }
                if (!z12) {
                    ug0Var.r.add("android.permission.READ_CALL_LOG");
                }
                if (!z13 && i11 >= 26) {
                    ug0Var.r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!ug0Var.r.isEmpty()) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!globalMainSettings.getBoolean("firstlogin", true) && !ug0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !ug0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            ug0Var.getParentActivity().requestPermissions((String[]) ug0Var.r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                    }
                    globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ug0Var.getParentActivity());
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
                    alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.L5, false), null);
                    ug0Var.h = ug0Var.showDialog(alertDialog$Builder.a);
                    tg0Var.L = true;
                    return;
                }
            }
        }
        rg0 rg0Var = new rg0(0, ig0Var, this);
        ig0Var.h.f(true, true);
        AndroidUtilities.runOnUIThread(rg0Var, 400L);
    }
}
