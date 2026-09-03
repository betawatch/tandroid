package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class zs extends f2.z0 {
    public boolean a;
    public boolean b;
    public final /* synthetic */ ContactsActivity c;

    public zs(ContactsActivity contactsActivity) {
        this.c = contactsActivity;
    }

    @Override // f2.z0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 != 1) {
            this.b = false;
            return;
        }
        ContactsActivity contactsActivity = this.c;
        if ((contactsActivity.C && contactsActivity.B) || contactsActivity.W.r.isFocused()) {
            AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
        }
        this.b = true;
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ng.e eVar;
        ContactsActivity contactsActivity = this.c;
        int L0 = contactsActivity.n.L0();
        View childAt = recyclerView.getChildAt(0);
        int top = childAt != null ? childAt.getTop() : 0;
        if (contactsActivity.w != null && !contactsActivity.C) {
            boolean z4 = i11 > 0;
            if (i11 != 0 && this.a && (z4 || this.b)) {
                contactsActivity.x = !z4;
                ContactsActivity.e0(contactsActivity);
            }
            this.a = true;
        }
        contactsActivity.V.b(L0 != 0 || top < contactsActivity.f.getPaddingTop(), true);
        if (Build.VERSION.SDK_INT >= 31 && (eVar = contactsActivity.q0) != null) {
            eVar.f(i10, i11);
            contactsActivity.g0();
        }
        ContactsActivity.d0(contactsActivity);
    }
}
