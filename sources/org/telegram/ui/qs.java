package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class qs implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.ok0, org.telegram.ui.Components.cl0, r0.n {
    public final /* synthetic */ ContactsActivity a;

    public /* synthetic */ qs(ContactsActivity contactsActivity) {
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

    @Override // org.telegram.ui.Components.ok0
    public void a() {
        this.a.g0();
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        ContactsActivity contactsActivity = this.a;
        s4.h0 adapter = contactsActivity.f.getAdapter();
        ws wsVar = contactsActivity.d;
        if (adapter == wsVar) {
            int S = wsVar.S(i10);
            int Q = contactsActivity.d.Q(i10);
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
            if (qcVar != null) {
                qcVar.b();
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
