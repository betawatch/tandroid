package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class rs extends f2.d1 {
    public boolean a;
    public boolean b;
    public final /* synthetic */ ContactsActivity c;

    public rs(ContactsActivity contactsActivity) {
        this.c = contactsActivity;
    }

    @Override // f2.d1
    public final void a(RecyclerView recyclerView, int i9) {
        if (i9 != 1) {
            this.b = false;
            return;
        }
        ContactsActivity contactsActivity = this.c;
        if ((contactsActivity.B && contactsActivity.A) || contactsActivity.V.r.isFocused()) {
            AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
        }
        this.b = true;
    }

    @Override // f2.d1
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        ig.e eVar;
        ContactsActivity contactsActivity = this.c;
        int L0 = contactsActivity.n.L0();
        View childAt = recyclerView.getChildAt(0);
        int top = childAt != null ? childAt.getTop() : 0;
        if (contactsActivity.w != null && !contactsActivity.B) {
            boolean z10 = i10 > 0;
            if (i10 != 0 && this.a && (z10 || this.b)) {
                contactsActivity.x = !z10;
                ContactsActivity.d0(contactsActivity);
            }
            this.a = true;
        }
        contactsActivity.U.b(L0 != 0 || top < contactsActivity.f.getPaddingTop(), true);
        if (Build.VERSION.SDK_INT >= 31 && (eVar = contactsActivity.p0) != null) {
            eVar.f(i9, i10);
            contactsActivity.f0();
        }
        ContactsActivity.c0(contactsActivity);
    }
}
