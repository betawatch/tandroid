package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ContactsController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class xs extends uf.d {
    public final /* synthetic */ ContactsActivity I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs(ContactsActivity contactsActivity, Context context, int i10, boolean z4, a0.h hVar, int i11) {
        super(context, i10, z4, hVar, i11);
        this.I = contactsActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    @Override // org.telegram.ui.Components.ol0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R() {
        int size;
        boolean z4;
        boolean z10 = false;
        this.F = false;
        int i10 = this.C;
        int i11 = this.r;
        int i12 = this.v;
        int i13 = 1;
        if (i10 != 2) {
            size = (i12 == 2 ? ContactsController.getInstance(i11).sortedUsersMutualSectionsArray : ContactsController.getInstance(i11).sortedUsersSectionsArray).size();
            if (size == 0) {
                this.F = true;
            }
            if (i12 == 0) {
                size++;
            }
            z4 = this.B;
            if (z4) {
                size++;
            }
            boolean isEmpty = ContactsController.getInstance(i11).phoneBookContacts.isEmpty();
            this.G = !isEmpty;
            if (this.F && this.w && !z4 && i12 == 0) {
                z10 = true;
            }
            this.H = z10;
            if (z10) {
                i13 = size;
            } else if (!isEmpty) {
                i13 = 2;
            }
            ContactsActivity contactsActivity = this.I;
            ContactsActivity.e0(contactsActivity);
            contactsActivity.m0();
            contactsActivity.l0();
            return i13;
        }
        this.F = this.y.isEmpty();
        size = 1;
        if (i12 == 0) {
        }
        z4 = this.B;
        if (z4) {
        }
        boolean isEmpty2 = ContactsController.getInstance(i11).phoneBookContacts.isEmpty();
        this.G = !isEmpty2;
        if (this.F) {
            z10 = true;
        }
        this.H = z10;
        if (z10) {
        }
        ContactsActivity contactsActivity2 = this.I;
        ContactsActivity.e0(contactsActivity2);
        contactsActivity2.m0();
        contactsActivity2.l0();
        return i13;
    }

    @Override // org.telegram.ui.Components.ol0, f2.p0
    public final void l() {
        X(false);
        ContactsActivity contactsActivity = this.I;
        org.telegram.ui.Components.sl0 sl0Var = contactsActivity.f;
        if (sl0Var == null || sl0Var.getAdapter() != this) {
            return;
        }
        int h = h();
        if (contactsActivity.E) {
            contactsActivity.f.setFastScrollVisible(h != 2);
        } else {
            contactsActivity.f.setFastScrollVisible(h != 0);
        }
    }
}
