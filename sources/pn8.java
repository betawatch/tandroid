// default package

import android.app.Dialog;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.PrivacySettingsActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class pn8 implements fd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PrivacySettingsActivity b;

    public /* synthetic */ pn8(PrivacySettingsActivity privacySettingsActivity, byte b) {
        this.a = b;
        this.b = privacySettingsActivity;
    }

    public final void a() {
        int i;
        byte b = this.a;
        PrivacySettingsActivity privacySettingsActivity = this.b;
        switch (b) {
            case 2:
                sn8 sn8Var = privacySettingsActivity.a;
                if (sn8Var != null && (i = privacySettingsActivity.s) >= 0) {
                    sn8Var.g(i);
                    break;
                }
                break;
            default:
                privacySettingsActivity.D0();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fd
    public final void w(id idVar, int i) {
        String M0;
        byte b = this.a;
        Object[] objArr = 0;
        PrivacySettingsActivity privacySettingsActivity = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                privacySettingsActivity.getClass();
                try {
                    Dialog dialog = privacySettingsActivity.visibleDialog;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                String M02 = ob6.M0(2131746523, "PrivacyPaymentsClearAlertTitle");
                id idVar2 = alertDialog$Builder.a;
                idVar2.S = M02;
                idVar2.U = ob6.M0(2131746525, "PrivacyPaymentsClearAlert");
                alertDialog$Builder.j(ob6.M0(2131752064, "ClearButton"), new pn8(privacySettingsActivity, b2));
                alertDialog$Builder.g(ob6.M0(2131752570, "Cancel"), null);
                privacySettingsActivity.showDialog(idVar2);
                privacySettingsActivity.showDialog(idVar2);
                TextView textView = (TextView) idVar2.c(-1);
                if (textView != null) {
                    yob.X(textView, aob.q7, null);
                    break;
                }
                break;
            case 1:
                privacySettingsActivity.getClass();
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr = privacySettingsActivity.a0;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity.getUserConfig().y = null;
                privacySettingsActivity.getUserConfig().u(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new xe2(objArr == true ? 1 : 0));
                if (zArr[0]) {
                    M0 = zArr[1] ? ob6.M0(2131746521, "PrivacyPaymentsPaymentShippingCleared") : ob6.M0(2131746520, "PrivacyPaymentsShippingInfoCleared");
                } else if (zArr[1]) {
                    M0 = ob6.M0(2131746522, "PrivacyPaymentsPaymentInfoCleared");
                }
                d31.b0(privacySettingsActivity).Q(R.raw.chats_infotip, 36, M0).j();
                break;
            case 2:
            case 3:
            default:
                id o = new AlertDialog$Builder(3, null, privacySettingsActivity.getParentActivity()).o();
                privacySettingsActivity.c = o;
                o.j0 = false;
                if (privacySettingsActivity.T != privacySettingsActivity.U) {
                    yac userConfig = privacySettingsActivity.getUserConfig();
                    boolean z = privacySettingsActivity.U;
                    userConfig.V = z;
                    privacySettingsActivity.T = z;
                    privacySettingsActivity.getUserConfig().u(false);
                }
                lv2 contactsController = privacySettingsActivity.getContactsController();
                on8 on8Var = new on8(privacySettingsActivity, b2);
                contactsController.K();
                TLRPC.TL_contacts_deleteContacts tL_contacts_deleteContacts = new TLRPC.TL_contacts_deleteContacts();
                int size = contactsController.f0.size();
                for (int i2 = 0; i2 < size; i2++) {
                    tL_contacts_deleteContacts.id.add(contactsController.getMessagesController().o1(((TLRPC.TL_contact) contactsController.f0.get(i2)).user_id));
                }
                contactsController.getConnectionsManager().sendRequest(tL_contacts_deleteContacts, new ql(contactsController, on8Var, (byte) 26));
                break;
            case 4:
                privacySettingsActivity.getClass();
                qh6 qh6Var = new qh6();
                on8 on8Var2 = new on8(privacySettingsActivity, (byte) 2);
                qh6Var.G = (byte) 3;
                qh6Var.a = 12;
                qh6Var.e0 = on8Var2;
                privacySettingsActivity.presentFragment(qh6Var);
                break;
        }
    }
}
