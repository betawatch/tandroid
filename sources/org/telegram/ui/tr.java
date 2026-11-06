package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
