package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ws implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.xk0, org.telegram.ui.Components.ll0, r0.n {
    public final /* synthetic */ ContactsActivity a;

    public /* synthetic */ ws(ContactsActivity contactsActivity) {
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

    @Override // org.telegram.ui.Components.xk0
    public void a() {
        this.a.g0();
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean d(int i10, View view) {
        ContactsActivity contactsActivity = this.a;
        s4.h0 adapter = contactsActivity.f.getAdapter();
        bt btVar = contactsActivity.d;
        if (adapter == btVar) {
            int S = btVar.S(i10);
            int Q = contactsActivity.d.Q(i10);
            org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.w;
            if (pcVar != null) {
                pcVar.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z10 = contactsActivity.K;
        if (!z10 && !contactsActivity.L && (view instanceof org.telegram.ui.Cells.bb)) {
            contactsActivity.r0((org.telegram.ui.Cells.bb) view);
            return true;
        }
        if (z10 || contactsActivity.L || !(view instanceof org.telegram.ui.Cells.j6)) {
            return false;
        }
        org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) view;
        if (j6Var.getUser() != null && j6Var.getUser().contact) {
            contactsActivity.r0(j6Var);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
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
