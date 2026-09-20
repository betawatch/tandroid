package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class wg0 {
    public final /* synthetic */ xg0 a;

    public wg0(xg0 xg0Var) {
        this.a = xg0Var;
    }

    public final void a(mg0 mg0Var) {
        int i10;
        xg0 xg0Var = this.a;
        xg0Var.L = true;
        yg0 yg0Var = xg0Var.V;
        yg0Var.J = 0;
        yg0Var.n1(0, false);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23 && AndroidUtilities.isSimAvailable()) {
            boolean z10 = yg0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            boolean z11 = yg0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
            boolean z12 = i11 < 28 || yg0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
            boolean z13 = i11 < 26 || yg0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
            dk0 dk0Var = xg0Var.a;
            if (dk0Var != null && "888".equals(dk0Var.getText())) {
                z10 = true;
                z11 = true;
                z12 = true;
                z13 = true;
            }
            if (yg0Var.v) {
                yg0Var.r.clear();
                if (!z10) {
                    yg0Var.r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z11) {
                    yg0Var.r.add("android.permission.CALL_PHONE");
                }
                if (!z12) {
                    yg0Var.r.add("android.permission.READ_CALL_LOG");
                }
                if (!z13 && i11 >= 26) {
                    yg0Var.r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!yg0Var.r.isEmpty()) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!globalMainSettings.getBoolean("firstlogin", true) && !yg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !yg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            yg0Var.getParentActivity().requestPermissions((String[]) yg0Var.r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yg0Var.getParentActivity());
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
                    yg0Var.h = yg0Var.showDialog(alertDialog$Builder.a);
                    xg0Var.L = true;
                    return;
                }
            }
        }
        vg0 vg0Var = new vg0(0, mg0Var, this);
        mg0Var.h.f(true, true);
        AndroidUtilities.runOnUIThread(vg0Var, 400L);
    }
}
