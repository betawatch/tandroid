package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vs implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.nk0, org.telegram.ui.Components.bl0, r0.n {
    public final /* synthetic */ ContactsActivity a;

    public /* synthetic */ vs(ContactsActivity contactsActivity) {
        this.a = contactsActivity;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(l1Var, false).d;
        ContactsActivity contactsActivity = this.a;
        contactsActivity.q0 = i10;
        contactsActivity.j0();
        contactsActivity.i0();
        contactsActivity.h0();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.nk0
    public void a() {
        this.a.g0();
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean d(int i10, View view) {
        ContactsActivity contactsActivity = this.a;
        s4.h0 adapter = contactsActivity.f.getAdapter();
        at atVar = contactsActivity.d;
        if (adapter == atVar) {
            int S = atVar.S(i10);
            int Q = contactsActivity.d.Q(i10);
            org.telegram.ui.Components.oc ocVar = org.telegram.ui.Components.oc.w;
            if (ocVar != null) {
                ocVar.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z10 = contactsActivity.K;
        if (!z10 && !contactsActivity.L && (view instanceof org.telegram.ui.Cells.ab)) {
            contactsActivity.r0((org.telegram.ui.Cells.ab) view);
            return true;
        }
        if (z10 || contactsActivity.L || !(view instanceof org.telegram.ui.Cells.i6)) {
            return false;
        }
        org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
        if (i6Var.getUser() != null && i6Var.getUser().contact) {
            contactsActivity.r0(i6Var);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ContactsActivity contactsActivity = this.a;
        contactsActivity.getClass();
        a0.i iVar = contactsActivity.d0;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(iVar.m());
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            arrayList.add((TLRPC.User) iVar.f(iVar.j(i11)));
        }
        contactsActivity.getContactsController().deleteContactsUndoable(contactsActivity.getParentActivity(), contactsActivity, arrayList);
        contactsActivity.o0();
    }
}
