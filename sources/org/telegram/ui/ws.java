package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ws extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ContactsActivity a;

    public ws(ContactsActivity contactsActivity) {
        this.a = contactsActivity;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ContactsActivity contactsActivity = this.a;
        if (i10 == -1) {
            kVar = ((org.telegram.ui.ActionBar.p2) contactsActivity).actionBar;
            if (kVar.s()) {
                contactsActivity.o0();
                return;
            } else {
                contactsActivity.finishFragment();
                return;
            }
        }
        if (i10 != 100) {
            if (i10 != 1) {
                if (i10 == 0) {
                    contactsActivity.f.x0(0);
                    AndroidUtilities.doOnPreDraw(contactsActivity.W.r, new bj(this, 14));
                    return;
                }
                return;
            }
            SharedConfig.toggleSortContactsByName();
            boolean z4 = SharedConfig.sortContactsByName;
            contactsActivity.v = z4;
            contactsActivity.d.Y(z4 ? 1 : 2, false);
            contactsActivity.s.setIcon(contactsActivity.v ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(contactsActivity.getParentActivity(), 0, contactsActivity.getResourceProvider());
        a0.h hVar = contactsActivity.a0;
        if (hVar.m() == 1) {
            alertDialog$Builder.a.O = LocaleController.getString(R.string.DeleteContactTitle);
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.DeleteContactSubtitle);
        } else {
            alertDialog$Builder.a.O = LocaleController.formatPluralString("DeleteContactsTitle", hVar.m(), new Object[0]);
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.DeleteContactsSubtitle);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ts(contactsActivity));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.lh0(18));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.show();
        d2Var.h();
    }
}
