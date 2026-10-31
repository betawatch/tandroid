package org.telegram.ui;

import android.app.Dialog;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class vu0 implements org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PrivacySettingsActivity b;

    public /* synthetic */ vu0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.a = i10;
        this.b = privacySettingsActivity;
    }

    public void a() {
        int i10;
        switch (this.a) {
            case 2:
                PrivacySettingsActivity privacySettingsActivity = this.b;
                wu0 wu0Var = privacySettingsActivity.a;
                if (wu0Var != null && (i10 = privacySettingsActivity.s) >= 0) {
                    wu0Var.g(i10);
                    break;
                }
                break;
            default:
                PrivacySettingsActivity.Y(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        String L0;
        int i11 = this.a;
        int i12 = 0;
        PrivacySettingsActivity privacySettingsActivity = this.b;
        int i13 = 1;
        switch (i11) {
            case 0:
                try {
                    Dialog dialog = privacySettingsActivity.visibleDialog;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                String L02 = org.telegram.messenger.cd.L0(2131746809, "PrivacyPaymentsClearAlertTitle");
                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.a;
                x1Var2.R = L02;
                x1Var2.T = org.telegram.messenger.cd.L0(2131746811, "PrivacyPaymentsClearAlert");
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752099, "ClearButton"), new vu0(privacySettingsActivity, i13));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, "Cancel"), null);
                privacySettingsActivity.showDialog(x1Var2);
                privacySettingsActivity.showDialog(x1Var2);
                TextView textView = (TextView) x1Var2.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                    break;
                }
                break;
            case 1:
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr = privacySettingsActivity.Z;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity.getUserConfig().y = null;
                privacySettingsActivity.getUserConfig().v(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new ag.c3(4));
                boolean z10 = zArr[0];
                if (z10 && zArr[1]) {
                    L0 = org.telegram.messenger.cd.L0(2131746807, "PrivacyPaymentsPaymentShippingCleared");
                } else if (z10) {
                    L0 = org.telegram.messenger.cd.L0(2131746806, "PrivacyPaymentsShippingInfoCleared");
                } else if (zArr[1]) {
                    L0 = org.telegram.messenger.cd.L0(2131746808, "PrivacyPaymentsPaymentInfoCleared");
                }
                org.telegram.ui.Components.cc.a0(privacySettingsActivity).Q(R.raw.chats_infotip, 36, L0).j();
                break;
            case 2:
            case 3:
            default:
                org.telegram.ui.ActionBar.x1 p5 = new AlertDialog$Builder(3, privacySettingsActivity.getParentActivity(), null).p();
                privacySettingsActivity.c = p5;
                p5.i0 = false;
                if (privacySettingsActivity.S != privacySettingsActivity.T) {
                    org.telegram.messenger.d20 userConfig = privacySettingsActivity.getUserConfig();
                    boolean z11 = privacySettingsActivity.T;
                    userConfig.U = z11;
                    privacySettingsActivity.S = z11;
                    privacySettingsActivity.getUserConfig().v(false);
                }
                org.telegram.messenger.i5 contactsController = privacySettingsActivity.getContactsController();
                uu0 uu0Var = new uu0(privacySettingsActivity, i13);
                contactsController.K();
                TLRPC.TL_contacts_deleteContacts tL_contacts_deleteContacts = new TLRPC.TL_contacts_deleteContacts();
                int size = contactsController.e0.size();
                for (int i14 = 0; i14 < size; i14++) {
                    tL_contacts_deleteContacts.id.add(contactsController.getMessagesController().n1(((TLRPC.TL_contact) contactsController.e0.get(i14)).user_id));
                }
                contactsController.getConnectionsManager().sendRequest(tL_contacts_deleteContacts, new org.telegram.messenger.v4(i12, contactsController, uu0Var));
                break;
            case 4:
                hf0 hf0Var = new hf0();
                uu0 uu0Var2 = new uu0(privacySettingsActivity, 2);
                hf0Var.F = 3;
                hf0Var.a = 12;
                hf0Var.d0 = uu0Var2;
                privacySettingsActivity.presentFragment(hf0Var);
                break;
        }
    }
}
