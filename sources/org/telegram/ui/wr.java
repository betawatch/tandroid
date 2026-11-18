package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class wr extends v4.u0 {
    public boolean a;
    public boolean b;
    public final /* synthetic */ ContactsActivity c;

    public wr(ContactsActivity contactsActivity) {
        this.c = contactsActivity;
    }

    @Override // v4.u0
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 != 1) {
            this.b = false;
            return;
        }
        ContactsActivity contactsActivity = this.c;
        if (contactsActivity.E && contactsActivity.y) {
            org.telegram.messenger.g0.v1(contactsActivity.getParentActivity().getCurrentFocus());
        }
        this.b = true;
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        ContactsActivity contactsActivity = this.c;
        if (contactsActivity.s == null || contactsActivity.E) {
            return;
        }
        boolean z10 = i10 > 0;
        if (i10 != 0 && this.a && (z10 || this.b)) {
            contactsActivity.w = !z10;
            ContactsActivity.g0(contactsActivity);
        }
        this.a = true;
    }
}
