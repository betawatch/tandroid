package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ContactsController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qs extends of.e {
    public final /* synthetic */ ContactsActivity H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs(ContactsActivity contactsActivity, Context context, int i9, boolean z10, a0.h hVar, int i10) {
        super(context, i9, z10, hVar, i10);
        this.H = contactsActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    @Override // org.telegram.ui.Components.sk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R() {
        int size;
        boolean z10;
        boolean z11 = false;
        this.E = false;
        int i9 = this.B;
        int i10 = this.r;
        int i11 = this.v;
        int i12 = 1;
        if (i9 != 2) {
            size = (i11 == 2 ? ContactsController.getInstance(i10).sortedUsersMutualSectionsArray : ContactsController.getInstance(i10).sortedUsersSectionsArray).size();
            if (size == 0) {
                this.E = true;
            }
            if (i11 == 0) {
                size++;
            }
            z10 = this.A;
            if (z10) {
                size++;
            }
            boolean isEmpty = ContactsController.getInstance(i10).phoneBookContacts.isEmpty();
            this.F = !isEmpty;
            if (this.E && this.w && !z10 && i11 == 0) {
                z11 = true;
            }
            this.G = z11;
            if (z11) {
                i12 = size;
            } else if (!isEmpty) {
                i12 = 2;
            }
            ContactsActivity contactsActivity = this.H;
            ContactsActivity.d0(contactsActivity);
            contactsActivity.l0();
            contactsActivity.k0();
            return i12;
        }
        this.E = this.y.isEmpty();
        size = 1;
        if (i11 == 0) {
        }
        z10 = this.A;
        if (z10) {
        }
        boolean isEmpty2 = ContactsController.getInstance(i10).phoneBookContacts.isEmpty();
        this.F = !isEmpty2;
        if (this.E) {
            z11 = true;
        }
        this.G = z11;
        if (z11) {
        }
        ContactsActivity contactsActivity2 = this.H;
        ContactsActivity.d0(contactsActivity2);
        contactsActivity2.l0();
        contactsActivity2.k0();
        return i12;
    }

    @Override // org.telegram.ui.Components.sk0, f2.r0
    public final void l() {
        X(false);
        ContactsActivity contactsActivity = this.H;
        org.telegram.ui.Components.wk0 wk0Var = contactsActivity.f;
        if (wk0Var == null || wk0Var.getAdapter() != this) {
            return;
        }
        int h = h();
        if (contactsActivity.D) {
            contactsActivity.f.setFastScrollVisible(h != 2);
        } else {
            contactsActivity.f.setFastScrollVisible(h != 0);
        }
    }
}
