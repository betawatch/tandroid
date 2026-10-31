package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ts extends s4.s0 {
    public boolean a;
    public boolean b;
    public final /* synthetic */ ContactsActivity c;

    public ts(ContactsActivity contactsActivity) {
        this.c = contactsActivity;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 != 1) {
            this.b = false;
            return;
        }
        ContactsActivity contactsActivity = this.c;
        if (contactsActivity.D && contactsActivity.y) {
            org.telegram.messenger.i0.v1(contactsActivity.getParentActivity().getCurrentFocus());
        }
        this.b = true;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ContactsActivity contactsActivity = this.c;
        if (contactsActivity.s == null || contactsActivity.D) {
            return;
        }
        boolean z10 = i11 > 0;
        if (i11 != 0 && this.a && (z10 || this.b)) {
            contactsActivity.w = !z10;
            ContactsActivity.f0(contactsActivity);
        }
        this.a = true;
    }
}
