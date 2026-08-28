package org.telegram.ui;

import android.app.Dialog;
import android.widget.TextView;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xw0 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PrivacySettingsActivity b;

    public /* synthetic */ xw0(PrivacySettingsActivity privacySettingsActivity, int i9) {
        this.a = i9;
        this.b = privacySettingsActivity;
    }

    public void a() {
        int i9;
        switch (this.a) {
            case 2:
                PrivacySettingsActivity privacySettingsActivity = this.b;
                yw0 yw0Var = privacySettingsActivity.a;
                if (yw0Var != null && (i9 = privacySettingsActivity.s) >= 0) {
                    yw0Var.m(i9);
                    break;
                }
                break;
            default:
                PrivacySettingsActivity.T(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        String string;
        switch (this.a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.b;
                try {
                    Dialog dialog = privacySettingsActivity.visibleDialog;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                alertDialog$Builder.a.N = LocaleController.getString("PrivacyPaymentsClearAlertTitle", R.string.PrivacyPaymentsClearAlertTitle);
                alertDialog$Builder.a.P = LocaleController.getString("PrivacyPaymentsClearAlert", R.string.PrivacyPaymentsClearAlert);
                alertDialog$Builder.k(LocaleController.getString("ClearButton", R.string.ClearButton), new xw0(privacySettingsActivity, 1));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                privacySettingsActivity.showDialog(alertDialog$Builder.a);
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.a;
                privacySettingsActivity.showDialog(c2Var2);
                TextView textView = (TextView) c2Var2.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                    break;
                }
                break;
            case 1:
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                PrivacySettingsActivity privacySettingsActivity2 = this.b;
                boolean[] zArr = privacySettingsActivity2.V;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity2.getUserConfig().tmpPassword = null;
                privacySettingsActivity2.getUserConfig().saveConfig(false);
                privacySettingsActivity2.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new ih.q5(5));
                boolean z10 = zArr[0];
                if (z10 && zArr[1]) {
                    string = LocaleController.getString("PrivacyPaymentsPaymentShippingCleared", R.string.PrivacyPaymentsPaymentShippingCleared);
                } else if (z10) {
                    string = LocaleController.getString("PrivacyPaymentsShippingInfoCleared", R.string.PrivacyPaymentsShippingInfoCleared);
                } else if (zArr[1]) {
                    string = LocaleController.getString("PrivacyPaymentsPaymentInfoCleared", R.string.PrivacyPaymentsPaymentInfoCleared);
                }
                org.telegram.ui.Components.oc.a0(privacySettingsActivity2).Q(R.raw.chats_infotip, 36, string).j();
                break;
            case 2:
            case 3:
            default:
                PrivacySettingsActivity privacySettingsActivity3 = this.b;
                org.telegram.ui.ActionBar.c2 o6 = new AlertDialog$Builder(privacySettingsActivity3.getParentActivity(), 3, null).o();
                privacySettingsActivity3.c = o6;
                o6.c0 = false;
                if (privacySettingsActivity3.O != privacySettingsActivity3.P) {
                    UserConfig userConfig = privacySettingsActivity3.getUserConfig();
                    boolean z11 = privacySettingsActivity3.P;
                    userConfig.syncContacts = z11;
                    privacySettingsActivity3.O = z11;
                    privacySettingsActivity3.getUserConfig().saveConfig(false);
                }
                privacySettingsActivity3.getContactsController().deleteAllContacts(new ww0(privacySettingsActivity3, 1));
                break;
            case 4:
                fg0 fg0Var = new fg0();
                PrivacySettingsActivity privacySettingsActivity4 = this.b;
                ww0 ww0Var = new ww0(privacySettingsActivity4, 2);
                fg0Var.B = 3;
                fg0Var.a = 12;
                fg0Var.Z = ww0Var;
                privacySettingsActivity4.presentFragment(fg0Var);
                break;
        }
    }
}
