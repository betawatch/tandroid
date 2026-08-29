package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class qs extends f2.a1 {
    public boolean a;
    public boolean b;
    public final /* synthetic */ ContactsActivity c;

    public qs(ContactsActivity contactsActivity) {
        this.c = contactsActivity;
    }

    @Override // f2.a1
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 != 1) {
            this.b = false;
            return;
        }
        ContactsActivity contactsActivity = this.c;
        if ((contactsActivity.B && contactsActivity.A) || contactsActivity.V.r.isFocused()) {
            AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
        }
        this.b = true;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        lg.e eVar;
        ContactsActivity contactsActivity = this.c;
        int L0 = contactsActivity.n.L0();
        View childAt = recyclerView.getChildAt(0);
        int top = childAt != null ? childAt.getTop() : 0;
        if (contactsActivity.w != null && !contactsActivity.B) {
            boolean z10 = i11 > 0;
            if (i11 != 0 && this.a && (z10 || this.b)) {
                contactsActivity.x = !z10;
                ContactsActivity.e0(contactsActivity);
            }
            this.a = true;
        }
        contactsActivity.U.b(L0 != 0 || top < contactsActivity.f.getPaddingTop(), true);
        if (Build.VERSION.SDK_INT >= 31 && (eVar = contactsActivity.p0) != null) {
            eVar.f(i10, i11);
            contactsActivity.g0();
        }
        ContactsActivity.d0(contactsActivity);
    }
}
