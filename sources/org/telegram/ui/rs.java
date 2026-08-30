package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rs implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.yk0, org.telegram.ui.Components.kl0, r0.o {
    public final /* synthetic */ ContactsActivity a;

    public /* synthetic */ rs(ContactsActivity contactsActivity) {
        this.a = contactsActivity;
    }

    @Override // r0.o
    public r0.m1 N0(View view, r0.m1 m1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(m1Var, false).d;
        ContactsActivity contactsActivity = this.a;
        contactsActivity.n0 = i10;
        contactsActivity.j0();
        contactsActivity.i0();
        contactsActivity.h0();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.yk0
    public void d() {
        this.a.g0();
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean f(int i10, View view) {
        ContactsActivity contactsActivity = this.a;
        f2.o0 adapter = contactsActivity.f.getAdapter();
        ws wsVar = contactsActivity.d;
        if (adapter == wsVar) {
            int S = wsVar.S(i10);
            int Q = contactsActivity.d.Q(i10);
            org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.w;
            if (icVar != null) {
                icVar.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z4 = contactsActivity.H;
        if (!z4 && !contactsActivity.I && (view instanceof org.telegram.ui.Cells.va)) {
            contactsActivity.r0((org.telegram.ui.Cells.va) view);
            return true;
        }
        if (z4 || contactsActivity.I || !(view instanceof org.telegram.ui.Cells.h6)) {
            return false;
        }
        org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
        if (h6Var.getUser() != null && h6Var.getUser().contact) {
            contactsActivity.r0(h6Var);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ContactsActivity contactsActivity = this.a;
        contactsActivity.getClass();
        a0.h hVar = contactsActivity.a0;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hVar.m());
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            arrayList.add((TLRPC.User) hVar.f(hVar.j(i11)));
        }
        contactsActivity.getContactsController().deleteContactsUndoable(contactsActivity.getParentActivity(), contactsActivity, arrayList);
        contactsActivity.o0();
    }
}
