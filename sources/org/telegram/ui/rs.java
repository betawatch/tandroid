package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class rs extends s4.u0 {
    public boolean a;
    public boolean b;
    public final /* synthetic */ ContactsActivity c;

    public rs(ContactsActivity contactsActivity) {
        this.c = contactsActivity;
    }

    @Override // s4.u0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 != 1) {
            this.b = false;
            return;
        }
        ContactsActivity contactsActivity = this.c;
        if (contactsActivity.y && contactsActivity.x) {
            AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
        }
        this.b = true;
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ContactsActivity contactsActivity = this.c;
        if (contactsActivity.s == null || contactsActivity.y) {
            return;
        }
        boolean z10 = i11 > 0;
        if (i11 != 0 && this.a && (z10 || this.b)) {
            contactsActivity.v = !z10;
            ContactsActivity.c0(contactsActivity);
        }
        this.a = true;
    }
}
