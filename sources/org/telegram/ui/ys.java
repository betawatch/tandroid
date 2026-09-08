package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ys extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ContactsActivity a;

    public ys(ContactsActivity contactsActivity) {
        this.a = contactsActivity;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ContactsActivity contactsActivity = this.a;
        if (i10 == -1) {
            kVar = ((org.telegram.ui.ActionBar.n2) contactsActivity).actionBar;
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
                    AndroidUtilities.doOnPreDraw(contactsActivity.Z.r, new dj(this, 14));
                    return;
                }
                return;
            }
            SharedConfig.toggleSortContactsByName();
            boolean z10 = SharedConfig.sortContactsByName;
            contactsActivity.v = z10;
            contactsActivity.d.Y(z10 ? 1 : 2, false);
            contactsActivity.s.setIcon(contactsActivity.v ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(contactsActivity.getParentActivity(), 0, contactsActivity.getResourceProvider());
        a0.i iVar = contactsActivity.d0;
        if (iVar.m() == 1) {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteContactTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.DeleteContactSubtitle);
        } else {
            alertDialog$Builder.a.R = LocaleController.formatPluralString("DeleteContactsTitle", iVar.m(), new Object[0]);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.DeleteContactsSubtitle);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new vs(contactsActivity));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.wo0(14));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.show();
        b2Var.h();
    }
}
