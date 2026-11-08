package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class tr extends v4.s0 {
    public boolean a;
    public boolean b;
    public final /* synthetic */ ContactsActivity c;

    public tr(ContactsActivity contactsActivity) {
        this.c = contactsActivity;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 != 1) {
            this.b = false;
            return;
        }
        ContactsActivity contactsActivity = this.c;
        if (contactsActivity.D && contactsActivity.y) {
            org.telegram.messenger.g0.v1(contactsActivity.getParentActivity().getCurrentFocus());
        }
        this.b = true;
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        ContactsActivity contactsActivity = this.c;
        if (contactsActivity.s == null || contactsActivity.D) {
            return;
        }
        boolean z9 = i10 > 0;
        if (i10 != 0 && this.a && (z9 || this.b)) {
            contactsActivity.w = !z9;
            ContactsActivity.g0(contactsActivity);
        }
        this.a = true;
    }
}
